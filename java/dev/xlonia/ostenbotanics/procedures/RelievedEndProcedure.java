package dev.xlonia.ostenbotanics.procedures;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import dev.xlonia.ostenbotanics.network.OstenBotanicsModVariables;

public class RelievedEndProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(OstenBotanicsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OstenBotanicsModVariables.PlayerVariables())).RelievedShift) {
			if (entity instanceof LivingEntity _livingEntity1 && _livingEntity1.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
				_livingEntity1.getAttribute(Attributes.MOVEMENT_SPEED)
						.setBaseValue(((entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED) ? _livingEntity0.getAttribute(Attributes.MOVEMENT_SPEED).getBaseValue() : 0)
								/ ((entity.getCapability(OstenBotanicsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OstenBotanicsModVariables.PlayerVariables())).RelievedLevel + 2)));
			{
				boolean _setval = false;
				entity.getCapability(OstenBotanicsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.RelievedShift = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
