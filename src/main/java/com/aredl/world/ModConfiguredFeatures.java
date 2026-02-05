package com.aredl.world;

import com.aredl.BestestOfWoods;
import com.aredl.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.CherryFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.ForkingTrunkPlacer;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPWOOD_KEY = registryKey("deepwood");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        register(context, DEEPWOOD_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.DEEPWOOD_LOG),
                new ForkingTrunkPlacer(2, 2, 2),

                BlockStateProvider.of(ModBlocks.DEEPWOOD_LEAVES),
                new CherryFoliagePlacer(ConstantIntProvider.create(1), ConstantIntProvider.create(0), ConstantIntProvider.create(4), 0.15F, 0.5F, 0.16666667F, 0.33333334F),

                new TwoLayersFeatureSize(0, 0, 0)).dirtProvider(BlockStateProvider.of(Blocks.SCULK)).ignoreVines().build());
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registryKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(BestestOfWoods.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context, RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
