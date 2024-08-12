package net.codersdownunder.growablecells.datagen.client;

import net.codersdownunder.growablecells.GrowableCellsMod;
import net.codersdownunder.growablecells.init.ItemInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nonnull;

public class ModItemModelProvider extends ItemModelProvider {

    private static final String LAYER_0 = "layer0";

    public ModItemModelProvider(PackOutput generator, ExistingFileHelper helper) {
        super(generator, GrowableCellsMod.MODID, helper);
    }

    @Nonnull
    @Override
    public String getName() {
        return "Growable Cells Item Models";
    }

    @Override
    protected void registerModels() {


        oneLayerItem(ItemInit.SEED_2CUBED_DISK.get());
        oneLayerItem(ItemInit.SEED_16CUBED_DISK.get());
        oneLayerItem(ItemInit.SEED_128CUBED_DISK.get());

        oneLayerItem(ItemInit.SEED_AE2_1K_DISK.get());
        oneLayerItem(ItemInit.SEED_AE2_4K_DISK.get());
        oneLayerItem(ItemInit.SEED_AE2_16K_DISK.get());
        oneLayerItem(ItemInit.SEED_AE2_64K_DISK.get());

        oneLayerItem(ItemInit.SEED_AE2_FLUID_1K_DISK.get());
        oneLayerItem(ItemInit.SEED_AE2_FLUID_4K_DISK.get());
        oneLayerItem(ItemInit.SEED_AE2_FLUID_16K_DISK.get());
        oneLayerItem(ItemInit.SEED_AE2_FLUID_64K_DISK.get());

        oneLayerItem(ItemInit.SEED_MEK_QIO_DRIVE.get());
        oneLayerItem(ItemInit.SEED_MEK_QIO_HYPER_DRIVE.get());
        oneLayerItem(ItemInit.SEED_MEK_QIO_TIME_DRIVE.get());
        oneLayerItem(ItemInit.SEED_MEK_QIO_SUPER_DRIVE.get());

        oneLayerItem(ItemInit.SEED_RS_1K_DISK.get());
        oneLayerItem(ItemInit.SEED_RS_4K_DISK.get());
        oneLayerItem(ItemInit.SEED_RS_16K_DISK.get());
        oneLayerItem(ItemInit.SEED_RS_64K_DISK.get());

        oneLayerItem(ItemInit.SEED_RS_FLUID_64K_DISK.get());
        oneLayerItem(ItemInit.SEED_RS_FLUID_256K_DISK.get());
        oneLayerItem(ItemInit.SEED_RS_FLUID_1024K_DISK.get());
        oneLayerItem(ItemInit.SEED_RS_FLUID_4096K_DISK.get());


        oneLayerItem(ItemInit.SEED_RS_ES_256K_DISK.get());
        oneLayerItem(ItemInit.SEED_RS_ES_16384K_DISK.get());
        oneLayerItem(ItemInit.SEED_RS_ES_1024K_DISK.get());
        oneLayerItem(ItemInit.SEED_RS_ES_4096K_DISK.get());

        oneLayerItem(ItemInit.SEED_RS_ES_FLUID_16384K_DISK.get());
        oneLayerItem(ItemInit.SEED_RS_ES_FLUID_65536K_DISK.get());
        oneLayerItem(ItemInit.SEED_RS_ES_FLUID_262144K_DISK.get());
        oneLayerItem(ItemInit.SEED_RS_ES_FLUID_1048576K_DISK.get());


        oneLayerItem(ItemInit.SEED_RS_ED_256K_DISK.get());
        oneLayerItem(ItemInit.SEED_RS_ED_1024K_DISK.get());
        oneLayerItem(ItemInit.SEED_RS_ED_4096K_DISK.get());
        oneLayerItem(ItemInit.SEED_RS_ED_16384K_DISK.get());
        oneLayerItem(ItemInit.SEED_RS_ED_65536K_DISK.get());
        oneLayerItem(ItemInit.SEED_RS_ED_262M_DISK.get());
        oneLayerItem(ItemInit.SEED_RS_ED_1048M_DISK.get());


        oneLayerItem(ItemInit.SEED_RS_ED_FLUID_16384K_DISK.get());
        oneLayerItem(ItemInit.SEED_RS_ED_FLUID_65536K_DISK.get());
        oneLayerItem(ItemInit.SEED_RS_ED_FLUID_262M_DISK.get());
        oneLayerItem(ItemInit.SEED_RS_ED_FLUID_1048M_DISK.get());

    }

    private ItemModelBuilder oneLayerItem(final Item item) {
        return withExistingParent(ForgeRegistries.ITEMS.getKey(item.asItem()).getPath(), "item/generated")
                .texture("layer0", modLoc("item/seed"));
    }

}