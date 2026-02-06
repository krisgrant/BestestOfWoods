package com.aredl.world;

import com.aredl.BestestOfWoods;
import com.aredl.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.CherryFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.ForkingTrunkPlacer;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPWOOD_KEY = registryKey("deepwood");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPWOOD_TREE_KEY = registryKey("deepwood_tree");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RegistryEntryLookup<ConfiguredFeature<?, ?>> registryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);
        register(context, DEEPWOOD_TREE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.DEEPWOOD_LOG),
                new ForkingTrunkPlacer(2, 2, 2),

                BlockStateProvider.of(ModBlocks.DEEPWOOD_LEAVES),
                new CherryFoliagePlacer(ConstantIntProvider.create(1), ConstantIntProvider.create(0), ConstantIntProvider.create(4), 0.15F, 0.5F, 0.16666667F, 0.33333334F),

                new TwoLayersFeatureSize(3, 0, 4)).dirtProvider(BlockStateProvider.of(Blocks.SCULK)).ignoreVines().build());
        register(
                context,
                DEEPWOOD_KEY,
                Feature.ROOT_SYSTEM,
                new RootSystemFeatureConfig(
                        PlacedFeatures.createEntry(registryEntryLookup.getOrThrow(DEEPWOOD_TREE_KEY)),
                        3,
                        3,
                        BlockTags.SCULK_REPLACEABLE,
                        BlockStateProvider.of(Blocks.SCULK),
                        20,
                        100,
                        3,
                        2,
                        BlockStateProvider.of(Blocks.SCULK_VEIN),
                        20,
                        2,
                        BlockPredicate.bothOf(
                                BlockPredicate.eitherOf(
                                        BlockPredicate.matchingBlocks(List.of(Blocks.AIR, Blocks.CAVE_AIR, Blocks.VOID_AIR)), BlockPredicate.matchingBlockTag(BlockTags.SCULK_REPLACEABLE)
                                ),
                                BlockPredicate.matchingBlocks(Direction.DOWN.getVector(), Blocks.SCULK)
                        )
                )
        );
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registryKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(BestestOfWoods.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context, RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
