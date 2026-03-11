
package dev.xlonia.ostenbotanics.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SlimeModel;

import dev.xlonia.ostenbotanics.entity.MobilizedEyeEntity;

public class MobilizedEyeRenderer extends MobRenderer<MobilizedEyeEntity, SlimeModel<MobilizedEyeEntity>> {
	public MobilizedEyeRenderer(EntityRendererProvider.Context context) {
		super(context, new SlimeModel(context.bakeLayer(ModelLayers.SLIME)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MobilizedEyeEntity entity) {
		return new ResourceLocation("osten_botanics:textures/entities/mobliized_eye_total.png");
	}
}
