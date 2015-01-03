package com.uklonewolf.exmorcraft.init.recipes;


import com.uklonewolf.exmorcraft.init.ModDyes;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class DyeRecipes

{
    public static void init()
    {
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModDyes.dyeBlack), "wit", "   ", "   ", 'w', Items.water_bucket, 'i', "dyeBlack", 't', "dyeTubEmpty"));


        //TODO Add Dye Recipes
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

