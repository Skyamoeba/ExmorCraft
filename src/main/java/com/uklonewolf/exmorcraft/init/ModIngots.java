package com.uklonewolf.exmorcraft.init;

import com.uklonewolf.exmorcraft.item.ingots.*;
import com.uklonewolf.exmorcraft.reference.Names;
import com.uklonewolf.exmorcraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModIngots
{
    //#################### Raw Materials And Ingots ######################
        public static final IngotsEC ingotAluminum = new ingot_Aluminum();
        public static final IngotsEC ingotCopper = new ingot_Copper();
        public static final IngotsEC ingotDarkiron = new ingot_Darkiron();
        public static final IngotsEC ingotLead = new ingot_Lead();
        public static final IngotsEC ingotMagnesium = new ingot_Magnesium();
        public static final IngotsEC ingotNickel = new ingot_Nickel();
        //public static final IngotsEC ingotSalt = new salt_ingot();
        public static final IngotsEC ingotSilica = new ingot_Silica();
        public static final IngotsEC ingotSilver = new ingot_Silver();
        public static final IngotsEC ingotTin = new ingot_Tin();
        public static final IngotsEC ingotUranium = new ingot_Uranium();
        public static final IngotsEC ingotRedstone = new ingot_Redstone();
    //####################################################################

    public static void init()
    {
    //#################### Raw Materials And Ingots ######################
        GameRegistry.registerItem(ingotAluminum, Names.Ingots.Ingot_Aluminium);
        GameRegistry.registerItem(ingotCopper, Names.Ingots.Ingot_Copper);
        GameRegistry.registerItem(ingotDarkiron, Names.Ingots.Ingot_Darkiron);
        GameRegistry.registerItem(ingotLead, Names.Ingots.Ingot_Lead);
        GameRegistry.registerItem(ingotMagnesium, Names.Ingots.Ingot_Magnesium);
        GameRegistry.registerItem(ingotNickel, Names.Ingots.Ingot_Nickel);
        //GameRegistry.registerItem(ingotSalt, Names.Ingots.Ingot_Salt);                //Note: Undecided to add Salt Ingot to Minecraft.
        GameRegistry.registerItem(ingotSilica, Names.Ingots.Ingot_Silica);
        GameRegistry.registerItem(ingotSilver, Names.Ingots.Ingot_Silver);
        GameRegistry.registerItem(ingotTin, Names.Ingots.Ingot_Tin);
        GameRegistry.registerItem(ingotUranium, Names.Ingots.Ingot_Uranium);
        GameRegistry.registerItem(ingotRedstone, Names.Ingots.Ingot_Redstone);
    //####################################################################
    }


}