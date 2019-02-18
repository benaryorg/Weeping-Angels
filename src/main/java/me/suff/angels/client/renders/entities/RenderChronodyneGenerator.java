package me.suff.angels.client.renders.entities;

import me.suff.angels.client.models.entity.ModelCG;
import me.suff.angels.common.WAObjects;
import me.suff.angels.common.entities.EntityChronodyneGenerator;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderSprite;

public class RenderChronodyneGenerator extends RenderSprite<EntityChronodyneGenerator> {
	
	private ModelCG model = new ModelCG();
	
	public RenderChronodyneGenerator(RenderManager manager) {
		super(manager, WAObjects.Items.CHRONODYNE_GENERATOR, null);
	}
	
	@Override
	public void doRender(EntityChronodyneGenerator entity, double x, double y, double z, float par8, float par9) {
		GlStateManager.pushMatrix();
		GlStateManager.translated(x, y - 1.3, z);
		GlStateManager.enableRescaleNormal();
		GlStateManager.disableFog();
		GlStateManager.disableLighting();
		model.render(entity, 0, 0, 0, 0, 0, 0.0625F);
		GlStateManager.enableFog();
		GlStateManager.enableLighting();
		GlStateManager.popMatrix();
	}
	
}
