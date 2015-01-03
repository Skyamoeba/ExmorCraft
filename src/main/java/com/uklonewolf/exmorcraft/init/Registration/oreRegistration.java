package com.uklonewolf.exmorcraft.init.Registration;

import com.uklonewolf.exmorcraft.init.ModOre;
import com.uklonewolf.exmorcraft.utility.LogHelper;
import net.minecraftforge.oredict.OreDictionary;

public class oreRegistration
{
    public static void init()
    {
        LogHelper.info("Registering Ores with Ore Dictionary");
     //##################################################################
        OreDictionary.registerOre("oreAluminum",    ModOre.oreAluminum);
        OreDictionary.registerOre("oreCopper",      ModOre.oreCopper);
        OreDictionary.registerOre("oreDarkiron",    ModOre.oreDarkiron);
        OreDictionary.registerOre("oreLead",        ModOre.oreLead);
        OreDictionary.registerOre("oreMagnesium",   ModOre.oreMagnesium);
        OreDictionary.registerOre("oreNickel",      ModOre.oreNickel);
        OreDictionary.registerOre("oreSalt",        ModOre.oreSalt);
        OreDictionary.registerOre("oreSilica",      ModOre.oreSilica);
        OreDictionary.registerOre("oreSilver",      ModOre.oreSilver);
        OreDictionary.registerOre("oreTin",         ModOre.oreTin);
        OreDictionary.registerOre("oreUrainium",    ModOre.oreUranium);
        OreDictionary.registerOre("oreDiamond",     ModOre.oreDiamond);
     //##################################################################
    }
}
