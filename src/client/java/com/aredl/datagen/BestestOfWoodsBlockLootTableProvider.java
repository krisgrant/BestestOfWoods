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

    @Override
    public void generate() {
        addDrop(ModBlocks.DEEPWOOD_LOG);
        addDrop(ModBlocks.DEEPWOOD_WOOD);
        addDrop(ModBlocks.DEEPWOOD_PLANKS);
        addDrop(ModBlocks.STRIPPED_DEEPWOOD_LOG);
        addDrop(ModBlocks.STRIPPED_DEEPWOOD_WOOD);
        addDrop(ModBlocks.DEEPWOOD_STAIRS);
        addDrop(ModBlocks.DEEPWOOD_SLAB);
    }
}
