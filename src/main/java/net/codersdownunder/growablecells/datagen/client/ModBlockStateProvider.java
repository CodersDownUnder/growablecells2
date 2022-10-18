package net.codersdownunder.growablecells.datagen.client;

import net.codersdownunder.growablecells.GrowableCellsMod;
import net.codersdownunder.growablecells.blocks.SingleCropBlock;
import net.codersdownunder.growablecells.init.BlockInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nonnull;


public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, GrowableCellsMod.MODID, helper);
    }

    @Override
    @Nonnull
    public String getName() {
        return "Growable Cells: BlockState Provider";
    }

    @Override
    protected void registerStatesAndModels() {
        /*
         * Mekanism QIO Drive Crop Blockstates and Models
         */
        makeCrop((SingleCropBlock) BlockInit.CROP_MEK_QIO_DRIVE.get(), "mekanism", "item/qio_drive_base");
        makeCrop((SingleCropBlock) BlockInit.CROP_MEK_QIO_HYPER_DRIVE.get(), "mekanism", "item/qio_drive_hyper_dense");
        makeCrop((SingleCropBlock) BlockInit.CROP_MEK_QIO_TIME_DRIVE.get(), "mekanism", "item/qio_drive_time_dilating");
        makeCrop((SingleCropBlock) BlockInit.CROP_MEK_QIO_SUPER_DRIVE.get(), "mekanism", "item/qio_drive_supermassive");

        /*
         * Applied Energistics Cell Crop Blockstates and Models
         */
        makeCrop((SingleCropBlock) BlockInit.CROP_AE2_1K_DISK.get(), "ae2", "item/item_storage_cell_1k");
        makeCrop((SingleCropBlock) BlockInit.CROP_AE2_4K_DISK.get(), "ae2", "item/item_storage_cell_4k");
        makeCrop((SingleCropBlock) BlockInit.CROP_AE2_16K_DISK.get(), "ae2", "item/item_storage_cell_16k");
        makeCrop((SingleCropBlock) BlockInit.CROP_AE2_64K_DISK.get(), "ae2", "item/item_storage_cell_64k");

        makeCrop((SingleCropBlock) BlockInit.CROP_AE2_FLUID_1K_DISK.get(), "ae2", "item/fluid_storage_cell_1k");
        makeCrop((SingleCropBlock) BlockInit.CROP_AE2_FLUID_4K_DISK.get(), "ae2", "item/fluid_storage_cell_4k");
        makeCrop((SingleCropBlock) BlockInit.CROP_AE2_FLUID_16K_DISK.get(), "ae2", "item/fluid_storage_cell_16k");
        makeCrop((SingleCropBlock) BlockInit.CROP_AE2_FLUID_64K_DISK.get(), "ae2", "item/fluid_storage_cell_64k");

        makeCrop((SingleCropBlock) BlockInit.CROP_2CUBED_DISK.get(), "ae2", "item/spatial_storage_cell_2");
        makeCrop((SingleCropBlock) BlockInit.CROP_16CUBED_DISK.get(), "ae2", "item/spatial_storage_cell_16");
        makeCrop((SingleCropBlock) BlockInit.CROP_128CUBED_DISK.get(), "ae2", "item/spatial_storage_cell_128");

        /*
         * Refined Storage Disk Crop Blockstates and Models
         */
        makeCrop((SingleCropBlock) BlockInit.CROP_RS_1K_DISK.get(), "refinedstorage", "item/1k_storage_disk");
        makeCrop((SingleCropBlock) BlockInit.CROP_RS_4K_DISK.get(), "refinedstorage", "item/4k_storage_disk");
        makeCrop((SingleCropBlock) BlockInit.CROP_RS_16K_DISK.get(), "refinedstorage", "item/16k_storage_disk");
        makeCrop((SingleCropBlock) BlockInit.CROP_RS_64K_DISK.get(), "refinedstorage", "item/64k_storage_disk");

        makeCrop((SingleCropBlock) BlockInit.CROP_RS_FLUID_64K_DISK.get(), "refinedstorage", "item/64k_fluid_storage_disk");
        makeCrop((SingleCropBlock) BlockInit.CROP_RS_FLUID_256K_DISK.get(), "refinedstorage", "item/256k_fluid_storage_disk");
        makeCrop((SingleCropBlock) BlockInit.CROP_RS_FLUID_1024K_DISK.get(), "refinedstorage", "item/1024k_fluid_storage_disk");
        makeCrop((SingleCropBlock) BlockInit.CROP_RS_FLUID_4096K_DISK.get(), "refinedstorage", "item/4096k_fluid_storage_disk");

        /*
         * Extra Storage Crop Blockstates and Models
         */

        makeCrop((SingleCropBlock) BlockInit.CROP_RS_ES_256K_DISK.get(), "extrastorage", "items/disks/256k");
        makeCrop((SingleCropBlock) BlockInit.CROP_RS_ES_1024K_DISK.get(), "extrastorage", "items/disks/1024k");
        makeCrop((SingleCropBlock) BlockInit.CROP_RS_ES_4096K_DISK.get(), "extrastorage", "items/disks/4096k");
        makeCrop((SingleCropBlock) BlockInit.CROP_RS_ES_16384K_DISK.get(), "extrastorage", "items/disks/16384k");

        makeCrop((SingleCropBlock) BlockInit.CROP_RS_ES_FLUID_16384K_DISK.get(), "extrastorage", "items/disks/16384k_fluid");
        makeCrop((SingleCropBlock) BlockInit.CROP_RS_ES_FLUID_65536K_DISK.get(), "extrastorage", "items/disks/65536k_fluid");
        makeCrop((SingleCropBlock) BlockInit.CROP_RS_ES_FLUID_262144K_DISK.get(), "extrastorage", "items/disks/262144k_fluid");
        makeCrop((SingleCropBlock) BlockInit.CROP_RS_ES_FLUID_1048576K_DISK.get(), "extrastorage", "items/disks/1048576k_fluid");

        /*
         * Extra Disks Crop Blockstates and Models
         */

        makeCrop((SingleCropBlock) BlockInit.CROP_RS_ED_256K_DISK.get(), "extradisks", "item/256k_storage_disk");
        makeCrop((SingleCropBlock) BlockInit.CROP_RS_ED_1024K_DISK.get(), "extradisks", "item/1024k_storage_disk");
        makeCrop((SingleCropBlock) BlockInit.CROP_RS_ED_4096K_DISK.get(), "extradisks", "item/4096k_storage_disk");
        makeCrop((SingleCropBlock) BlockInit.CROP_RS_ED_16384K_DISK.get(), "extradisks", "item/16384k_storage_disk");
        makeCrop((SingleCropBlock) BlockInit.CROP_RS_ED_65536K_DISK.get(), "extradisks", "item/65536k_storage_disk");
        makeCrop((SingleCropBlock) BlockInit.CROP_RS_ED_262M_DISK.get(), "extradisks", "item/262144k_storage_disk");
        makeCrop((SingleCropBlock) BlockInit.CROP_RS_ED_1048M_DISK.get(), "extradisks", "item/1048576k_storage_disk");

        makeCrop((SingleCropBlock) BlockInit.CROP_RS_ED_FLUID_16384K_DISK.get(), "extradisks", "item/16384k_fluid_storage_disk");
        makeCrop((SingleCropBlock) BlockInit.CROP_RS_ED_FLUID_65536K_DISK.get(), "extradisks", "item/65536k_fluid_storage_disk");
        makeCrop((SingleCropBlock) BlockInit.CROP_RS_ED_FLUID_262M_DISK.get(), "extradisks", "item/262144k_fluid_storage_disk");
        makeCrop((SingleCropBlock) BlockInit.CROP_RS_ED_FLUID_1048M_DISK.get(), "extradisks", "item/1048576k_fluid_storage_disk");

    }

    public void makeCrop(CropBlock block, String modid,  String textureName) {

        String blockName = ForgeRegistries.BLOCKS.getKey(block).getPath();

        ModelFile stage_0 = models().crop(blockName + "_stage_0", modLoc("block/crop_stage_0")).renderType("minecraft:cutout_mipped");
        ModelFile stage_1 = models().crop(blockName + "_stage_1", modLoc("block/crop_stage_1")).renderType("minecraft:cutout_mipped");
        ModelFile stage_2 = models().crop(blockName + "_stage_2", modLoc("block/crop_stage_2")).renderType("minecraft:cutout_mipped");
        ModelFile stage_3 = models().withExistingParent(blockName + "_stage_3", modLoc("block/crop_stage_3_template"))
                .texture("crop", modLoc("block/crop_stage_3"))
                .texture("disk", new ResourceLocation(modid, textureName)).renderType("minecraft:cutout_mipped");

        getVariantBuilder(block)
                .partialState()
                    .with(SingleCropBlock.AGE, 0)
                    .modelForState()
                    .modelFile(stage_0)
                    .addModel()
                .partialState()
                    .with(SingleCropBlock.AGE, 1)
                    .modelForState()
                    .modelFile(stage_0)
                    .addModel()
                .partialState()
                    .with(SingleCropBlock.AGE, 2)
                    .modelForState()
                    .modelFile(stage_1)
                    .addModel()
                .partialState()
                    .with(SingleCropBlock.AGE, 3)
                    .modelForState()
                    .modelFile(stage_1)
                    .addModel()
                .partialState()
                    .with(SingleCropBlock.AGE, 4)
                    .modelForState()
                    .modelFile(stage_1)
                    .addModel()
                .partialState()
                    .with(SingleCropBlock.AGE, 5)
                    .modelForState()
                    .modelFile(stage_2)
                    .addModel()
                .partialState()
                    .with(SingleCropBlock.AGE, 6)
                    .modelForState()
                    .modelFile(stage_2)
                    .addModel()
                .partialState()
                .with(SingleCropBlock.AGE, 7)
                .modelForState()
                .modelFile(stage_3)
                .addModel();


    }


}
