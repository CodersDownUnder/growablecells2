package net.codersdownunder.growablecells.datagen.server;

import net.codersdownunder.growablecells.GrowableCellsMod;
import net.codersdownunder.growablecells.init.BlockInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTagsProvider extends BlockTagsProvider {

    public ModBlockTagsProvider(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, GrowableCellsMod.MODID, helper);
    }

    @Override
    public String getName() {
        return "Growable Cells Block Tags";
    }

    @Override
    protected void addTags() {
        tag(BlockTags.CROPS)
                .add(BlockInit.CROP_2CUBED_DISK.get())
                .add(BlockInit.CROP_16CUBED_DISK.get())
                .add(BlockInit.CROP_128CUBED_DISK.get())
                .add(BlockInit.CROP_AE2_1K_DISK.get())
                .add(BlockInit.CROP_AE2_4K_DISK.get())
                .add(BlockInit.CROP_AE2_16K_DISK.get())
                .add(BlockInit.CROP_AE2_64K_DISK.get())
                .add(BlockInit.CROP_AE2_FLUID_1K_DISK.get())
                .add(BlockInit.CROP_AE2_FLUID_4K_DISK.get())
                .add(BlockInit.CROP_AE2_FLUID_16K_DISK.get())
                .add(BlockInit.CROP_AE2_FLUID_64K_DISK.get())
                .add(BlockInit.CROP_MEK_QIO_DRIVE.get())
                .add(BlockInit.CROP_MEK_QIO_HYPER_DRIVE.get())
                .add(BlockInit.CROP_MEK_QIO_SUPER_DRIVE.get())
                .add(BlockInit.CROP_MEK_QIO_TIME_DRIVE.get())
                .add(BlockInit.CROP_RS_1K_DISK.get())
                .add(BlockInit.CROP_RS_4K_DISK.get())
                .add(BlockInit.CROP_RS_16K_DISK.get())
                .add(BlockInit.CROP_RS_64K_DISK.get())
                .add(BlockInit.CROP_RS_ED_256K_DISK.get())
                .add(BlockInit.CROP_RS_ED_262M_DISK.get())
                .add(BlockInit.CROP_RS_ED_1024K_DISK.get())
                .add(BlockInit.CROP_RS_ED_1048M_DISK.get())
                .add(BlockInit.CROP_RS_ED_4096K_DISK.get())
                .add(BlockInit.CROP_RS_ED_16384K_DISK.get())
                .add(BlockInit.CROP_RS_ED_65536K_DISK.get())
                .add(BlockInit.CROP_RS_ED_FLUID_262M_DISK.get())
                .add(BlockInit.CROP_RS_ED_FLUID_1048M_DISK.get())
                .add(BlockInit.CROP_RS_ED_FLUID_16384K_DISK.get())
                .add(BlockInit.CROP_RS_ED_FLUID_65536K_DISK.get())
                .add(BlockInit.CROP_RS_ES_256K_DISK.get())
                .add(BlockInit.CROP_RS_ES_1024K_DISK.get())
                .add(BlockInit.CROP_RS_ES_4096K_DISK.get())
                .add(BlockInit.CROP_RS_ES_16384K_DISK.get())
                .add(BlockInit.CROP_RS_ES_FLUID_16384K_DISK.get())
                .add(BlockInit.CROP_RS_ES_FLUID_65536K_DISK.get())
                .add(BlockInit.CROP_RS_ES_FLUID_262144K_DISK.get())
                .add(BlockInit.CROP_RS_ES_FLUID_1048576K_DISK.get())
                .add(BlockInit.CROP_RS_FLUID_64K_DISK.get())
                .add(BlockInit.CROP_RS_FLUID_256K_DISK.get())
                .add(BlockInit.CROP_RS_FLUID_1024K_DISK.get())
                .add(BlockInit.CROP_RS_FLUID_4096K_DISK.get());
    }

}