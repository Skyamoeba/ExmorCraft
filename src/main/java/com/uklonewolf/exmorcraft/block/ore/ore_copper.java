package com.uklonewolf.exmorcraft.block.ore;

import com.uklonewolf.exmorcraft.reference.Names;
import net.minecraft.block.material.Material;

public class ore_Copper extends BlockOreEC
{
    public ore_Copper()
    {
        super(Material.rock);
        this.setBlockName(Names.Ore.Ore_Copper);
        this.setBlockTextureName(Names.Ore.Ore_Copper);
        this.setHardness(3.0F);
        this.setResistance(5.0F);
        this.setHarvestLevel("pickaxe", 1);
        this.setHarvestLevel("toolSilicaPickaxe", 3);
        this.setStepSound(soundTypeStone);
    }
}
//TODO Add HarvestLevel to all ores.
//Wood   : 0
//Stone  : 1
//Iron   : 2
//Diamond: 3
//Gold   : 0