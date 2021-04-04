package net.codersdownunder.growablecells.utils;

import net.codersdownunder.growablecells.GrowableCellsMod;
import net.codersdownunder.growablecells.init.ItemInit;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = GrowableCellsMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ColorHandler {
	
	//Tier 1: Orange #F9801D
	//Tier 2: Yellow #FED83D
	//Tier 3: Lime #80C71F
	//Tier 4: Cyan #169C9C
	//Tier 5: Magenta #C74EBD
	//Tier 6: Red #B02E26
	//Tier 7: Green #5E7C16
	//Tier 8: Pink #F38BAA
	//Tier 9: Brown #835432
	//Tier 10: White #F9FFFE	
	//Tier 11: Blue #3C44AA
	//Tier 12: Black #1D1D21
	
	
	@SubscribeEvent
	public static void registerItemColor(ColorHandlerEvent.Item event) {
		
		final IItemColor Tier1Color = (stack, tintIndex) -> {
			return 0xF9801D;
		};
		event.getItemColors().register(Tier1Color, ItemInit.SEED_AE2_1K_DISK.get());
		event.getItemColors().register(Tier1Color, ItemInit.SEED_AE2_FLUID_1K_DISK.get());
		event.getItemColors().register(Tier1Color, ItemInit.SEED_2CUBED_DISK.get());
		
		event.getItemColors().register(Tier1Color, ItemInit.SEED_RS_1K_DISK.get());

		
		//Tier 2
		final IItemColor Tier2Color = (stack, tintIndex) -> {
			return 0xFED83D;
		};
		event.getItemColors().register(Tier2Color, ItemInit.SEED_AE2_4K_DISK.get());
		event.getItemColors().register(Tier2Color, ItemInit.SEED_AE2_FLUID_4K_DISK.get());
		event.getItemColors().register(Tier2Color, ItemInit.SEED_16CUBED_DISK.get());
		
		event.getItemColors().register(Tier2Color, ItemInit.SEED_RS_4K_DISK.get());
		
		//Tier 3
		final IItemColor Tier3Color = (stack, tintIndex) -> {
			return 0x80C71F;
		};
		event.getItemColors().register(Tier3Color, ItemInit.SEED_AE2_16K_DISK.get());
		event.getItemColors().register(Tier3Color, ItemInit.SEED_AE2_FLUID_16K_DISK.get());
		event.getItemColors().register(Tier3Color, ItemInit.SEED_128CUBED_DISK.get());
		
		event.getItemColors().register(Tier3Color, ItemInit.SEED_RS_16K_DISK.get());
		
		//Tier 4
		final IItemColor Tier4Color = (stack, tintIndex) -> {
			return 0x169C9C;
		};
		event.getItemColors().register(Tier4Color, ItemInit.SEED_AE2_64K_DISK.get());
		event.getItemColors().register(Tier4Color, ItemInit.SEED_AE2_FLUID_64K_DISK.get());
		
		event.getItemColors().register(Tier4Color, ItemInit.SEED_RS_64K_DISK.get());
		event.getItemColors().register(Tier4Color, ItemInit.SEED_RS_64K_DISK.get());
		
		//Tier 5
		final IItemColor Tier5Color = (stack, tintIndex) -> {
			return 0xC74EBD;
		};
		event.getItemColors().register(Tier5Color, ItemInit.SEED_RS_FLUID_256K_DISK.get());
		event.getItemColors().register(Tier5Color, ItemInit.SEED_RS_ED_256K_DISK.get());
		event.getItemColors().register(Tier5Color, ItemInit.SEED_RS_ES_256K_DISK.get());
		
		//Tier 6
		final IItemColor Tier6Color = (stack, tintIndex) -> {
			return 0xB02E26;
		};
		event.getItemColors().register(Tier6Color, ItemInit.SEED_RS_ED_1024K_DISK.get());
		event.getItemColors().register(Tier6Color, ItemInit.SEED_RS_FLUID_1024K_DISK.get());
		event.getItemColors().register(Tier6Color, ItemInit.SEED_RS_ES_1024K_DISK.get());
		
		//Tier 7
		final IItemColor Tier7Color = (stack, tintIndex) -> {
			return 0x5E7C16;
		};
		event.getItemColors().register(Tier7Color, ItemInit.SEED_RS_ED_4096K_DISK.get());
		event.getItemColors().register(Tier7Color, ItemInit.SEED_RS_ES_4096K_DISK.get());
		event.getItemColors().register(Tier7Color, ItemInit.SEED_RS_FLUID_4096K_DISK.get());
		
		//Tier 8
		final IItemColor Tier8Color = (stack, tintIndex) -> {
			return 0xF38BAA;
		};
		event.getItemColors().register(Tier8Color, ItemInit.SEED_RS_ED_16384K_DISK.get());
		event.getItemColors().register(Tier8Color, ItemInit.SEED_RS_ED_FLUID_16384K_DISK.get());
		event.getItemColors().register(Tier8Color, ItemInit.SEED_RS_ES_16384K_DISK.get());
		event.getItemColors().register(Tier8Color, ItemInit.SEED_RS_ES_FLUID_16384K_DISK.get());
		
		//Tier 9
		final IItemColor Tier9Color = (stack, tintIndex) -> {
			return 0x835432;
		};
		event.getItemColors().register(Tier9Color, ItemInit.SEED_RS_ED_65536K_DISK.get());
		event.getItemColors().register(Tier9Color, ItemInit.SEED_RS_ED_FLUID_65536K_DISK.get());
		event.getItemColors().register(Tier9Color, ItemInit.SEED_RS_ES_FLUID_65536K_DISK.get());
		
		//Tier 10
		final IItemColor Tier10Color = (stack, tintIndex) -> {
			return 0xF9FFFE;
		};
		event.getItemColors().register(Tier10Color, ItemInit.SEED_RS_ED_262M_DISK.get());
		event.getItemColors().register(Tier10Color, ItemInit.SEED_RS_ED_FLUID_262M_DISK.get());
		event.getItemColors().register(Tier10Color, ItemInit.SEED_RS_ES_FLUID_262144K_DISK.get());
		
		//Tier 11
		final IItemColor Tier11Color = (stack, tintIndex) -> {
			return 0x3C44AA;
		};
		event.getItemColors().register(Tier11Color, ItemInit.SEED_RS_ED_1048M_DISK.get());
		event.getItemColors().register(Tier11Color, ItemInit.SEED_RS_ED_FLUID_1048M_DISK.get());
		event.getItemColors().register(Tier11Color, ItemInit.SEED_RS_ES_FLUID_1048576K_DISK.get());
		
		//Tier 12
		final IItemColor Tier12Color = (stack, tintIndex) -> {
			return 0x1D1D21;
		};
		event.getItemColors().register(Tier12Color, ItemInit.SEED_RS_ED_INFINITE_DISK.get());
		event.getItemColors().register(Tier12Color, ItemInit.SEED_RS_ED_FLUID_INFINITE_DISK.get());
	}

}