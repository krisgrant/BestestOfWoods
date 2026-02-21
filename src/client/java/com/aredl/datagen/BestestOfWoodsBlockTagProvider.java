package com.aredl.datagen;

import com.aredl.BestestOfWoods;
import com.aredl.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalBlockTags;
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
    public static final TagKey<Block> GREEN_AZALEA_LOGS = TagKey.of(RegistryKeys.BLOCK, Identifier.of(BestestOfWoods.MOD_ID, "green_azalea_logs"));
    public static final TagKey<Block> GREEN_AZALEA_PLANKS = TagKey.of(RegistryKeys.BLOCK, Identifier.of(BestestOfWoods.MOD_ID, "green_azalea_planks"));

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

        getOrCreateTagBuilder(GREEN_AZALEA_LOGS)
                .add(ModBlocks.GREEN_AZALEA_LOG)
                .add(ModBlocks.STRIPPED_GREEN_AZALEA_LOG)
                .add(ModBlocks.STRIPPED_GREEN_AZALEA_WOOD)
                .add(ModBlocks.GREEN_AZALEA_WOOD);
        getOrCreateTagBuilder(GREEN_AZALEA_PLANKS)
                .add(ModBlocks.GREEN_AZALEA_PLANKS);

        getOrCreateTagBuilder(BlockTags.LOGS)
                .add(ModBlocks.DEEPWOOD_LOG)
                .add(ModBlocks.STRIPPED_DEEPWOOD_LOG)
                .add(ModBlocks.STRIPPED_DEEPWOOD_WOOD)
                .add(ModBlocks.DEEPWOOD_WOOD)
                .add(ModBlocks.GREEN_AZALEA_LOG)
                .add(ModBlocks.STRIPPED_GREEN_AZALEA_LOG)
                .add(ModBlocks.STRIPPED_GREEN_AZALEA_WOOD)
                .add(ModBlocks.GREEN_AZALEA_WOOD);
        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.DEEPWOOD_WOOD)
                .add(ModBlocks.STRIPPED_DEEPWOOD_LOG)
                .add(ModBlocks.STRIPPED_DEEPWOOD_WOOD)
                .add(ModBlocks.DEEPWOOD_LOG)
                .add(ModBlocks.GREEN_AZALEA_LOG)
                .add(ModBlocks.STRIPPED_GREEN_AZALEA_LOG)
                .add(ModBlocks.STRIPPED_GREEN_AZALEA_WOOD)
                .add(ModBlocks.GREEN_AZALEA_WOOD);
        getOrCreateTagBuilder(BlockTags.OVERWORLD_NATURAL_LOGS)
                .add(ModBlocks.DEEPWOOD_LOG)
                .add(ModBlocks.GREEN_AZALEA_LOG);
        getOrCreateTagBuilder(ConventionalBlockTags.STRIPPED_LOGS)
                .add(ModBlocks.STRIPPED_DEEPWOOD_LOG)
                .add(ModBlocks.STRIPPED_GREEN_AZALEA_LOG);
        getOrCreateTagBuilder(ConventionalBlockTags.STRIPPED_WOODS)
                .add(ModBlocks.STRIPPED_DEEPWOOD_WOOD)
                .add(ModBlocks.STRIPPED_GREEN_AZALEA_WOOD);

        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(ModBlocks.DEEPWOOD_PLANKS)
                .add(ModBlocks.GREEN_AZALEA_PLANKS);

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
                .add(ModBlocks.DEEPWOOD_TRAPDOOR)
                .add(ModBlocks.DEEPWOOD_DOOR)
                .add(ModBlocks.DEEPWOOD_SIGN)
                .add(ModBlocks.DEEPWOOD_WALL_SIGN)
                .add(ModBlocks.DEEPWOOD_HANGING_SIGN)
                .add(ModBlocks.DEEPWOOD_WALL_HANGING_SIGN)
                .add(ModBlocks.DEEPWOOD_SPORES)
                .add(ModBlocks.DEEPWOOD_SAPLING)
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
                .add(ModBlocks.DEEPWOOD_TRAPDOOR)
                .add(ModBlocks.DEEPWOOD_DOOR)
                .add(ModBlocks.DEEPWOOD_SIGN)
                .add(ModBlocks.DEEPWOOD_WALL_SIGN)
                .add(ModBlocks.DEEPWOOD_HANGING_SIGN)
                .add(ModBlocks.DEEPWOOD_WALL_HANGING_SIGN)
                .add(ModBlocks.DEEPWOOD_SPORES)
                .add(ModBlocks.DEEPWOOD_SAPLING)
                .add(ModBlocks.DEEPWOOD_LOG);

        getOrCreateTagBuilder(BlockTags.STAIRS)
                .add(ModBlocks.DEEPWOOD_STAIRS)
                .add(ModBlocks.GREEN_AZALEA_STAIRS);
        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(ModBlocks.DEEPWOOD_STAIRS)
                .add(ModBlocks.GREEN_AZALEA_STAIRS);

        getOrCreateTagBuilder(BlockTags.SLABS)
                .add(ModBlocks.DEEPWOOD_SLAB)
                .add(ModBlocks.GREEN_AZALEA_SLAB);
        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(ModBlocks.DEEPWOOD_SLAB)
                .add(ModBlocks.GREEN_AZALEA_SLAB);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.DEEPWOOD_FENCE)
                .add(ModBlocks.GREEN_AZALEA_FENCE);
        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.DEEPWOOD_FENCE)
                .add(ModBlocks.GREEN_AZALEA_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.DEEPWOOD_FENCE_GATE)
                .add(ModBlocks.GREEN_AZALEA_FENCE_GATE);
        getOrCreateTagBuilder(ConventionalBlockTags.FENCES)
                .add(ModBlocks.DEEPWOOD_FENCE)
                .add(ModBlocks.GREEN_AZALEA_FENCE);
        getOrCreateTagBuilder(ConventionalBlockTags.WOODEN_FENCES)
                .add(ModBlocks.DEEPWOOD_FENCE)
                .add(ModBlocks.GREEN_AZALEA_FENCE);
        getOrCreateTagBuilder(ConventionalBlockTags.FENCE_GATES)
                .add(ModBlocks.DEEPWOOD_FENCE_GATE)
                .add(ModBlocks.GREEN_AZALEA_FENCE_GATE);
        getOrCreateTagBuilder(ConventionalBlockTags.WOODEN_FENCE_GATES)
                .add(ModBlocks.DEEPWOOD_FENCE_GATE)
                .add(ModBlocks.GREEN_AZALEA_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.PRESSURE_PLATES)
                .add(ModBlocks.DEEPWOOD_PRESSURE_PLATE)
                .add(ModBlocks.GREEN_AZALEA_PRESSURE_PLATE);
        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.DEEPWOOD_PRESSURE_PLATE)
                .add(ModBlocks.GREEN_AZALEA_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.BUTTONS)
                .add(ModBlocks.DEEPWOOD_BUTTON)
                .add(ModBlocks.GREEN_AZALEA_BUTTON);
        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                .add(ModBlocks.DEEPWOOD_BUTTON)
                .add(ModBlocks.GREEN_AZALEA_BUTTON);

        getOrCreateTagBuilder(BlockTags.TRAPDOORS)
                .add(ModBlocks.DEEPWOOD_TRAPDOOR)
                .add(ModBlocks.GREEN_AZALEA_TRAPDOOR);
        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.DEEPWOOD_TRAPDOOR)
                .add(ModBlocks.GREEN_AZALEA_TRAPDOOR);

        getOrCreateTagBuilder(BlockTags.DOORS)
                .add(ModBlocks.DEEPWOOD_DOOR)
                .add(ModBlocks.GREEN_AZALEA_DOOR);
        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(ModBlocks.DEEPWOOD_DOOR)
                .add(ModBlocks.GREEN_AZALEA_DOOR);

        getOrCreateTagBuilder(BlockTags.SIGNS)
                .add(ModBlocks.DEEPWOOD_SIGN)
                .add(ModBlocks.DEEPWOOD_WALL_SIGN)
                .add(ModBlocks.GREEN_AZALEA_SIGN)
                .add(ModBlocks.GREEN_AZALEA_WALL_SIGN);
        getOrCreateTagBuilder(BlockTags.STANDING_SIGNS)
                .add(ModBlocks.DEEPWOOD_SIGN)
                .add(ModBlocks.GREEN_AZALEA_SIGN);
        getOrCreateTagBuilder(BlockTags.WALL_SIGNS)
                .add(ModBlocks.DEEPWOOD_WALL_SIGN)
                .add(ModBlocks.GREEN_AZALEA_WALL_SIGN);

        getOrCreateTagBuilder(BlockTags.CEILING_HANGING_SIGNS)
                .add(ModBlocks.DEEPWOOD_HANGING_SIGN)
                .add(ModBlocks.GREEN_AZALEA_HANGING_SIGN);
        getOrCreateTagBuilder(BlockTags.WALL_HANGING_SIGNS)
                .add(ModBlocks.DEEPWOOD_WALL_HANGING_SIGN)
                .add(ModBlocks.GREEN_AZALEA_WALL_HANGING_SIGN);

        getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(ModBlocks.DEEPWOOD_SPORES);
        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(ModBlocks.DEEPWOOD_SPORES);

        getOrCreateTagBuilder(BlockTags.SAPLINGS)
                .add(ModBlocks.DEEPWOOD_SAPLING);

        getOrCreateTagBuilder(BlockTags.FLOWER_POTS)
                .add(ModBlocks.POTTED_DEEPWOOD_SAPLING);
    }
}
