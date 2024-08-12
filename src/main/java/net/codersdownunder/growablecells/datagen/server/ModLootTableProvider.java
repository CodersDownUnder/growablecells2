package net.codersdownunder.growablecells.datagen.server;

import appeng.core.definitions.AEItems;
import com.mojang.datafixers.util.Pair;
import com.refinedmods.refinedstorage.RSItems;
import com.refinedmods.refinedstorage.apiimpl.storage.FluidStorageType;
import com.refinedmods.refinedstorage.apiimpl.storage.ItemStorageType;
import de.melanx.extradisks.items.Registration;
import de.melanx.extradisks.items.fluid.ExtraFluidStorageType;
import de.melanx.extradisks.items.item.ExtraItemStorageType;
import net.codersdownunder.growablecells.GrowableCellsMod;
import net.codersdownunder.growablecells.blocks.SingleCropBlock;
import net.codersdownunder.growablecells.init.BlockInit;
import net.codersdownunder.growablecells.init.ItemInit;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.AlternativesEntry;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.ApplyExplosionDecay;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nonnull;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;


public final class ModLootTableProvider  extends BlockLootSubProvider {
    public ModLootTableProvider() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        /*
         * AE2 Crop Loottables
         */

        createLootTable(BlockInit.CROP_2CUBED_DISK.get(), AEItems.SPATIAL_CELL2.asItem(), ItemInit.SEED_2CUBED_DISK.get());
        createLootTable(BlockInit.CROP_16CUBED_DISK.get(), AEItems.SPATIAL_CELL16.asItem(), ItemInit.SEED_16CUBED_DISK.get());
        createLootTable(BlockInit.CROP_128CUBED_DISK.get(), AEItems.SPATIAL_CELL128.asItem(), ItemInit.SEED_128CUBED_DISK.get());

        createLootTable(BlockInit.CROP_AE2_1K_DISK.get(), AEItems.ITEM_CELL_1K.asItem(), ItemInit.SEED_AE2_1K_DISK.get());
        createLootTable(BlockInit.CROP_AE2_4K_DISK.get(), AEItems.ITEM_CELL_4K.asItem(), ItemInit.SEED_AE2_4K_DISK.get());
        createLootTable(BlockInit.CROP_AE2_16K_DISK.get(), AEItems.ITEM_CELL_16K.asItem(), ItemInit.SEED_AE2_16K_DISK.get());
        createLootTable(BlockInit.CROP_AE2_64K_DISK.get(), AEItems.ITEM_CELL_64K.asItem(), ItemInit.SEED_AE2_64K_DISK.get());

        createLootTable(BlockInit.CROP_AE2_FLUID_1K_DISK.get(), AEItems.FLUID_CELL_1K.asItem(), ItemInit.SEED_AE2_FLUID_1K_DISK.get());
        createLootTable(BlockInit.CROP_AE2_FLUID_4K_DISK.get(), AEItems.FLUID_CELL_4K.asItem(), ItemInit.SEED_AE2_FLUID_4K_DISK.get());
        createLootTable(BlockInit.CROP_AE2_FLUID_16K_DISK.get(), AEItems.FLUID_CELL_16K.asItem(), ItemInit.SEED_AE2_FLUID_16K_DISK.get());
        createLootTable(BlockInit.CROP_AE2_FLUID_64K_DISK.get(), AEItems.FLUID_CELL_64K.asItem(), ItemInit.SEED_AE2_FLUID_64K_DISK.get());

        /*
         * Mekanism Crop LootTables
         */

        createLootTable(BlockInit.CROP_MEK_QIO_DRIVE.get(), ForgeRegistries.ITEMS.getValue(new ResourceLocation("mekanism:qio_drive_base")), ItemInit.SEED_MEK_QIO_DRIVE.get());
        createLootTable(BlockInit.CROP_MEK_QIO_HYPER_DRIVE.get(), ForgeRegistries.ITEMS.getValue(new ResourceLocation("mekanism:qio_drive_hyper_dense")), ItemInit.SEED_MEK_QIO_HYPER_DRIVE.get());
        createLootTable(BlockInit.CROP_MEK_QIO_TIME_DRIVE.get(), ForgeRegistries.ITEMS.getValue(new ResourceLocation("mekanism:qio_drive_time_dilating")), ItemInit.SEED_MEK_QIO_TIME_DRIVE.get());
        createLootTable(BlockInit.CROP_MEK_QIO_SUPER_DRIVE.get(), ForgeRegistries.ITEMS.getValue(new ResourceLocation("mekanism:qio_drive_supermassive")), ItemInit.SEED_MEK_QIO_SUPER_DRIVE.get());

        /*
         * RS Crop LootTables
         */
        createLootTable(BlockInit.CROP_RS_1K_DISK.get(),
                RSItems.ITEM_STORAGE_DISKS.get(ItemStorageType.ONE_K).get().asItem(),
                ItemInit.SEED_RS_1K_DISK.get());
        createLootTable(BlockInit.CROP_RS_4K_DISK.get(),
                RSItems.ITEM_STORAGE_DISKS.get(ItemStorageType.FOUR_K).get().asItem(),
                ItemInit.SEED_RS_4K_DISK.get());
        createLootTable(BlockInit.CROP_RS_16K_DISK.get(),
                RSItems.ITEM_STORAGE_DISKS.get(ItemStorageType.SIXTEEN_K).get().asItem(),
                ItemInit.SEED_RS_16K_DISK.get());
        createLootTable(BlockInit.CROP_RS_64K_DISK.get(),
                RSItems.ITEM_STORAGE_DISKS.get(ItemStorageType.SIXTY_FOUR_K).get().asItem(),
                ItemInit.SEED_RS_64K_DISK.get());

        createLootTable(BlockInit.CROP_RS_FLUID_64K_DISK.get(),
                RSItems.FLUID_STORAGE_DISKS.get(FluidStorageType.SIXTY_FOUR_K).get().asItem(),
                ItemInit.SEED_RS_FLUID_64K_DISK.get());
        createLootTable(BlockInit.CROP_RS_FLUID_256K_DISK.get(),
                RSItems.FLUID_STORAGE_DISKS.get(FluidStorageType.TWO_HUNDRED_FIFTY_SIX_K).get().asItem(),
                ItemInit.SEED_RS_FLUID_256K_DISK.get());
        createLootTable(BlockInit.CROP_RS_FLUID_1024K_DISK.get(),
                RSItems.FLUID_STORAGE_DISKS.get(FluidStorageType.THOUSAND_TWENTY_FOUR_K).get().asItem(),
                ItemInit.SEED_RS_FLUID_1024K_DISK.get());
        createLootTable(BlockInit.CROP_RS_FLUID_4096K_DISK.get(),
                RSItems.FLUID_STORAGE_DISKS.get(FluidStorageType.FOUR_THOUSAND_NINETY_SIX_K).get().asItem(),
                ItemInit.SEED_RS_FLUID_4096K_DISK.get());

        /*
         * Extra Disks Crop LootTables
         */

        createLootTable(BlockInit.CROP_RS_ED_256K_DISK.get(),
                Registration.ITEM_STORAGE_DISK.get(ExtraItemStorageType.TIER_5).get().asItem(),
                ItemInit.SEED_RS_ED_256K_DISK.get());

        createLootTable(BlockInit.CROP_RS_ED_1024K_DISK.get(),
                Registration.ITEM_STORAGE_DISK.get(ExtraItemStorageType.TIER_6).get().asItem(),
                ItemInit.SEED_RS_ED_1024K_DISK.get());

        createLootTable(BlockInit.CROP_RS_ED_4096K_DISK.get(),
                Registration.ITEM_STORAGE_DISK.get(ExtraItemStorageType.TIER_7).get().asItem(),
                ItemInit.SEED_RS_ED_4096K_DISK.get());

        createLootTable(BlockInit.CROP_RS_ED_16384K_DISK.get(),
                Registration.ITEM_STORAGE_DISK.get(ExtraItemStorageType.TIER_8).get().asItem(),
                ItemInit.SEED_RS_ED_16384K_DISK.get());

        createLootTable(BlockInit.CROP_RS_ED_65536K_DISK.get(),
                Registration.ITEM_STORAGE_DISK.get(ExtraItemStorageType.TIER_9).get().asItem(),
                ItemInit.SEED_RS_ED_65536K_DISK.get());

        createLootTable(BlockInit.CROP_RS_ED_262M_DISK.get(),
                Registration.ITEM_STORAGE_DISK.get(ExtraItemStorageType.TIER_10).get().asItem(),
                ItemInit.SEED_RS_ED_262M_DISK.get());

        createLootTable(BlockInit.CROP_RS_ED_1048M_DISK.get(),
                Registration.ITEM_STORAGE_DISK.get(ExtraItemStorageType.TIER_11).get().asItem(),
                ItemInit.SEED_RS_ED_1048M_DISK.get());


        createLootTable(BlockInit.CROP_RS_ED_FLUID_16384K_DISK.get(),
                Registration.FLUID_STORAGE_DISK.get(ExtraFluidStorageType.TIER_5_FLUID).get().asItem(),
                ItemInit.SEED_RS_ED_FLUID_16384K_DISK.get());

        createLootTable(BlockInit.CROP_RS_ED_FLUID_65536K_DISK.get(),
                Registration.FLUID_STORAGE_DISK.get(ExtraFluidStorageType.TIER_6_FLUID).get().asItem(),
                ItemInit.SEED_RS_ED_FLUID_65536K_DISK.get());

        createLootTable(BlockInit.CROP_RS_ED_FLUID_262M_DISK.get(),
                Registration.FLUID_STORAGE_DISK.get(ExtraFluidStorageType.TIER_7_FLUID).get().asItem(),
                ItemInit.SEED_RS_ED_FLUID_262M_DISK.get());

        createLootTable(BlockInit.CROP_RS_ED_FLUID_1048M_DISK.get(),
                Registration.FLUID_STORAGE_DISK.get(ExtraFluidStorageType.TIER_8_FLUID).get().asItem(),
                ItemInit.SEED_RS_ED_FLUID_1048M_DISK.get());

        /*
         * Extra Storage Crop LootTables
         */

        createLootTable(BlockInit.CROP_RS_ES_256K_DISK.get(),
                edivad.extrastorage.setup.ESItems.ITEM_DISK
                        .get(edivad.extrastorage.items.storage.item.ItemStorageType.TIER_5).get().asItem(),
                ItemInit.SEED_RS_ES_256K_DISK.get());

        createLootTable(BlockInit.CROP_RS_ES_1024K_DISK.get(),
                edivad.extrastorage.setup.ESItems.ITEM_DISK
                        .get(edivad.extrastorage.items.storage.item.ItemStorageType.TIER_6).get().asItem(),
                ItemInit.SEED_RS_ES_1024K_DISK.get());

        createLootTable(BlockInit.CROP_RS_ES_4096K_DISK.get(),
                edivad.extrastorage.setup.ESItems.ITEM_DISK
                        .get(edivad.extrastorage.items.storage.item.ItemStorageType.TIER_7).get().asItem(),
                ItemInit.SEED_RS_ES_4096K_DISK.get());

        createLootTable(BlockInit.CROP_RS_ES_16384K_DISK.get(),
                edivad.extrastorage.setup.ESItems.ITEM_DISK
                        .get(edivad.extrastorage.items.storage.item.ItemStorageType.TIER_8).get().asItem(),
                ItemInit.SEED_RS_ES_16384K_DISK.get());


        createLootTable(BlockInit.CROP_RS_ES_FLUID_16384K_DISK.get(),
                edivad.extrastorage.setup.ESItems.FLUID_DISK
                        .get(edivad.extrastorage.items.storage.fluid.FluidStorageType.TIER_5).get().asItem(),
                ItemInit.SEED_RS_ES_FLUID_16384K_DISK.get());

        createLootTable(BlockInit.CROP_RS_ES_FLUID_65536K_DISK.get(),
                edivad.extrastorage.setup.ESItems.FLUID_DISK
                        .get(edivad.extrastorage.items.storage.fluid.FluidStorageType.TIER_6).get().asItem(),
                ItemInit.SEED_RS_ES_FLUID_65536K_DISK.get());

        createLootTable(BlockInit.CROP_RS_ES_FLUID_262144K_DISK.get(),
                edivad.extrastorage.setup.ESItems.FLUID_DISK
                        .get(edivad.extrastorage.items.storage.fluid.FluidStorageType.TIER_7).get().asItem(),
                ItemInit.SEED_RS_ES_FLUID_262144K_DISK.get());

        createLootTable(BlockInit.CROP_RS_ES_FLUID_1048576K_DISK.get(),
                edivad.extrastorage.setup.ESItems.FLUID_DISK
                        .get(edivad.extrastorage.items.storage.fluid.FluidStorageType.TIER_8).get().asItem(),
                ItemInit.SEED_RS_ES_FLUID_1048576K_DISK.get());


    }

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


    private void createLootTable(Block cropBlock, Item seedItem, Item cropGrownItem) {
        add(cropBlock, createOptionalCellDrops(cropBlock,
                seedItem,
                cropGrownItem));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
