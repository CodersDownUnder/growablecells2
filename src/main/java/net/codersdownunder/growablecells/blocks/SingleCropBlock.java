package net.codersdownunder.growablecells.blocks;



import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;


public class SingleCropBlock extends CropBlock {

	private static final VoxelShape[] SHAPES = new VoxelShape[] {
			Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D),
			Block.box(0.0D, 0.0D, 0.0D, 16.0D, 3.0D, 16.0D),
			Block.box(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D),
			Block.box(0.0D, 0.0D, 0.0D, 16.0D, 5.0D, 16.0D),
			Block.box(0.0D, 0.0D, 0.0D, 16.0D, 6.0D, 16.0D),
			Block.box(0.0D, 0.0D, 0.0D, 16.0D, 7.0D, 16.0D),
			Block.box(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D),
			Block.box(0.0D, 0.0D, 0.0D, 16.0D, 9.0D, 16.0D) };

	public SingleCropBlock(Properties builder) {
		super(builder);
	}

	@Override
	public ItemStack getCloneItemStack(BlockGetter pLevel, BlockPos pPos, BlockState pState) {
		return new ItemStack(this.asItem());
	}

	//	@SuppressWarnings("deprecation")
//	@Override
//	public List<ItemStack> getDrops(BlockState state, Builder builder) {
//		return super.getDrops(state, builder);
//	}

	/*@Override
	protected IItemProvider getSeedsItem() {
	    
		if (this.getBlock() == BlockInit.CROP_128CUBED_DISK.get()) {
			return ItemInit.SEED_128CUBED_DISK.get();
		} else if (this.getBlock() == BlockInit.CROP_16CUBED_DISK.get()) {
			return ItemInit.SEED_16CUBED_DISK.get();
		}else if (this.getBlock() == BlockInit.CROP_2CUBED_DISK.get()) {
			return ItemInit.SEED_2CUBED_DISK.get();
		}else if (this.getBlock() == BlockInit.CROP_AE2_16K_DISK.get()) {
			return ItemInit.SEED_AE2_16K_DISK.get();
		}else if (this.getBlock() == BlockInit.CROP_AE2_1K_DISK.get()) {
			return ItemInit.SEED_AE2_1K_DISK.get();
		}else if (this.getBlock() == BlockInit.CROP_AE2_4K_DISK.get()) {
			return ItemInit.SEED_AE2_4K_DISK.get();
		}else if (this.getBlock() == BlockInit.CROP_AE2_64K_DISK.get()) {
			return ItemInit.SEED_AE2_64K_DISK.get();
		}else if (this.getBlock() == BlockInit.CROP_RS_16K_DISK.get()) {
			return ItemInit.SEED_RS_16K_DISK.get();
		}else if (this.getBlock() == BlockInit.CROP_RS_1K_DISK.get()) {
			return ItemInit.SEED_RS_1K_DISK.get();
		}else if (this.getBlock() == BlockInit.CROP_RS_4K_DISK.get()) {
			return ItemInit.SEED_RS_4K_DISK.get();
		}else if (this.getBlock() == BlockInit.CROP_RS_64K_DISK.get()) {
			return ItemInit.SEED_RS_64K_DISK.get();
		}else if (this.getBlock() == BlockInit.CROP_RS_ED_1024K_DISK.get()) {
			return ItemInit.SEED_RS_ED_1024K_DISK.get();
		}else if (this.getBlock() == BlockInit.CROP_RS_ED_1048M_DISK.get()) {
			return ItemInit.SEED_RS_ED_1048M_DISK.get();
		}else if (this.getBlock() == BlockInit.CROP_RS_ED_16384K_DISK.get()) {
			return ItemInit.SEED_RS_ED_16384K_DISK.get();
		}else if (this.getBlock() == BlockInit.CROP_RS_ED_256K_DISK.get()) {
			return ItemInit.SEED_RS_ED_256K_DISK.get();
		}else if (this.getBlock() == BlockInit.CROP_RS_ED_262M_DISK.get()) {
			return ItemInit.SEED_RS_ED_262M_DISK.get();
		}else if (this.getBlock() == BlockInit.CROP_RS_ED_4096K_DISK.get()) {
			return ItemInit.SEED_RS_ED_4096K_DISK.get();
		}else if (this.getBlock() == BlockInit.CROP_RS_ED_65536K_DISK.get()) {
			return ItemInit.SEED_RS_ED_65536K_DISK.get();
		}else if (this.getBlock() == BlockInit.CROP_RS_ED_FLUID_1048M_DISK.get()) {
			return ItemInit.SEED_RS_ED_FLUID_1048M_DISK.get();
		}else if (this.getBlock() == BlockInit.CROP_RS_ED_FLUID_16384K_DISK.get()) {
			return ItemInit.SEED_RS_ED_FLUID_16384K_DISK.get();
		}else if (this.getBlock() == BlockInit.CROP_RS_ED_FLUID_262M_DISK.get()) {
			return ItemInit.SEED_RS_ED_FLUID_262M_DISK.get();
		}else if (this.getBlock() == BlockInit.CROP_RS_ED_FLUID_65536K_DISK.get()) {
			return ItemInit.SEED_RS_ED_FLUID_65536K_DISK.get();
		}else if (this.getBlock() == BlockInit.CROP_RS_ED_FLUID_INFINITE_DISK.get()) {
			return ItemInit.SEED_RS_ED_FLUID_INFINITE_DISK.get();
		}else if (this.getBlock() == BlockInit.CROP_RS_ED_INFINITE_DISK.get()) {
			return ItemInit.SEED_RS_ED_INFINITE_DISK.get();
		}else if (this.getBlock() == BlockInit.CROP_RS_ES_1024K_DISK.get()) {
			return ItemInit.SEED_RS_ES_1024K_DISK.get();
		}else if (this.getBlock() == BlockInit.CROP_RS_ES_16384K_DISK.get()) {
			return ItemInit.SEED_RS_ES_16384K_DISK.get();
		}else if (this.getBlock() == BlockInit.CROP_RS_ES_256K_DISK.get()) {
			return ItemInit.SEED_RS_ES_256K_DISK.get();
		}else if (this.getBlock() == BlockInit.CROP_RS_ES_4096K_DISK.get()) {
			return ItemInit.SEED_RS_ES_4096K_DISK.get();
		}else if (this.getBlock() == BlockInit.CROP_RS_ES_FLUID_1048576K_DISK.get()) {
			return ItemInit.SEED_RS_ES_FLUID_1048576K_DISK.get();
		}else if (this.getBlock() == BlockInit.CROP_RS_ES_FLUID_16384K_DISK.get()) {
			return ItemInit.SEED_RS_ES_FLUID_16384K_DISK.get();
		}else if (this.getBlock() == BlockInit.CROP_RS_ES_FLUID_262144K_DISK.get()) {
			return ItemInit.SEED_RS_ES_FLUID_262144K_DISK.get();
		}else if (this.getBlock() == BlockInit.CROP_RS_ES_FLUID_65536K_DISK.get()) {
			return ItemInit.SEED_RS_ES_FLUID_65536K_DISK.get();
		}else if (this.getBlock() == BlockInit.CROP_RS_FLUID_1024K_DISK.get()) {
			return ItemInit.SEED_RS_FLUID_1024K_DISK.get();
		}else if (this.getBlock() == BlockInit.CROP_RS_FLUID_256K_DISK.get()) {
			return ItemInit.SEED_RS_FLUID_256K_DISK.get();
		}else if (this.getBlock() == BlockInit.CROP_RS_FLUID_4096K_DISK.get()) {
			return ItemInit.SEED_RS_FLUID_4096K_DISK.get();
		}else if (this.getBlock() == BlockInit.CROP_RS_FLUID_64K_DISK.get()) {
			return ItemInit.SEED_RS_FLUID_64K_DISK.get();
		}else if (this.getBlock() == BlockInit.CROP_AE2_16K_DISK.get()) {
            return ItemInit.SEED_AE2st.get();
        }else if (this.getBlock() == BlockInit.CROP_AE2_1K_DISK.get()) {
            return ItemInit.SEED_AE2_1K_DISK.get();
        }else if (this.getBlock() == BlockInit.CROP_AE2_4K_DISK.get()) {
            return ItemInit.SEED_AE2_4K_DISK.get();
        }else if (this.getBlock() == BlockInit.CROP_AE2_64K_DISK.get()) {
            return ItemInit.SEED_AE2_64K_DISK.get();
        } else {
			return Items.PAPER;
		}
	}*/
	
	
	@Override
	public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
		return SHAPES[state.getValue(this.getAgeProperty())];
	}

}