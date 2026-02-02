package com.aredl.datagen;

import com.aredl.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
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
        offerPlanksRecipe(recipeExporter, ModBlocks.DEEPWOOD_PLANKS.asItem(), BestestOfWoodsItemTagProvider.DEEPWOOD_LOGS, 4);
        offerBarkBlockRecipe(recipeExporter, ModBlocks.DEEPWOOD_WOOD, ModBlocks.DEEPWOOD_LOG);
        offerBarkBlockRecipe(recipeExporter, ModBlocks.STRIPPED_DEEPWOOD_WOOD, ModBlocks.STRIPPED_DEEPWOOD_LOG);
        createStairsRecipe(ModBlocks.DEEPWOOD_STAIRS, Ingredient.ofItems(ModBlocks.DEEPWOOD_PLANKS))
                .criterion(hasItem(ModBlocks.DEEPWOOD_PLANKS), conditionsFromItem(ModBlocks.DEEPWOOD_PLANKS))
                .offerTo(recipeExporter);
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPWOOD_SLAB, Ingredient.ofItems(ModBlocks.DEEPWOOD_PLANKS))
                .criterion(hasItem(ModBlocks.DEEPWOOD_PLANKS), conditionsFromItem(ModBlocks.DEEPWOOD_PLANKS))
                .offerTo(recipeExporter);
    }
}
