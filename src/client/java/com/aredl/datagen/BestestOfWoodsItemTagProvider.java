package com.aredl.datagen;

import com.aredl.BestestOfWoods;
import com.aredl.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class BestestOfWoodsItemTagProvider extends FabricTagProvider<Item> {
    public static final TagKey<Item> DEEPWOOD_LOGS = TagKey.of(RegistryKeys.ITEM, Identifier.of(BestestOfWoods.MOD_ID, "deepwood_logs"));
    public static final TagKey<Item> DEEPWOOD_PLANKS = TagKey.of(RegistryKeys.ITEM, Identifier.of(BestestOfWoods.MOD_ID, "deepwood_planks"));

    public BestestOfWoodsItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, RegistryKeys.ITEM, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(DEEPWOOD_LOGS)
                .add(ModBlocks.DEEPWOOD_WOOD.asItem())
                .add(ModBlocks.STRIPPED_DEEPWOOD_LOG.asItem())
                .add(ModBlocks.STRIPPED_DEEPWOOD_WOOD.asItem())
                .add(ModBlocks.DEEPWOOD_LOG.asItem());
        getOrCreateTagBuilder(DEEPWOOD_PLANKS)
                .add(ModBlocks.DEEPWOOD_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS)
                .add(ModBlocks.DEEPWOOD_WOOD.asItem())
                .add(ModBlocks.STRIPPED_DEEPWOOD_LOG.asItem())
                .add(ModBlocks.STRIPPED_DEEPWOOD_WOOD.asItem())
                .add(ModBlocks.DEEPWOOD_LOG.asItem());
        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.DEEPWOOD_WOOD.asItem())
                .add(ModBlocks.STRIPPED_DEEPWOOD_LOG.asItem())
                .add(ModBlocks.STRIPPED_DEEPWOOD_WOOD.asItem())
                .add(ModBlocks.DEEPWOOD_LOG.asItem());

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.DEEPWOOD_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.DAMPENS_VIBRATIONS)
                .add(ModBlocks.DEEPWOOD_WOOD.asItem())
                .add(ModBlocks.DEEPWOOD_PLANKS.asItem())
                .add(ModBlocks.STRIPPED_DEEPWOOD_LOG.asItem())
                .add(ModBlocks.STRIPPED_DEEPWOOD_WOOD.asItem())
                .add(ModBlocks.DEEPWOOD_STAIRS.asItem())
                .add(ModBlocks.DEEPWOOD_SLAB.asItem())
                .add(ModBlocks.DEEPWOOD_LOG.asItem());

        getOrCreateTagBuilder(ItemTags.STAIRS)
                .add(ModBlocks.DEEPWOOD_STAIRS.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_STAIRS)
                .add(ModBlocks.DEEPWOOD_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.SLABS)
                .add(ModBlocks.DEEPWOOD_SLAB.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_SLABS)
                .add(ModBlocks.DEEPWOOD_SLAB.asItem());
    }
}
