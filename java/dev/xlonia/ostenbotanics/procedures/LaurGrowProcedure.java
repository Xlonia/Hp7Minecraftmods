package dev.xlonia.ostenbotanics.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import dev.xlonia.ostenbotanics.init.OstenBotanicsModBlocks;

public class LaurGrowProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.25) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (Math.random() < 0.75) {
				if (world instanceof ServerLevel _level)
					_level.registryAccess().registryOrThrow(Registries.CONFIGURED_FEATURE).getHolderOrThrow(FeatureUtils.createKey("osten_botanics:laur_tree_1")).value().place(_level, _level.getChunkSource().getGenerator(), _level.getRandom(),
							BlockPos.containing(x, y, z));
			} else {
				if (world instanceof ServerLevel _level)
					_level.registryAccess().registryOrThrow(Registries.CONFIGURED_FEATURE).getHolderOrThrow(FeatureUtils.createKey("osten_botanics:laur_tree_2")).value().place(_level, _level.getChunkSource().getGenerator(), _level.getRandom(),
							BlockPos.containing(x, y, z));
			}
			if (world.isEmptyBlock(BlockPos.containing(x, y, z))) {
				world.setBlock(BlockPos.containing(x, y, z), OstenBotanicsModBlocks.LAUR_SAPLING.get().defaultBlockState(), 3);
			}
		}
	}
}
