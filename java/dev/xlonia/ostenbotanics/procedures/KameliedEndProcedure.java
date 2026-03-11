package dev.xlonia.ostenbotanics.procedures;

import net.minecraft.world.entity.Entity;

import dev.xlonia.ostenbotanics.network.OstenBotanicsModVariables;

public class KameliedEndProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 0;
			entity.getCapability(OstenBotanicsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.KameliedTicktime = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
