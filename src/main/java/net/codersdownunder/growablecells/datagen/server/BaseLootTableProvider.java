package net.codersdownunder.growablecells.datagen.server;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.codersdownunder.growablecells.blocks.SingleCropBlock;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.LootTables;
import net.minecraft.world.level.storage.loot.entries.AlternativesEntry;
import net.minecraft.world.level.storage.loot.functions.*;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;


public abstract class BaseLootTableProvider extends LootTableProvider {

    private static final Logger LOGGER = LogManager.getLogger();
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();

    protected final Map<Block, LootTable.Builder> lootTables = new HashMap<>();
    private final DataGenerator generator;

    public BaseLootTableProvider(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
        this.generator = dataGeneratorIn;
    }

    protected abstract void addTables();

    private static LootItemCondition.Builder cropCondition(Block cropBlock) {
        return LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(cropBlock)
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(SingleCropBlock.AGE, 7));
    }

    protected static LootTable.Builder createOptionalCellDrops(Block cropBlock, Item grownCropItem, Item seedsItem) {
        LootPool.Builder builder = LootPool.lootPool()
                .name(cropBlock.getName().toString())
                .setRolls(ConstantValue.exactly(2))
                .add(AlternativesEntry.alternatives(
                        OptionalLootItem.lootTableItem(grownCropItem)
                                .when(cropCondition(cropBlock))
                                .otherwise(OptionalLootItem.lootTableItem(seedsItem).apply(ApplyExplosionDecay.explosionDecay()))
                )).when(cropCondition(cropBlock)).add(OptionalLootItem.lootTableItem(seedsItem)
                        .apply(ApplyBonusCount
                                .addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))
                        .apply(ApplyExplosionDecay.explosionDecay()));

        return LootTable.lootTable().withPool(builder);
        }

    @Override
    public void run(CachedOutput cache) {
        addTables();

        Map<ResourceLocation, LootTable> tables = new HashMap<>();
        for (Map.Entry<Block, LootTable.Builder> entry : lootTables.entrySet()) {
            tables.put(entry.getKey().getLootTable(), entry.getValue().setParamSet(LootContextParamSets.BLOCK).build());
        }
        writeTables(cache, tables);
    }

    private void writeTables(CachedOutput cache, Map<ResourceLocation, LootTable> tables) {
        Path outputFolder = this.generator.getOutputFolder();
        tables.forEach((key, lootTable) -> {
            Path path = outputFolder.resolve("data/" + key.getNamespace() + "/loot_tables/" + key.getPath() + ".json");
            try {
                DataProvider.saveStable(cache, LootTables.serialize(lootTable), path);
            } catch (IOException e) {
                LOGGER.error("Couldn't write loot table {}", path, e);
            }
        });
    }

    @Override
    public String getName() {
        return "Growable Cells 2: LootTables";
    }
}