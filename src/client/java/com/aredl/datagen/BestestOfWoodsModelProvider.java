package com.aredl.datagen;

import com.aredl.block.ModBlocks;
import com.aredl.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

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
                .stairs(ModBlocks.DEEPWOOD_STAIRS)
                .family(ModBlocks.DEEPWOOD_FAMILY);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.DEEPWOOD_TRAPDOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.DEEPWOOD_DOOR);
        blockStateModelGenerator.registerHangingSign(ModBlocks.STRIPPED_DEEPWOOD_LOG, ModBlocks.DEEPWOOD_HANGING_SIGN, ModBlocks.DEEPWOOD_WALL_HANGING_SIGN);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.DEEPWOOD_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.DEEPWOOD_CHEST_BOAT, Models.GENERATED);
    }

    @Override
    public String getName() {
        return "BestestOfWoodsModelProvider";
    }
}
