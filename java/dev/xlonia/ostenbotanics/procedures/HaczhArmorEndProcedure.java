package dev.xlonia.ostenbotanics.procedures;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;

import dev.xlonia.ostenbotanics.network.OstenBotanicsModVariables;
import dev.xlonia.ostenbotanics.init.OstenBotanicsModMobEffects;

public class HaczhArmorEndProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.POISON);
		if (entity instanceof LivingEntity _livingEntity3 && _livingEntity3.getAttributes().hasAttribute(Attributes.ARMOR_TOUGHNESS))
			_livingEntity3.getAttribute(Attributes.ARMOR_TOUGHNESS)
					.setBaseValue(((entity instanceof LivingEntity _livingEntity1 && _livingEntity1.getAttributes().hasAttribute(Attributes.ARMOR_TOUGHNESS) ? _livingEntity1.getAttribute(Attributes.ARMOR_TOUGHNESS).getBaseValue() : 0)
							- (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(OstenBotanicsModMobEffects.HACZH_ARMOR.get()) ? _livEnt.getEffect(OstenBotanicsModMobEffects.HACZH_ARMOR.get()).getAmplifier() : 0) * 4));
		{
			boolean _setval = false;
			entity.getCapability(OstenBotanicsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.HaczhArmorStart = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
