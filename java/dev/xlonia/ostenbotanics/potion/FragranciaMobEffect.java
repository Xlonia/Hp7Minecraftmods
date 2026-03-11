
package dev.xlonia.ostenbotanics.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import dev.xlonia.ostenbotanics.procedures.OsmanthusFrangranciaqaTickProcedure;
import dev.xlonia.ostenbotanics.procedures.OsmanthusFragranciaStartProcedure;

public class FragranciaMobEffect extends MobEffect {
	public FragranciaMobEffect() {
		super(MobEffectCategory.NEUTRAL, -103);
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		OsmanthusFragranciaStartProcedure.execute(entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		OsmanthusFrangranciaqaTickProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
