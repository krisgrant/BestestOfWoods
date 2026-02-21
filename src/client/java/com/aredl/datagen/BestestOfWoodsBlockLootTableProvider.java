package com.aredl.datagen;

import com.aredl.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class BestestOfWoodsBlockLootTableProvider extends FabricBlockLootTableProvider {
    public BestestOfWoodsBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    public static final float[] SAPLING_DROP_CHANCE = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};

    @Override
    public void generate() {
        addDrop(ModBlocks.DEEPWOOD_LOG);
        addDrop(ModBlocks.DEEPWOOD_WOOD);
        addDrop(ModBlocks.DEEPWOOD_PLANKS);
        addDrop(ModBlocks.STRIPPED_DEEPWOOD_LOG);
        addDrop(ModBlocks.STRIPPED_DEEPWOOD_WOOD);
        addDrop(ModBlocks.DEEPWOOD_STAIRS);
        addDrop(ModBlocks.DEEPWOOD_SLAB);
        addDrop(ModBlocks.DEEPWOOD_FENCE);
        addDrop(ModBlocks.DEEPWOOD_FENCE_GATE);
        addDrop(ModBlocks.DEEPWOOD_PRESSURE_PLATE);
        addDrop(ModBlocks.DEEPWOOD_BUTTON);
        addDrop(ModBlocks.DEEPWOOD_TRAPDOOR);
        addDrop(ModBlocks.DEEPWOOD_DOOR, this::doorDrops);
        addDrop(ModBlocks.DEEPWOOD_SIGN);
        addDrop(ModBlocks.DEEPWOOD_HANGING_SIGN);
        addDrop(ModBlocks.DEEPWOOD_SPORES, leavesDrops(ModBlocks.DEEPWOOD_SPORES, ModBlocks.DEEPWOOD_SAPLING, SAPLING_DROP_CHANCE));
        addDrop(ModBlocks.DEEPWOOD_SAPLING);
        addPottedPlantDrops(ModBlocks.POTTED_DEEPWOOD_SAPLING);

        addDrop(ModBlocks.GREEN_AZALEA_LOG);
        addDrop(ModBlocks.GREEN_AZALEA_WOOD);
        addDrop(ModBlocks.GREEN_AZALEA_PLANKS);
        addDrop(ModBlocks.STRIPPED_GREEN_AZALEA_LOG);
        addDrop(ModBlocks.STRIPPED_GREEN_AZALEA_WOOD);
        addDrop(ModBlocks.GREEN_AZALEA_STAIRS);
        addDrop(ModBlocks.GREEN_AZALEA_SLAB);
        addDrop(ModBlocks.GREEN_AZALEA_FENCE);
        addDrop(ModBlocks.GREEN_AZALEA_FENCE_GATE);
        addDrop(ModBlocks.GREEN_AZALEA_PRESSURE_PLATE);
        addDrop(ModBlocks.GREEN_AZALEA_BUTTON);
        addDrop(ModBlocks.GREEN_AZALEA_TRAPDOOR);
        addDrop(ModBlocks.GREEN_AZALEA_DOOR, this::doorDrops);
        addDrop(ModBlocks.GREEN_AZALEA_SIGN);
        addDrop(ModBlocks.GREEN_AZALEA_HANGING_SIGN);
    }
}
