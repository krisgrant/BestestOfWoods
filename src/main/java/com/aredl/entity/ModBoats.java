package com.aredl.entity;

import com.aredl.BestestOfWoods;
import com.aredl.block.ModBlocks;
import com.aredl.item.ModItems;
import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModBoats {
    public static final Identifier DEEPWOOD_BOAT_ID = Identifier.of(BestestOfWoods.MOD_ID, "deepwood");
    public static final RegistryKey<TerraformBoatType> DEEPWOOD_BOAT_KEY = TerraformBoatTypeRegistry.createKey(DEEPWOOD_BOAT_ID);

    public static final Identifier GREEN_AZALEA_BOAT_ID = Identifier.of(BestestOfWoods.MOD_ID, "green_azalea");
    public static final RegistryKey<TerraformBoatType> GREEN_AZALEA_BOAT_KEY = TerraformBoatTypeRegistry.createKey(GREEN_AZALEA_BOAT_ID);

    public static void initialize() {
        TerraformBoatType deepwoodBoat = new TerraformBoatType.Builder()
                .item(ModItems.DEEPWOOD_BOAT)
                .chestItem(ModItems.DEEPWOOD_CHEST_BOAT)
                .planks(ModBlocks.DEEPWOOD_PLANKS.asItem())
                .build();
        TerraformBoatType greenAzaleaBoat = new TerraformBoatType.Builder()
                .item(ModItems.GREEN_AZALEA_BOAT)
                .chestItem(ModItems.GREEN_AZALEA_CHEST_BOAT)
                .planks(ModBlocks.GREEN_AZALEA_PLANKS.asItem())
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE, DEEPWOOD_BOAT_KEY, deepwoodBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, GREEN_AZALEA_BOAT_KEY, greenAzaleaBoat);
    }
}
