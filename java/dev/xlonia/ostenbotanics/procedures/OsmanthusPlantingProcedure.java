package dev.xlonia.ostenbotanics.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class OsmanthusPlantingProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getMaxLocalRawBrightness(BlockPos.containing(x, y + 1, z)) > 13) {
			return true;
		}
		return false;
	}
}
