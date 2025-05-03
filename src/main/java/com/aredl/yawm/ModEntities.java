package com.aredl.yawm;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.entity.vehicle.ChestBoatEntity;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Supplier;

public class ModEntities {
    // no idea how this works I just kinda copied it
    private static <T extends Entity> EntityType<T> register(RegistryKey<EntityType<?>> key, EntityType.Builder<T> type) {
        return Registry.register(Registries.ENTITY_TYPE, key, type.build(key));
    }
    private static RegistryKey<EntityType<?>> keyOf(String id) {
        return RegistryKey.of(RegistryKeys.ENTITY_TYPE, Identifier.of(YetAnotherWoodMod.MOD_ID, id));
    }
    private static <T extends Entity> EntityType<T> register(String id, EntityType.Builder<T> type) {
        return register(keyOf(id), type);
    }

    private static EntityType.EntityFactory<BoatEntity> boatFactory(Supplier<Item> item)
    {
        return (type, world) -> new BoatEntity(type, world, item);
    }
    private static EntityType.EntityFactory<ChestBoatEntity> chestBoatFactory(Supplier<Item> itemSupplier) {
        return (type, world) -> new ChestBoatEntity(type, world, itemSupplier);
    }

    public static final EntityType<BoatEntity> DEEPWOOD_BOAT = register(
            "deepwood_boat",
            EntityType.Builder.create(boatFactory(() -> ModItems.DEEPWOOD_BOAT), SpawnGroup.MISC)
                    .dropsNothing()
                    .dimensions(1.375F, 0.5625F)
                    .eyeHeight(0.5625F)
                    .maxTrackingRange(10)
    );
    public static final EntityType<ChestBoatEntity> DEEPWOOD_CHEST_BOAT = register(
            "deepwood_chest_boat",
            EntityType.Builder.create(chestBoatFactory(() -> ModItems.DEEPWOOD_CHEST_BOAT), SpawnGroup.MISC)
                    .dropsNothing()
                    .dimensions(1.375F, 0.5625F)
                    .eyeHeight(0.5625F)
                    .maxTrackingRange(10)
    );
}
