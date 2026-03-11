
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.xlonia.ostenbotanics.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import dev.xlonia.ostenbotanics.client.renderer.MobilizedEyeRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class OstenBotanicsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(OstenBotanicsModEntities.MOBILIZED_EYE.get(), MobilizedEyeRenderer::new);
	}
}
