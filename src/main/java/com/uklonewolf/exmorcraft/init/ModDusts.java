package com.uklonewolf.exmorcraft.init;

import com.uklonewolf.exmorcraft.item.dusts.*;
import com.uklonewolf.exmorcraft.reference.Names;
import com.uklonewolf.exmorcraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModDusts
{
    //#################### Raw Materials And Ingots ######################
        public static final DustEC dustAluminum = new dust_Aluminum();
        public static final DustEC dustCopper = new dust_Copper();
        public static final DustEC dustDarkiron = new dust_Darkiron();
        public static final DustEC dustLead = new dust_Lead();
        public static final DustEC dustMagnesium = new dust_Magnesium();
        public static final DustEC dustNickel = new dust_Nickel();
        public static final DustEC dustSalt = new dust_Salt();
        public static final DustEC dustSilica = new dust_Silica();
        public static final DustEC dustSilver = new dust_Silver();
        public static final DustEC dustTin = new dust_Tin();
        public static final DustEC dustUranium = new dust_Uranium();
    //####################################################################

    public static void init()
    {
    //#################### Raw Materials And Ingots ######################
        GameRegistry.registerItem(dustAluminum, Names.Dusts.Dusts_Aluminium);
        GameRegistry.registerItem(dustCopper, Names.Dusts.Dusts_Copper);
        GameRegistry.registerItem(dustDarkiron, Names.Dusts.Dusts_Darkiron);
        GameRegistry.registerItem(dustLead, Names.Dusts.Dusts_Lead);
        GameRegistry.registerItem(dustMagnesium, Names.Dusts.Dusts_Magnesium);
        GameRegistry.registerItem(dustNickel, Names.Dusts.Dusts_Nickel);
        GameRegistry.registerItem(dustSalt, Names.Dusts.Dusts_Salt);
        GameRegistry.registerItem(dustSilica, Names.Dusts.Dusts_Silica);
        GameRegistry.registerItem(dustSilver, Names.Dusts.Dusts_Silver);
        GameRegistry.registerItem(dustTin, Names.Dusts.Dusts_Tin);
        GameRegistry.registerItem(dustUranium, Names.Dusts.Dusts_Uranium);
    //####################################################################
    }


}