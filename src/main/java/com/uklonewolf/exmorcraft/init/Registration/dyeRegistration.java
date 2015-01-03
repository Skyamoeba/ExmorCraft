package com.uklonewolf.exmorcraft.init.Registration;

import com.uklonewolf.exmorcraft.init.ModDyes;
import com.uklonewolf.exmorcraft.reference.Names;
import com.uklonewolf.exmorcraft.utility.LogHelper;
import net.minecraftforge.oredict.OreDictionary;

public class dyeRegistration
{
    public static void init()
    {
        LogHelper.info("Dyes : Loading...");
     //##################################################################
        OreDictionary.registerOre("dyeTubEmpty", ModDyes.dyeTubEmpty);
        OreDictionary.registerOre("dyeBlack", ModDyes.dyeBlack);
        OreDictionary.registerOre("dyeBlue", ModDyes.dyeBlue);
        OreDictionary.registerOre("dyeBrown", ModDyes.dyeBrown);
        OreDictionary.registerOre("dyeCyan", ModDyes.dyeCyan);
        OreDictionary.registerOre("dyeGold", ModDyes.dyeGold);
        OreDictionary.registerOre("dyeGray", ModDyes.dyeGray);
        OreDictionary.registerOre("dyeGreen", ModDyes.dyeGreen);
        OreDictionary.registerOre("dyeLightBlue", ModDyes.dyeLightBlue);
        OreDictionary.registerOre("dyeLime", ModDyes.dyeLime);
        OreDictionary.registerOre("dyeMagenta", ModDyes.dyeMagenta);
        OreDictionary.registerOre("dyeOrange", ModDyes.dyeOrange);
        OreDictionary.registerOre("dyePink", ModDyes.dyePink);
        OreDictionary.registerOre("dyePurple", ModDyes.dyePurple);
        OreDictionary.registerOre("dyeRed", ModDyes.dyeRed);
        OreDictionary.registerOre("dyeSilver", ModDyes.dyeSilver);
        OreDictionary.registerOre("dyeWhite", ModDyes.dyeWhite);
        OreDictionary.registerOre("dyeYellow", ModDyes.dyeYellow);
     //##################################################################
        LogHelper.info("Dyes : Complete! ");
    }
}
