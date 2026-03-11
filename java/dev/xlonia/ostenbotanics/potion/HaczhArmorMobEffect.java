
package dev.xlonia.ostenbotanics.potion;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import java.util.List;
import java.util.ArrayList;

import dev.xlonia.ostenbotanics.procedures.HaczhArmorStartProcedure;
import dev.xlonia.ostenbotanics.procedures.HaczhArmorEndProcedure;

public class HaczhArmorMobEffect extends MobEffect {
	public HaczhArmorMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -1509668);
	}

	@Override
	public List<ItemStack> getCurativeItems() {
		ArrayList<ItemStack> cures = new ArrayList<ItemStack>();
		cures.add(new ItemStack(Items.MILK_BUCKET));
		return cures;
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		HaczhArmorStartProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		HaczhArmorEndProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
