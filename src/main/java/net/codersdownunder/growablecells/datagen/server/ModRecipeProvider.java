package net.codersdownunder.growablecells.datagen.server;


import appeng.core.definitions.AEItems;
import com.refinedmods.refinedstorage.RSItems;
import com.refinedmods.refinedstorage.apiimpl.storage.FluidStorageType;
import com.refinedmods.refinedstorage.apiimpl.storage.ItemStorageType;
import net.codersdownunder.growablecells.GrowableCellsMod;
import net.codersdownunder.growablecells.init.ItemInit;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;


import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput generator) {
        super(generator);
    }

    @Override
    protected void buildRecipes(RecipeOutput consumer) {
        /*
         * Refined Storage Recipes Start
         */
        GrowableCellsMod.LOGGER.info("Generating Refined Storage Item Disk Seed Recipes");
        // Refined Storage Item Disk Seed Recipes
        SeedRecipe("refinedstorage", consumer,
                RSItems.ITEM_STORAGE_DISKS.get(ItemStorageType.ONE_K).get(),
                ItemInit.SEED_RS_1K_DISK.get());
        SeedRecipe("refinedstorage", consumer,
                RSItems.ITEM_STORAGE_DISKS.get(ItemStorageType.FOUR_K).get(),
                ItemInit.SEED_RS_4K_DISK.get());
        SeedRecipe("refinedstorage", consumer,
                RSItems.ITEM_STORAGE_DISKS.get(ItemStorageType.SIXTEEN_K).get(),
                ItemInit.SEED_RS_16K_DISK.get());
        SeedRecipe("refinedstorage", consumer,
                RSItems.ITEM_STORAGE_DISKS.get(ItemStorageType.SIXTY_FOUR_K).get(),
                ItemInit.SEED_RS_64K_DISK.get());

        GrowableCellsMod.LOGGER.info("Generating Refined Storage Fluid Disk Seed Recipes");
        // Refined Storage Fluid Disk Seed Recipes
        SeedRecipe("refinedstorage", consumer,
                RSItems.FLUID_STORAGE_DISKS.get(FluidStorageType.SIXTY_FOUR_K).get(),
                ItemInit.SEED_RS_FLUID_64K_DISK.get());
        SeedRecipe("refinedstorage", consumer,
                RSItems.FLUID_STORAGE_DISKS.get(FluidStorageType.TWO_HUNDRED_FIFTY_SIX_K).get(),
                ItemInit.SEED_RS_FLUID_256K_DISK.get());
        SeedRecipe("refinedstorage", consumer,
                RSItems.FLUID_STORAGE_DISKS.get(FluidStorageType.THOUSAND_TWENTY_FOUR_K).get(),
                ItemInit.SEED_RS_FLUID_1024K_DISK.get());
        SeedRecipe("refinedstorage", consumer,
                RSItems.FLUID_STORAGE_DISKS.get(FluidStorageType.FOUR_THOUSAND_NINETY_SIX_K).get(),
                ItemInit.SEED_RS_FLUID_4096K_DISK.get());
        /*
         * Refined Storage Recipes End
         */

        /*
         * AE2 Recipes Start
         */
        GrowableCellsMod.LOGGER.info("Generating AE2 Cell Seed Recipes");

        SeedRecipe("ae2", consumer,
                AEItems.ITEM_CELL_1K.asItem(),
                ItemInit.SEED_AE2_1K_DISK.get());
        SeedRecipe("ae2", consumer,
                AEItems.ITEM_CELL_4K.asItem(),
                ItemInit.SEED_AE2_4K_DISK.get());
        SeedRecipe("ae2", consumer,
                AEItems.ITEM_CELL_16K.asItem(),
                ItemInit.SEED_AE2_16K_DISK.get());
        SeedRecipe("ae2", consumer,
                AEItems.ITEM_CELL_64K.asItem(),
                ItemInit.SEED_AE2_64K_DISK.get());

        SeedRecipe("ae2", consumer,
                AEItems.FLUID_CELL_1K.asItem(),
                ItemInit.SEED_AE2_FLUID_1K_DISK.get());
        SeedRecipe("ae2", consumer,
                AEItems.FLUID_CELL_4K.asItem(),
                ItemInit.SEED_AE2_FLUID_4K_DISK.get());
        SeedRecipe("ae2", consumer,
                AEItems.FLUID_CELL_16K.asItem(),
                ItemInit.SEED_AE2_FLUID_16K_DISK.get());
        SeedRecipe("ae2", consumer,
                AEItems.FLUID_CELL_64K.asItem(),
                ItemInit.SEED_AE2_FLUID_64K_DISK.get());

        SeedRecipe("ae2", consumer,
                AEItems.SPATIAL_CELL2.asItem(),
                ItemInit.SEED_2CUBED_DISK.get());
        SeedRecipe("ae2", consumer,
                AEItems.SPATIAL_CELL16.asItem(),
                ItemInit.SEED_16CUBED_DISK.get());
        SeedRecipe("ae2", consumer,
                AEItems.SPATIAL_CELL128.asItem(),
                ItemInit.SEED_128CUBED_DISK.get());
        /*
         * AE2 Recipes End
         */

        /*
         * Mekanism QIO Recipes Start
         */
        GrowableCellsMod.LOGGER.info("Generating Mekanism QIO Seed Recipes");

        SeedRecipe("mekanism", consumer,
                BuiltInRegistries.ITEM.get(new ResourceLocation("mekanism:qio_drive_base")),
                ItemInit.SEED_MEK_QIO_DRIVE.get());
        SeedRecipe("mekanism", consumer,
                BuiltInRegistries.ITEM.get(new ResourceLocation("mekanism:qio_drive_hyper_dense")),
                ItemInit.SEED_MEK_QIO_HYPER_DRIVE.get());
        SeedRecipe("mekanism", consumer,
                BuiltInRegistries.ITEM.get(new ResourceLocation("mekanism:qio_drive_time_dilating")),
                ItemInit.SEED_MEK_QIO_TIME_DRIVE.get());
        SeedRecipe("mekanism", consumer,
                BuiltInRegistries.ITEM.get(new ResourceLocation("mekanism:qio_drive_supermassive")),
                ItemInit.SEED_MEK_QIO_SUPER_DRIVE.get());

        /*
         * Mekanism QIO Recipes End
         */

        /*
         * Extra Disks Recipes Start
         */

//        GrowableCellsMod.LOGGER.info("Generating Extra Disks Item Disk Seed Recipes");
//
//        SeedRecipe("extradisks", consumer,
//                Registration.ITEM_STORAGE_DISK.get(ExtraItemStorageType.TIER_5).get().asItem(),
//                ItemInit.SEED_RS_ED_256K_DISK.get());
//
//        SeedRecipe("extradisks", consumer,
//                Registration.ITEM_STORAGE_DISK.get(ExtraItemStorageType.TIER_6).get().asItem(),
//                ItemInit.SEED_RS_ED_1024K_DISK.get());
//
//        SeedRecipe("extradisks", consumer,
//                Registration.ITEM_STORAGE_DISK.get(ExtraItemStorageType.TIER_7).get().asItem(),
//                ItemInit.SEED_RS_ED_4096K_DISK.get());
//
//        SeedRecipe("extradisks", consumer,
//                Registration.ITEM_STORAGE_DISK.get(ExtraItemStorageType.TIER_8).get().asItem(),
//                ItemInit.SEED_RS_ED_16384K_DISK.get());
//
//        SeedRecipe("extradisks", consumer,
//                Registration.ITEM_STORAGE_DISK.get(ExtraItemStorageType.TIER_9).get().asItem(),
//                ItemInit.SEED_RS_ED_65536K_DISK.get());
//
//        SeedRecipe("extradisks", consumer,
//                Registration.ITEM_STORAGE_DISK.get(ExtraItemStorageType.TIER_10).get().asItem(),
//                ItemInit.SEED_RS_ED_262M_DISK.get());
//
//        SeedRecipe("extradisks", consumer,
//                Registration.ITEM_STORAGE_DISK.get(ExtraItemStorageType.TIER_11).get().asItem(),
//                ItemInit.SEED_RS_ED_1048M_DISK.get());
//
//        GrowableCellsMod.LOGGER.info("Generating Extra Disks Fluid Disk Seed Recipes");
//
//        SeedRecipe("extradisks", consumer,
//                Registration.FLUID_STORAGE_DISK.get(ExtraFluidStorageType.TIER_5_FLUID).get().asItem(),
//                ItemInit.SEED_RS_ED_FLUID_16384K_DISK.get());
//
//        SeedRecipe("extradisks", consumer,
//                Registration.FLUID_STORAGE_DISK.get(ExtraFluidStorageType.TIER_6_FLUID).get().asItem(),
//                ItemInit.SEED_RS_ED_FLUID_65536K_DISK.get());
//
//        SeedRecipe("extradisks", consumer,
//                Registration.FLUID_STORAGE_DISK.get(ExtraFluidStorageType.TIER_7_FLUID).get().asItem(),
//                ItemInit.SEED_RS_ED_FLUID_262M_DISK.get());
//
//        SeedRecipe("extradisks", consumer,
//                Registration.FLUID_STORAGE_DISK.get(ExtraFluidStorageType.TIER_8_FLUID).get().asItem(),
//                ItemInit.SEED_RS_ED_FLUID_1048M_DISK.get());

        /*
         * Extra Disks Recipes End
         */

        /*
         * Extra Storage Recipes Start
         */
        GrowableCellsMod.LOGGER.info("Generating Extra Storage Item Disk Seed Recipes");

        SeedRecipe("extrastorage", consumer,
                edivad.extrastorage.setup.ESItems.ITEM_DISK
                        .get(edivad.extrastorage.items.storage.item.ItemStorageType.TIER_5).get().asItem(),
                ItemInit.SEED_RS_ES_256K_DISK.get());

        SeedRecipe("extrastorage", consumer,
                edivad.extrastorage.setup.ESItems.ITEM_DISK
                        .get(edivad.extrastorage.items.storage.item.ItemStorageType.TIER_6).get().asItem(),
                ItemInit.SEED_RS_ES_1024K_DISK.get());

        SeedRecipe("extrastorage", consumer,
                edivad.extrastorage.setup.ESItems.ITEM_DISK
                        .get(edivad.extrastorage.items.storage.item.ItemStorageType.TIER_7).get().asItem(),
                ItemInit.SEED_RS_ES_4096K_DISK.get());

        SeedRecipe("extrastorage", consumer,
                edivad.extrastorage.setup.ESItems.ITEM_DISK
                        .get(edivad.extrastorage.items.storage.item.ItemStorageType.TIER_8).get().asItem(),
                ItemInit.SEED_RS_ES_16384K_DISK.get());

        GrowableCellsMod.LOGGER.info("Generating Extra Storage Fluid Disk Seed Recipes");

        SeedRecipe("extrastorage", consumer,
                edivad.extrastorage.setup.ESItems.FLUID_DISK
                        .get(edivad.extrastorage.items.storage.fluid.FluidStorageType.TIER_5).get().asItem(),
                ItemInit.SEED_RS_ES_FLUID_16384K_DISK.get());

        SeedRecipe("extrastorage", consumer,
                edivad.extrastorage.setup.ESItems.FLUID_DISK
                        .get(edivad.extrastorage.items.storage.fluid.FluidStorageType.TIER_6).get().asItem(),
                ItemInit.SEED_RS_ES_FLUID_65536K_DISK.get());

        SeedRecipe("extrastorage", consumer,
                edivad.extrastorage.setup.ESItems.FLUID_DISK
                        .get(edivad.extrastorage.items.storage.fluid.FluidStorageType.TIER_7).get().asItem(),
                ItemInit.SEED_RS_ES_FLUID_262144K_DISK.get());

        SeedRecipe("extrastorage", consumer,
                edivad.extrastorage.setup.ESItems.FLUID_DISK
                        .get(edivad.extrastorage.items.storage.fluid.FluidStorageType.TIER_8).get().asItem(),
                ItemInit.SEED_RS_ES_FLUID_1048576K_DISK.get());
        /*
         * Extra Storage Recipes End
         */



    }

    private void SeedRecipe(String modid, RecipeOutput pWriter, Item cell, Item cellSeed) {

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, cellSeed, 1)
                        .requires(cell, 4)
                        .requires(Tags.Items.SEEDS)
                                .unlockedBy(getHasName(cell), has(cell))
                                        .save(pWriter.withConditions(
                                                and(
                                                        not(modLoaded(BuiltInRegistries.ITEM.getKey(cell).getNamespace())), FALSE())
                                                )
                                        );


//        GrowableCellsMod.LOGGER.info("************ " + cell.getDescriptionId().substring(6 + modid.length()));

    }

//    public String getName() {
//
//        return "Growable Cells: Recipes";
//    }

}