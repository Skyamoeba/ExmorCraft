package com.uklonewolf.exmorcraft.init;

import com.uklonewolf.exmorcraft.block.ore.*;
import com.uklonewolf.exmorcraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModOre
{
 //##################################################################
    public static final BlockOreEC oreCopper = new ore_Copper();
    public static final BlockOreEC oreAluminum = new ore_Aluminum();
    public static final BlockOreEC oreDarkiron = new ore_DarkIron();
    public static final BlockOreEC oreLead = new ore_Lead();
    public static final BlockOreEC oreMagnesium = new ore_Magnesium();
    public static final BlockOreEC oreNickel = new ore_Nickel();
    public static final BlockOreEC oreSalt = new ore_Salt();
    public static final BlockOreEC oreSilver = new ore_Silver();
    public static final BlockOreEC oreTin = new ore_Tin();
    public static final BlockOreEC oreUranium = new ore_Uranium();
    public static final BlockOreEC oreSilica = new ore_Silica();
    public static final BlockOreEC oreDiamond = new ore_Diamond();

 //##################################################################
    public static void init()
    {
        GameRegistry.registerBlock(oreAluminum, "oreAluminum");
        GameRegistry.registerBlock(oreCopper, "oreCopper");
        GameRegistry.registerBlock(oreDarkiron, "oreDarkiron");
        GameRegistry.registerBlock(oreLead, "oreLead");
        GameRegistry.registerBlock(oreMagnesium, "oreMagnesium");
        GameRegistry.registerBlock(oreNickel, "oreNickel");
        GameRegistry.registerBlock(oreSalt, "oreSalt");
        GameRegistry.registerBlock(oreSilver, "oreSilver");
        GameRegistry.registerBlock(oreTin, "oreTin");
        GameRegistry.registerBlock(oreUranium, "oreUranium");
        GameRegistry.registerBlock(oreSilica, "oreSilica");
        GameRegistry.registerBlock(oreDiamond, "oreDiamond");
        //TODO Add these to Names
    }
 //##################################################################
}