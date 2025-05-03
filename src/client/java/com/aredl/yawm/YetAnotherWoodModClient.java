package com.aredl.yawm;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.BoatEntityRenderer;
import net.minecraft.client.render.entity.model.BoatEntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class YetAnotherWoodModClient implements ClientModInitializer {
	public static final EntityModelLayer DEEPWOOD_BOAT = new EntityModelLayer(Identifier.of(YetAnotherWoodMod.MOD_ID, "boat/deepwood"), "main");
	public static final EntityModelLayer DEEPWOOD_CHEST_BOAT = new EntityModelLayer(Identifier.of(YetAnotherWoodMod.MOD_ID, "chest_boat/deepwood"), "main");
	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEEPWOOD_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEEPWOOD_TRAPDOOR, RenderLayer.getCutout());

		EntityModelLayerRegistry.registerModelLayer(DEEPWOOD_BOAT, BoatEntityModel::getTexturedModelData);
		EntityModelLayerRegistry.registerModelLayer(DEEPWOOD_CHEST_BOAT, BoatEntityModel::getChestTexturedModelData);

		EntityRendererRegistry.register(ModEntities.DEEPWOOD_BOAT, context -> new BoatEntityRenderer(context, DEEPWOOD_BOAT));
		EntityRendererRegistry.register(ModEntities.DEEPWOOD_CHEST_BOAT, context -> new BoatEntityRenderer(context, DEEPWOOD_CHEST_BOAT));
	}
}