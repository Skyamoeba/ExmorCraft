package com.uklonewolf.exmorcraft.init;

import com.uklonewolf.exmorcraft.item.tools.toolEC.*;
import com.uklonewolf.exmorcraft.item.tools.toolItems.*;
import com.uklonewolf.exmorcraft.reference.Names;
import com.uklonewolf.exmorcraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;


@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModTools
{
    public static final ToolsGrinderEC toolHandGrinder = new tool_HandGrinder();
    public static final ToolsAxeEC toolSilicaAxe = new tool_SilicaAxe();
    public static final ToolsHoeEC toolSilicaHoe = new tool_SilicaHoe();
    public static final ToolsPickaxeEC toolSilicaPickaxe = new tool_SilicaPickaxe();
    public static final ToolsShearsEC toolSilicaShears = new tool_SilicaShears();
    public static final ToolsShovelEC toolSilicaShovel = new tool_SilicaShovel();
    public static final ToolsSwordEC toolSilicaSword = new tool_SilicaSword();

    public static void init()
    {
        GameRegistry.registerItem(toolHandGrinder, Names.Tools.Tool_Hand_Grinder, Reference.MOD_ID);
        GameRegistry.registerItem(toolSilicaAxe, Names.Tools.Tool_Silica_Axe);
        GameRegistry.registerItem(toolSilicaHoe, Names.Tools.Tool_Silica_Hoe);
        GameRegistry.registerItem(toolSilicaPickaxe, Names.Tools.Tool_Silica_Pickaxe);
        GameRegistry.registerItem(toolSilicaShears, Names.Tools.Tool_Silica_Shears);
        GameRegistry.registerItem(toolSilicaShovel, Names.Tools.Tool_Silica_Shovel);
        GameRegistry.registerItem(toolSilicaSword, Names.Tools.Tool_Silica_Sword);
    }
}
