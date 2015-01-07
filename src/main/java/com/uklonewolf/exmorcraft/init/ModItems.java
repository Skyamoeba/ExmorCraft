package com.uklonewolf.exmorcraft.init;

import com.uklonewolf.exmorcraft.item.generalitems.component.circuitboards.*;
import com.uklonewolf.exmorcraft.item.generalitems.component.power.ItemToroidCore;
import com.uklonewolf.exmorcraft.item.generalitems.consuables.ItemSilicon;
import com.uklonewolf.exmorcraft.item.generalitems.component.cpu.ItemAdvancedCPU;
import com.uklonewolf.exmorcraft.item.generalitems.component.cpu.ItemBasicCPU;
import com.uklonewolf.exmorcraft.item.generalitems.component.cpu.ItemMidCPU;
import com.uklonewolf.exmorcraft.item.generalitems.component.cpu.ItemTransistor;
import com.uklonewolf.exmorcraft.item.generalitems.component.power.ItemCapacitor;
import com.uklonewolf.exmorcraft.item.generalitems.component.power.ItemToroid;
import com.uklonewolf.exmorcraft.item.generalitems.component.power.ItemTransformer;
import com.uklonewolf.exmorcraft.item.generalitems.component.resistors.*;
import com.uklonewolf.exmorcraft.item.generalitems.ItemEC;
import com.uklonewolf.exmorcraft.item.generalitems.consuables.itemDiamond;
import com.uklonewolf.exmorcraft.reference.Names;
import com.uklonewolf.exmorcraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    //###################### Compoonent Items #########################

    //CPU
        public static final ItemEC itemAdvancedcpu = new ItemAdvancedCPU();
        public static final ItemEC itemMidcpu = new ItemMidCPU();
        public static final ItemEC itemBasicCPU = new ItemBasicCPU();
        public static final ItemEC itemTransistor = new ItemTransistor();

    //Resistors
        public static final ItemEC itemUntunedresistor = new ItemUntunedResistor();
        public static final ItemEC itemOhm50resistor = new ItemOhm50Resistor();
        public static final ItemEC itemOhm100resistor = new ItemOhm100Resistor();
        public static final ItemEC itemOhm150resistor = new ItemOhm150Resistor();
        public static final ItemEC itemOhm200resistor = new ItemOhm200Resistor();
        public static final ItemEC itemOhm250resistor = new ItemOhm250Resistor();

    //Circuitboards
        public static final ItemEC itemFiberboard = new ItemFiberBoard();
        public static final ItemEC itemCopperCladBoard = new ItemCopperCladBoard();
        public static final ItemEC itemFriztCircuitBoard = new ItemFriztCircuitBoard();
        public static final ItemEC itemTemplateCircuitBoard = new ItemTemplateCircuitBoard();
        public static final ItemEC itemTrackedCircuitBoard = new ItemTrackedCircuitBoard();

    //Capacitor
        public static final ItemEC itemCapacitor = new ItemCapacitor();

    //Power
        public static final ItemEC itemTransformer = new ItemTransformer();
        public static final ItemEC itemToroid = new ItemToroid();
        public static final ItemEC itemToroidCore = new ItemToroidCore();

    //############################ Consuables Items ####################

        public static final ItemEC itemSilicon = new ItemSilicon();
        public static final ItemEC gemDiamond = new itemDiamond();

    //##################################################################

    public static void init() {
    //############################ Compoonent Items ####################

    //CPU
        GameRegistry.registerItem(itemAdvancedcpu, "itemAdvancedcpu"); // Make whats in the "sample" what you want to type to get the item by /give commands
        GameRegistry.registerItem(itemMidcpu, "itemMidcpu");
        GameRegistry.registerItem(itemBasicCPU, "itemBasicCPU");
        GameRegistry.registerItem(itemTransistor, "itemTransistor");
        //TODO Add these to Names

    //Resistors
        GameRegistry.registerItem(itemUntunedresistor, "itemUntunedresistor");
        GameRegistry.registerItem(itemOhm50resistor, "itemOhm50resistor");
        GameRegistry.registerItem(itemOhm100resistor, "itemOhm100resistor");
        GameRegistry.registerItem(itemOhm150resistor, "itemOhm150resistor");
        GameRegistry.registerItem(itemOhm200resistor, "itemOhm200resistor");
        GameRegistry.registerItem(itemOhm250resistor, "itemOhm250resistor");
        //TODO Add these to Names

    //Capacitor
        GameRegistry.registerItem(itemCapacitor, "itemCapacitor");
        //TODO Add these to Names

    //Circuitboards
        GameRegistry.registerItem(itemFiberboard, "itemFiberboard");
        GameRegistry.registerItem(itemCopperCladBoard, "itemCopperCladBoard");
        GameRegistry.registerItem(itemFriztCircuitBoard, "itemFriztCircuitBoard");
        GameRegistry.registerItem(itemTemplateCircuitBoard, "itemTemplateCircuitBoard");
        GameRegistry.registerItem(itemToroidCore, "itemToroidCore");
        GameRegistry.registerItem(itemTrackedCircuitBoard, "itemTrackedCircuitBoard");
        //TODO Add these to Names

    //Power
        GameRegistry.registerItem(itemTransformer, "itemTransformer");
        GameRegistry.registerItem(itemToroid, "itemToroid");
        //TODO Add these to Names
    //####################################################################



    //############################ Consuables Items ######################
        GameRegistry.registerItem(itemSilicon, Names.Consuables.ItemCons_Silicon);
        GameRegistry.registerItem(gemDiamond, Names.Consuables.ItemCons_Diamond);

    //####################################################################

    }


}