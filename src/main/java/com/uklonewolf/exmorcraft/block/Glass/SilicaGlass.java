package com.uklonewolf.exmorcraft.block.Glass;

import com.uklonewolf.exmorcraft.creativetab.CreativeTabExmorCraft;
import com.uklonewolf.exmorcraft.reference.Names;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.Random;


public class SilicaGlass extends GlassEC
{
    public SilicaGlass()
    {
        super();
        this.setCreativeTab(CreativeTabExmorCraft.ExmorCraft_TAB);
        this.setBlockName(Names.EXGlass.SILICA_GLASS);
        this.setBlockTextureName(Names.EXGlass.SILICA_GLASS);
        this.setResistance(900000000.0F);
        this.setHardness(10.0F);
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random p_149745_1_)
    {
        return 0;
    }

    /**
     * Returns which pass should this block be rendered on. 0 for solids and 1 for alpha
     */
    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass()
    {
        return 0;
    }

    /**
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    /**
     * Return true if a player with Silk Touch can harvest this block directly, and not its normal drops.
     */
    protected boolean canSilkHarvest()
    {
        return true;
    }

    public boolean isOpaqueCube()
    {
        return false;
    }

}
