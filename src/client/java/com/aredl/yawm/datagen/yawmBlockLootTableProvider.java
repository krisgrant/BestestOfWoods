package com.aredl.yawm.datagen;

import com.aredl.yawm.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class yawmBlockLootTableProvider extends FabricBlockLootTableProvider {
    protected yawmBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup){
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate(){
        addDrop(ModBlocks.DEEPWOOD_SLAB, slabDrops(ModBlocks.DEEPWOOD_SLAB));
        addDrop(ModBlocks.DEEPWOOD_DOOR, doorDrops(ModBlocks.DEEPWOOD_DOOR));
    }
}
