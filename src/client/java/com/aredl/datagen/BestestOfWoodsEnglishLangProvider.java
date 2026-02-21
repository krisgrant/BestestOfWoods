package com.aredl.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class BestestOfWoodsEnglishLangProvider extends FabricLanguageProvider {
    public BestestOfWoodsEnglishLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("itemGroup.bestestOfWoods", "Bestest Of Woods");
        translationBuilder.add("block.bow.deepwood_log", "Deepwood Log");
        translationBuilder.add("block.bow.deepwood_planks", "Deepwood Planks");
        translationBuilder.add("block.bow.deepwood_wood", "Deepwood Wood");
        translationBuilder.add("block.bow.stripped_deepwood_log", "Stripped Deepwood Log");
        translationBuilder.add("block.bow.stripped_deepwood_wood", "Stripped Deepwood Wood");
        translationBuilder.add("block.bow.deepwood_stairs", "Deepwood Stairs");
        translationBuilder.add("block.bow.deepwood_slab", "Deepwood Slab");
        translationBuilder.add("block.bow.deepwood_fence", "Deepwood Fence");
        translationBuilder.add("block.bow.deepwood_fence_gate", "Deepwood Fence Gate");
        translationBuilder.add("block.bow.deepwood_pressure_plate", "Deepwood Pressure Plate");
        translationBuilder.add("block.bow.deepwood_button", "Deepwood Button");
        translationBuilder.add("block.bow.deepwood_trapdoor", "Deepwood Trapdoor");
        translationBuilder.add("block.bow.deepwood_door", "Deepwood Door");
        translationBuilder.add("block.bow.deepwood_sign", "Deepwood Sign");
        translationBuilder.add("block.bow.deepwood_hanging_sign", "Deepwood Hanging Sign");
        translationBuilder.add("item.bow.deepwood_boat", "Deepwood Boat");
        translationBuilder.add("item.bow.deepwood_chest_boat", "Deepwood Boat with Chest");
        translationBuilder.add("block.bow.deepwood_sapling", "Deepwood Sapling");
        translationBuilder.add("block.bow.potted_deepwood_sapling", "Potted Deepwood Sapling");
        translationBuilder.add("block.bow.deepwood_spores", "Deepwood Spores");

        translationBuilder.add("block.bow.green_azalea_log", "Green Azalea Log");
        translationBuilder.add("block.bow.green_azalea_planks", "Green Azalea Planks");
        translationBuilder.add("block.bow.green_azalea_wood", "Green Azalea Wood");
        translationBuilder.add("block.bow.stripped_green_azalea_log", "Stripped Green Azalea Log");
        translationBuilder.add("block.bow.stripped_green_azalea_wood", "Stripped Green Azalea Wood");
        translationBuilder.add("block.bow.green_azalea_stairs", "Green Azalea Stairs");
        translationBuilder.add("block.bow.green_azalea_slab", "Green Azalea Slab");
        translationBuilder.add("block.bow.green_azalea_fence", "Green Azalea Fence");
        translationBuilder.add("block.bow.green_azalea_fence_gate", "Green Azalea Fence Gate");
        translationBuilder.add("block.bow.green_azalea_pressure_plate", "Green Azalea Pressure Plate");
        translationBuilder.add("block.bow.green_azalea_button", "Green Azalea Button");
        translationBuilder.add("block.bow.green_azalea_trapdoor", "Green Azalea Trapdoor");
        translationBuilder.add("block.bow.green_azalea_door", "Green Azalea Door");
        translationBuilder.add("block.bow.green_azalea_sign", "Green Azalea Sign");
        translationBuilder.add("block.bow.green_azalea_hanging_sign", "Green Azalea Hanging Sign");
        translationBuilder.add("item.bow.green_azalea_boat", "Green Azalea Boat");
        translationBuilder.add("item.bow.green_azalea_chest_boat", "Green Azalea Boat with Chest");
    }
}
