package com.uklonewolf.exmorcraft.block.ore;

import com.uklonewolf.exmorcraft.init.ModItems;
import com.uklonewolf.exmorcraft.reference.Names;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;



import java.util.Random;


public class ore_Diamond extends BlockOreEC
{
    public ore_Diamond()
    {
        super(Material.rock);
        this.setBlockName(Names.Ore.Ore_Diamond);
        this.setBlockTextureName(Names.Ore.Ore_Diamond);
        this.setHardness(3.0F);
        this.setResistance(5.0F);
        this.setStepSound(soundTypeStone);
    }

    @Override
    public Item getItemDropped(int metadata, Random random, int fortune)
    {
        return ModItems.gemDiamond;
    }
}
//TODO Change to Compressed Diamond