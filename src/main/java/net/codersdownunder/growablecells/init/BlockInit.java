package net.codersdownunder.growablecells.init;

import net.codersdownunder.growablecells.GrowableCellsMod;
import net.codersdownunder.growablecells.blocks.SingleCropBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.AbstractBlock;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	
public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GrowableCellsMod.MODID);
	
	/*
	 *===================================================================================================================================
	 * AE2 Disks
	 *===================================================================================================================================
	 */

	//Normal
	public static final RegistryObject<Block> CROP_AE2_1K_DISK = BLOCKS.register("crop_ae2_1k_disk", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	public static final RegistryObject<Block> CROP_AE2_4K_DISK = BLOCKS.register("crop_ae2_4k_disk", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	public static final RegistryObject<Block> CROP_AE2_16K_DISK = BLOCKS.register("crop_ae2_16k_disk", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	public static final RegistryObject<Block> CROP_AE2_64K_DISK = BLOCKS.register("crop_ae2_64k_disk", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	
	//Spatial
	public static final RegistryObject<Block> CROP_2CUBED_DISK = BLOCKS.register("crop_2cubed_disk", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	public static final RegistryObject<Block> CROP_16CUBED_DISK = BLOCKS.register("crop_16cubed_disk", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	public static final RegistryObject<Block> CROP_128CUBED_DISK = BLOCKS.register("crop_128cubed_disk", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	
	//Normal
	public static final RegistryObject<Block> CROP_AE2_FLUID_1K_DISK = BLOCKS.register("crop_ae2_fluid_1k_disk", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	public static final RegistryObject<Block> CROP_AE2_FLUID_4K_DISK = BLOCKS.register("crop_ae2_fluid_4k_disk", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	public static final RegistryObject<Block> CROP_AE2_FLUID_16K_DISK = BLOCKS.register("crop_ae2_fluid_16k_disk", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	public static final RegistryObject<Block> CROP_AE2_FLUID_64K_DISK = BLOCKS.register("crop_ae2_fluid_64k_disk", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
		
	
	/*
	 *===================================================================================================================================
	 * RS Disks
	 *===================================================================================================================================
	 */
	
	//Normal
	public static final RegistryObject<Block> CROP_RS_1K_DISK = BLOCKS.register("crop_rs_1k_disk", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	public static final RegistryObject<Block> CROP_RS_4K_DISK = BLOCKS.register("crop_rs_4k_disk", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	public static final RegistryObject<Block> CROP_RS_16K_DISK = BLOCKS.register("crop_rs_16k_disk", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	public static final RegistryObject<Block> CROP_RS_64K_DISK = BLOCKS.register("crop_rs_64k_disk", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	
	
	//Fluid
	public static final RegistryObject<Block> CROP_RS_FLUID_64K_DISK = BLOCKS.register("crop_rs_fluid_64k_disk", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	public static final RegistryObject<Block> CROP_RS_FLUID_256K_DISK = BLOCKS.register("crop_rs_fluid_256k_disk", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	public static final RegistryObject<Block> CROP_RS_FLUID_1024K_DISK = BLOCKS.register("crop_rs_fluid_1024k_disk", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	public static final RegistryObject<Block> CROP_RS_FLUID_4096K_DISK = BLOCKS.register("crop_rs_fluid_4096k_disk", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	
	
	/*
	 *===================================================================================================================================
	 * RS Extra Disks
	 *===================================================================================================================================
	 */
	
	//Normal
	public static final RegistryObject<Block> CROP_RS_ED_256K_DISK = BLOCKS.register("crop_rs_ed_256k_disk", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	public static final RegistryObject<Block> CROP_RS_ED_1024K_DISK = BLOCKS.register("crop_rs_ed_1024k_disk", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	public static final RegistryObject<Block> CROP_RS_ED_4096K_DISK = BLOCKS.register("crop_rs_ed_4096k_disk", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	public static final RegistryObject<Block> CROP_RS_ED_16384K_DISK = BLOCKS.register("crop_rs_ed_16384k_disk", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	public static final RegistryObject<Block> CROP_RS_ED_65536K_DISK = BLOCKS.register("crop_rs_ed_65536k_disk", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	public static final RegistryObject<Block> CROP_RS_ED_262M_DISK = BLOCKS.register("crop_rs_ed_262m_disk", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	public static final RegistryObject<Block> CROP_RS_ED_1048M_DISK = BLOCKS.register("crop_rs_ed_1048m_disk", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	public static final RegistryObject<Block> CROP_RS_ED_INFINITE_DISK = BLOCKS.register("crop_rs_ed_infinite_disk", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	
	//Fluid
	public static final RegistryObject<Block> CROP_RS_ED_FLUID_16384K_DISK = BLOCKS.register("crop_rs_ed_fluid_16384k_disk", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	public static final RegistryObject<Block> CROP_RS_ED_FLUID_65536K_DISK = BLOCKS.register("crop_rs_ed_fluid_65536k_disk", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	public static final RegistryObject<Block> CROP_RS_ED_FLUID_262M_DISK = BLOCKS.register("crop_rs_ed_fluid_262m_disk", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	public static final RegistryObject<Block> CROP_RS_ED_FLUID_1048M_DISK = BLOCKS.register("crop_rs_ed_fluid_1048m_disk", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	public static final RegistryObject<Block> CROP_RS_ED_FLUID_INFINITE_DISK = BLOCKS.register("crop_rs_ed_fluid_infinite_disk", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	
	/*
	 *===================================================================================================================================
	 * RS Extra Storage
	 *===================================================================================================================================
	 */
	
	//Normal
	public static final RegistryObject<Block> CROP_RS_ES_256K_DISK = BLOCKS.register("crop_rs_es_256k_disk", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	public static final RegistryObject<Block> CROP_RS_ES_1024K_DISK = BLOCKS.register("crop_rs_es_1024k_disk", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	public static final RegistryObject<Block> CROP_RS_ES_4096K_DISK = BLOCKS.register("crop_rs_es_4096k_disk", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	public static final RegistryObject<Block> CROP_RS_ES_16384K_DISK = BLOCKS.register("crop_rs_es_16384k_disk", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));

	//Fluid
	public static final RegistryObject<Block> CROP_RS_ES_FLUID_16384K_DISK = BLOCKS.register("crop_rs_es_fluid_16384k_disk", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	public static final RegistryObject<Block> CROP_RS_ES_FLUID_65536K_DISK = BLOCKS.register("crop_rs_es_fluid_65536k_disk", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	public static final RegistryObject<Block> CROP_RS_ES_FLUID_262144K_DISK = BLOCKS.register("crop_rs_es_fluid_262144k_disk", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));
	public static final RegistryObject<Block> CROP_RS_ES_FLUID_1048576K_DISK = BLOCKS.register("crop_rs_es_fluid_1048576k_disk", () -> new SingleCropBlock(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));

	
}
