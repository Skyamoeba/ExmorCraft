package com.uklonewolf.exmorcraft.init;

import com.uklonewolf.exmorcraft.item.ingots.*;
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
        GameRegistry.registerItem(ingotAluminum, "ingotAluminum");
        GameRegistry.registerItem(ingotCopper, "ingotCopper");
        GameRegistry.registerItem(ingotDarkiron, "ingotDarkiron");
        GameRegistry.registerItem(ingotLead, "ingotLead");
        GameRegistry.registerItem(ingotMagnesium, "ingotMagnesium");
        GameRegistry.registerItem(ingotNickel, "ingotNickel");
        //GameRegistry.registerItem(ingotSalt, "ingotSalt");                //Note: Undecided to add Salt Ingot to Minecraft.
        GameRegistry.registerItem(ingotSilica, "ingotSilica");
        GameRegistry.registerItem(ingotSilver, "ingotSilver");
        GameRegistry.registerItem(ingotTin, "ingotTin");
        GameRegistry.registerItem(ingotUranium, "ingotUranium");
        GameRegistry.registerItem(ingotRedstone, "ingotRedstone");
        //TODO Add these to Names
    //####################################################################
    }


}