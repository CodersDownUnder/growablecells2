package net.codersdownunder.growablecells.datagen;

import net.codersdownunder.growablecells.GrowableCellsMod;
import net.codersdownunder.growablecells.datagen.client.ModBlockStateProvider;
import net.codersdownunder.growablecells.datagen.client.ModItemModelProvider;
import net.codersdownunder.growablecells.datagen.client.lang.ModEnUsProvider;
import net.codersdownunder.growablecells.datagen.server.ModBlockTagsProvider;
import net.codersdownunder.growablecells.datagen.server.ModItemTagsProvider;
import net.codersdownunder.growablecells.datagen.server.ModLootTableProvider;
import net.codersdownunder.growablecells.datagen.server.ModRecipeProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = GrowableCellsMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GrowableCellsDataGen {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper helper = event.getExistingFileHelper();

        // Server Data Generation
        ModBlockTagsProvider blockTags = new ModBlockTagsProvider(generator, helper);
            generator.addProvider(event.includeServer(), new ModRecipeProvider(generator));
            generator.addProvider(event.includeServer(), blockTags);
            generator.addProvider(event.includeServer(), new ModItemTagsProvider(generator, blockTags, helper));
            generator.addProvider(event.includeServer(), new ModLootTableProvider(generator));

        // Client Data Generation
            generator.addProvider(event.includeClient(), new ModBlockStateProvider(generator, helper));
            generator.addProvider(event.includeClient(), new ModItemModelProvider(generator, helper));
            generator.addProvider(event.includeClient(), new ModEnUsProvider(generator));


    }
}


