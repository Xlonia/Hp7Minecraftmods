package dev.xlonia.ostenbotanics.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import java.util.List;
import java.util.Comparator;

import dev.xlonia.ostenbotanics.network.OstenBotanicsModVariables;
import dev.xlonia.ostenbotanics.init.OstenBotanicsModMobEffects;

public class Relieved_qaTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.isShiftKeyDown() && !(entity.getCapability(OstenBotanicsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OstenBotanicsModVariables.PlayerVariables())).RelievedShift) {
			if (entity instanceof LivingEntity _livingEntity3 && _livingEntity3.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
				_livingEntity3.getAttribute(Attributes.MOVEMENT_SPEED)
						.setBaseValue(((entity instanceof LivingEntity _livingEntity1 && _livingEntity1.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED) ? _livingEntity1.getAttribute(Attributes.MOVEMENT_SPEED).getBaseValue() : 0)
								* ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(OstenBotanicsModMobEffects.GARDENISTJASMINOIDE.get()) ? _livEnt.getEffect(OstenBotanicsModMobEffects.GARDENISTJASMINOIDE.get()).getAmplifier() : 0)
										+ 2)));
			{
				boolean _setval = true;
				entity.getCapability(OstenBotanicsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.RelievedShift = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(OstenBotanicsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OstenBotanicsModVariables.PlayerVariables())).RelievedShift && !entity.isShiftKeyDown()) {
			if (entity instanceof LivingEntity _livingEntity7 && _livingEntity7.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
				_livingEntity7.getAttribute(Attributes.MOVEMENT_SPEED)
						.setBaseValue(((entity instanceof LivingEntity _livingEntity5 && _livingEntity5.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED) ? _livingEntity5.getAttribute(Attributes.MOVEMENT_SPEED).getBaseValue() : 0)
								/ ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(OstenBotanicsModMobEffects.GARDENISTJASMINOIDE.get()) ? _livEnt.getEffect(OstenBotanicsModMobEffects.GARDENISTJASMINOIDE.get()).getAmplifier() : 0)
										+ 2)));
			{
				boolean _setval = false;
				entity.getCapability(OstenBotanicsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.RelievedShift = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (Math.random() >= 0.75) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.DIG_SLOWDOWN);
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(
						((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(OstenBotanicsModMobEffects.GARDENISTJASMINOIDE.get()) ? _livEnt.getEffect(OstenBotanicsModMobEffects.GARDENISTJASMINOIDE.get()).getAmplifier() : 0) * 4) / 2d),
						e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof LivingEntity _livEnt10 && _livEnt10.getMobType() == MobType.UNDEAD || entityiterator instanceof LivingEntity _livEnt11 && _livEnt11.getMobType() == MobType.ARTHROPOD) {
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 300,
									(int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(OstenBotanicsModMobEffects.GARDENISTJASMINOIDE.get())
											? _livEnt.getEffect(OstenBotanicsModMobEffects.GARDENISTJASMINOIDE.get()).getAmplifier()
											: 0) * 2)));
						if (entityiterator instanceof LivingEntity _livEnt14 && _livEnt14.isBaby() && entityiterator instanceof LivingEntity _livEnt15 && _livEnt15.getMobType() == MobType.UNDEAD) {
							if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 300, 5));
						}
					}
				}
			}
		}
	}
}
