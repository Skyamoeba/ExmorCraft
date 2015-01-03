package com.uklonewolf.exmorcraft.item.tools.toolEC;

import com.uklonewolf.exmorcraft.creativetab.CreativeTabExmorCraft;
import com.uklonewolf.exmorcraft.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ToolsGrinderEC extends Item
{
    public ToolsGrinderEC()
    {
        super();
        this.setCreativeTab(CreativeTabExmorCraft.ExmorCraft_TAB);

    }

    //Item
    @Override
    public String getUnlocalizedName() {
        return String.format("tool.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    // Stack
    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
        return String.format("tool.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    // Texture
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}

