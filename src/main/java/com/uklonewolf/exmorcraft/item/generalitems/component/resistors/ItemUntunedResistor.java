package com.uklonewolf.exmorcraft.item.generalitems.component.resistors;

import com.uklonewolf.exmorcraft.item.generalitems.ItemEC;
import com.uklonewolf.exmorcraft.reference.Names;

public class ItemUntunedResistor extends ItemEC
{
    public ItemUntunedResistor()
    {
        super();
        this.setUnlocalizedName(Names.Component.ITEM_UNTUNED_RESISTOR);
        this.setTextureName(Names.Component.ITEM_UNTUNED_RESISTOR);
        this.maxStackSize = 64;
    }
}
//TODO Recipe