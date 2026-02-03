package com.aredl.item;

import com.aredl.BestestOfWoods;
import com.aredl.block.ModBlocks;
import com.aredl.entity.ModBoats;
import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import net.minecraft.item.HangingSignItem;
import net.minecraft.item.Item;
import net.minecraft.item.SignItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static Item register(Item item, String id) {
        // Create the identifier for the item.
        Identifier itemID = Identifier.of(BestestOfWoods.MOD_ID, id);

        // Return the registered item!
        return Registry.register(Registries.ITEM, itemID, item);
    }

    public static final Item DEEPWOOD_SIGN = register(
            new SignItem(new Item.Settings().maxCount(16), ModBlocks.DEEPWOOD_SIGN, ModBlocks.DEEPWOOD_WALL_SIGN),
            "deepwood_sign"
    );
    public static final Item DEEPWOOD_HANGING_SIGN = register(
            new HangingSignItem(ModBlocks.DEEPWOOD_HANGING_SIGN, ModBlocks.DEEPWOOD_WALL_HANGING_SIGN, new Item.Settings().maxCount(16)),
            "deepwood_hanging_sign"
    );

    public static final Identifier DEEPWOOD_BOAT_ITEM_ID = Identifier.of(BestestOfWoods.MOD_ID, "deepwood_boat");
    public static final Identifier DEEPWOOD_CHEST_BOAT_ITEM_ID = Identifier.of(BestestOfWoods.MOD_ID, "deepwood_chest_boat");

    public static final Item DEEPWOOD_BOAT = TerraformBoatItemHelper.registerBoatItem(DEEPWOOD_BOAT_ITEM_ID, ModBoats.DEEPWOOD_BOAT_KEY, false);
    public static final Item DEEPWOOD_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(DEEPWOOD_CHEST_BOAT_ITEM_ID, ModBoats.DEEPWOOD_BOAT_KEY, true);

    public static void initialize() {
    }
}
