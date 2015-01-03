package com.uklonewolf.exmorcraft.block.ore;

import com.uklonewolf.exmorcraft.reference.Names;
import net.minecraft.block.material.Material;

public class ore_Aluminum extends BlockOreEC
{
    public ore_Aluminum()
    {
        super(Material.rock);
        this.setBlockName(Names.Ore.Ore_Aluminium);
        this.setBlockTextureName(Names.Ore.Ore_Aluminium);
        this.setHardness(3.0F);
        this.setResistance(5.0F);
        this.setStepSound(soundTypeStone);
    }
}
