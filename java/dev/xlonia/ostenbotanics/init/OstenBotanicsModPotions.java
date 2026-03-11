
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.xlonia.ostenbotanics.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import dev.xlonia.ostenbotanics.OstenBotanicsMod;

public class OstenBotanicsModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, OstenBotanicsMod.MODID);
	public static final RegistryObject<Potion> FRAGRANCIA_BOTTLE = REGISTRY.register("fragrancia_bottle", () -> new Potion(new MobEffectInstance(OstenBotanicsModMobEffects.FRAGRANCIA.get(), 3600, 0, false, true)));
	public static final RegistryObject<Potion> FRAGRANCIA_LONG = REGISTRY.register("fragrancia_long", () -> new Potion(new MobEffectInstance(OstenBotanicsModMobEffects.FRAGRANCIA.get(), 9600, 0, false, true)));
	public static final RegistryObject<Potion> FRAGRANCIA_II = REGISTRY.register("fragrancia_ii", () -> new Potion(new MobEffectInstance(OstenBotanicsModMobEffects.FRAGRANCIA.get(), 1800, 1, false, true)));
	public static final RegistryObject<Potion> HACZH_ARMOR_BOTTLE = REGISTRY.register("haczh_armor_bottle", () -> new Potion(new MobEffectInstance(OstenBotanicsModMobEffects.HACZH_ARMOR.get(), 3600, 0, false, true)));
	public static final RegistryObject<Potion> ABSORPTION = REGISTRY.register("absorption", () -> new Potion(new MobEffectInstance(MobEffects.ABSORPTION, 1800, 2, false, true)));
	public static final RegistryObject<Potion> RELIEVED_BOTTLE = REGISTRY.register("relieved_bottle", () -> new Potion(new MobEffectInstance(OstenBotanicsModMobEffects.GARDENISTJASMINOIDE.get(), 3600, 0, false, true)));
	public static final RegistryObject<Potion> HAKUREI_BEER = REGISTRY.register("hakurei_beer", () -> new Potion(new MobEffectInstance(MobEffects.LUCK, 14400, 2, false, true),
			new MobEffectInstance(OstenBotanicsModMobEffects.GARDENISTJASMINOIDE.get(), 7200, 2, false, true), new MobEffectInstance(MobEffects.DAMAGE_BOOST, 7200, 2, false, true)));
	public static final RegistryObject<Potion> HACZH_ARMOR_LONG = REGISTRY.register("haczh_armor_long", () -> new Potion(new MobEffectInstance(OstenBotanicsModMobEffects.HACZH_ARMOR.get(), 7200, 0, false, true)));
	public static final RegistryObject<Potion> HACZH_ARMOR_II = REGISTRY.register("haczh_armor_ii", () -> new Potion(new MobEffectInstance(OstenBotanicsModMobEffects.HACZH_ARMOR.get(), 1800, 1, false, true)));
	public static final RegistryObject<Potion> RELIEVED_LONG = REGISTRY.register("relieved_long", () -> new Potion(new MobEffectInstance(OstenBotanicsModMobEffects.GARDENISTJASMINOIDE.get(), 7200, 0, false, true)));
	public static final RegistryObject<Potion> RELIEVED_II = REGISTRY.register("relieved_ii", () -> new Potion(new MobEffectInstance(OstenBotanicsModMobEffects.GARDENISTJASMINOIDE.get(), 1800, 1, false, true)));
	public static final RegistryObject<Potion> ABSORPTION_II = REGISTRY.register("absorption_ii", () -> new Potion(new MobEffectInstance(MobEffects.ABSORPTION, 2400, 4, false, true)));
}
