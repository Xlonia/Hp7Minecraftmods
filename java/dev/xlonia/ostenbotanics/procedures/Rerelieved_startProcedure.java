package dev.xlonia.ostenbotanics.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;

import dev.xlonia.ostenbotanics.network.OstenBotanicsModVariables;
import dev.xlonia.ostenbotanics.init.OstenBotanicsModMobEffects;

public class Rerelieved_startProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.getFoodData().setSaturation((float) ((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0)
					+ (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(OstenBotanicsModMobEffects.GARDENISTJASMINOIDE.get()) ? _livEnt.getEffect(OstenBotanicsModMobEffects.GARDENISTJASMINOIDE.get()).getAmplifier() : 0) * 3));
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.POISON);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.HUNGER);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.WEAKNESS);
		{
			double _setval = entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(OstenBotanicsModMobEffects.GARDENISTJASMINOIDE.get()) ? _livEnt.getEffect(OstenBotanicsModMobEffects.GARDENISTJASMINOIDE.get()).getAmplifier() : 0;
			entity.getCapability(OstenBotanicsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.RelievedLevel = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
