package com.uklonewolf.exmorcraft.block.generalblocks;

import com.uklonewolf.exmorcraft.reference.Names;
import net.minecraft.block.material.Material;

public class CleanRoomWall extends BlockEC
{
        public CleanRoomWall()
        {
            super(Material.rock);
            this.setBlockName(Names.Blocks.Clean_Room_Wall);
            this.setBlockTextureName(Names.Blocks.Clean_Room_Wall);
            this.setHarvestLevel("pickaxe", 3);
            this.setHardness(900000000.0F);
            this.setResistance(900000000.0F);
            this.setStepSound(soundTypeMetal);
        }



}
