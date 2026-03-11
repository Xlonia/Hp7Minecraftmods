package dev.xlonia.ostenbotanics.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class OsmanthusSaplingFertilizeProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBlockState(BlockPos.containing(x, y + 1, z)).getLightEmission(world, BlockPos.containing(x, y + 1, z)) >= 7) {
			return true;
		}
		return false;
	}
}
