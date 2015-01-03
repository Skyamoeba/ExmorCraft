package com.uklonewolf.exmorcraft.init.Registration;

import com.uklonewolf.exmorcraft.init.ModItems;
import com.uklonewolf.exmorcraft.utility.LogHelper;
import net.minecraftforge.oredict.OreDictionary;

public class itemRegistration
{
    public static void init()
    {
        LogHelper.info("Registering Items with Ore Dictionary");
     //##################################################################
        OreDictionary.registerOre("itemSilicon", ModItems.itemSilicon);
        OreDictionary.registerOre("itemUntunedresistor", ModItems.itemUntunedresistor);
        OreDictionary.registerOre("gemDiamond", ModItems.gemDiamond);
     //##################################################################
    }
}
