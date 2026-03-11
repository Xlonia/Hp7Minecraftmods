
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.xlonia.ostenbotanics.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import dev.xlonia.ostenbotanics.OstenBotanicsMod;

public class OstenBotanicsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, OstenBotanicsMod.MODID);
	public static final RegistryObject<SoundEvent> LEVEL_COMPELETED = REGISTRY.register("level_compeleted", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("osten_botanics", "level_compeleted")));
	public static final RegistryObject<SoundEvent> ROGINERILOENTH = REGISTRY.register("rogineriloenth", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("osten_botanics", "rogineriloenth")));
	public static final RegistryObject<SoundEvent> GVEDZRAMYTNIATH = REGISTRY.register("gvedzramytniath", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("osten_botanics", "gvedzramytniath")));
}
