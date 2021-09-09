package net.codersdownunder.growablecells.init;

import net.codersdownunder.growablecells.GrowableCellsMod;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GrowableCellsMod.MODID);

	/*
	 *===================================================================================================================================
	 * AE2 Disks
	 *===================================================================================================================================
	 */

	//Normal
	public static final RegistryObject<Item> SEED_AE2_1K_DISK = ITEMS.register("seed_ae2_1k_disk", () -> new BlockItem(BlockInit.CROP_AE2_1K_DISK.get(), new Item.Properties()));
	public static final RegistryObject<Item> SEED_AE2_4K_DISK = ITEMS.register("seed_ae2_4k_disk", () -> new BlockItem(BlockInit.CROP_AE2_4K_DISK.get(), new Item.Properties()));
	public static final RegistryObject<Item> SEED_AE2_16K_DISK = ITEMS.register("seed_ae2_16k_disk", () -> new BlockItem(BlockInit.CROP_AE2_16K_DISK.get(), new Item.Properties()));
	public static final RegistryObject<Item> SEED_AE2_64K_DISK = ITEMS.register("seed_ae2_64k_disk", () -> new BlockItem(BlockInit.CROP_AE2_64K_DISK.get(), new Item.Properties()));
	
	//Spatial
	public static final RegistryObject<Item> SEED_2CUBED_DISK = ITEMS.register("seed_2cubed_disk", () -> new BlockItem(BlockInit.CROP_2CUBED_DISK.get(), new Item.Properties()));
	public static final RegistryObject<Item> SEED_16CUBED_DISK = ITEMS.register("seed_16cubed_disk", () -> new BlockItem(BlockInit.CROP_16CUBED_DISK.get(), new Item.Properties()));
	public static final RegistryObject<Item> SEED_128CUBED_DISK = ITEMS.register("seed_128cubed_disk", () -> new BlockItem(BlockInit.CROP_128CUBED_DISK.get(), new Item.Properties()));
	
	//Fluid
	public static final RegistryObject<Item> SEED_AE2_FLUID_1K_DISK = ITEMS.register("seed_ae2_fluid_1k_disk", () -> new BlockItem(BlockInit.CROP_AE2_FLUID_1K_DISK.get(), new Item.Properties()));
	public static final RegistryObject<Item> SEED_AE2_FLUID_4K_DISK = ITEMS.register("seed_ae2_fluid_4k_disk", () -> new BlockItem(BlockInit.CROP_AE2_FLUID_4K_DISK.get(), new Item.Properties()));
	public static final RegistryObject<Item> SEED_AE2_FLUID_16K_DISK = ITEMS.register("seed_ae2_fluid_16k_disk", () -> new BlockItem(BlockInit.CROP_AE2_FLUID_16K_DISK.get(), new Item.Properties()));
	public static final RegistryObject<Item> SEED_AE2_FLUID_64K_DISK = ITEMS.register("seed_ae2_fluid_64k_disk", () -> new BlockItem(BlockInit.CROP_AE2_FLUID_64K_DISK.get(), new Item.Properties()));
	
	
	/*
     *===================================================================================================================================
     * AE2 Extras Disks
     *===================================================================================================================================
     */

    //Normal
    public static final RegistryObject<Item> SEED_AE2STUFF_256K_DISK = ITEMS.register("seed_ae2stuff_256k_disk", () -> new BlockItem(BlockInit.CROP_AE2STUFF_256K_DISK.get(), new Item.Properties()));
    public static final RegistryObject<Item> SEED_AE2STUFF_1M_DISK = ITEMS.register("seed_ae2stuff_1m_disk", () -> new BlockItem(BlockInit.CROP_AE2STUFF_1M_DISK.get(), new Item.Properties()));
    public static final RegistryObject<Item> SEED_AE2STUFF_4M_DISK = ITEMS.register("seed_ae2stuff_4m_disk", () -> new BlockItem(BlockInit.CROP_AE2STUFF_4M_DISK.get(), new Item.Properties()));
    public static final RegistryObject<Item> SEED_AE2STUFF_16M_DISK = ITEMS.register("seed_ae2stuff_16m_disk", () -> new BlockItem(BlockInit.CROP_AE2STUFF_16M_DISK.get(), new Item.Properties()));
    
    //Fluid
    public static final RegistryObject<Item> SEED_AE2STUFF_256K_FLUID_DISK = ITEMS.register("seed_ae2stuff_256k_fluid_disk", () -> new BlockItem(BlockInit.CROP_AE2STUFF_256K_FLUID_DISK.get(), new Item.Properties()));
    public static final RegistryObject<Item> SEED_AE2STUFF_1M_FLUID_DISK = ITEMS.register("seed_ae2stuff_1m_fluid_disk", () -> new BlockItem(BlockInit.CROP_AE2STUFF_1M_FLUID_DISK.get(), new Item.Properties()));
    public static final RegistryObject<Item> SEED_AE2STUFF_4M_FLUID_DISK = ITEMS.register("seed_ae2stuff_4m_fluid_disk", () -> new BlockItem(BlockInit.CROP_AE2STUFF_4M_FLUID_DISK.get(), new Item.Properties()));
    public static final RegistryObject<Item> SEED_AE2STUFF_16M_FLUID_DISK = ITEMS.register("seed_ae2stuff_16m_fluid_disk", () -> new BlockItem(BlockInit.CROP_AE2STUFF_16M_FLUID_DISK.get(), new Item.Properties()));
    
	
	/*
	 *===================================================================================================================================
	 * RS Disks
	 *===================================================================================================================================
	 */
	
	//Normal
	public static final RegistryObject<Item> SEED_RS_1K_DISK = ITEMS.register("seed_rs_1k_disk", () -> new BlockItem(BlockInit.CROP_RS_1K_DISK.get(), new Item.Properties()));
	public static final RegistryObject<Item> SEED_RS_4K_DISK = ITEMS.register("seed_rs_4k_disk", () -> new BlockItem(BlockInit.CROP_RS_4K_DISK.get(), new Item.Properties()));
	public static final RegistryObject<Item> SEED_RS_16K_DISK = ITEMS.register("seed_rs_16k_disk", () -> new BlockItem(BlockInit.CROP_RS_16K_DISK.get(), new Item.Properties()));
	public static final RegistryObject<Item> SEED_RS_64K_DISK = ITEMS.register("seed_rs_64k_disk", () -> new BlockItem(BlockInit.CROP_RS_64K_DISK.get(), new Item.Properties()));
	
	
	//Fluid
	public static final RegistryObject<Item> SEED_RS_FLUID_64K_DISK = ITEMS.register("seed_rs_fluid_64k_disk", () -> new BlockItem(BlockInit.CROP_RS_FLUID_64K_DISK.get(), new Item.Properties()));
	public static final RegistryObject<Item> SEED_RS_FLUID_256K_DISK = ITEMS.register("seed_rs_fluid_256k_disk", () -> new BlockItem(BlockInit.CROP_RS_FLUID_256K_DISK.get(), new Item.Properties()));
	public static final RegistryObject<Item> SEED_RS_FLUID_1024K_DISK = ITEMS.register("seed_rs_fluid_1024k_disk", () -> new BlockItem(BlockInit.CROP_RS_FLUID_1024K_DISK.get(), new Item.Properties()));
	public static final RegistryObject<Item> SEED_RS_FLUID_4096K_DISK = ITEMS.register("seed_rs_fluid_4096k_disk", () -> new BlockItem(BlockInit.CROP_RS_FLUID_4096K_DISK.get(), new Item.Properties()));
	
	
	/*
	 *===================================================================================================================================
	 * RS Extra Disks
	 *===================================================================================================================================
	 */
	
	//Normal
	public static final RegistryObject<Item> SEED_RS_ED_256K_DISK = ITEMS.register("seed_rs_ed_256k_disk", () -> new BlockItem(BlockInit.CROP_RS_ED_256K_DISK.get(), new Item.Properties()));
	public static final RegistryObject<Item> SEED_RS_ED_1024K_DISK = ITEMS.register("seed_rs_ed_1024k_disk", () -> new BlockItem(BlockInit.CROP_RS_ED_1024K_DISK.get(), new Item.Properties()));
	public static final RegistryObject<Item> SEED_RS_ED_4096K_DISK = ITEMS.register("seed_rs_ed_4096k_disk", () -> new BlockItem(BlockInit.CROP_RS_ED_4096K_DISK.get(), new Item.Properties()));
	public static final RegistryObject<Item> SEED_RS_ED_16384K_DISK = ITEMS.register("seed_rs_ed_16384k_disk", () -> new BlockItem(BlockInit.CROP_RS_ED_16384K_DISK.get(), new Item.Properties()));
	public static final RegistryObject<Item> SEED_RS_ED_65536K_DISK = ITEMS.register("seed_rs_ed_65536k_disk", () -> new BlockItem(BlockInit.CROP_RS_ED_65536K_DISK.get(), new Item.Properties()));
	public static final RegistryObject<Item> SEED_RS_ED_262M_DISK = ITEMS.register("seed_rs_ed_262m_disk", () -> new BlockItem(BlockInit.CROP_RS_ED_262M_DISK.get(), new Item.Properties()));
	public static final RegistryObject<Item> SEED_RS_ED_1048M_DISK = ITEMS.register("seed_rs_ed_1048m_disk", () -> new BlockItem(BlockInit.CROP_RS_ED_1048M_DISK.get(), new Item.Properties()));
	public static final RegistryObject<Item> SEED_RS_ED_INFINITE_DISK = ITEMS.register("seed_rs_ed_infinite_disk", () -> new BlockItem(BlockInit.CROP_RS_ED_INFINITE_DISK.get(), new Item.Properties()));
	
	//Fluid
	public static final RegistryObject<Item> SEED_RS_ED_FLUID_16384K_DISK = ITEMS.register("seed_rs_ed_fluid_16384k_disk", () -> new BlockItem(BlockInit.CROP_RS_ED_FLUID_16384K_DISK.get(), new Item.Properties()));
	public static final RegistryObject<Item> SEED_RS_ED_FLUID_65536K_DISK = ITEMS.register("seed_rs_ed_fluid_65536k_disk", () -> new BlockItem(BlockInit.CROP_RS_ED_FLUID_65536K_DISK.get(), new Item.Properties()));
	public static final RegistryObject<Item> SEED_RS_ED_FLUID_262M_DISK = ITEMS.register("seed_rs_ed_fluid_262m_disk", () -> new BlockItem(BlockInit.CROP_RS_ED_FLUID_262M_DISK.get(), new Item.Properties()));
	public static final RegistryObject<Item> SEED_RS_ED_FLUID_1048M_DISK = ITEMS.register("seed_rs_ed_fluid_1048m_disk", () -> new BlockItem(BlockInit.CROP_RS_ED_FLUID_1048M_DISK.get(), new Item.Properties()));
	public static final RegistryObject<Item> SEED_RS_ED_FLUID_INFINITE_DISK = ITEMS.register("seed_rs_ed_fluid_infinite_disk", () -> new BlockItem(BlockInit.CROP_RS_ED_FLUID_INFINITE_DISK.get(), new Item.Properties()));
	
	/*
	 *===================================================================================================================================
	 * RS Extra Storage
	 *===================================================================================================================================
	 */
	
	//Normal
	public static final RegistryObject<Item> SEED_RS_ES_256K_DISK = ITEMS.register("seed_rs_es_256k_disk", () -> new BlockItem(BlockInit.CROP_RS_ES_256K_DISK.get(), new Item.Properties()));
	public static final RegistryObject<Item> SEED_RS_ES_1024K_DISK = ITEMS.register("seed_rs_es_1024k_disk", () -> new BlockItem(BlockInit.CROP_RS_ES_1024K_DISK.get(), new Item.Properties()));
	public static final RegistryObject<Item> SEED_RS_ES_4096K_DISK = ITEMS.register("seed_rs_es_4096k_disk", () -> new BlockItem(BlockInit.CROP_RS_ES_4096K_DISK.get(), new Item.Properties()));
	public static final RegistryObject<Item> SEED_RS_ES_16384K_DISK = ITEMS.register("seed_rs_es_16384k_disk", () -> new BlockItem(BlockInit.CROP_RS_ES_16384K_DISK.get(), new Item.Properties()));

	//Fluid
	public static final RegistryObject<Item> SEED_RS_ES_FLUID_16384K_DISK = ITEMS.register("seed_rs_es_fluid_16384k_disk", () -> new BlockItem(BlockInit.CROP_RS_ES_FLUID_16384K_DISK.get(), new Item.Properties()));
	public static final RegistryObject<Item> SEED_RS_ES_FLUID_65536K_DISK = ITEMS.register("seed_rs_es_fluid_65536k_disk", () -> new BlockItem(BlockInit.CROP_RS_ES_FLUID_65536K_DISK.get(), new Item.Properties()));
	public static final RegistryObject<Item> SEED_RS_ES_FLUID_262144K_DISK = ITEMS.register("seed_rs_es_fluid_262144k_disk", () -> new BlockItem(BlockInit.CROP_RS_ES_FLUID_262144K_DISK.get(), new Item.Properties()));
	public static final RegistryObject<Item> SEED_RS_ES_FLUID_1048576K_DISK = ITEMS.register("seed_rs_es_fluid_1048576k_disk", () -> new BlockItem(BlockInit.CROP_RS_ES_FLUID_1048576K_DISK.get(), new Item.Properties()));
	
	/*
	 *===================================================================================================================================
	 * Mekanism
	 *===================================================================================================================================
	 */
	
	//Normal
	public static final RegistryObject<Item> SEED_MEK_QIO_DRIVE = ITEMS.register("seed_mek_qio_drive", () -> new BlockItem(BlockInit.CROP_MEK_QIO_DRIVE.get(), new Item.Properties()));
	public static final RegistryObject<Item> SEED_MEK_QIO_HYPER_DRIVE = ITEMS.register("seed_mek_qio_hyper_drive", () -> new BlockItem(BlockInit.CROP_MEK_QIO_HYPER_DRIVE.get(), new Item.Properties()));
	public static final RegistryObject<Item> SEED_MEK_QIO_TIME_DRIVE = ITEMS.register("seed_mek_qio_time_drive", () -> new BlockItem(BlockInit.CROP_MEK_QIO_TIME_DRIVE.get(), new Item.Properties()));
	public static final RegistryObject<Item> SEED_MEK_QIO_SUPER_DRIVE = ITEMS.register("seed_mek_qio_super_drive", () -> new BlockItem(BlockInit.CROP_MEK_QIO_SUPER_DRIVE.get(), new Item.Properties()));

}
