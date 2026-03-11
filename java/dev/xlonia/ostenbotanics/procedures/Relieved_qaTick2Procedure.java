package dev.xlonia.ostenbotanics.procedures;

import net.minecraft.world.entity.Entity;

public class Relieved_qaTick2Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("foodTickTimer", 10);
	}
}
