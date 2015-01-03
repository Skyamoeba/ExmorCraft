package com.uklonewolf.exmorcraft.block.Glass;

import com.uklonewolf.exmorcraft.creativetab.CreativeTabExmorCraft;
import com.uklonewolf.exmorcraft.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class GlassEC extends Block
{
    public GlassEC(Material material) {
        super(material);
        this.setCreativeTab(CreativeTabExmorCraft.ExmorCraft_TAB);
    }

    public GlassEC()
    {
        this(Material.glass);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    // Texture
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }
    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
