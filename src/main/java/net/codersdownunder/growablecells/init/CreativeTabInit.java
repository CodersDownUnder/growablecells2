package net.codersdownunder.growablecells.init;

import net.codersdownunder.growablecells.GrowableCellsMod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;


public class CreativeTabInit {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GrowableCellsMod.MODID);

    public static final Supplier<CreativeModeTab> GROWABLECELLS_TAB = CREATIVE_MODE_TABS.register("growablecells_tab",
            () -> CreativeModeTab.builder().icon(CreativeTabInit.getIcon())
                    .title(Component.translatable("itemGroup.growablecells"))
                    .withSearchBar()
                    .displayItems((pParameters, pOutput) -> {

                        if (GrowableCellsMod.AE2Loaded) {
                            pOutput.accept(new ItemStack(ItemInit.SEED_AE2_1K_DISK.get()));
                            pOutput.accept(new ItemStack(ItemInit.SEED_AE2_4K_DISK.get()));
                            pOutput.accept(new ItemStack(ItemInit.SEED_AE2_16K_DISK.get()));
                            pOutput.accept(new ItemStack(ItemInit.SEED_AE2_64K_DISK.get()));

                            pOutput.accept(new ItemStack(ItemInit.SEED_2CUBED_DISK.get()));
                            pOutput.accept(new ItemStack(ItemInit.SEED_16CUBED_DISK.get()));
                            pOutput.accept(new ItemStack(ItemInit.SEED_128CUBED_DISK.get()));

                            pOutput.accept(new ItemStack(ItemInit.SEED_AE2_FLUID_1K_DISK.get()));
                            pOutput.accept(new ItemStack(ItemInit.SEED_AE2_FLUID_4K_DISK.get()));
                            pOutput.accept(new ItemStack(ItemInit.SEED_AE2_FLUID_16K_DISK.get()));
                            pOutput.accept(new ItemStack(ItemInit.SEED_AE2_FLUID_64K_DISK.get()));
                        }

                        if (GrowableCellsMod.RSLoaded) {
                            pOutput.accept(new ItemStack(ItemInit.SEED_RS_1K_DISK.get()));
                            pOutput.accept(new ItemStack(ItemInit.SEED_RS_4K_DISK.get()));
                            pOutput.accept(new ItemStack(ItemInit.SEED_RS_16K_DISK.get()));
                            pOutput.accept(new ItemStack(ItemInit.SEED_RS_64K_DISK.get()));

                            pOutput.accept(new ItemStack(ItemInit.SEED_RS_FLUID_64K_DISK.get()));
                            pOutput.accept(new ItemStack(ItemInit.SEED_RS_FLUID_256K_DISK.get()));
                            pOutput.accept(new ItemStack(ItemInit.SEED_RS_FLUID_1024K_DISK.get()));
                            pOutput.accept(new ItemStack(ItemInit.SEED_RS_FLUID_4096K_DISK.get()));
                        }

//                        if (GrowableCellsMod.RSEDLoaded) {
//                            pOutput.accept(new ItemStack(ItemInit.SEED_RS_ED_256K_DISK.get()));
//                            pOutput.accept(new ItemStack(ItemInit.SEED_RS_ED_1024K_DISK.get()));
//                            pOutput.accept(new ItemStack(ItemInit.SEED_RS_ED_4096K_DISK.get()));
//                            pOutput.accept(new ItemStack(ItemInit.SEED_RS_ED_16384K_DISK.get()));
//                            pOutput.accept(new ItemStack(ItemInit.SEED_RS_ED_65536K_DISK.get()));
//                            pOutput.accept(new ItemStack(ItemInit.SEED_RS_ED_262M_DISK.get()));
//                            pOutput.accept(new ItemStack(ItemInit.SEED_RS_ED_1048M_DISK.get()));
//                            //pOutput.accept(new ItemStack(ItemInit.SEED_RS_ED_INFINITE_DISK.get()));
//
//                            pOutput.accept(new ItemStack(ItemInit.SEED_RS_ED_FLUID_16384K_DISK.get()));
//                            pOutput.accept(new ItemStack(ItemInit.SEED_RS_ED_FLUID_65536K_DISK.get()));
//                            pOutput.accept(new ItemStack(ItemInit.SEED_RS_ED_FLUID_262M_DISK.get()));
//                            pOutput.accept(new ItemStack(ItemInit.SEED_RS_ED_FLUID_1048M_DISK.get()));
//                            //pOutput.accept(new ItemStack(ItemInit.SEED_RS_ED_FLUID_INFINITE_DISK.get()));
//                        }

                        if (GrowableCellsMod.RSESLoaded) {
                            pOutput.accept(new ItemStack(ItemInit.SEED_RS_ES_256K_DISK.get()));
                            pOutput.accept(new ItemStack(ItemInit.SEED_RS_ES_1024K_DISK.get()));
                            pOutput.accept(new ItemStack(ItemInit.SEED_RS_ES_4096K_DISK.get()));
                            pOutput.accept(new ItemStack(ItemInit.SEED_RS_ES_16384K_DISK.get()));

                            pOutput.accept(new ItemStack(ItemInit.SEED_RS_ES_FLUID_16384K_DISK.get()));
                            pOutput.accept(new ItemStack(ItemInit.SEED_RS_ES_FLUID_65536K_DISK.get()));
                            pOutput.accept(new ItemStack(ItemInit.SEED_RS_ES_FLUID_262144K_DISK.get()));
                            pOutput.accept(new ItemStack(ItemInit.SEED_RS_ES_FLUID_1048576K_DISK.get()));
                        }

                        if (GrowableCellsMod.MEKLoaded) {
                            pOutput.accept(new ItemStack(ItemInit.SEED_MEK_QIO_DRIVE.get()));
                            pOutput.accept(new ItemStack(ItemInit.SEED_MEK_QIO_HYPER_DRIVE.get()));
                            pOutput.accept(new ItemStack(ItemInit.SEED_MEK_QIO_TIME_DRIVE.get()));
                            pOutput.accept(new ItemStack(ItemInit.SEED_MEK_QIO_SUPER_DRIVE.get()));
                        }


                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }


    private static Supplier<ItemStack> getIcon() {

        Supplier<ItemStack> stack = () -> new ItemStack(Items.BARRIER);

        if (GrowableCellsMod.AE2Loaded) {

            stack = () -> new ItemStack(BuiltInRegistries.ITEM.get(new ResourceLocation("ae2:1k_storage_cell")));
        }

        if (GrowableCellsMod.RSLoaded) {
            stack = () -> new ItemStack(BuiltInRegistries.ITEM.get(new ResourceLocation("refinedstorage:1k_storage_disk")));
        }

        if (GrowableCellsMod.MEKLoaded) {
            stack = () -> new ItemStack(BuiltInRegistries.ITEM.get(new ResourceLocation("mekanism:qio_drive_base")));
        }

        return stack;
    }

}