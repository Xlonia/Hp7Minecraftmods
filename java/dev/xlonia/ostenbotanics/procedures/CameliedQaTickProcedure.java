package dev.xlonia.ostenbotanics.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import dev.xlonia.ostenbotanics.network.OstenBotanicsModVariables;
import dev.xlonia.ostenbotanics.init.OstenBotanicsModMobEffects;

public class CameliedQaTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Mth.nextInt(RandomSource.create(), 0, 10) <= 10
				- (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(OstenBotanicsModMobEffects.KAMELIED.get()) ? _livEnt.getEffect(OstenBotanicsModMobEffects.KAMELIED.get()).getAmplifier() : 0)) {
			entity.clearFire();
		}
		{
			double _setval = (entity.getCapability(OstenBotanicsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OstenBotanicsModVariables.PlayerVariables())).KameliedTicktime + 1;
			entity.getCapability(OstenBotanicsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.KameliedTicktime = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) < (entity.getCapability(OstenBotanicsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OstenBotanicsModVariables.PlayerVariables())).KamelliedBase
				&& (entity.getCapability(OstenBotanicsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OstenBotanicsModVariables.PlayerVariables())).KameliedTicktime
						* (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(OstenBotanicsModMobEffects.KAMELIED.get()) ? _livEnt.getEffect(OstenBotanicsModMobEffects.KAMELIED.get()).getAmplifier() : 0) > 20) {
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)
						+ Math.ceil((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(OstenBotanicsModMobEffects.KAMELIED.get()) ? _livEnt.getEffect(OstenBotanicsModMobEffects.KAMELIED.get()).getAmplifier() : 0) * 2)));
			{
				double _setval = (entity.getCapability(OstenBotanicsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OstenBotanicsModVariables.PlayerVariables())).KameliedTicktime - 40;
				entity.getCapability(OstenBotanicsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KameliedTicktime = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
