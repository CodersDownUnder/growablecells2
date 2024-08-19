package net.codersdownunder.growablecells.init;

import net.codersdownunder.growablecells.GrowableCellsMod;
import net.codersdownunder.growablecells.blocks.SingleCropBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BlockInit {
	
	public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(GrowableCellsMod.MODID);
	
	/*
	 *===================================================================================================================================
	 * AE2 Disks
	 *===================================================================================================================================
	 */

	//Normal
	public static final DeferredBlock<Block> CROP_AE2_1K_DISK = BLOCKS.register("crop_ae2_1k_disk", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));
	public static final DeferredBlock<Block> CROP_AE2_4K_DISK = BLOCKS.register("crop_ae2_4k_disk", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));
	public static final DeferredBlock<Block> CROP_AE2_16K_DISK = BLOCKS.register("crop_ae2_16k_disk", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));
	public static final DeferredBlock<Block> CROP_AE2_64K_DISK = BLOCKS.register("crop_ae2_64k_disk", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));
	
	//Spatial
	public static final DeferredBlock<Block> CROP_2CUBED_DISK = BLOCKS.register("crop_2cubed_disk", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));
	public static final DeferredBlock<Block> CROP_16CUBED_DISK = BLOCKS.register("crop_16cubed_disk", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));
	public static final DeferredBlock<Block> CROP_128CUBED_DISK = BLOCKS.register("crop_128cubed_disk", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));
	
	//Normal
	public static final DeferredBlock<Block> CROP_AE2_FLUID_1K_DISK = BLOCKS.register("crop_ae2_fluid_1k_disk", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));
	public static final DeferredBlock<Block> CROP_AE2_FLUID_4K_DISK = BLOCKS.register("crop_ae2_fluid_4k_disk", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));
	public static final DeferredBlock<Block> CROP_AE2_FLUID_16K_DISK = BLOCKS.register("crop_ae2_fluid_16k_disk", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));
	public static final DeferredBlock<Block> CROP_AE2_FLUID_64K_DISK = BLOCKS.register("crop_ae2_fluid_64k_disk", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));
	
//   /*
//    *===================================================================================================================================
//    * AE2 Extras Disks
//    *===================================================================================================================================
//    */
//	public static final DeferredBlock<Block> CROP_AE2STUFF_256K_DISK = BLOCKS.register("crop_ae2stuff_256k_disk", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));
//    public static final DeferredBlock<Block> CROP_AE2STUFF_1M_DISK = BLOCKS.register("crop_ae2stuff_1m_disk", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));
//    public static final DeferredBlock<Block> CROP_AE2STUFF_4M_DISK = BLOCKS.register("crop_ae2stuff_4m_disk", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));
//    public static final DeferredBlock<Block> CROP_AE2STUFF_16M_DISK = BLOCKS.register("crop_ae2stuff_16m_disk", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));
//
//    public static final DeferredBlock<Block> CROP_AE2STUFF_256K_FLUID_DISK = BLOCKS.register("crop_ae2stuff_256k_fluid_disk", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));
//    public static final DeferredBlock<Block> CROP_AE2STUFF_1M_FLUID_DISK = BLOCKS.register("crop_ae2stuff_1m_fluid_disk", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));
//    public static final DeferredBlock<Block> CROP_AE2STUFF_4M_FLUID_DISK = BLOCKS.register("crop_ae2stuff_4m_fluid_disk", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));
//    public static final DeferredBlock<Block> CROP_AE2STUFF_16M_FLUID_DISK = BLOCKS.register("crop_ae2stuff_16m_fluid_disk", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));
//
	
	/*
	 *===================================================================================================================================
	 * RS Disks
	 *===================================================================================================================================
	 */
	
	//Normal
	public static final DeferredBlock<Block> CROP_RS_1K_DISK = BLOCKS.register("crop_rs_1k_disk", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));
	public static final DeferredBlock<Block> CROP_RS_4K_DISK = BLOCKS.register("crop_rs_4k_disk", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));
	public static final DeferredBlock<Block> CROP_RS_16K_DISK = BLOCKS.register("crop_rs_16k_disk", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));
	public static final DeferredBlock<Block> CROP_RS_64K_DISK = BLOCKS.register("crop_rs_64k_disk", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));
	
	
	//Fluid
	public static final DeferredBlock<Block> CROP_RS_FLUID_64K_DISK = BLOCKS.register("crop_rs_fluid_64k_disk", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));
	public static final DeferredBlock<Block> CROP_RS_FLUID_256K_DISK = BLOCKS.register("crop_rs_fluid_256k_disk", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));
	public static final DeferredBlock<Block> CROP_RS_FLUID_1024K_DISK = BLOCKS.register("crop_rs_fluid_1024k_disk", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));
	public static final DeferredBlock<Block> CROP_RS_FLUID_4096K_DISK = BLOCKS.register("crop_rs_fluid_4096k_disk", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));
	
	
	/*
	 *===================================================================================================================================
	 * RS Extra Disks
	 *===================================================================================================================================
	 */
	
//	//Normal
//	public static final DeferredBlock<Block> CROP_RS_ED_256K_DISK = BLOCKS.register("crop_rs_ed_256k_disk", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));
//	public static final DeferredBlock<Block> CROP_RS_ED_1024K_DISK = BLOCKS.register("crop_rs_ed_1024k_disk", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));
//	public static final DeferredBlock<Block> CROP_RS_ED_4096K_DISK = BLOCKS.register("crop_rs_ed_4096k_disk", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));
//	public static final DeferredBlock<Block> CROP_RS_ED_16384K_DISK = BLOCKS.register("crop_rs_ed_16384k_disk", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));
//	public static final DeferredBlock<Block> CROP_RS_ED_65536K_DISK = BLOCKS.register("crop_rs_ed_65536k_disk", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));
//	public static final DeferredBlock<Block> CROP_RS_ED_262M_DISK = BLOCKS.register("crop_rs_ed_262m_disk", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));
//	public static final DeferredBlock<Block> CROP_RS_ED_1048M_DISK = BLOCKS.register("crop_rs_ed_1048m_disk", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));
//	//public static final DeferredBlock<Block> CROP_RS_ED_INFINITE_DISK = BLOCKS.register("crop_rs_ed_infinite_disk", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));
//
//	//Fluid
//	public static final DeferredBlock<Block> CROP_RS_ED_FLUID_16384K_DISK = BLOCKS.register("crop_rs_ed_fluid_16384k_disk", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));
//	public static final DeferredBlock<Block> CROP_RS_ED_FLUID_65536K_DISK = BLOCKS.register("crop_rs_ed_fluid_65536k_disk", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));
//	public static final DeferredBlock<Block> CROP_RS_ED_FLUID_262M_DISK = BLOCKS.register("crop_rs_ed_fluid_262m_disk", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));
//	public static final DeferredBlock<Block> CROP_RS_ED_FLUID_1048M_DISK = BLOCKS.register("crop_rs_ed_fluid_1048m_disk", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));
//	//public static final DeferredBlock<Block> CROP_RS_ED_FLUID_INFINITE_DISK = BLOCKS.register("crop_rs_ed_fluid_infinite_disk", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));
//
	/*
	 *===================================================================================================================================
	 * RS Extra Storage
	 *===================================================================================================================================
	 */
	
	//Normal
	public static final DeferredBlock<Block> CROP_RS_ES_256K_DISK = BLOCKS.register("crop_rs_es_256k_disk", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));
	public static final DeferredBlock<Block> CROP_RS_ES_1024K_DISK = BLOCKS.register("crop_rs_es_1024k_disk", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));
	public static final DeferredBlock<Block> CROP_RS_ES_4096K_DISK = BLOCKS.register("crop_rs_es_4096k_disk", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));
	public static final DeferredBlock<Block> CROP_RS_ES_16384K_DISK = BLOCKS.register("crop_rs_es_16384k_disk", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));

	//Fluid
	public static final DeferredBlock<Block> CROP_RS_ES_FLUID_16384K_DISK = BLOCKS.register("crop_rs_es_fluid_16384k_disk", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));
	public static final DeferredBlock<Block> CROP_RS_ES_FLUID_65536K_DISK = BLOCKS.register("crop_rs_es_fluid_65536k_disk", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));
	public static final DeferredBlock<Block> CROP_RS_ES_FLUID_262144K_DISK = BLOCKS.register("crop_rs_es_fluid_262144k_disk", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));
	public static final DeferredBlock<Block> CROP_RS_ES_FLUID_1048576K_DISK = BLOCKS.register("crop_rs_es_fluid_1048576k_disk", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));
	
	/*
	 *===================================================================================================================================
	 * Mekanism QIO
	 *===================================================================================================================================
	 */
	
	//Normal
	public static final DeferredBlock<Block> CROP_MEK_QIO_DRIVE = BLOCKS.register("crop_mek_qio_drive", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));
	public static final DeferredBlock<Block> CROP_MEK_QIO_HYPER_DRIVE = BLOCKS.register("crop_mek_qio_hyper_drive", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));
	public static final DeferredBlock<Block> CROP_MEK_QIO_TIME_DRIVE = BLOCKS.register("crop_mek_qio_time_drive", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));
	public static final DeferredBlock<Block> CROP_MEK_QIO_SUPER_DRIVE = BLOCKS.register("crop_mek_qio_super_drive", () -> new SingleCropBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().sound(SoundType.CROP)));



	public static void register(IEventBus eventBus) {
		BLOCKS.register(eventBus);
	}
	
}
