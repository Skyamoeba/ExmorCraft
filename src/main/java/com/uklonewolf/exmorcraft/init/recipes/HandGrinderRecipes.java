package com.uklonewolf.exmorcraft.init.recipes;



import com.uklonewolf.exmorcraft.init.ModDusts;
import com.uklonewolf.exmorcraft.init.ModOre;
import com.uklonewolf.exmorcraft.init.ModTools;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;


public class HandGrinderRecipes

{
    public static void init()
    {
        GameRegistry.addShapelessRecipe(new ItemStack(ModDusts.dustAluminum,2), new ItemStack(ModTools.toolHandGrinder, 1, 0), new ItemStack(ModOre.oreAluminum,1));
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

