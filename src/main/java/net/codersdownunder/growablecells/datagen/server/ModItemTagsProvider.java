package net.codersdownunder.growablecells.datagen.server;

import net.codersdownunder.growablecells.GrowableCellsMod;
import net.codersdownunder.growablecells.init.ItemInit;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {

    public ModItemTagsProvider(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_, CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, GrowableCellsMod.MODID, existingFileHelper);
    }

    @Override
    public String getName() {
        return "Growable Cells Item Tags";
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {



        tagSet(
                ItemInit.SEED_2CUBED_DISK.get(),
                ItemInit.SEED_16CUBED_DISK.get(),
                ItemInit.SEED_128CUBED_DISK.get(),
                ItemInit.SEED_AE2_1K_DISK.get(),
                ItemInit.SEED_AE2_4K_DISK.get(),
                ItemInit.SEED_AE2_16K_DISK.get(),
                ItemInit.SEED_AE2_64K_DISK.get(),
                ItemInit.SEED_AE2_FLUID_1K_DISK.get(),
                ItemInit.SEED_AE2_FLUID_4K_DISK.get(),
                ItemInit.SEED_AE2_FLUID_16K_DISK.get(),
                ItemInit.SEED_AE2_FLUID_64K_DISK.get(),
                ItemInit.SEED_MEK_QIO_DRIVE.get(),
                ItemInit.SEED_MEK_QIO_HYPER_DRIVE.get(),
                ItemInit.SEED_MEK_QIO_SUPER_DRIVE.get(),
                ItemInit.SEED_MEK_QIO_TIME_DRIVE.get(),
                ItemInit.SEED_RS_1K_DISK.get(),
                ItemInit.SEED_RS_4K_DISK.get(),
                ItemInit.SEED_RS_16K_DISK.get(),
                ItemInit.SEED_RS_64K_DISK.get(),
                ItemInit.SEED_RS_ES_256K_DISK.get(),
                ItemInit.SEED_RS_ES_1024K_DISK.get(),
                ItemInit.SEED_RS_ES_4096K_DISK.get(),
                ItemInit.SEED_RS_ES_16384K_DISK.get(),
                ItemInit.SEED_RS_ES_FLUID_16384K_DISK.get(),
                ItemInit.SEED_RS_ES_FLUID_65536K_DISK.get(),
                ItemInit.SEED_RS_ES_FLUID_262144K_DISK.get(),
                ItemInit.SEED_RS_ES_FLUID_1048576K_DISK.get(),
                ItemInit.SEED_RS_FLUID_64K_DISK.get(),
                ItemInit.SEED_RS_FLUID_256K_DISK.get(),
                ItemInit.SEED_RS_FLUID_1024K_DISK.get(),
                ItemInit.SEED_RS_FLUID_4096K_DISK.get());
    }

    public void tagSet(Item... items) {
        tag(ItemTags.VILLAGER_PLANTABLE_SEEDS)
                .add(items);

        tag(Tags.Items.SEEDS)
                .add(items);

        tag(Tags.Items.CROPS)
                .add(items);

        tag(ItemTags.SMALL_FLOWERS)
                .add(items);

    }
}