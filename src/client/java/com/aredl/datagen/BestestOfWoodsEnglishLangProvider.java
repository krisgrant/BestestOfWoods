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
        translationBuilder.add("item.bow.deepwood_chest_boat", "Deepwood Chest Boat");
    }
}
