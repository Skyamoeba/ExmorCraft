package com.uklonewolf.exmorcraft.init.Registration.worldgen;

import com.uklonewolf.exmorcraft.init.ModOre;
import com.uklonewolf.exmorcraft.utility.LogHelper;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class WorldGenExmor implements IWorldGenerator
{
    public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.dimensionId)
        {
            case -1:
                generateNether(world, rand, chunkX * 16, chunkZ * 16);
            case -0:
                generateSurface(world, rand, chunkX * 16, chunkZ * 16);
            


        }
    }

    private void generateSurface(World world, Random rand, int chunkX, int chunkZ)
    {
        //############################################################################## Aluminium Ore Gen
        LogHelper.info("Generating oreAluminum");
        for (int a = 0; a < 5; a++)
        {
            int randPosX = chunkX + rand.nextInt(16);
            int randPosY = rand.nextInt(64);
            int randPosZ = chunkZ + rand.nextInt(16);

            (new WorldGenMinable(ModOre.oreAluminum ,5)).generate(world, rand, randPosX, randPosY, randPosZ);
        }
        //############################################################################## Copper Ore Gen
        LogHelper.info("Generating oreCopper");
        for (int b = 0; b < 5; b++)
        {
            int randPosX = chunkX + rand.nextInt(16);
            int randPosY = rand.nextInt(64);
            int randPosZ = chunkZ + rand.nextInt(16);

            (new WorldGenMinable(ModOre.oreCopper ,5)).generate(world, rand, randPosX, randPosY, randPosZ);
        }
        //############################################################################## Dark Iron Ore Gen
        LogHelper.info("Generating oreDarkIron");
        for (int c = 0; c < 5; c++)
        {
            int randPosX = chunkX + rand.nextInt(16);
            int randPosY = rand.nextInt(64);
            int randPosZ = chunkZ + rand.nextInt(16);

            (new WorldGenMinable(ModOre.oreDarkiron ,5)).generate(world, rand, randPosX, randPosY, randPosZ);
        }
        //############################################################################## Lead Ore Gen
        LogHelper.info("Generating oreLead");
        for (int d = 0; d < 5; d++)
        {
            int randPosX = chunkX + rand.nextInt(16);
            int randPosY = rand.nextInt(64);
            int randPosZ = chunkZ + rand.nextInt(16);

            (new WorldGenMinable(ModOre.oreLead ,5)).generate(world, rand, randPosX, randPosY, randPosZ);
        }
        //############################################################################## Magnesium Ore Gen
        LogHelper.info("Generating Magnesium");
        for (int e = 0; e < 5; e++)
        {
            int randPosX = chunkX + rand.nextInt(16);
            int randPosY = rand.nextInt(64);
            int randPosZ = chunkZ + rand.nextInt(16);

            (new WorldGenMinable(ModOre.oreMagnesium ,5)).generate(world, rand, randPosX, randPosY, randPosZ);
        }
        //############################################################################## Nickel Ore Gen
        LogHelper.info("Generating Nickel");
        for (int f = 0; f < 5; f++)
        {
            int randPosX = chunkX + rand.nextInt(16);
            int randPosY = rand.nextInt(64);
            int randPosZ = chunkZ + rand.nextInt(16);

            (new WorldGenMinable(ModOre.oreNickel ,5)).generate(world, rand, randPosX, randPosY, randPosZ);
        }
        //############################################################################## Salt Ore Gen
        LogHelper.info("Generating Salt");
        for (int g = 0; g < 5; g++)
        {
            int randPosX = chunkX + rand.nextInt(16);
            int randPosY = rand.nextInt(64);
            int randPosZ = chunkZ + rand.nextInt(16);

            (new WorldGenMinable(ModOre.oreSalt ,5)).generate(world, rand, randPosX, randPosY, randPosZ);
        }
        //############################################################################## Silica Ore Gen
        LogHelper.info("Generating Silica");
        for (int h = 0; h < 5; h++)
        {
            int randPosX = chunkX + rand.nextInt(16);
            int randPosY = rand.nextInt(64);
            int randPosZ = chunkZ + rand.nextInt(16);

            (new WorldGenMinable(ModOre.oreSilica ,5)).generate(world, rand, randPosX, 30, randPosZ); //YLevel 30
        }
        //############################################################################## Tin Ore Gen
        LogHelper.info("Generating Tin");
        for (int i = 0; i < 5; i++)
        {
            int randPosX = chunkX + rand.nextInt(16);
            int randPosY = rand.nextInt(64);
            int randPosZ = chunkZ + rand.nextInt(16);

            (new WorldGenMinable(ModOre.oreTin ,5)).generate(world, rand, randPosX, randPosY, randPosZ);
        }
        //############################################################################## Uranium Ore Gen
        LogHelper.info("Generating Uranium");
        for (int j = 0; j < 2; j++)
        {
            int randPosX = chunkX + rand.nextInt(16);
            int randPosY = rand.nextInt(20);
            int randPosZ = chunkZ + rand.nextInt(16);
            (new WorldGenMinable(ModOre.oreUranium ,2)).generate(world, rand, randPosX, randPosY, randPosZ);
        }
        //############################################################################## Diamond Ore Gen
        //TODO Change to Compressed Diamond
        LogHelper.info("Generating Diamond");
        for (int j = 0; j < 2; j++)
        {
            int randPosX = chunkX + rand.nextInt(16);
            int randPosY = rand.nextInt(20);
            int randPosZ = chunkZ + rand.nextInt(16);
            (new WorldGenMinable(ModOre.oreDiamond ,3)).generate(world, rand, randPosX, randPosY, randPosZ);
        }
    }

    private void generateNether(World world, Random rand, int chunkX, int chunkZ)
    {

    }
    
    private void generateEnd(World world, Random rand, int chunkX, int chunkZ)
    {
    
    }
}
