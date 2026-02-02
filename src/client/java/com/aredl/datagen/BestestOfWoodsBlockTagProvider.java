package com.aredl.datagen;

import com.aredl.BestestOfWoods;
import com.aredl.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class BestestOfWoodsBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public static final TagKey<Block> DEEPWOOD_LOGS = TagKey.of(RegistryKeys.BLOCK, Identifier.of(BestestOfWoods.MOD_ID, "deepwood_logs"));
    public static final TagKey<Block> DEEPWOOD_PLANKS = TagKey.of(RegistryKeys.BLOCK, Identifier.of(BestestOfWoods.MOD_ID, "deepwood_planks"));

    public BestestOfWoodsBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(DEEPWOOD_LOGS)
                .add(ModBlocks.DEEPWOOD_LOG)
                .add(ModBlocks.STRIPPED_DEEPWOOD_LOG)
                .add(ModBlocks.STRIPPED_DEEPWOOD_WOOD)
                .add(ModBlocks.DEEPWOOD_WOOD);
        getOrCreateTagBuilder(DEEPWOOD_PLANKS)
                .add(ModBlocks.DEEPWOOD_PLANKS);

        getOrCreateTagBuilder(BlockTags.LOGS)
                .add(ModBlocks.DEEPWOOD_LOG)
                .add(ModBlocks.STRIPPED_DEEPWOOD_LOG)
                .add(ModBlocks.STRIPPED_DEEPWOOD_WOOD)
                .add(ModBlocks.DEEPWOOD_WOOD);
        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.DEEPWOOD_WOOD)
                .add(ModBlocks.STRIPPED_DEEPWOOD_LOG)
                .add(ModBlocks.STRIPPED_DEEPWOOD_WOOD)
                .add(ModBlocks.DEEPWOOD_LOG);

        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(ModBlocks.DEEPWOOD_PLANKS);

        getOrCreateTagBuilder(BlockTags.DAMPENS_VIBRATIONS)
                .add(ModBlocks.DEEPWOOD_PLANKS)
                .add(ModBlocks.DEEPWOOD_WOOD)
                .add(ModBlocks.STRIPPED_DEEPWOOD_LOG)
                .add(ModBlocks.STRIPPED_DEEPWOOD_WOOD)
                .add(ModBlocks.DEEPWOOD_STAIRS)
                .add(ModBlocks.DEEPWOOD_SLAB)
                .add(ModBlocks.DEEPWOOD_FENCE)
                .add(ModBlocks.DEEPWOOD_FENCE_GATE)
                .add(ModBlocks.DEEPWOOD_PRESSURE_PLATE)
                .add(ModBlocks.DEEPWOOD_BUTTON)
                .add(ModBlocks.DEEPWOOD_LOG);
        getOrCreateTagBuilder(BlockTags.OCCLUDES_VIBRATION_SIGNALS)
                .add(ModBlocks.DEEPWOOD_PLANKS)
                .add(ModBlocks.DEEPWOOD_WOOD)
                .add(ModBlocks.STRIPPED_DEEPWOOD_LOG)
                .add(ModBlocks.STRIPPED_DEEPWOOD_WOOD)
                .add(ModBlocks.DEEPWOOD_STAIRS)
                .add(ModBlocks.DEEPWOOD_SLAB)
                .add(ModBlocks.DEEPWOOD_FENCE)
                .add(ModBlocks.DEEPWOOD_FENCE_GATE)
                .add(ModBlocks.DEEPWOOD_PRESSURE_PLATE)
                .add(ModBlocks.DEEPWOOD_BUTTON)
                .add(ModBlocks.DEEPWOOD_LOG);

        getOrCreateTagBuilder(BlockTags.STAIRS)
                .add(ModBlocks.DEEPWOOD_STAIRS);
        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(ModBlocks.DEEPWOOD_STAIRS);

        getOrCreateTagBuilder(BlockTags.SLABS)
                .add(ModBlocks.DEEPWOOD_SLAB);
        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(ModBlocks.DEEPWOOD_SLAB);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.DEEPWOOD_FENCE);
        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.DEEPWOOD_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.DEEPWOOD_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.PRESSURE_PLATES)
                .add(ModBlocks.DEEPWOOD_PRESSURE_PLATE);
        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.DEEPWOOD_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.BUTTONS)
                .add(ModBlocks.DEEPWOOD_BUTTON);
        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                .add(ModBlocks.DEEPWOOD_BUTTON);
    }
}
