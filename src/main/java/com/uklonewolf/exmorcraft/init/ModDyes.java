package com.uklonewolf.exmorcraft.init;


import com.uklonewolf.exmorcraft.item.generalitems.consuables.dyes.*;
import com.uklonewolf.exmorcraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModDyes
{
    //##################################################################
    public static final DyeEC dyeTubEmpty = new ItemDyeTubEmpty();
    public static final DyeEC dyeBlack = new ItemDyeBlack();
    public static final DyeEC dyeBlue = new ItemDyeBlue();
    public static final DyeEC dyeBrown = new ItemDyeBrown();
    public static final DyeEC dyeCyan = new ItemDyeCyan();
    public static final DyeEC dyeGold = new ItemDyeGold();
    public static final DyeEC dyeGray = new ItemDyeGray();
    public static final DyeEC dyeGreen = new ItemDyeGreen();
    public static final DyeEC dyeLightBlue = new ItemDyeLightBlue();
    public static final DyeEC dyeLime = new ItemDyeLime();
    public static final DyeEC dyeMagenta = new ItemDyeMagenta();
    public static final DyeEC dyeOrange = new ItemDyeOrange();
    public static final DyeEC dyePink = new ItemDyePink();
    public static final DyeEC dyePurple = new ItemDyePurple();
    public static final DyeEC dyeRed = new ItemDyeRed();
    public static final DyeEC dyeSilver = new ItemDyeSilver();
    public static final DyeEC dyeWhite = new ItemDyeWhite();
    public static final DyeEC dyeYellow = new ItemDyeYellow();

    //##################################################################
    public static void init()
    {
        GameRegistry.registerItem(dyeTubEmpty, "dyeTubEmpty");
        GameRegistry.registerItem(dyeBlack, "dyeBlack");
        GameRegistry.registerItem(dyeBlue, "dyeBlue");
        GameRegistry.registerItem(dyeBrown, "dyeBrown");
        GameRegistry.registerItem(dyeCyan, "dyeCyan");
        GameRegistry.registerItem(dyeGold, "dyeGold");
        GameRegistry.registerItem(dyeGray, "dyeGray");
        GameRegistry.registerItem(dyeGreen, "dyeGreen");
        GameRegistry.registerItem(dyeLightBlue, "dyeLightBlue");
        GameRegistry.registerItem(dyeLime, "dyeLime");
        GameRegistry.registerItem(dyeMagenta, "dyeMagenta");
        GameRegistry.registerItem(dyeOrange, "dyeOrange");
        GameRegistry.registerItem(dyePink, "dyePink");
        GameRegistry.registerItem(dyePurple, "dyePurple");
        GameRegistry.registerItem(dyeRed, "dyeRed");
        GameRegistry.registerItem(dyeSilver, "dyeSilver");
        GameRegistry.registerItem(dyeWhite, "dyeWhite");
        GameRegistry.registerItem(dyeYellow, "dyeYellow");
    }
    //##################################################################
}
//TODO Add to Names