
package dev.xlonia.ostenbotanics.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import dev.xlonia.ostenbotanics.procedures.OBSSaplingGrowRequireProcedure;
import dev.xlonia.ostenbotanics.procedures.GinkgoGrowProcedure;

public class GinkgoSaplingBlock extends FlowerBlock implements BonemealableBlock {
	public GinkgoSaplingBlock() {
		super(() -> MobEffects.MOVEMENT_SPEED, 0, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).sound(SoundType.PINK_PETALS).instabreak().noCollission().offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY));
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 100;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 60;
	}

	@Override
	public void randomTick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		GinkgoGrowProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public boolean isValidBonemealTarget(LevelReader worldIn, BlockPos pos, BlockState blockstate, boolean clientSide) {
		return true;
	}

	@Override
	public boolean isBonemealSuccess(Level world, RandomSource random, BlockPos pos, BlockState blockstate) {
		return OBSSaplingGrowRequireProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public void performBonemeal(ServerLevel world, RandomSource random, BlockPos pos, BlockState blockstate) {
		GinkgoGrowProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}
