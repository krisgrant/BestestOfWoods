package com.aredl.block;

import com.aredl.BestestOfWoods;
import com.aredl.item.ModItems;
import com.terraformersmc.terraform.sign.api.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallSignBlock;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.*;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static Block register(Block block, String name, boolean shouldRegisterItem) {
        // Register the block and its item.
        Identifier id = Identifier.of(BestestOfWoods.MOD_ID, name);

        // Sometimes, you may not want to register an item for the block.
        // Eg: if it's a technical block like `minecraft:air` or `minecraft:end_gateway`
        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, id, blockItem);
        }

        return Registry.register(Registries.BLOCK, id, block);
    }

    public static final Block DEEPWOOD_LOG = register(
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.WARPED_STEM).sounds(BlockSoundGroup.WOOD)),
            "deepwood_log",
            true
    );

    public static final Block DEEPWOOD_WOOD = register(
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.WARPED_HYPHAE).sounds(BlockSoundGroup.WOOD)),
            "deepwood_wood",
            true
    );

    public static final Block STRIPPED_DEEPWOOD_LOG = register(
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_WARPED_STEM).sounds(BlockSoundGroup.WOOD)),
            "stripped_deepwood_log",
            true
    );

    public static final Block STRIPPED_DEEPWOOD_WOOD = register(
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_WARPED_HYPHAE).sounds(BlockSoundGroup.WOOD)),
            "stripped_deepwood_wood",
            true
    );

    public static final Block DEEPWOOD_PLANKS = register(
            new Block(AbstractBlock.Settings.copy(Blocks.WARPED_PLANKS).sounds(BlockSoundGroup.WOOD)),
            "deepwood_planks",
            true
    );

    public static final Block DEEPWOOD_STAIRS = register(
            new StairsBlock(
                ModBlocks.DEEPWOOD_PLANKS.getDefaultState(),
                AbstractBlock.Settings.copy(Blocks.WARPED_STAIRS).sounds(BlockSoundGroup.WOOD)
            ),
            "deepwood_stairs",
            true
    );

    public static final Block DEEPWOOD_SLAB = register(
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WARPED_SLAB).sounds(BlockSoundGroup.WOOD)),
            "deepwood_slab",
            true
    );

    public static final Block DEEPWOOD_FENCE = register(
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.WARPED_FENCE).sounds(BlockSoundGroup.WOOD)),
            "deepwood_fence",
            true
    );

    public static final Block DEEPWOOD_FENCE_GATE = register(
            new FenceGateBlock(
                    WoodType.WARPED,
                    AbstractBlock.Settings.copy(Blocks.WARPED_FENCE_GATE).sounds(BlockSoundGroup.WOOD)
            ),
            "deepwood_fence_gate",
            true
    );

    public static final Block DEEPWOOD_PRESSURE_PLATE = register(
            new PressurePlateBlock(
                    BlockSetType.WARPED,
                    AbstractBlock.Settings.copy(Blocks.WARPED_PRESSURE_PLATE).sounds(BlockSoundGroup.WOOD)
            ),
            "deepwood_pressure_plate",
            true
    );

    public static final Block DEEPWOOD_BUTTON = register(
            new ButtonBlock(
                    BlockSetType.WARPED,
                    30,
                    AbstractBlock.Settings.copy(Blocks.WARPED_BUTTON).sounds(BlockSoundGroup.WOOD)
            ),
            "deepwood_button",
            true
    );

    public static final Block DEEPWOOD_TRAPDOOR = register(
            new TrapdoorBlock(
                    BlockSetType.WARPED,
                    AbstractBlock.Settings.copy(Blocks.WARPED_TRAPDOOR).sounds(BlockSoundGroup.WOOD)
            ),
            "deepwood_trapdoor",
            true
    );

    public static final Block DEEPWOOD_DOOR = register(
            new DoorBlock(
                    BlockSetType.WARPED,
                    AbstractBlock.Settings.copy(Blocks.WARPED_DOOR).sounds(BlockSoundGroup.WOOD)
            ),
            "deepwood_door",
            true
    );

    public static final Identifier DEEPWOOD_SIGN_TEXTURE = Identifier.of(BestestOfWoods.MOD_ID, "entity/signs/deepwood");
    public static final Identifier DEEPWOOD_HANGING_SIGN_TEXTURE = Identifier.of(BestestOfWoods.MOD_ID, "entity/signs/hanging/deepwood");
    public static final Identifier DEEPWOOD_HANGING_GUI_SIGN_TEXTURE = Identifier.of(BestestOfWoods.MOD_ID, "textures/gui/hanging_signs/deepwood");

    public static final Block DEEPWOOD_SIGN = register(
            new TerraformSignBlock(
                    DEEPWOOD_SIGN_TEXTURE,
                    WoodType.WARPED, AbstractBlock.Settings.copy(Blocks.WARPED_SIGN)
            ),
            "deepwood_sign",
            false
    );
    public static final Block DEEPWOOD_WALL_SIGN = register(
            new TerraformWallSignBlock(
                    DEEPWOOD_SIGN_TEXTURE,
                    WoodType.WARPED,
                    AbstractBlock.Settings.copy(Blocks.WARPED_WALL_SIGN).dropsLike(DEEPWOOD_SIGN)
            ),
            "deepwood_wall_sign",
            false
    );
    public static final Block DEEPWOOD_HANGING_SIGN = register(
            new TerraformHangingSignBlock(
                    DEEPWOOD_HANGING_SIGN_TEXTURE,
                    DEEPWOOD_HANGING_GUI_SIGN_TEXTURE,
                    WoodType.WARPED, AbstractBlock.Settings.copy(Blocks.WARPED_HANGING_SIGN)
            ),
            "deepwood_hanging_sign",
            false
    );
    public static final Block DEEPWOOD_WALL_HANGING_SIGN = register(
            new TerraformWallHangingSignBlock(DEEPWOOD_HANGING_SIGN_TEXTURE,
                    DEEPWOOD_HANGING_GUI_SIGN_TEXTURE,
                    WoodType.WARPED,
                    AbstractBlock.Settings.copy(Blocks.WARPED_WALL_HANGING_SIGN).dropsLike(DEEPWOOD_HANGING_SIGN)
            ),
            "deepwood_wall_hanging_sign",
            false
    );

    public static final BlockFamily DEEPWOOD_FAMILY = BlockFamilies.register(ModBlocks.DEEPWOOD_PLANKS)
            .sign(ModBlocks.DEEPWOOD_SIGN, ModBlocks.DEEPWOOD_WALL_SIGN)
            .group("wooden")
            .unlockCriterionName("has_planks")
            .build();

    public static final RegistryKey<ItemGroup> BOW_ITEM_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(BestestOfWoods.MOD_ID, "item_group"));
    public static final ItemGroup BOW_ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModBlocks.DEEPWOOD_LOG))
            .displayName(Text.translatable("itemGroup.bestestOfWoods"))
            .build();

    public static void initialize() {
        Registry.register(Registries.ITEM_GROUP, BOW_ITEM_GROUP_KEY, BOW_ITEM_GROUP);

        ItemGroupEvents.modifyEntriesEvent(BOW_ITEM_GROUP_KEY).register(itemGroup -> {
            itemGroup.add(ModBlocks.DEEPWOOD_LOG.asItem());
            itemGroup.add(ModBlocks.DEEPWOOD_WOOD.asItem());
            itemGroup.add(ModBlocks.DEEPWOOD_PLANKS.asItem());
            itemGroup.add(ModBlocks.STRIPPED_DEEPWOOD_LOG.asItem());
            itemGroup.add(ModBlocks.STRIPPED_DEEPWOOD_WOOD.asItem());
            itemGroup.add(ModBlocks.DEEPWOOD_STAIRS.asItem());
            itemGroup.add(ModBlocks.DEEPWOOD_SLAB.asItem());
            itemGroup.add(ModBlocks.DEEPWOOD_FENCE.asItem());
            itemGroup.add(ModBlocks.DEEPWOOD_FENCE_GATE.asItem());
            itemGroup.add(ModBlocks.DEEPWOOD_PRESSURE_PLATE.asItem());
            itemGroup.add(ModBlocks.DEEPWOOD_BUTTON.asItem());
            itemGroup.add(ModBlocks.DEEPWOOD_TRAPDOOR.asItem());
            itemGroup.add(ModBlocks.DEEPWOOD_DOOR.asItem());
            itemGroup.add(ModItems.DEEPWOOD_SIGN);
            itemGroup.add(ModItems.DEEPWOOD_HANGING_SIGN);
            itemGroup.add(ModItems.DEEPWOOD_BOAT);
            itemGroup.add(ModItems.DEEPWOOD_CHEST_BOAT);
        });

        StrippableBlockRegistry.register(DEEPWOOD_LOG, STRIPPED_DEEPWOOD_LOG);
        StrippableBlockRegistry.register(DEEPWOOD_WOOD, STRIPPED_DEEPWOOD_WOOD);
    }
}
