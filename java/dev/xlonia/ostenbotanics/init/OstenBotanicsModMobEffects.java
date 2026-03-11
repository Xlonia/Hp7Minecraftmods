
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package dev.xlonia.ostenbotanics.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import dev.xlonia.ostenbotanics.potion.RelievedMobEffect;
import dev.xlonia.ostenbotanics.potion.KameliedMobEffect;
import dev.xlonia.ostenbotanics.potion.HaczhArmorMobEffect;
import dev.xlonia.ostenbotanics.potion.FragranciaMobEffect;
import dev.xlonia.ostenbotanics.OstenBotanicsMod;

public class OstenBotanicsModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, OstenBotanicsMod.MODID);
	public static final RegistryObject<MobEffect> GARDENISTJASMINOIDE = REGISTRY.register("gardenistjasminoide", () -> new RelievedMobEffect());
	public static final RegistryObject<MobEffect> FRAGRANCIA = REGISTRY.register("fragrancia", () -> new FragranciaMobEffect());
	public static final RegistryObject<MobEffect> KAMELIED = REGISTRY.register("kamelied", () -> new KameliedMobEffect());
	public static final RegistryObject<MobEffect> HACZH_ARMOR = REGISTRY.register("haczh_armor", () -> new HaczhArmorMobEffect());
}
