package com.aredl.block;

import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldView;

public class SporeSaplingBlock extends SaplingBlock implements Fertilizable {
    public SporeSaplingBlock(SaplingGenerator generator, Settings settings) {
        super(generator, settings);
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isOf(Blocks.SCULK) || super.canPlantOnTop(floor, world, pos);
    }
    @Override
    public boolean isFertilizable(WorldView world, BlockPos pos, BlockState state) {
        BlockState blockState = world.getBlockState(pos.down());
        return blockState.isOf(Blocks.SCULK);
    }
}
