package com.aredl.datagen;

import com.aredl.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class BestestOfWoodsModelProvider extends FabricModelProvider {
    public BestestOfWoodsModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerLog(ModBlocks.DEEPWOOD_LOG)
                .log(ModBlocks.DEEPWOOD_LOG)
                .wood(ModBlocks.DEEPWOOD_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_DEEPWOOD_LOG)
                .log(ModBlocks.STRIPPED_DEEPWOOD_LOG)
                .wood(ModBlocks.STRIPPED_DEEPWOOD_WOOD);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPWOOD_PLANKS)
                .slab(ModBlocks.DEEPWOOD_SLAB)
                .fence(ModBlocks.DEEPWOOD_FENCE)
                .fenceGate(ModBlocks.DEEPWOOD_FENCE_GATE)
                .pressurePlate(ModBlocks.DEEPWOOD_PRESSURE_PLATE)
                .button(ModBlocks.DEEPWOOD_BUTTON)
                .stairs(ModBlocks.DEEPWOOD_STAIRS);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }

    @Override
    public String getName() {
        return "BestestOfWoodsModelProvider";
    }
}
