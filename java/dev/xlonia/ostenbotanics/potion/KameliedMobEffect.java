
package dev.xlonia.ostenbotanics.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import dev.xlonia.ostenbotanics.procedures.KameliedEndProcedure;
import dev.xlonia.ostenbotanics.procedures.CameliedStartProcedure;
import dev.xlonia.ostenbotanics.procedures.CameliedQaTickProcedure;

public class KameliedMobEffect extends MobEffect {
	public KameliedMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -3058070);
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		CameliedStartProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		CameliedQaTickProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		KameliedEndProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
