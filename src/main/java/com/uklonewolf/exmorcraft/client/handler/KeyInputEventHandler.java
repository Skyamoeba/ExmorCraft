package com.uklonewolf.exmorcraft.client.handler;


import com.uklonewolf.exmorcraft.client.settings.Keybindings;
import com.uklonewolf.exmorcraft.reference.Key;
import com.uklonewolf.exmorcraft.utility.LogHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class KeyInputEventHandler
{
    private static Key getPressedKeybinding() {
        if (Keybindings.charge.isPressed())
        {
            return Key.CHARGE;
        }
        else if (Keybindings.release.isPressed())
        {
            return Key.RELEASE;
        }
        else if (Keybindings.forward.isPressed())
        {
            return Key.FORWARD;
        }
        return Key.UNKNOWN;
    }


    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent event)
    {
        LogHelper.info(getPressedKeybinding());
    }

}
