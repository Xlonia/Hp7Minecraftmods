package dev.xlonia.ostenbotanics.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.registries.Registries;

import java.util.List;
import java.util.Comparator;

import dev.xlonia.ostenbotanics.network.OstenBotanicsModVariables;
import dev.xlonia.ostenbotanics.init.OstenBotanicsModMobEffects;

public class CameliedStartProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1;
			entity.getCapability(OstenBotanicsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.KamelliedBase = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(16 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if ((entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == entity
						&& (entityiterator instanceof LivingEntity _livEnt3 && _livEnt3.getMobType() == MobType.UNDEAD || entityiterator instanceof LivingEntity _livEnt4 && _livEnt4.getMobType() == MobType.ARTHROPOD)) {
					entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC), entity),
							(float) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(OstenBotanicsModMobEffects.KAMELIED.get()) ? _livEnt.getEffect(OstenBotanicsModMobEffects.KAMELIED.get()).getAmplifier() : 0) * 2));
				}
			}
		}
	}
}
