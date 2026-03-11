package dev.xlonia.ostenbotanics.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import dev.xlonia.ostenbotanics.init.OstenBotanicsModMobEffects;

public class OsmanthusEatenProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(OstenBotanicsModMobEffects.FRAGRANCIA.get(), 100, 1));
	}
}
