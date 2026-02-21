package com.aredl.datagen;

import com.aredl.block.ModBlocks;
import com.aredl.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TexturedModel;

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
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.DEEPWOOD_SAPLING, ModBlocks.POTTED_DEEPWOOD_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerSingleton(ModBlocks.DEEPWOOD_SPORES, TexturedModel.LEAVES);

        blockStateModelGenerator.registerLog(ModBlocks.GREEN_AZALEA_LOG)
                .log(ModBlocks.GREEN_AZALEA_LOG)
                .wood(ModBlocks.GREEN_AZALEA_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_GREEN_AZALEA_LOG)
                .log(ModBlocks.STRIPPED_GREEN_AZALEA_LOG)
                .wood(ModBlocks.STRIPPED_GREEN_AZALEA_WOOD);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GREEN_AZALEA_PLANKS)
                .slab(ModBlocks.GREEN_AZALEA_SLAB)
                .fence(ModBlocks.GREEN_AZALEA_FENCE)
                .fenceGate(ModBlocks.GREEN_AZALEA_FENCE_GATE)
                .pressurePlate(ModBlocks.GREEN_AZALEA_PRESSURE_PLATE)
                .button(ModBlocks.GREEN_AZALEA_BUTTON)
                .stairs(ModBlocks.GREEN_AZALEA_STAIRS)
                .family(ModBlocks.GREEN_AZALEA_FAMILY);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.GREEN_AZALEA_TRAPDOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.GREEN_AZALEA_DOOR);
        blockStateModelGenerator.registerHangingSign(ModBlocks.STRIPPED_GREEN_AZALEA_LOG, ModBlocks.GREEN_AZALEA_HANGING_SIGN, ModBlocks.GREEN_AZALEA_WALL_HANGING_SIGN);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.DEEPWOOD_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.DEEPWOOD_CHEST_BOAT, Models.GENERATED);

        itemModelGenerator.register(ModItems.GREEN_AZALEA_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.GREEN_AZALEA_CHEST_BOAT, Models.GENERATED);
    }

    @Override
    public String getName() {
        return "BestestOfWoodsModelProvider";
    }
}
