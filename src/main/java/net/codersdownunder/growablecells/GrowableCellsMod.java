package net.codersdownunder.growablecells;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.codersdownunder.growablecells.init.BlockInit;
import net.codersdownunder.growablecells.init.ItemInit;
import net.codersdownunder.growablecells.utils.flags.GrowableCellsModFlags;
import net.minecraft.block.ComposterBlock;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod(GrowableCellsMod.MODID)
public class GrowableCellsMod
{
    
	public static final String MODID = "growablecells";
	public static GrowableCellsItemGroup GROWABLE_CELLS_ITEM_GROUP;
	
	public static Boolean AE2Loaded;
	public static Boolean AE2StuffLoaded;
	
	public static Boolean RSLoaded;
	public static Boolean RSESLoaded;
	public static Boolean RSEDLoaded;
	
	public static Boolean MEKLoaded;
	
	
	public static final Logger LOGGER = LogManager.getLogger();

    public GrowableCellsMod() {
    	
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        
        bus.addListener(this::setup);
        bus.addListener(this::clientSetup);
        
        //ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, GrowableStorageConfig.SERVER_CONFIG, "growablestorage-server.toml");
        
        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);

        GROWABLE_CELLS_ITEM_GROUP = new GrowableCellsItemGroup("growablecells");
        
        AE2Loaded = ModList.get().isLoaded("appliedenergistics2");
        AE2StuffLoaded = ModList.get().isLoaded("ae2extras");
        RSLoaded = ModList.get().isLoaded("refinedstorage");
        RSEDLoaded = ModList.get().isLoaded("extradisks");
        RSESLoaded = ModList.get().isLoaded("extrastorage");
        MEKLoaded = ModList.get().isLoaded("mekanism");
        
        
        registerFlags();
    }
    
    private void registerFlags() {
        
    	//Applied Energistics 2
        
        
        
    	if (AE2Loaded) {
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_AE2_1K_DISK, true);
    	    GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_AE2_4K_DISK, true);
    	    GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_AE2_16K_DISK, true);
    	    GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_AE2_64K_DISK, true);
    	    GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_2CUBED_DISK, true);
    	    GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_16CUBED_DISK, true);
    	    GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_128CUBED_DISK, true);
    	    GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_AE2_FLUID_1K_DISK, true);
    	    GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_AE2_FLUID_4K_DISK, true);
    	    GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_AE2_FLUID_16K_DISK, true);
    	    GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_AE2_FLUID_64K_DISK, true);
    	} else {
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_AE2_1K_DISK, false);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_AE2_4K_DISK, false);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_AE2_16K_DISK, false);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_AE2_64K_DISK, false);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_2CUBED_DISK, false);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_16CUBED_DISK, false);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_128CUBED_DISK, false);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_AE2_FLUID_1K_DISK, false);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_AE2_FLUID_4K_DISK, false);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_AE2_FLUID_16K_DISK, false);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_AE2_FLUID_64K_DISK, false);
    	}
    	
    	if (AE2StuffLoaded) {
    	    GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_AE2STUFF_256K_CELL, true);
    	    GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_AE2STUFF_1M_CELL, true);
    	    GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_AE2STUFF_4M_CELL, true);
    	    GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_AE2STUFF_16M_CELL, true);
    	    
    	    GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_AE2STUFF_256K_FLUID_CELL, true);
    	    GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_AE2STUFF_1M_FLUID_CELL, true);
    	    GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_AE2STUFF_4M_FLUID_CELL, true);
    	    GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_AE2STUFF_16M_FLUID_CELL, true);
    	} else {
    	    GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_AE2STUFF_256K_CELL, false);
            GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_AE2STUFF_1M_CELL, false);
            GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_AE2STUFF_4M_CELL, false);
            GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_AE2STUFF_16M_CELL, false);
            
            GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_AE2STUFF_256K_FLUID_CELL, false);
            GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_AE2STUFF_1M_FLUID_CELL, false);
            GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_AE2STUFF_4M_FLUID_CELL, false);
            GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_AE2STUFF_16M_FLUID_CELL, false);
    	}
    	
    	//Refined Storage
    	if (RSLoaded) {
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_1K_DISK, true);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_4K_DISK, true);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_16K_DISK, true);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_64K_DISK, true);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_FLUID_64K_DISK, true);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_FLUID_256K_DISK, true);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_FLUID_1024K_DISK, true);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_FLUID_4096K_DISK, true);
    	} else {
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_1K_DISK, false);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_4K_DISK, false);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_16K_DISK, false);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_64K_DISK, false);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_FLUID_64K_DISK, false);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_FLUID_256K_DISK, false);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_FLUID_1024K_DISK, false);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_FLUID_4096K_DISK, false);
    	}
    	
    	//Refined Storage Extra Disks
    	if (RSEDLoaded) {
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_ED_256K_DISK, true);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_ED_1024K_DISK, true);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_ED_4096K_DISK, true);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_ED_16384K_DISK, true);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_ED_65536K_DISK, true);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_ED_262M_DISK, true);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_ED_1048M_DISK, true);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_ED_INFINITE_DISK, true);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_ED_FLUID_16384K_DISK, true);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_ED_FLUID_65536K_DISK, true);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_ED_FLUID_262M_DISK, true);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_ED_FLUID_1048M_DISK, true);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_ED_FLUID_INFINITE_DISK, true);
    	} else {
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_ED_256K_DISK, false);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_ED_1024K_DISK, false);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_ED_4096K_DISK, false);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_ED_16384K_DISK, false);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_ED_65536K_DISK, false);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_ED_262M_DISK, false);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_ED_1048M_DISK, false);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_ED_INFINITE_DISK, false);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_ED_FLUID_16384K_DISK, false);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_ED_FLUID_65536K_DISK, false);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_ED_FLUID_262M_DISK, false);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_ED_FLUID_1048M_DISK, false);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_ED_FLUID_INFINITE_DISK, false);
    	}
    	
    	//Refined Storage Extra Storage
    	if (RSESLoaded) {
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_ES_256K_DISK, true);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_ES_1024K_DISK, true);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_ES_4096K_DISK, true);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_ES_16384K_DISK, true);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_ES_FLUID_16384K_DISK, true);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_ES_FLUID_65536K_DISK, true);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_ES_FLUID_262144K_DISK, true);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_ES_FLUID_1048576K_DISK, true);
    	} else {
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_ES_256K_DISK, false);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_ES_1024K_DISK, false);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_ES_4096K_DISK, false);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_ES_16384K_DISK, false);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_ES_FLUID_16384K_DISK, false);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_ES_FLUID_65536K_DISK, false);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_ES_FLUID_262144K_DISK, false);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_RS_ES_FLUID_1048576K_DISK, false);
    	}
    	
    	if (MEKLoaded) {
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_MEK_QIO_DRIVE, true);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_MEK_QIO_HYPER_DRIVE, true);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_MEK_QIO_TIME_DRIVE, true);
    		GrowableCellsModFlags.setFlag(GrowableCellsModFlags.FLAG_MEK_QIO_SUPER_DRIVE, true);
    	}
    }

    private void setup(final FMLCommonSetupEvent event)
    {
    	
    	
    	
    	event.enqueueWork(() -> {
            // CROPS
            {
                float chance = 0.3F;
                
                //AE2
                ComposterBlock.CHANCES.put(ItemInit.SEED_AE2_1K_DISK.get(), chance);
                ComposterBlock.CHANCES.put(ItemInit.SEED_AE2_4K_DISK.get(), chance);
                ComposterBlock.CHANCES.put(ItemInit.SEED_AE2_16K_DISK.get(), chance);
                ComposterBlock.CHANCES.put(ItemInit.SEED_AE2_64K_DISK.get(), chance);
                ComposterBlock.CHANCES.put(ItemInit.SEED_2CUBED_DISK.get(), chance);
                ComposterBlock.CHANCES.put(ItemInit.SEED_16CUBED_DISK.get(), chance);
                ComposterBlock.CHANCES.put(ItemInit.SEED_128CUBED_DISK.get(), chance);
                ComposterBlock.CHANCES.put(ItemInit.SEED_AE2_FLUID_1K_DISK.get(), chance);
                ComposterBlock.CHANCES.put(ItemInit.SEED_AE2_FLUID_4K_DISK.get(), chance);
                ComposterBlock.CHANCES.put(ItemInit.SEED_AE2_FLUID_16K_DISK.get(), chance);
                ComposterBlock.CHANCES.put(ItemInit.SEED_AE2_FLUID_64K_DISK.get(), chance);
                
                //AE2 Stuff
                ComposterBlock.CHANCES.put(ItemInit.SEED_AE2STUFF_256K_DISK.get(), chance);
                ComposterBlock.CHANCES.put(ItemInit.SEED_AE2STUFF_1M_DISK.get(), chance);
                ComposterBlock.CHANCES.put(ItemInit.SEED_AE2STUFF_4M_DISK.get(), chance);
                ComposterBlock.CHANCES.put(ItemInit.SEED_AE2STUFF_16M_DISK.get(), chance);
                
                ComposterBlock.CHANCES.put(ItemInit.SEED_AE2STUFF_256K_FLUID_DISK.get(), chance);
                ComposterBlock.CHANCES.put(ItemInit.SEED_AE2STUFF_1M_FLUID_DISK.get(), chance);
                ComposterBlock.CHANCES.put(ItemInit.SEED_AE2STUFF_4M_FLUID_DISK.get(), chance);
                ComposterBlock.CHANCES.put(ItemInit.SEED_AE2STUFF_16M_FLUID_DISK.get(), chance);
                
                //Refined Storage
                ComposterBlock.CHANCES.put(ItemInit.SEED_RS_1K_DISK.get(), chance);
                ComposterBlock.CHANCES.put(ItemInit.SEED_RS_4K_DISK.get(), chance);
                ComposterBlock.CHANCES.put(ItemInit.SEED_RS_16K_DISK.get(), chance);
                ComposterBlock.CHANCES.put(ItemInit.SEED_RS_64K_DISK.get(), chance);
                ComposterBlock.CHANCES.put(ItemInit.SEED_RS_FLUID_64K_DISK.get(), chance);
                ComposterBlock.CHANCES.put(ItemInit.SEED_RS_FLUID_256K_DISK.get(), chance);
                ComposterBlock.CHANCES.put(ItemInit.SEED_RS_FLUID_1024K_DISK.get(), chance);
                ComposterBlock.CHANCES.put(ItemInit.SEED_RS_FLUID_4096K_DISK.get(), chance);
                
                //Refined Storage Extra Disks
                ComposterBlock.CHANCES.put(ItemInit.SEED_RS_ED_256K_DISK.get(), chance);
                ComposterBlock.CHANCES.put(ItemInit.SEED_RS_ED_1024K_DISK.get(), chance);
                ComposterBlock.CHANCES.put(ItemInit.SEED_RS_ED_4096K_DISK.get(), chance);
                ComposterBlock.CHANCES.put(ItemInit.SEED_RS_ED_16384K_DISK.get(), chance);
                ComposterBlock.CHANCES.put(ItemInit.SEED_RS_ED_65536K_DISK.get(), chance);
                ComposterBlock.CHANCES.put(ItemInit.SEED_RS_ED_262M_DISK.get(), chance);
                ComposterBlock.CHANCES.put(ItemInit.SEED_RS_ED_1048M_DISK.get(), chance);
                ComposterBlock.CHANCES.put(ItemInit.SEED_RS_ED_INFINITE_DISK.get(), chance);
                ComposterBlock.CHANCES.put(ItemInit.SEED_RS_ED_FLUID_16384K_DISK.get(), chance);
                ComposterBlock.CHANCES.put(ItemInit.SEED_RS_ED_FLUID_65536K_DISK.get(), chance);
                ComposterBlock.CHANCES.put(ItemInit.SEED_RS_ED_FLUID_262M_DISK.get(), chance);
                ComposterBlock.CHANCES.put(ItemInit.SEED_RS_ED_FLUID_1048M_DISK.get(), chance);
                ComposterBlock.CHANCES.put(ItemInit.SEED_RS_ED_FLUID_INFINITE_DISK.get(), chance);

                //Refined Storage Extra Storage
                ComposterBlock.CHANCES.put(ItemInit.SEED_RS_ES_256K_DISK.get(), chance);
                ComposterBlock.CHANCES.put(ItemInit.SEED_RS_ES_1024K_DISK.get(), chance);
                ComposterBlock.CHANCES.put(ItemInit.SEED_RS_ES_4096K_DISK.get(), chance);
                ComposterBlock.CHANCES.put(ItemInit.SEED_RS_ES_FLUID_16384K_DISK.get(), chance);
                ComposterBlock.CHANCES.put(ItemInit.SEED_RS_ES_FLUID_65536K_DISK.get(), chance);
                ComposterBlock.CHANCES.put(ItemInit.SEED_RS_ES_FLUID_262144K_DISK.get(), chance);
                ComposterBlock.CHANCES.put(ItemInit.SEED_RS_ES_FLUID_1048576K_DISK.get(), chance);
                
                //Mekanism
                ComposterBlock.CHANCES.put(ItemInit.SEED_MEK_QIO_DRIVE.get(), chance);
                ComposterBlock.CHANCES.put(ItemInit.SEED_MEK_QIO_HYPER_DRIVE.get(), chance);
                ComposterBlock.CHANCES.put(ItemInit.SEED_MEK_QIO_TIME_DRIVE.get(), chance);
                ComposterBlock.CHANCES.put(ItemInit.SEED_MEK_QIO_SUPER_DRIVE.get(), chance);


            }
    	});
    }
    
    
    
    private void clientSetup(final FMLClientSetupEvent event)
	{	
    	//AE2
    	RenderTypeLookup.setRenderLayer(BlockInit.CROP_128CUBED_DISK.get(), RenderType.getCutout()); 
    	RenderTypeLookup.setRenderLayer(BlockInit.CROP_16CUBED_DISK.get(), RenderType.getCutout()); 
    	RenderTypeLookup.setRenderLayer(BlockInit.CROP_2CUBED_DISK.get(), RenderType.getCutout()); 
    	RenderTypeLookup.setRenderLayer(BlockInit.CROP_AE2_16K_DISK.get(), RenderType.getCutout()); 
    	RenderTypeLookup.setRenderLayer(BlockInit.CROP_AE2_1K_DISK.get(), RenderType.getCutout()); 
    	RenderTypeLookup.setRenderLayer(BlockInit.CROP_AE2_4K_DISK.get(), RenderType.getCutout()); 
    	RenderTypeLookup.setRenderLayer(BlockInit.CROP_AE2_64K_DISK.get(), RenderType.getCutout());
    	RenderTypeLookup.setRenderLayer(BlockInit.CROP_AE2_FLUID_16K_DISK.get(), RenderType.getCutout()); 
    	RenderTypeLookup.setRenderLayer(BlockInit.CROP_AE2_FLUID_1K_DISK.get(), RenderType.getCutout()); 
    	RenderTypeLookup.setRenderLayer(BlockInit.CROP_AE2_FLUID_4K_DISK.get(), RenderType.getCutout()); 
    	RenderTypeLookup.setRenderLayer(BlockInit.CROP_AE2_FLUID_64K_DISK.get(), RenderType.getCutout());
    	
    	//AE2 Stuff
    	RenderTypeLookup.setRenderLayer(BlockInit.CROP_AE2STUFF_256K_DISK.get(), RenderType.getCutout()); 
        RenderTypeLookup.setRenderLayer(BlockInit.CROP_AE2STUFF_1M_DISK.get(), RenderType.getCutout()); 
        RenderTypeLookup.setRenderLayer(BlockInit.CROP_AE2STUFF_4M_DISK.get(), RenderType.getCutout()); 
        RenderTypeLookup.setRenderLayer(BlockInit.CROP_AE2STUFF_16M_DISK.get(), RenderType.getCutout());
        
        RenderTypeLookup.setRenderLayer(BlockInit.CROP_AE2STUFF_256K_FLUID_DISK.get(), RenderType.getCutout()); 
        RenderTypeLookup.setRenderLayer(BlockInit.CROP_AE2STUFF_1M_FLUID_DISK.get(), RenderType.getCutout()); 
        RenderTypeLookup.setRenderLayer(BlockInit.CROP_AE2STUFF_4M_FLUID_DISK.get(), RenderType.getCutout()); 
        RenderTypeLookup.setRenderLayer(BlockInit.CROP_AE2STUFF_16M_FLUID_DISK.get(), RenderType.getCutout());
    	
    	//Refined Storage
    	RenderTypeLookup.setRenderLayer(BlockInit.CROP_RS_16K_DISK.get(), RenderType.getCutout()); 
    	RenderTypeLookup.setRenderLayer(BlockInit.CROP_RS_1K_DISK.get(), RenderType.getCutout()); 
    	RenderTypeLookup.setRenderLayer(BlockInit.CROP_RS_4K_DISK.get(), RenderType.getCutout()); 
    	RenderTypeLookup.setRenderLayer(BlockInit.CROP_RS_64K_DISK.get(), RenderType.getCutout()); 
    	
    	//Refined Storage Extra Disks
    	RenderTypeLookup.setRenderLayer(BlockInit.CROP_RS_ED_1024K_DISK.get(), RenderType.getCutout()); 
    	RenderTypeLookup.setRenderLayer(BlockInit.CROP_RS_ED_1048M_DISK.get(), RenderType.getCutout()); 
    	RenderTypeLookup.setRenderLayer(BlockInit.CROP_RS_ED_16384K_DISK.get(), RenderType.getCutout()); 
    	RenderTypeLookup.setRenderLayer(BlockInit.CROP_RS_ED_256K_DISK.get(), RenderType.getCutout()); 
    	RenderTypeLookup.setRenderLayer(BlockInit.CROP_RS_ED_262M_DISK.get(), RenderType.getCutout()); 
    	RenderTypeLookup.setRenderLayer(BlockInit.CROP_RS_ED_4096K_DISK.get(), RenderType.getCutout()); 
    	RenderTypeLookup.setRenderLayer(BlockInit.CROP_RS_ED_65536K_DISK.get(), RenderType.getCutout()); 
    	RenderTypeLookup.setRenderLayer(BlockInit.CROP_RS_ED_FLUID_1048M_DISK.get(), RenderType.getCutout()); 
    	RenderTypeLookup.setRenderLayer(BlockInit.CROP_RS_ED_FLUID_16384K_DISK.get(), RenderType.getCutout()); 
    	RenderTypeLookup.setRenderLayer(BlockInit.CROP_RS_ED_FLUID_262M_DISK.get(), RenderType.getCutout()); 
    	RenderTypeLookup.setRenderLayer(BlockInit.CROP_RS_ED_FLUID_65536K_DISK.get(), RenderType.getCutout()); 
    	RenderTypeLookup.setRenderLayer(BlockInit.CROP_RS_ED_FLUID_INFINITE_DISK.get(), RenderType.getCutout()); 
    	RenderTypeLookup.setRenderLayer(BlockInit.CROP_RS_ED_INFINITE_DISK.get(), RenderType.getCutout()); 
    	
    	//Refined Storage Extra Storage
    	RenderTypeLookup.setRenderLayer(BlockInit.CROP_RS_ES_1024K_DISK.get(), RenderType.getCutout()); 
    	RenderTypeLookup.setRenderLayer(BlockInit.CROP_RS_ES_16384K_DISK.get(), RenderType.getCutout()); 
    	RenderTypeLookup.setRenderLayer(BlockInit.CROP_RS_ES_256K_DISK.get(), RenderType.getCutout()); 
    	RenderTypeLookup.setRenderLayer(BlockInit.CROP_RS_ES_4096K_DISK.get(), RenderType.getCutout()); 
    	RenderTypeLookup.setRenderLayer(BlockInit.CROP_RS_ES_FLUID_1048576K_DISK.get(), RenderType.getCutout()); 
    	RenderTypeLookup.setRenderLayer(BlockInit.CROP_RS_ES_FLUID_16384K_DISK.get(), RenderType.getCutout()); 
    	RenderTypeLookup.setRenderLayer(BlockInit.CROP_RS_ES_FLUID_262144K_DISK.get(), RenderType.getCutout()); 
    	RenderTypeLookup.setRenderLayer(BlockInit.CROP_RS_ES_FLUID_65536K_DISK.get(), RenderType.getCutout()); 
    	RenderTypeLookup.setRenderLayer(BlockInit.CROP_RS_FLUID_1024K_DISK.get(), RenderType.getCutout()); 
    	RenderTypeLookup.setRenderLayer(BlockInit.CROP_RS_FLUID_256K_DISK.get(), RenderType.getCutout()); 
    	RenderTypeLookup.setRenderLayer(BlockInit.CROP_RS_FLUID_4096K_DISK.get(), RenderType.getCutout()); 
    	RenderTypeLookup.setRenderLayer(BlockInit.CROP_RS_FLUID_64K_DISK.get(), RenderType.getCutout());
    	
    	//Mekanism
    	RenderTypeLookup.setRenderLayer(BlockInit.CROP_MEK_QIO_DRIVE.get(), RenderType.getCutout());
    	RenderTypeLookup.setRenderLayer(BlockInit.CROP_MEK_QIO_SUPER_DRIVE.get(), RenderType.getCutout());
    	RenderTypeLookup.setRenderLayer(BlockInit.CROP_MEK_QIO_TIME_DRIVE.get(), RenderType.getCutout());
    	RenderTypeLookup.setRenderLayer(BlockInit.CROP_MEK_QIO_HYPER_DRIVE.get(), RenderType.getCutout());
		
	}

 
}
