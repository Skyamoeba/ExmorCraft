package com.uklonewolf.exmorcraft.init;

import com.uklonewolf.exmorcraft.block.generalblocks.BlockEC;
import com.uklonewolf.exmorcraft.block.Glass.GlassEC;
import com.uklonewolf.exmorcraft.block.Glass.SilicaGlass;
import com.uklonewolf.exmorcraft.block.generalblocks.CleanRoomWall;
import com.uklonewolf.exmorcraft.reference.Names;
import com.uklonewolf.exmorcraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
 //##################################################################
    public static final GlassEC silicaGlass = new SilicaGlass();
    public static final BlockEC cleanroomwall = new CleanRoomWall();

 //##################################################################
    public static void init()
    {
        GameRegistry.registerBlock(silicaGlass, Names.EXGlass.SILICA_GLASS);
        GameRegistry.registerBlock(cleanroomwall, Names.Blocks.Clean_Room_Wall);
    }
 //##################################################################
}
