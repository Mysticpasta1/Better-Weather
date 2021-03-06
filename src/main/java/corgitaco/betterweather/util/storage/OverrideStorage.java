package corgitaco.betterweather.util.storage;

import corgitaco.betterweather.BetterWeatherUtil;
import net.minecraft.block.Block;

import java.util.IdentityHashMap;

public class OverrideStorage {
    private double tempModifier = Double.MAX_VALUE;
    private double humidityModifier = Double.MAX_VALUE;
    private IdentityHashMap<Block, Double> blockToCropGrowthMultiplierMap = new IdentityHashMap<>();
    private double fallBack = Double.MAX_VALUE;
    private OverrideClientStorage clientStorage = new OverrideClientStorage();

    public OverrideStorage() {
    }

    public IdentityHashMap<Block, Double> getBlockToCropGrowthMultiplierMap() {
        if (blockToCropGrowthMultiplierMap == null)
            blockToCropGrowthMultiplierMap = new IdentityHashMap<>();
        return blockToCropGrowthMultiplierMap;
    }

    public OverrideStorage setBlockToCropGrowthMultiplierMap(IdentityHashMap<Block, Double> blockToCropGrowthMultiplierMap) {
        this.blockToCropGrowthMultiplierMap = blockToCropGrowthMultiplierMap;
        return this;
    }

    public double getFallBack() {
        return fallBack;
    }

    public OverrideStorage setFallBack(double fallBack) {
        this.fallBack = fallBack;
        return this;
    }

    public double getTempModifier() {
        return tempModifier;
    }

    public OverrideStorage setTempModifier(double tempModifier) {
        this.tempModifier = tempModifier;
        return this;
    }

    public double getHumidityModifier() {
        return humidityModifier;
    }

    public OverrideStorage setHumidityModifier(double humidityModifier) {
        this.humidityModifier = humidityModifier;
        return this;
    }

    public OverrideClientStorage getClientStorage() {
        return clientStorage;
    }

    public OverrideStorage setClientStorage(OverrideClientStorage clientStorage) {
        this.clientStorage = clientStorage;
        return this;
    }

    public static class OverrideClientStorage {
        private String targetFoliageHexColor = "";
        private double foliageColorBlendStrength = Double.MAX_VALUE;
        private String targetGrassHexColor = "";
        private double grassColorBlendStrength = Double.MAX_VALUE;
        private String targetSkyHexColor = "";
        private double skyColorBlendStrength = Double.MAX_VALUE;
        private String targetFogHexColor = "";
        private double fogColorBlendStrength = Double.MAX_VALUE;
        private int parsedFoliageHexColor = Integer.MAX_VALUE;
        private int parsedGrassHexColor = Integer.MAX_VALUE;
        private int parsedSkyHexColor = Integer.MAX_VALUE;
        private int parsedFogHexColor = Integer.MAX_VALUE;


        public OverrideClientStorage() {
        }

        public void parseHexColors() {
            if (!targetFoliageHexColor.isEmpty())
                parsedFoliageHexColor = BetterWeatherUtil.parseHexColor(targetFoliageHexColor);
            if (!targetGrassHexColor.isEmpty())
                parsedGrassHexColor = BetterWeatherUtil.parseHexColor(targetGrassHexColor);
            if (!targetSkyHexColor.isEmpty())
                parsedSkyHexColor = BetterWeatherUtil.parseHexColor(targetSkyHexColor);
            if (!targetFogHexColor.isEmpty())
                parsedFogHexColor = BetterWeatherUtil.parseHexColor(targetFogHexColor);
        }

        public String getTargetFoliageHexColor() {
            return targetFoliageHexColor;
        }

        public OverrideClientStorage setTargetFoliageHexColor(String targetFoliageHexColor) {
            this.targetFoliageHexColor = targetFoliageHexColor;
            return this;
        }

        public double getFoliageColorBlendStrength() {
            return foliageColorBlendStrength;
        }

        public OverrideClientStorage setFoliageColorBlendStrength(double foliageColorBlendStrength) {
            this.foliageColorBlendStrength = foliageColorBlendStrength;
            return this;
        }

        public String getTargetGrassHexColor() {
            return targetGrassHexColor;
        }

        public OverrideClientStorage setTargetGrassHexColor(String targetGrassHexColor) {
            this.targetGrassHexColor = targetGrassHexColor;
            return this;
        }

        public double getGrassColorBlendStrength() {
            return grassColorBlendStrength;
        }

        public OverrideClientStorage setGrassColorBlendStrength(double grassColorBlendStrength) {
            this.grassColorBlendStrength = grassColorBlendStrength;
            return this;
        }

        public String getTargetSkyHexColor() {
            return targetSkyHexColor;
        }

        public OverrideClientStorage setTargetSkyHexColor(String targetSkyHexColor) {
            this.targetSkyHexColor = targetSkyHexColor;
            return this;
        }

        public double getSkyColorBlendStrength() {
            return skyColorBlendStrength;
        }

        public OverrideClientStorage setSkyColorBlendStrength(double skyColorBlendStrength) {
            this.skyColorBlendStrength = skyColorBlendStrength;
            return this;
        }

        public String getTargetFogHexColor() {
            return targetFogHexColor;
        }

        public OverrideClientStorage setTargetFogHexColor(String targetFogHexColor) {
            this.targetFogHexColor = targetFogHexColor;
            return this;
        }

        public double getFogColorBlendStrength() {
            return fogColorBlendStrength;
        }

        public OverrideClientStorage setFogColorBlendStrength(double fogColorBlendStrength) {
            this.fogColorBlendStrength = fogColorBlendStrength;
            return this;
        }

        public int getParsedFoliageHexColor() {
            return parsedFoliageHexColor;
        }

        public int getParsedGrassHexColor() {
            return parsedGrassHexColor;
        }

        public int getParsedSkyHexColor() {
            return parsedSkyHexColor;
        }

        public int getParsedFogHexColor() {
            return parsedFogHexColor;
        }
    }
}
