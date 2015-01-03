package com.uklonewolf.exmorcraft.creativetab;

import com.uklonewolf.exmorcraft.init.ModItems;
import com.uklonewolf.exmorcraft.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabExmorCraft
{
    public static CreativeTabs ExmorCraft_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.itemFiberboard;
        }
    };
}
