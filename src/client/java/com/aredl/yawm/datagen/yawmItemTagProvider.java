package com.aredl.yawm.datagen;

import com.aredl.yawm.ModBlocks;
import com.aredl.yawm.YetAnotherWoodMod;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class yawmItemTagProvider extends FabricTagProvider<Item> {
    /**
     * Constructs a new {@link FabricTagProvider} with the default computed path.
     *
     * <p>Common implementations of this class are provided.
     *
     * @param output           the {@link FabricDataOutput} instance
     * @param registriesFuture the backing registry for the tag type
     */
    public yawmItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, RegistryKeys.ITEM, registriesFuture);

    }
    public static final TagKey<Item> DEEPWOOD_LOGS = TagKey.of(RegistryKeys.ITEM, Identifier.of(YetAnotherWoodMod.MOD_ID, "deepwood_logs"));
    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(DEEPWOOD_LOGS)
                .add(ModBlocks.DEEPWOOD_LOG.asItem())
                .add(ModBlocks.STRIPPED_DEEPWOOD_LOG.asItem());
    }
}
