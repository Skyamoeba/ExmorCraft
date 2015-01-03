package com.uklonewolf.exmorcraft.init.Registration;

import com.uklonewolf.exmorcraft.init.ModIngots;
import com.uklonewolf.exmorcraft.utility.LogHelper;
import net.minecraftforge.oredict.OreDictionary;

public class ingotRegistration
{
    public static void init()
    {
        LogHelper.info("Registering Ingots with Ore Dictionary");
     //########################################################################
        OreDictionary.registerOre("ingotAluminum", ModIngots.ingotAluminum);
        OreDictionary.registerOre("ingotCopper", ModIngots.ingotCopper);
        OreDictionary.registerOre("ingotDarkiron", ModIngots.ingotDarkiron);
        OreDictionary.registerOre("ingotLead", ModIngots.ingotLead);
        OreDictionary.registerOre("ingotMagnesium", ModIngots.ingotMagnesium);
        OreDictionary.registerOre("ingotNickel", ModIngots.ingotNickel);
        //OreDictionary.registerOre("ingotSalt", ModIngots.ingotSalt);
        OreDictionary.registerOre("ingotSilica", ModIngots.ingotSilica);
        OreDictionary.registerOre("ingotSilver", ModIngots.ingotSilver);
        OreDictionary.registerOre("ingotTin", ModIngots.ingotTin);
        OreDictionary.registerOre("ingotUranium", ModIngots.ingotUranium);
     //########################################################################
    }
}
