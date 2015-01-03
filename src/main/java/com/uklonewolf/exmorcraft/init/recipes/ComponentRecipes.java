package com.uklonewolf.exmorcraft.init.recipes;

import com.uklonewolf.exmorcraft.init.ModItems;
import com.uklonewolf.exmorcraft.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;


public class ComponentRecipes

{
    public static void init() {
      //ExmorCraft Recipes
    // CPU
  // Basic
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.itemBasicCPU) , "###", "###", "###", '#', "itemSilicon"));
  // Mid
        //GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.itemMidcpu) , " cy", "cyc", "yc ", 'y', new ItemStack(Items.blaze_rod), 'c', new ItemStack(Items.clay_ball)));
  // Advanced
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.itemAdvancedcpu) , "###", "###", "###", '#', new ItemStack(ModItems.itemTransistor)));

        //Resistors
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.itemUntunedresistor, 5) , " cy", "cyc", "yc ", 'y', new ItemStack(Items.blaze_rod), 'c', new ItemStack(Items.clay_ball)));
        //#############################################################################################################################################################################################

        //#############################################################################################################################################################################################
        //Resistor Crafting Recipes

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.itemOhm50resistor) , "d  ", "pr ", "gb ", 'b', "dyeBlack", 'g', "dyeGreen", 'p', "dyeBrown", 'd', "dyeGold", 'r', Names.Component.ITEM_UNTUNED_RESISTOR));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.itemOhm100resistor), "d  ", "pr ", "gb ", 'b', "dyeBlack", 'g', "dyeBrown", 'p', "dyeBrown", 'd', "dyeGold", 'r', Names.Component.ITEM_UNTUNED_RESISTOR));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.itemOhm150resistor), "d  ", "pr ", "gb ", 'b', "dyeGreen", 'g', "dyeBrown", 'p', "dyeBrown", 'd', "dyeGold", 'r', Names.Component.ITEM_UNTUNED_RESISTOR));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.itemOhm200resistor), "d  ", "pr ", "gb ", 'b', "dyeRed", 'g', "dyeBlack", 'p', "dyeBrown", 'd', "dyeGold", 'r', Names.Component.ITEM_UNTUNED_RESISTOR));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.itemOhm250resistor), "d  ", "pr ", "gb ", 'b', "dyeRed", 'g', "dyeGreen", 'p', "dyeBrown", 'd', "dyeGold", 'r', Names.Component.ITEM_UNTUNED_RESISTOR));
        //#############################################################################################################################################################################################

        //Capacitors


        //Boards (Motherboard, Blank Circuit board)


        //Transistor and Transformer

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.itemTransistor), "idi", "dsd", "rir", 'i', "ingotIron", 'r', "dustRedstone", 'd', "gemDiamond", 's', "itemSilicon"));
        
        
    }
}


//Notes
//                             Output------------------->|   Top    Mid    Bot    s = is this item --- Item -->|   i = is this item -------- Item -->|
//      GameRegistry.addRecipe(new ItemStack(ModItems.cpu), " s ", "sis", " s ", 's', new ItemStack(Items.stick), 'i', new ItemStack(Items.iron_ingot));
//                                      Output----------------------->|  Input-------------------------------------------------------------------------------------->|
//      GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.casing), new ItemStack(ModItems.cpu), new ItemStack(Items.iron_ingot), new ItemStack(Items.iron_ingot));

//                                                 Output + Number to output -->|   Top    Mid    Bot    s = Ore Dict      i = Ore Dict
//      GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.cpu, 4), " s ", "sis", " s ", 's', "stickWood", 'i', "ingotIron"));
//
//      GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.casing), new ItemStack(ModItems.cpu), new ItemStack(Items.iron_ingot), new ItemStack(Items.iron_ingot)));

