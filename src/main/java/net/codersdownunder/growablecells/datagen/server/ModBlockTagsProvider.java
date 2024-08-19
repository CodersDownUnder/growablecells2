package net.codersdownunder.growablecells.datagen.server;

import appeng.datagen.providers.tags.BlockTagsProvider;
import net.codersdownunder.growablecells.GrowableCellsMod;
import net.codersdownunder.growablecells.init.BlockInit;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider {

    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, existingFileHelper);
    }

    @Override
    public String getName() {
        return "Growable Cells Block Tags";
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tagSet(
                BlockInit.CROP_2CUBED_DISK.get(),
                BlockInit.CROP_16CUBED_DISK.get(),
                BlockInit.CROP_128CUBED_DISK.get(),
                BlockInit.CROP_AE2_1K_DISK.get(),
                BlockInit.CROP_AE2_4K_DISK.get(),
                BlockInit.CROP_AE2_16K_DISK.get(),
                BlockInit.CROP_AE2_64K_DISK.get(),
                BlockInit.CROP_AE2_FLUID_1K_DISK.get(),
                BlockInit.CROP_AE2_FLUID_4K_DISK.get(),
                BlockInit.CROP_AE2_FLUID_16K_DISK.get(),
                BlockInit.CROP_AE2_FLUID_64K_DISK.get(),
                BlockInit.CROP_MEK_QIO_DRIVE.get(),
                BlockInit.CROP_MEK_QIO_HYPER_DRIVE.get(),
                BlockInit.CROP_MEK_QIO_SUPER_DRIVE.get(),
                BlockInit.CROP_MEK_QIO_TIME_DRIVE.get(),
                BlockInit.CROP_RS_1K_DISK.get(),
                BlockInit.CROP_RS_4K_DISK.get(),
                BlockInit.CROP_RS_16K_DISK.get(),
                BlockInit.CROP_RS_64K_DISK.get(),
                BlockInit.CROP_RS_ES_256K_DISK.get(),
                BlockInit.CROP_RS_ES_1024K_DISK.get(),
                BlockInit.CROP_RS_ES_4096K_DISK.get(),
                BlockInit.CROP_RS_ES_16384K_DISK.get(),
                BlockInit.CROP_RS_ES_FLUID_16384K_DISK.get(),
                BlockInit.CROP_RS_ES_FLUID_65536K_DISK.get(),
                BlockInit.CROP_RS_ES_FLUID_262144K_DISK.get(),
                BlockInit.CROP_RS_ES_FLUID_1048576K_DISK.get(),
                BlockInit.CROP_RS_FLUID_64K_DISK.get(),
                BlockInit.CROP_RS_FLUID_256K_DISK.get(),
                BlockInit.CROP_RS_FLUID_1024K_DISK.get(),
                BlockInit.CROP_RS_FLUID_4096K_DISK.get());
    }

    public void tagSet(Block... blocks) {
        tag(BlockTags.CROPS)
                .add(blocks);

        tag(BlockTags.BEE_GROWABLES)
                .add(blocks);

        tag(BlockTags.MAINTAINS_FARMLAND)
                .add(blocks);

        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(blocks);

        tag(BlockTags.MINEABLE_WITH_HOE)
                .add(blocks);

        tag(BlockTags.SMALL_FLOWERS)
                .add(blocks);
    }

}