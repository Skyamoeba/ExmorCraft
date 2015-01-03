package com.uklonewolf.exmorcraft.init.recipes;

import com.uklonewolf.exmorcraft.init.ModDusts;
import com.uklonewolf.exmorcraft.init.ModItems;
import com.uklonewolf.exmorcraft.init.ModOre;
import com.uklonewolf.exmorcraft.init.ModIngots;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Smelting
{
    public static void init()
    {
        //Ores Smelting
        GameRegistry.addSmelting(ModOre.oreAluminum, new ItemStack(ModIngots.ingotAluminum), 1.0F);
        GameRegistry.addSmelting(ModOre.oreCopper, new ItemStack(ModIngots.ingotCopper), 1.0F);
        GameRegistry.addSmelting(ModOre.oreDarkiron, new ItemStack(ModIngots.ingotDarkiron), 1.0F);
        GameRegistry.addSmelting(ModOre.oreLead, new ItemStack(ModIngots.ingotLead), 1.0F);
        GameRegistry.addSmelting(ModOre.oreMagnesium, new ItemStack(ModIngots.ingotMagnesium), 1.0F);
        GameRegistry.addSmelting(ModOre.oreNickel, new ItemStack(ModIngots.ingotNickel), 1.0F);
        //Salt Ingot
        GameRegistry.addSmelting(ModOre.oreSilica, new ItemStack(ModIngots.ingotSilica), 1.0F);
        GameRegistry.addSmelting(ModOre.oreSilver, new ItemStack(ModIngots.ingotSilver), 1.0F);
        GameRegistry.addSmelting(ModOre.oreTin,new ItemStack(ModIngots.ingotTin), 1.0F);
        GameRegistry.addSmelting(ModOre.oreUranium, new ItemStack(ModIngots.ingotUranium), 1.0F);

        //Dusts Smelting
        GameRegistry.addSmelting(ModDusts.dustAluminum, new ItemStack(ModIngots.ingotAluminum), 0.5F);
        GameRegistry.addSmelting(ModDusts.dustCopper, new ItemStack(ModIngots.ingotCopper), 0.5F);
        GameRegistry.addSmelting(ModDusts.dustDarkiron, new ItemStack(ModIngots.ingotDarkiron), 0.5F);
        GameRegistry.addSmelting(ModDusts.dustLead, new ItemStack(ModIngots.ingotLead), 0.5F);
        GameRegistry.addSmelting(ModDusts.dustMagnesium, new ItemStack(ModIngots.ingotMagnesium), 0.5F);
        GameRegistry.addSmelting(ModDusts.dustNickel, new ItemStack(ModIngots.ingotNickel), 0.5F);
        //Salt Dust to ????
        GameRegistry.addSmelting(ModDusts.dustSilica, new ItemStack(ModItems.itemSilicon), 0.5F);
        GameRegistry.addSmelting(ModDusts.dustSilver, new ItemStack(ModIngots.ingotSilver), 0.5F);
        GameRegistry.addSmelting(ModDusts.dustTin, new ItemStack(ModIngots.ingotTin), 0.5F);
        GameRegistry.addSmelting(ModDusts.dustUranium, new ItemStack(ModIngots.ingotUranium), 0.5F);

        //Misc
        GameRegistry.addSmelting(Items.redstone, new ItemStack(ModIngots.ingotRedstone), 1.0F);
    }
}
