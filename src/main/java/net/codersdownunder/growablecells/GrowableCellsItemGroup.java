package net.codersdownunder.growablecells;

import net.codersdownunder.growablecells.init.ItemInit;
import net.minecraft.core.NonNullList;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.ForgeRegistries;

public class GrowableCellsItemGroup extends CreativeModeTab {

		  public GrowableCellsItemGroup(String label) {
		    super(label);
		    label = "flowerseeds";
		  }
			@Override
			public ItemStack makeIcon() {
				if (GrowableCellsMod.AE2Loaded) {
					return new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("ae2:1k_storage_cell")));
				}
				
				if (GrowableCellsMod.RSLoaded) {
					return new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("refinedstorage:1k_storage_disk")));
				}
				
				if (GrowableCellsMod.MEKLoaded) {
					return new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("mekanism:qio_drive_base")));
				}
				
				return new ItemStack(Items.BARRIER);
			}
		
		  @Override
		  public void fillItemList(NonNullList<ItemStack> items)
		  {
			  items.clear();
			  
			  if (GrowableCellsMod.AE2Loaded) {
				  items.add(new ItemStack(ItemInit.SEED_AE2_1K_DISK.get()));
				  items.add(new ItemStack(ItemInit.SEED_AE2_4K_DISK.get()));
				  items.add(new ItemStack(ItemInit.SEED_AE2_16K_DISK.get()));
				  items.add(new ItemStack(ItemInit.SEED_AE2_64K_DISK.get()));
				  
				  items.add(new ItemStack(ItemInit.SEED_2CUBED_DISK.get()));
				  items.add(new ItemStack(ItemInit.SEED_16CUBED_DISK.get()));
				  items.add(new ItemStack(ItemInit.SEED_128CUBED_DISK.get()));
				  
				  items.add(new ItemStack(ItemInit.SEED_AE2_FLUID_1K_DISK.get()));
				  items.add(new ItemStack(ItemInit.SEED_AE2_FLUID_4K_DISK.get()));
				  items.add(new ItemStack(ItemInit.SEED_AE2_FLUID_16K_DISK.get()));
				  items.add(new ItemStack(ItemInit.SEED_AE2_FLUID_64K_DISK.get()));
			  }
			  
//			  if (GrowableCellsMod.AE2StuffLoaded) {
//			      items.add(new ItemStack(ItemInit.SEED_AE2STUFF_256K_DISK.get()));
//			      items.add(new ItemStack(ItemInit.SEED_AE2STUFF_1M_DISK.get()));
//			      items.add(new ItemStack(ItemInit.SEED_AE2STUFF_4M_DISK.get()));
//			      items.add(new ItemStack(ItemInit.SEED_AE2STUFF_16M_DISK.get()));
//
//			      items.add(new ItemStack(ItemInit.SEED_AE2STUFF_256K_FLUID_DISK.get()));
//                  items.add(new ItemStack(ItemInit.SEED_AE2STUFF_1M_FLUID_DISK.get()));
//                  items.add(new ItemStack(ItemInit.SEED_AE2STUFF_4M_FLUID_DISK.get()));
//                  items.add(new ItemStack(ItemInit.SEED_AE2STUFF_16M_FLUID_DISK.get()));
//			  }
//
			  if (GrowableCellsMod.RSLoaded) {
				  items.add(new ItemStack(ItemInit.SEED_RS_1K_DISK.get()));
				  items.add(new ItemStack(ItemInit.SEED_RS_4K_DISK.get()));
				  items.add(new ItemStack(ItemInit.SEED_RS_16K_DISK.get()));
				  items.add(new ItemStack(ItemInit.SEED_RS_64K_DISK.get()));
				  
				  items.add(new ItemStack(ItemInit.SEED_RS_FLUID_64K_DISK.get()));
				  items.add(new ItemStack(ItemInit.SEED_RS_FLUID_256K_DISK.get()));
				  items.add(new ItemStack(ItemInit.SEED_RS_FLUID_1024K_DISK.get()));
				  items.add(new ItemStack(ItemInit.SEED_RS_FLUID_4096K_DISK.get()));				
			  }
			  
			  if (GrowableCellsMod.RSEDLoaded) {
				  items.add(new ItemStack(ItemInit.SEED_RS_ED_256K_DISK.get()));
				  items.add(new ItemStack(ItemInit.SEED_RS_ED_1024K_DISK.get()));
				  items.add(new ItemStack(ItemInit.SEED_RS_ED_4096K_DISK.get()));
				  items.add(new ItemStack(ItemInit.SEED_RS_ED_16384K_DISK.get()));
				  items.add(new ItemStack(ItemInit.SEED_RS_ED_65536K_DISK.get()));
				  items.add(new ItemStack(ItemInit.SEED_RS_ED_262M_DISK.get()));
				  items.add(new ItemStack(ItemInit.SEED_RS_ED_1048M_DISK.get()));
				  //items.add(new ItemStack(ItemInit.SEED_RS_ED_INFINITE_DISK.get()));
				  
				  items.add(new ItemStack(ItemInit.SEED_RS_ED_FLUID_16384K_DISK.get()));
				  items.add(new ItemStack(ItemInit.SEED_RS_ED_FLUID_65536K_DISK.get()));
				  items.add(new ItemStack(ItemInit.SEED_RS_ED_FLUID_262M_DISK.get()));
				  items.add(new ItemStack(ItemInit.SEED_RS_ED_FLUID_1048M_DISK.get()));
				  //items.add(new ItemStack(ItemInit.SEED_RS_ED_FLUID_INFINITE_DISK.get()));
			  }
			  
			  if (GrowableCellsMod.RSESLoaded) {
				  items.add(new ItemStack(ItemInit.SEED_RS_ES_256K_DISK.get()));
				  items.add(new ItemStack(ItemInit.SEED_RS_ES_1024K_DISK.get()));
				  items.add(new ItemStack(ItemInit.SEED_RS_ES_4096K_DISK.get()));
				  items.add(new ItemStack(ItemInit.SEED_RS_ES_16384K_DISK.get()));
				  
				  items.add(new ItemStack(ItemInit.SEED_RS_ES_FLUID_16384K_DISK.get()));
				  items.add(new ItemStack(ItemInit.SEED_RS_ES_FLUID_65536K_DISK.get()));
				  items.add(new ItemStack(ItemInit.SEED_RS_ES_FLUID_262144K_DISK.get()));
				  items.add(new ItemStack(ItemInit.SEED_RS_ES_FLUID_1048576K_DISK.get()));
			  }
			  			
			  if (GrowableCellsMod.MEKLoaded) {
				  items.add(new ItemStack(ItemInit.SEED_MEK_QIO_DRIVE.get()));
				  items.add(new ItemStack(ItemInit.SEED_MEK_QIO_HYPER_DRIVE.get()));
				  items.add(new ItemStack(ItemInit.SEED_MEK_QIO_TIME_DRIVE.get()));
				  items.add(new ItemStack(ItemInit.SEED_MEK_QIO_SUPER_DRIVE.get()));
			  }
			  
		  }



}
