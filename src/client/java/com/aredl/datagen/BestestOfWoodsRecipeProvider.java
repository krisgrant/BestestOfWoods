package com.aredl.datagen;

import com.aredl.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class BestestOfWoodsRecipeProvider extends FabricRecipeProvider {
    public BestestOfWoodsRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        offerPlanksRecipe(recipeExporter, ModBlocks.DEEPWOOD_PLANKS, BestestOfWoodsItemTagProvider.DEEPWOOD_LOGS, 4);
        offerBarkBlockRecipe(recipeExporter, ModBlocks.DEEPWOOD_WOOD, ModBlocks.DEEPWOOD_LOG);
        offerBarkBlockRecipe(recipeExporter, ModBlocks.STRIPPED_DEEPWOOD_WOOD, ModBlocks.STRIPPED_DEEPWOOD_LOG);
        createStairsRecipe(ModBlocks.DEEPWOOD_STAIRS, Ingredient.ofItems(ModBlocks.DEEPWOOD_PLANKS))
                .criterion(hasItem(ModBlocks.DEEPWOOD_PLANKS), conditionsFromItem(ModBlocks.DEEPWOOD_PLANKS))
                .offerTo(recipeExporter);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPWOOD_SLAB, ModBlocks.DEEPWOOD_PLANKS);
        createFenceRecipe(ModBlocks.DEEPWOOD_FENCE, Ingredient.ofItems(ModBlocks.DEEPWOOD_PLANKS))
                .criterion(hasItem(ModBlocks.DEEPWOOD_PLANKS), conditionsFromItem(ModBlocks.DEEPWOOD_PLANKS))
                .offerTo(recipeExporter);
        createFenceGateRecipe(ModBlocks.DEEPWOOD_FENCE_GATE, Ingredient.ofItems(ModBlocks.DEEPWOOD_PLANKS))
                .criterion(hasItem(ModBlocks.DEEPWOOD_PLANKS), conditionsFromItem(ModBlocks.DEEPWOOD_PLANKS))
                .offerTo(recipeExporter);
        offerPressurePlateRecipe(recipeExporter, ModBlocks.DEEPWOOD_PRESSURE_PLATE, ModBlocks.DEEPWOOD_PLANKS);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.DEEPWOOD_BUTTON)
                .input(Ingredient.ofItems(ModBlocks.DEEPWOOD_PLANKS))
                .group("wooden_button")
                .criterion(hasItem(ModBlocks.DEEPWOOD_PLANKS), conditionsFromItem(ModBlocks.DEEPWOOD_PLANKS))
                .offerTo(recipeExporter);
    }
}
