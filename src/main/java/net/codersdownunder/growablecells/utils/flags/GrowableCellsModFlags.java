package net.codersdownunder.growablecells.utils.flags;

import net.codersdownunder.growablecells.GrowableCellsMod;

public class GrowableCellsModFlags {
	
	private static final FlagManager FLAG_MANAGER = new FlagManager(GrowableCellsMod.MODID);

    public static FlagManager manager() {

        return FLAG_MANAGER;
    }

    public static void setFlag(String flag, boolean enable) {

        FLAG_MANAGER.putFlag(flag, enable);
    }

    public static boolean getFlag(String flag) {

        return FLAG_MANAGER.getFlag(flag);
    }
    
    /*
     *===================================================================================================================================
     * Applied Energistics 2
     *===================================================================================================================================
     */
    public static String FLAG_AE2_1K_DISK = "ae2_1k_disk";
    public static String FLAG_AE2_4K_DISK = "ae2_4k_disk";
    public static String FLAG_AE2_16K_DISK = "ae2_16k_disk";
    public static String FLAG_AE2_64K_DISK = "ae2_64k_disk";
    public static String FLAG_2CUBED_DISK = "2cubed_disk";
    public static String FLAG_16CUBED_DISK = "16cubed_disk";
    public static String FLAG_128CUBED_DISK = "128cubed_disk";
    public static String FLAG_AE2_FLUID_1K_DISK = "ae2_fluid_1k_disk";
    public static String FLAG_AE2_FLUID_4K_DISK = "ae2_fluid_4k_disk";
    public static String FLAG_AE2_FLUID_16K_DISK = "ae2_fluid_16k_disk";
    public static String FLAG_AE2_FLUID_64K_DISK = "ae2_fluid_64k_disk";
    
    /*
     *===================================================================================================================================
     * Refined Storage
     *===================================================================================================================================
     */
    public static String FLAG_RS_1K_DISK = "rs_1k_disk";
    public static String FLAG_RS_4K_DISK = "rs_4k_disk";
    public static String FLAG_RS_16K_DISK = "rs_16k_disk";
    public static String FLAG_RS_64K_DISK = "rs_64k_disk";
    public static String FLAG_RS_FLUID_64K_DISK = "rs_fluid_64k_disk";
    public static String FLAG_RS_FLUID_256K_DISK = "rs_fluid_256k_disk";
    public static String FLAG_RS_FLUID_1024K_DISK = "rs_fluid_1024k_disk";
    public static String FLAG_RS_FLUID_4096K_DISK = "rs_fluid_4096k_disk";
    
    /*
     *===================================================================================================================================
     * Refined Storage Extra Disks
     *===================================================================================================================================
     */
    public static String FLAG_RS_ED_256K_DISK = "rs_ed_256k_disk";
    public static String FLAG_RS_ED_1024K_DISK = "rs_ed_1024k_disk";
    public static String FLAG_RS_ED_4096K_DISK = "rs_ed_4096k_disk";
    public static String FLAG_RS_ED_16384K_DISK = "rs_ed_16384k_disk";
    public static String FLAG_RS_ED_65536K_DISK = "rs_ed_65536k_disk";
    public static String FLAG_RS_ED_262M_DISK = "rs_ed_262m_disk";
    public static String FLAG_RS_ED_1048M_DISK = "rs_ed_1048m_disk";
    public static String FLAG_RS_ED_INFINITE_DISK = "rs_ed_infinite_disk";
    public static String FLAG_RS_ED_FLUID_16384K_DISK = "rs_ed_fluid_16384k_disk";
    public static String FLAG_RS_ED_FLUID_65536K_DISK = "rs_ed_fluid_65536k_disk";
    public static String FLAG_RS_ED_FLUID_262M_DISK = "rs_ed_fluid_262m_disk";
    public static String FLAG_RS_ED_FLUID_1048M_DISK = "rs_ed_fluid_1048m_disk";
    public static String FLAG_RS_ED_FLUID_INFINITE_DISK = "rs_ed_fluid_infinite_disk";
    
    
    /*
     *===================================================================================================================================
     * Refined Storage Extra Storage
     *===================================================================================================================================
     */
  
    public static String FLAG_RS_ES_256K_DISK = "rs_es_256k_disk";
    public static String FLAG_RS_ES_1024K_DISK = "rs_es_1024k_disk";
    public static String FLAG_RS_ES_4096K_DISK = "rs_es_4096k_disk";
    public static String FLAG_RS_ES_16384K_DISK = "rs_es_16384k_disk";
    public static String FLAG_RS_ES_FLUID_16384K_DISK = "rs_es_fluid_16384k_disk";
    public static String FLAG_RS_ES_FLUID_65536K_DISK = "rs_es_fluid_65536k_disk";
    public static String FLAG_RS_ES_FLUID_262144K_DISK = "rs_es_fluid_262144k_disk";
    public static String FLAG_RS_ES_FLUID_1048576K_DISK = "rs_es_fluid_1048576k_disk";
    
    
    /*
     *===================================================================================================================================
     * Mekanism
     *===================================================================================================================================
     */
    
    public static String FLAG_MEK_QIO_DRIVE = "mek_qio_drive";
    public static String FLAG_MEK_QIO_HYPER_DRIVE = "mek_qio_hyper_drive";
    public static String FLAG_MEK_QIO_TIME_DRIVE = "mek_qio_time_drive";
    public static String FLAG_MEK_QIO_SUPER_DRIVE = "mek_qio_super_drive";
}
