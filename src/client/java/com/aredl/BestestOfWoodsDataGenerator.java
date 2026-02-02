package com.aredl;

import com.aredl.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

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
	}
}
