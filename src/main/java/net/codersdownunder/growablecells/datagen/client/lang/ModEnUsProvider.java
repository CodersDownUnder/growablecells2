package net.codersdownunder.growablecells.datagen.client.lang;

import net.codersdownunder.growablecells.GrowableCellsMod;
import net.codersdownunder.growablecells.init.BlockInit;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class ModEnUsProvider extends LanguageProvider {

    public ModEnUsProvider(DataGenerator gen) {
        super(gen, GrowableCellsMod.MODID, "en_us");
    }

    @Override
    public String getName() {
        return "Growable Cells: EN_US Translations";
    }

    @Override
    protected void addTranslations() {
        GrowableCellsMod.LOGGER.info("Generating EN_US Translations");

        addRSTranslations();
        addAETranslations();
        addQIOTranslation();
        addRSESTranslations();
        addRSEDTranslations();

        add("itemGroup.growablecells", "Growable Cells 2");
    }

    private void addQIOTranslation() {
        add(BlockInit.CROP_MEK_QIO_DRIVE.get(), "Mekanism QIO Drive Seed");
        add(BlockInit.CROP_MEK_QIO_HYPER_DRIVE.get(), "Mekanism Hyper-Dense QIO Drive Seed");
        add(BlockInit.CROP_MEK_QIO_TIME_DRIVE.get(), "Mekanism Time-Dilating QIO Drive Seed");
        add(BlockInit.CROP_MEK_QIO_SUPER_DRIVE.get(), "Mekanism Supermassive QIO Drive Seed");

    }

    private void addAETranslations() {
        add(BlockInit.CROP_AE2_1K_DISK.get(), "AE2 1K Cell Seed");
        add(BlockInit.CROP_AE2_4K_DISK.get(), "AE2 4K Cell Seed");
        add(BlockInit.CROP_AE2_16K_DISK.get(), "AE2 16K Cell Seed");
        add(BlockInit.CROP_AE2_64K_DISK.get(), "AE2 64K Cell Seed");
        add(BlockInit.CROP_2CUBED_DISK.get(), "AE2 2 Cubed Spatial Cell Seed");
        add(BlockInit.CROP_16CUBED_DISK.get(), "AE2 16 Cubed Spatial Cell Seed");
        add(BlockInit.CROP_128CUBED_DISK.get(), "AE2 128 Cubed Spatial Cell Seed");
        add(BlockInit.CROP_AE2_FLUID_1K_DISK.get(), "AE2 Fluid 1K Cell Seed");
        add(BlockInit.CROP_AE2_FLUID_4K_DISK.get(), "AE2 Fluid 4K Cell Seed");
        add(BlockInit.CROP_AE2_FLUID_16K_DISK.get(), "AE2 Fluid 16K Cell Seed");
        add(BlockInit.CROP_AE2_FLUID_64K_DISK.get(), "AE2 Fluid 64K Cell Seed");

    }

    private void addRSTranslations() {
        add(BlockInit.CROP_RS_1K_DISK.get(), "Refined Storage 1K Disk Seed");
        add(BlockInit.CROP_RS_4K_DISK.get(), "Refined Storage 4K Disk Seed");
        add(BlockInit.CROP_RS_16K_DISK.get(), "Refined Storage 16K Disk Seed");
        add(BlockInit.CROP_RS_64K_DISK.get(), "Refined Storage 64K Disk Seed");
        add(BlockInit.CROP_RS_FLUID_64K_DISK.get(), "Refined Storage 64K Fluid Disk Seed");
        add(BlockInit.CROP_RS_FLUID_256K_DISK.get(), "Refined Storage 256K Fluid Disk Seed");
        add(BlockInit.CROP_RS_FLUID_1024K_DISK.get(), "Refined Storage 1024K Fluid Disk Seed");
        add(BlockInit.CROP_RS_FLUID_4096K_DISK.get(), "Refined Storage 4096K Fluid Disk Seed");
    }

    private void addRSESTranslations() {
        add(BlockInit.CROP_RS_ES_256K_DISK.get(), "Extra Storage 256K Disk Seed");
        add(BlockInit.CROP_RS_ES_1024K_DISK.get(), "Extra Storage 1024K Disk Seed");
        add(BlockInit.CROP_RS_ES_4096K_DISK.get(), "Extra Storage 4096K Disk Seed");
        add(BlockInit.CROP_RS_ES_16384K_DISK.get(), "Extra Storage 16384K Disk Seed");
        add(BlockInit.CROP_RS_ES_FLUID_16384K_DISK.get(), "Extra Storage 16384K Disk Seed");
        add(BlockInit.CROP_RS_ES_FLUID_65536K_DISK.get(), "Extra Storage 65536K Disk Seed");
        add(BlockInit.CROP_RS_ES_FLUID_262144K_DISK.get(), "Extra Storage 262144K Disk Seed");
        add(BlockInit.CROP_RS_ES_FLUID_1048576K_DISK.get(), "Extra Storage 1048576K Disk Seed");
    }

    private void addRSEDTranslations() {
        add(BlockInit.CROP_RS_ED_256K_DISK.get(), "Extra Disks 256K Disk Seed");
        add(BlockInit.CROP_RS_ED_1024K_DISK.get(), "Extra Disks 1024K Disk Seed");
        add(BlockInit.CROP_RS_ED_4096K_DISK.get(), "Extra Disks 4096K Disk Seed");
        add(BlockInit.CROP_RS_ED_16384K_DISK.get(), "Extra Disks 16384K Disk Seed");
        add(BlockInit.CROP_RS_ED_65536K_DISK.get(), "Extra Disks 65536K Disk Seed");
        add(BlockInit.CROP_RS_ED_262M_DISK.get(), "Extra Disks 262M Disk Seed");
        add(BlockInit.CROP_RS_ED_1048M_DISK.get(), "Extra Disks 1048M Disk Seed");
        //add(BlockInit.CROP_RS_ED_INFINITE_DISK.get(), "Extra Disks Infinite Disk Seed");
        add(BlockInit.CROP_RS_ED_FLUID_16384K_DISK.get(), "Extra Disks 16384K Fluid Disk Seed");
        add(BlockInit.CROP_RS_ED_FLUID_65536K_DISK.get(), "Extra Disks 65536K Fluid Disk Seed");
        add(BlockInit.CROP_RS_ED_FLUID_262M_DISK.get(), "Extra Disks 262M Fluid Disk Seed");
        add(BlockInit.CROP_RS_ED_FLUID_1048M_DISK.get(), "Extra Disks 1048M Fluid Disk Seed");
        //add(BlockInit.CROP_RS_ED_FLUID_INFINITE_DISK.get(), "Extra Disks Infinite Fluid Disk Seed");
    }

}