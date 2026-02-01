package com.aredl;

import com.aredl.datagen.BestestOfWoodsBlockLootTableProvider;
import com.aredl.datagen.BestestOfWoodsEnglishLangProvider;
import com.aredl.datagen.BestestOfWoodsBlockTagProvider;
import com.aredl.datagen.BestestOfWoodsModelProvider;
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
	}
}
