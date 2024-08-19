package net.codersdownunder.growablecells.init;

import net.codersdownunder.growablecells.GrowableCellsMod;
import net.codersdownunder.growablecells.datagen.server.OptionalLootItem;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;


public class LootEntryTypeInit {

    private static final DeferredRegister<LootPoolEntryType> POOL_ENTRY_TYPES = DeferredRegister.create(Registries.LOOT_POOL_ENTRY_TYPE, GrowableCellsMod.MODID);

    public static final Holder<LootPoolEntryType> OPTIONAL_LOOT_ITEM = POOL_ENTRY_TYPES.register(
            "optional_item", () -> new LootPoolEntryType(OptionalLootItem.CODEC)
    );

    public static void register(IEventBus eventBus) {
        POOL_ENTRY_TYPES.register(eventBus);
    }
}
