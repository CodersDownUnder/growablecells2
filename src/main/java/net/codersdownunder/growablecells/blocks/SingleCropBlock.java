package net.codersdownunder.growablecells.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.neoforged.neoforge.common.Tags;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;
import java.util.List;

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
	@NotNull
	public ItemStack getCloneItemStack(BlockState state, HitResult target, LevelReader level, BlockPos pos, Player player) {
		return new ItemStack(this.asItem());
	}

	@Override
	@NotNull
	public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
		return SHAPES[state.getValue(this.getAgeProperty())];
	}


	@Override
	@NotNull
	public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
		if (world instanceof ServerLevel serverLevel) {

			int age = state.getValue(AGE);
			boolean mature = age == 7;
			Block block = state.getBlock();
			if (!mature && player.getItemInHand(hand).is(Items.BONE_MEAL)) {
				return InteractionResult.PASS;
			} else if (age > 1) {
				List<ItemStack> drops = Block.getDrops(state, serverLevel, pos, null);
				for (ItemStack stack : drops) {
					if (!stack.is(Tags.Items.SEEDS)) {
						popResource(world, pos, stack);
					}
				}
				BlockState blockstate = state.setValue(AGE, 5);
				world.setBlock(pos, blockstate, 2);
				world.gameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Context.of(player, blockstate));
				return InteractionResult.sidedSuccess(world.isClientSide);
			} else {
				return super.use(state, world, pos, player, hand, hit);
			}
		}
        return InteractionResult.PASS;
    }
}

