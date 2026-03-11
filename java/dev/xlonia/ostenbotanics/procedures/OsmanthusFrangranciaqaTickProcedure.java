package dev.xlonia.ostenbotanics.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.registries.Registries;

import java.util.List;
import java.util.Comparator;

import dev.xlonia.ostenbotanics.network.OstenBotanicsModVariables;
import dev.xlonia.ostenbotanics.init.OstenBotanicsModMobEffects;

public class OsmanthusFrangranciaqaTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (Math.random() >= 0.75) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.POISON);
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof LivingEntity _livEnt1 && _livEnt1.getMobType() == MobType.UNDEAD && (entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == entity
							&& Mth.nextInt(RandomSource.create(), 0, 10) == 5) {
						entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)),
								(float) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(OstenBotanicsModMobEffects.FRAGRANCIA.get()) ? _livEnt.getEffect(OstenBotanicsModMobEffects.FRAGRANCIA.get()).getAmplifier() : 0) * 2));
					}
				}
			}
		}
		if ((entity instanceof LivingEntity _livEnt
				? _livEnt.getHealth()
				: -1) < (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(OstenBotanicsModMobEffects.FRAGRANCIA.get()) ? _livEnt.getEffect(OstenBotanicsModMobEffects.FRAGRANCIA.get()).getAmplifier() : 0) * 8) {
			{
				double _setval = (entity.getCapability(OstenBotanicsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OstenBotanicsModVariables.PlayerVariables())).OsmanthusFrangranciaEffectTick + 1;
				entity.getCapability(OstenBotanicsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.OsmanthusFrangranciaEffectTick = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if ((entity.getCapability(OstenBotanicsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new OstenBotanicsModVariables.PlayerVariables())).OsmanthusFrangranciaEffectTick >= 20) {
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + Mth.nextInt(RandomSource.create(), 0,
							(int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(OstenBotanicsModMobEffects.FRAGRANCIA.get()) ? _livEnt.getEffect(OstenBotanicsModMobEffects.FRAGRANCIA.get()).getAmplifier() : 0) * 2))));
				{
					double _setval = 0;
					entity.getCapability(OstenBotanicsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.OsmanthusFrangranciaEffectTick = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
