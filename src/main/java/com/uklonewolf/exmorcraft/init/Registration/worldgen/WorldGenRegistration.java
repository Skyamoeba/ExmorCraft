package com.uklonewolf.exmorcraft.init.Registration.worldgen;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class WorldGenRegistration
{
    public static void mainRegistry()
    {
        initWorldGen();
    }

    public static void initWorldGen()
    {
        registerWorldGen(new WorldGenExmor(), 1);
    }

    public static void registerWorldGen(IWorldGenerator worldGenClass, int weightedProbabaility)
    {
        GameRegistry.registerWorldGenerator(worldGenClass, weightedProbabaility);
    }
}

