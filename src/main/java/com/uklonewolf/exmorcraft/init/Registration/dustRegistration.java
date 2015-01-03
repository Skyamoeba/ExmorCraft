package com.uklonewolf.exmorcraft.init.Registration;

import com.uklonewolf.exmorcraft.init.ModDusts;

import com.uklonewolf.exmorcraft.utility.LogHelper;
import net.minecraftforge.oredict.OreDictionary;

public class dustRegistration
{
    public static void init()
    {
        LogHelper.info("Registering Dusts with Ore Dictionary");
     //########################################################################
        OreDictionary.registerOre("dustAluminum",  ModDusts.dustAluminum);
        OreDictionary.registerOre("dustCopper",    ModDusts.dustCopper);
        OreDictionary.registerOre("dustDarkiron",  ModDusts.dustDarkiron);
        OreDictionary.registerOre("dustLead",      ModDusts.dustLead);
        OreDictionary.registerOre("dustMagnesium", ModDusts.dustMagnesium);
        OreDictionary.registerOre("dustNickel",    ModDusts.dustNickel);
        OreDictionary.registerOre("dustSalt",      ModDusts.dustSalt);
        OreDictionary.registerOre("dustSilica",    ModDusts.dustSilica);
        OreDictionary.registerOre("dustSilver",    ModDusts.dustSilver);
        OreDictionary.registerOre("dustTin",       ModDusts.dustTin);
        OreDictionary.registerOre("dustUranium",   ModDusts.dustUranium);
     //########################################################################
    }
}
