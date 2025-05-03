package com.aredl.yawm;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.BoatItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {
    public static Item register(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
        // Create the item key.
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(YetAnotherWoodMod.MOD_ID, name));

        // Create the item instance.
        Item item = itemFactory.apply(settings.registryKey(itemKey));

        // Register the item.
        Registry.register(Registries.ITEM, itemKey, item);

        return item;
    }

    public static final Item DEEPWOOD_BOAT = register(
            "deepwood_boat",
            settings -> new BoatItem(ModEntities.DEEPWOOD_BOAT, settings),
            new Item.Settings().maxCount(1)
    );

    public static final Item DEEPWOOD_CHEST_BOAT = register(
            "deepwood_chest_boat",
            settings -> new BoatItem(ModEntities.DEEPWOOD_CHEST_BOAT, settings),
            new Item.Settings().maxCount(1)
    );

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> {
                itemGroup.add(ModItems.DEEPWOOD_BOAT);
                itemGroup.add(ModItems.DEEPWOOD_CHEST_BOAT);
        });
    }
}
