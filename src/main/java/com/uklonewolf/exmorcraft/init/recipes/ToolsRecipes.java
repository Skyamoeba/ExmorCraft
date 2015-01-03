package com.uklonewolf.exmorcraft.init.recipes;

import com.uklonewolf.exmorcraft.init.ModTools;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class ToolsRecipes

{
    public static void init() {
        //ExmorCraft Tool Recipes

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModTools.toolSilicaAxe), "ii ", "is ", " s ", 'i', "ingotSilica", 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModTools.toolSilicaHoe), "ii ", " s ", " s ", 'i', "ingotSilica", 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModTools.toolSilicaPickaxe), "iii", " s ", " s ", 'i', "ingotSilica", 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModTools.toolSilicaShears), " i ", " ii", "i  ", 'i', "ingotSilica"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModTools.toolSilicaShovel), " i ", " s ", " s ", 'i', "ingotSilica", 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModTools.toolSilicaSword), " i ", " i ", " s ", 'i', "ingotSilica", 's', "ingotIron"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModTools.toolHandGrinder), " s ", "isi", " s ", 'i', "stickWood", 's', "ingotSilica"));
        
    }
}

