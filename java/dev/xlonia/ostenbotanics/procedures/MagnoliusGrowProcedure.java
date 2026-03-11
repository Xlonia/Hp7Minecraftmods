package dev.xlonia.ostenbotanics.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import dev.xlonia.ostenbotanics.init.OstenBotanicsModBlocks;

public class MagnoliusGrowProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() > 0.5) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (world instanceof ServerLevel _level)
				_level.registryAccess().registryOrThrow(Registries.CONFIGURED_FEATURE).getHolderOrThrow(FeatureUtils.createKey("osten_botanics:magnolius_tree")).value().place(_level, _level.getChunkSource().getGenerator(), _level.getRandom(),
						BlockPos.containing(x, y, z));
			if (world.isEmptyBlock(BlockPos.containing(x, y, z))) {
				world.setBlock(BlockPos.containing(x, y, z), OstenBotanicsModBlocks.MAGNOLIUS_SAPLING.get().defaultBlockState(), 3);
			}
		}
	}
}
