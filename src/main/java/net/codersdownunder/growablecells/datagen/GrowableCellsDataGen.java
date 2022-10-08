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
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = GrowableCellsMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GrowableCellsDataGen {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper helper = event.getExistingFileHelper();

        if (event.includeClient()) {

            // Client Data Generation
            generator.addProvider(new ModBlockStateProvider(generator, helper));
            generator.addProvider(new ModItemModelProvider(generator, helper));
            generator.addProvider(new ModEnUsProvider(generator));
        }

        if (event.includeServer()) {

            ModBlockTagsProvider blockTags = new ModBlockTagsProvider(generator, helper);

            // Server Data Generation
            generator.addProvider(new ModRecipeProvider(generator));
            generator.addProvider(blockTags);
            generator.addProvider(new ModItemTagsProvider(generator, blockTags, helper));
            generator.addProvider(new ModLootTableProvider(generator));

        }
    }
}


