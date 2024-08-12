package net.codersdownunder.growablecells.datagen;

import net.codersdownunder.growablecells.GrowableCellsMod;
import net.codersdownunder.growablecells.datagen.client.ModBlockStateProvider;
import net.codersdownunder.growablecells.datagen.client.ModItemModelProvider;
import net.codersdownunder.growablecells.datagen.client.lang.ModEnUsProvider;
import net.codersdownunder.growablecells.datagen.server.*;
import net.minecraft.DetectedVersion;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.metadata.PackMetadataGenerator;
import net.minecraft.network.chat.Component;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.metadata.pack.PackMetadataSection;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Collectors;

@Mod.EventBusSubscriber(modid = GrowableCellsMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GrowableCellsDataGen {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper helper = event.getExistingFileHelper();
        PackOutput output = event.getGenerator().getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(true, new PackMetadataGenerator(output)
                .add(PackMetadataSection.TYPE, new PackMetadataSection(
                        Component.translatable("growablecells.text.packmeta.description"),
                        DetectedVersion.BUILT_IN.getPackVersion(PackType.CLIENT_RESOURCES),
                        Arrays.stream(PackType.values()).collect(Collectors.toMap(Function.identity(), DetectedVersion.BUILT_IN::getPackVersion))
                ))
        );

        // Server Data Generation
        ModBlockTagsProvider blockTagGenerator = generator.addProvider(event.includeServer(),
                new ModBlockTagsProvider(output, lookupProvider, helper));
            generator.addProvider(event.includeServer(), new ModRecipeProvider(output));
//            generator.addProvider(event.includeServer(), blockTagGenerator);
            generator.addProvider(event.includeServer(), new ModItemTagsProvider(output, lookupProvider, blockTagGenerator.contentsGetter(), helper));
            generator.addProvider(event.includeServer(), BaseLootTableProvider.create(output));

        // Client Data Generation
            generator.addProvider(event.includeClient(), new ModBlockStateProvider(output, helper));
            generator.addProvider(event.includeClient(), new ModItemModelProvider(output, helper));
            generator.addProvider(event.includeClient(), new ModEnUsProvider(output));


    }
}


