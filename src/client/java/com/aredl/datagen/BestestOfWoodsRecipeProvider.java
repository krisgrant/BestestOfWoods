package com.aredl.datagen;

import com.aredl.block.ModBlocks;
import com.aredl.item.ModItems;
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
        createTrapdoorRecipe(ModBlocks.DEEPWOOD_TRAPDOOR, Ingredient.ofItems(ModBlocks.DEEPWOOD_PLANKS))
                .criterion(hasItem(ModBlocks.DEEPWOOD_PLANKS), conditionsFromItem(ModBlocks.DEEPWOOD_PLANKS))
                .offerTo(recipeExporter);
        createDoorRecipe(ModBlocks.DEEPWOOD_DOOR, Ingredient.ofItems(ModBlocks.DEEPWOOD_PLANKS))
                .criterion(hasItem(ModBlocks.DEEPWOOD_PLANKS), conditionsFromItem(ModBlocks.DEEPWOOD_PLANKS))
                .offerTo(recipeExporter);
        offerHangingSignRecipe(recipeExporter, ModItems.DEEPWOOD_HANGING_SIGN, ModBlocks.STRIPPED_DEEPWOOD_LOG);
        createSignRecipe(ModItems.DEEPWOOD_SIGN, Ingredient.ofItems(ModBlocks.DEEPWOOD_PLANKS))
                .criterion(hasItem(ModBlocks.DEEPWOOD_PLANKS), conditionsFromItem(ModBlocks.DEEPWOOD_PLANKS))
                .offerTo(recipeExporter);
        offerBoatRecipe(recipeExporter, ModItems.DEEPWOOD_BOAT, ModBlocks.DEEPWOOD_PLANKS);
        offerChestBoatRecipe(recipeExporter, ModItems.DEEPWOOD_CHEST_BOAT, ModItems.DEEPWOOD_BOAT);

        offerPlanksRecipe(recipeExporter, ModBlocks.GREEN_AZALEA_PLANKS, BestestOfWoodsItemTagProvider.GREEN_AZALEA_LOGS, 4);
        offerBarkBlockRecipe(recipeExporter, ModBlocks.GREEN_AZALEA_WOOD, ModBlocks.GREEN_AZALEA_LOG);
        offerBarkBlockRecipe(recipeExporter, ModBlocks.STRIPPED_GREEN_AZALEA_WOOD, ModBlocks.STRIPPED_GREEN_AZALEA_LOG);
        createStairsRecipe(ModBlocks.GREEN_AZALEA_STAIRS, Ingredient.ofItems(ModBlocks.GREEN_AZALEA_PLANKS))
                .criterion(hasItem(ModBlocks.GREEN_AZALEA_PLANKS), conditionsFromItem(ModBlocks.GREEN_AZALEA_PLANKS))
                .offerTo(recipeExporter);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_AZALEA_SLAB, ModBlocks.GREEN_AZALEA_PLANKS);
        createFenceRecipe(ModBlocks.GREEN_AZALEA_FENCE, Ingredient.ofItems(ModBlocks.GREEN_AZALEA_PLANKS))
                .criterion(hasItem(ModBlocks.GREEN_AZALEA_PLANKS), conditionsFromItem(ModBlocks.GREEN_AZALEA_PLANKS))
                .offerTo(recipeExporter);
        createFenceGateRecipe(ModBlocks.GREEN_AZALEA_FENCE_GATE, Ingredient.ofItems(ModBlocks.GREEN_AZALEA_PLANKS))
                .criterion(hasItem(ModBlocks.GREEN_AZALEA_PLANKS), conditionsFromItem(ModBlocks.GREEN_AZALEA_PLANKS))
                .offerTo(recipeExporter);
        offerPressurePlateRecipe(recipeExporter, ModBlocks.GREEN_AZALEA_PRESSURE_PLATE, ModBlocks.GREEN_AZALEA_PLANKS);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.GREEN_AZALEA_BUTTON)
                .input(Ingredient.ofItems(ModBlocks.GREEN_AZALEA_PLANKS))
                .group("wooden_button")
                .criterion(hasItem(ModBlocks.GREEN_AZALEA_PLANKS), conditionsFromItem(ModBlocks.GREEN_AZALEA_PLANKS))
                .offerTo(recipeExporter);
        createTrapdoorRecipe(ModBlocks.GREEN_AZALEA_TRAPDOOR, Ingredient.ofItems(ModBlocks.GREEN_AZALEA_PLANKS))
                .criterion(hasItem(ModBlocks.GREEN_AZALEA_PLANKS), conditionsFromItem(ModBlocks.GREEN_AZALEA_PLANKS))
                .offerTo(recipeExporter);
        createDoorRecipe(ModBlocks.GREEN_AZALEA_DOOR, Ingredient.ofItems(ModBlocks.GREEN_AZALEA_PLANKS))
                .criterion(hasItem(ModBlocks.GREEN_AZALEA_PLANKS), conditionsFromItem(ModBlocks.GREEN_AZALEA_PLANKS))
                .offerTo(recipeExporter);
        offerHangingSignRecipe(recipeExporter, ModItems.GREEN_AZALEA_HANGING_SIGN, ModBlocks.STRIPPED_GREEN_AZALEA_LOG);
        createSignRecipe(ModItems.GREEN_AZALEA_SIGN, Ingredient.ofItems(ModBlocks.GREEN_AZALEA_PLANKS))
                .criterion(hasItem(ModBlocks.GREEN_AZALEA_PLANKS), conditionsFromItem(ModBlocks.GREEN_AZALEA_PLANKS))
                .offerTo(recipeExporter);
        offerBoatRecipe(recipeExporter, ModItems.GREEN_AZALEA_BOAT, ModBlocks.GREEN_AZALEA_PLANKS);
        offerChestBoatRecipe(recipeExporter, ModItems.GREEN_AZALEA_CHEST_BOAT, ModItems.GREEN_AZALEA_BOAT);
    }
}
