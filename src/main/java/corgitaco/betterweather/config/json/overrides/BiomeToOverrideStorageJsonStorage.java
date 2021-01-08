package corgitaco.betterweather.config.json.overrides;

import corgitaco.betterweather.util.storage.OverrideStorage;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;

import java.util.IdentityHashMap;

public class BiomeToOverrideStorageJsonStorage {
    private final IdentityHashMap<ResourceLocation, OverrideStorage> biomeToOverrideStorage;

    public BiomeToOverrideStorageJsonStorage(IdentityHashMap<ResourceLocation, OverrideStorage> biomeToOverrideStorage) {
        this.biomeToOverrideStorage = biomeToOverrideStorage;
    }

    public IdentityHashMap<ResourceLocation, OverrideStorage> getBiomeToOverrideStorage() {
        return biomeToOverrideStorage;
    }

    public static class ObjectToOverrideStorageJsonStorage {
        private final IdentityHashMap<Object, OverrideStorage> objectToOverrideStorage;

        public ObjectToOverrideStorageJsonStorage(IdentityHashMap<Object, OverrideStorage> objectToOverrideStorage) {
            this.objectToOverrideStorage = objectToOverrideStorage;
        }

        public IdentityHashMap<Object, OverrideStorage> getObjectToOverrideStorage() {
            return objectToOverrideStorage;
        }
    }
}