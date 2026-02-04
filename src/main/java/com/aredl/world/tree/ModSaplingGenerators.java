package com.aredl.world.tree;

import com.aredl.BestestOfWoods;
import com.aredl.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator DEEPWOOD = new SaplingGenerator(BestestOfWoods.MOD_ID + ":driftwood",
            Optional.empty(), Optional.of(ModConfiguredFeatures.DEEPWOOD_KEY), Optional.empty());
}
