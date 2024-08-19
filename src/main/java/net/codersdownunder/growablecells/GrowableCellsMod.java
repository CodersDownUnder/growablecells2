package net.codersdownunder.growablecells;

import net.codersdownunder.growablecells.blocks.SingleCropBlock;
import net.codersdownunder.growablecells.init.CreativeTabInit;
import net.codersdownunder.growablecells.init.LootEntryTypeInit;
import net.codersdownunder.growablecells.utils.LogFilter;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.codersdownunder.growablecells.init.BlockInit;
import net.codersdownunder.growablecells.init.ItemInit;



@Mod(GrowableCellsMod.MODID)
public class GrowableCellsMod
{

    public static final String MODID = "growablecells";
    //public static GrowableCellsItemGroup GROWABLE_CELLS_TAB;

    public static Boolean AE2Loaded;
    //public static Boolean AE2StuffLoaded;

    public static Boolean RSLoaded;
    public static Boolean RSESLoaded;
    public static Boolean RSEDLoaded;

    public static Boolean MEKLoaded;

    public static final Logger LOGGER = LogManager.getLogger();

    public GrowableCellsMod(IEventBus bus) {



        ItemInit.register(bus);
        BlockInit.register(bus);
        LootEntryTypeInit.register(bus);
        CreativeTabInit.register(bus);

        bus.addListener(this::setup);

        AE2Loaded = ModList.get().isLoaded("ae2");
        //AE2StuffLoaded = ModList.get().isLoaded("ae2extras");
        RSLoaded = ModList.get().isLoaded("refinedstorage");
        RSEDLoaded = ModList.get().isLoaded("extradisks");
        RSESLoaded = ModList.get().isLoaded("extrastorage");
        MEKLoaded = ModList.get().isLoaded("mekanism");


    }

    private void setup(final FMLCommonSetupEvent event)
    {
        LogFilter.apply();
    }

}
