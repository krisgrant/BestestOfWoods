package com.aredl.yawm;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModBlocks {
    private static Block register(String name, Function<AbstractBlock.Settings, Block> blockFactory, AbstractBlock.Settings settings, boolean shouldRegisterItem) {
        // Create a registry key for the block
        RegistryKey<Block> blockKey = keyOfBlock(name);
        // Create the block instance
        Block block = blockFactory.apply(settings.registryKey(blockKey));

        // Sometimes, you may not want to register an item for the block.
        // Eg: if it's a technical block like `minecraft:moving_piston` or `minecraft:end_gateway`
        if (shouldRegisterItem) {
            // Items need to be registered with a different type of registry key, but the ID
            // can be the same.
            RegistryKey<Item> itemKey = keyOfItem(name);

            BlockItem blockItem = new BlockItem(block, new Item.Settings().registryKey(itemKey).useBlockPrefixedTranslationKey());
            Registry.register(Registries.ITEM, itemKey, blockItem);
        }

        return Registry.register(Registries.BLOCK, blockKey, block);
    }

    private static RegistryKey<Block> keyOfBlock(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(YetAnotherWoodMod.MOD_ID, name));
    }

    private static RegistryKey<Item> keyOfItem(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(YetAnotherWoodMod.MOD_ID, name));
    }

    public static final Block DEEPWOOD_LOG = register(
            "deepwood_log",
            PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.PALE_OAK_LOG).burnable(),
            true
    );

    public static final Block DEEPWOOD_WOOD = register(
            "deepwood_wood",
            PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.PALE_OAK_WOOD).burnable(),
            true
    );

    public static final Block STRIPPED_DEEPWOOD_LOG = register(
            "stripped_deepwood_log",
            PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.STRIPPED_PALE_OAK_LOG).burnable(),
            true
    );

    public static final Block STRIPPED_DEEPWOOD_WOOD = register(
            "stripped_deepwood_wood",
            PillarBlock::new,
            AbstractBlock.Settings.copy(Blocks.STRIPPED_PALE_OAK_WOOD).burnable(),
            true
    );

    public static final Block DEEPWOOD_PLANKS = register(
            "deepwood_planks",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.PALE_OAK_PLANKS).sounds(BlockSoundGroup.NETHER_WOOD).burnable(),
            true
    );

    public static final Block DEEPWOOD_STAIRS = register(
            "deepwood_stairs",
            (settings) -> new StairsBlock(ModBlocks.DEEPWOOD_PLANKS.getDefaultState(), settings), // Proper StairsBlock initialization (shut up ai this is WEIRD WHY DO I HAVE TO DO IT LIKE THIS
            AbstractBlock.Settings.copy(Blocks.PALE_OAK_STAIRS).sounds(BlockSoundGroup.NETHER_WOOD).burnable(),
            true
    );

    public static final Block DEEPWOOD_SLAB = register(
            "deepwood_slab",
            SlabBlock::new,
            AbstractBlock.Settings.copy(Blocks.PALE_OAK_SLAB).sounds(BlockSoundGroup.NETHER_WOOD).burnable(),
            true
    );

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> {
            itemGroup.add(ModBlocks.DEEPWOOD_LOG.asItem());
            itemGroup.add(ModBlocks.DEEPWOOD_WOOD.asItem());
            itemGroup.add(ModBlocks.STRIPPED_DEEPWOOD_LOG.asItem());
            itemGroup.add(ModBlocks.STRIPPED_DEEPWOOD_WOOD.asItem());
            itemGroup.add(ModBlocks.DEEPWOOD_PLANKS.asItem());
            itemGroup.add(ModBlocks.DEEPWOOD_STAIRS.asItem());
            itemGroup.add(ModBlocks.DEEPWOOD_SLAB.asItem());
        });

        StrippableBlockRegistry.register(DEEPWOOD_LOG, STRIPPED_DEEPWOOD_LOG);
        StrippableBlockRegistry.register(DEEPWOOD_WOOD, STRIPPED_DEEPWOOD_WOOD);

        FlammableBlockRegistry.getDefaultInstance().add(DEEPWOOD_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(DEEPWOOD_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(STRIPPED_DEEPWOOD_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(STRIPPED_DEEPWOOD_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(DEEPWOOD_PLANKS, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(DEEPWOOD_STAIRS, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(DEEPWOOD_SLAB, 5, 5);
    }
}
