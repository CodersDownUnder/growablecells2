package net.codersdownunder.growablecells.init;

import net.codersdownunder.growablecells.GrowableCellsMod;
import net.codersdownunder.growablecells.datagen.server.OptionalLootItem;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class LootEntryTypeInit {

    private static final DeferredRegister<LootPoolEntryType> POOL_ENTRY_TYPES = DeferredRegister.create(Registries.LOOT_POOL_ENTRY_TYPE, GrowableCellsMod.MODID);

    public static final RegistryObject<LootPoolEntryType> OPTIONAL_LOOT_ITEM = POOL_ENTRY_TYPES.register(
            "optional_item",
            () -> new LootPoolEntryType(new OptionalLootItem.Serializer())
    );

    public static void register(IEventBus eventBus) {
        POOL_ENTRY_TYPES.register(eventBus);
    }
}
