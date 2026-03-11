package dev.xlonia.ostenbotanics.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class OBSSaplingGrowRequireProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double GrowSpace = 0;
		double SpaceJa = 0;
		double lx = 0;
		double lz = 0;
		GrowSpace = 1;
		SpaceJa = 0;
		lx = -1;
		lz = -1;
		if (world.isEmptyBlock(BlockPos.containing(x, y + GrowSpace, z))) {
			GrowSpace = 2;
			while (GrowSpace < 6 && SpaceJa == 0) {
				while (lz < 2 && SpaceJa == 0) {
					for (int index2 = 0; index2 < 3; index2++) {
						if (world.isEmptyBlock(BlockPos.containing(x + lx, y + GrowSpace, z + lz))) {
							lx = lx + 1;
						} else {
							SpaceJa = SpaceJa + 1;
						}
					}
					lx = -1;
					lz = lz + 1;
				}
				lx = -1;
				lz = -1;
				GrowSpace = GrowSpace + 1;
			}
		} else {
			return false;
		}
		if (SpaceJa == 0) {
			return true;
		}
		return false;
	}
}
