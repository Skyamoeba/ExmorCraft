package com.uklonewolf.exmorcraft.block.ore;

import com.uklonewolf.exmorcraft.reference.Names;
import net.minecraft.block.material.Material;

public class ore_Silica extends BlockOreEC
{
    public ore_Silica()
    {
        super(Material.rock);
        this.setBlockName(Names.Ore.Ore_Silica);
        this.setBlockTextureName(Names.Ore.Ore_Silica);
        this.setHardness(3.0F);
        this.setResistance(5.0F);
        this.setStepSound(soundTypeStone);
    }
}
