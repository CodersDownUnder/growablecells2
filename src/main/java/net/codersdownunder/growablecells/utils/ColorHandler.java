package net.codersdownunder.growablecells.utils;

import net.codersdownunder.growablecells.GrowableCellsMod;
import net.codersdownunder.growablecells.init.ItemInit;
import net.minecraft.client.color.item.ItemColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
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
	public static void registerItemColor(RegisterColorHandlersEvent.Item  event) {
		
		final ItemColor Tier1Color = (stack, tintIndex) -> {
			return 0xF9801D;
		};
		event.register(Tier1Color, ItemInit.SEED_AE2_1K_DISK.get());
		event.register(Tier1Color, ItemInit.SEED_AE2_FLUID_1K_DISK.get());
		event.register(Tier1Color, ItemInit.SEED_2CUBED_DISK.get());
		
		event.register(Tier1Color, ItemInit.SEED_RS_1K_DISK.get());

		
		//Tier 2
		final ItemColor Tier2Color = (stack, tintIndex) -> {
			return 0xFED83D;
		};
		event.register(Tier2Color, ItemInit.SEED_AE2_4K_DISK.get());
		event.register(Tier2Color, ItemInit.SEED_AE2_FLUID_4K_DISK.get());
		event.register(Tier2Color, ItemInit.SEED_16CUBED_DISK.get());
		
		event.register(Tier2Color, ItemInit.SEED_RS_4K_DISK.get());
		
		//Tier 3
		final ItemColor Tier3Color = (stack, tintIndex) -> {
			return 0x80C71F;
		};
		event.register(Tier3Color, ItemInit.SEED_AE2_16K_DISK.get());
		event.register(Tier3Color, ItemInit.SEED_AE2_FLUID_16K_DISK.get());
		event.register(Tier3Color, ItemInit.SEED_128CUBED_DISK.get());
		
		event.register(Tier3Color, ItemInit.SEED_RS_16K_DISK.get());
		
		//Tier 4
		final ItemColor Tier4Color = (stack, tintIndex) -> {
			return 0x169C9C;
		};
		event.register(Tier4Color, ItemInit.SEED_AE2_64K_DISK.get());
		event.register(Tier4Color, ItemInit.SEED_AE2_FLUID_64K_DISK.get());
		
		event.register(Tier4Color, ItemInit.SEED_RS_64K_DISK.get());
		event.register(Tier4Color, ItemInit.SEED_RS_64K_DISK.get());
		
		//Tier 5
		final ItemColor Tier5Color = (stack, tintIndex) -> {
			return 0xC74EBD;
		};
		event.register(Tier5Color, ItemInit.SEED_RS_FLUID_256K_DISK.get());
		event.register(Tier5Color, ItemInit.SEED_RS_ED_256K_DISK.get());
		event.register(Tier5Color, ItemInit.SEED_RS_ES_256K_DISK.get());
//		event.register(Tier5Color, ItemInit.SEED_AE2STUFF_256K_DISK.get());
//		event.register(Tier5Color, ItemInit.SEED_AE2STUFF_256K_FLUID_DISK.get());
		
		//Tier 6
		final ItemColor Tier6Color = (stack, tintIndex) -> {
			return 0xB02E26;
		};
		event.register(Tier6Color, ItemInit.SEED_RS_ED_1024K_DISK.get());
		event.register(Tier6Color, ItemInit.SEED_RS_FLUID_1024K_DISK.get());
		event.register(Tier6Color, ItemInit.SEED_RS_ES_1024K_DISK.get());
		
		//Tier 7
		final ItemColor Tier7Color = (stack, tintIndex) -> {
			return 0x5E7C16;
		};
		event.register(Tier7Color, ItemInit.SEED_RS_ED_4096K_DISK.get());
		event.register(Tier7Color, ItemInit.SEED_RS_ES_4096K_DISK.get());
		event.register(Tier7Color, ItemInit.SEED_RS_FLUID_4096K_DISK.get());
		
		//Tier 8
		final ItemColor Tier8Color = (stack, tintIndex) -> {
			return 0xF38BAA;
		};
		event.register(Tier8Color, ItemInit.SEED_RS_ED_16384K_DISK.get());
		event.register(Tier8Color, ItemInit.SEED_RS_ED_FLUID_16384K_DISK.get());
		event.register(Tier8Color, ItemInit.SEED_RS_ES_16384K_DISK.get());
		event.register(Tier8Color, ItemInit.SEED_RS_ES_FLUID_16384K_DISK.get());
		
		//Tier 9
		final ItemColor Tier9Color = (stack, tintIndex) -> {
			return 0x835432;
		};
		event.register(Tier9Color, ItemInit.SEED_RS_ED_65536K_DISK.get());
		event.register(Tier9Color, ItemInit.SEED_RS_ED_FLUID_65536K_DISK.get());
		event.register(Tier9Color, ItemInit.SEED_RS_ES_FLUID_65536K_DISK.get());
		event.register(Tier9Color, ItemInit.SEED_MEK_QIO_DRIVE.get());
//		event.register(Tier9Color, ItemInit.SEED_AE2STUFF_1M_DISK.get());
//        event.register(Tier9Color, ItemInit.SEED_AE2STUFF_1M_FLUID_DISK.get());
		
		//Tier 10
		final ItemColor Tier10Color = (stack, tintIndex) -> {
			return 0xF9FFFE;
		};
		event.register(Tier10Color, ItemInit.SEED_RS_ED_262M_DISK.get());
		event.register(Tier10Color, ItemInit.SEED_RS_ED_FLUID_262M_DISK.get());
		event.register(Tier10Color, ItemInit.SEED_RS_ES_FLUID_262144K_DISK.get());
		event.register(Tier10Color, ItemInit.SEED_MEK_QIO_HYPER_DRIVE.get());
//		event.register(Tier10Color, ItemInit.SEED_AE2STUFF_4M_DISK.get());
//        event.register(Tier10Color, ItemInit.SEED_AE2STUFF_4M_FLUID_DISK.get());
		
		//Tier 11
		final ItemColor Tier11Color = (stack, tintIndex) -> {
			return 0x3C44AA;
		};
		event.register(Tier11Color, ItemInit.SEED_RS_ED_1048M_DISK.get());
		event.register(Tier11Color, ItemInit.SEED_RS_ED_FLUID_1048M_DISK.get());
		event.register(Tier11Color, ItemInit.SEED_RS_ES_FLUID_1048576K_DISK.get());
		event.register(Tier11Color, ItemInit.SEED_MEK_QIO_TIME_DRIVE.get());
//		event.register(Tier11Color, ItemInit.SEED_AE2STUFF_16M_DISK.get());
//        event.register(Tier11Color, ItemInit.SEED_AE2STUFF_16M_FLUID_DISK.get());
		
		//Tier 12
		final ItemColor Tier12Color = (stack, tintIndex) -> {
			return 0x1D1D21;
		};
		//event.register(Tier12Color, ItemInit.SEED_RS_ED_INFINITE_DISK.get());
		//event.register(Tier12Color, ItemInit.SEED_RS_ED_FLUID_INFINITE_DISK.get());
		event.register(Tier12Color, ItemInit.SEED_MEK_QIO_SUPER_DRIVE.get());
	}

}