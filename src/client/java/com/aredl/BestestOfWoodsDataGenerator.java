package com.aredl;

import com.aredl.datagen.*;
import com.aredl.world.ModConfiguredFeatures;
import com.aredl.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class BestestOfWoodsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(BestestOfWoodsModelProvider::new);
		pack.addProvider(BestestOfWoodsEnglishLangProvider::new);
		pack.addProvider(BestestOfWoodsBlockLootTableProvider::new);
		pack.addProvider(BestestOfWoodsBlockTagProvider::new);
		pack.addProvider(BestestOfWoodsItemTagProvider::new);
		pack.addProvider(BestestOfWoodsRecipeProvider::new);
		pack.addProvider(BestestOfWoodsRegistryDataGenerator::new);
	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, ModPlacedFeatures::bootstrap);
	}
}
