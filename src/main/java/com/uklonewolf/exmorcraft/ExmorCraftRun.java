package com.uklonewolf.exmorcraft;

import com.uklonewolf.exmorcraft.client.handler.KeyInputEventHandler;
import com.uklonewolf.exmorcraft.handler.ConfigurationHandler;
import com.uklonewolf.exmorcraft.init.*;
import com.uklonewolf.exmorcraft.init.Registration.*;
import com.uklonewolf.exmorcraft.init.Registration.worldgen.WorldGenRegistration;
import com.uklonewolf.exmorcraft.init.recipes.*;
import com.uklonewolf.exmorcraft.proxy.IProxy;
import com.uklonewolf.exmorcraft.reference.Messages;
import com.uklonewolf.exmorcraft.reference.ModCheck;
import com.uklonewolf.exmorcraft.reference.Names;
import com.uklonewolf.exmorcraft.reference.Reference;
import com.uklonewolf.exmorcraft.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLFingerprintViolationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, certificateFingerprint = Reference.FINGERPRINT, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class ExmorCraftRun
{
    @Mod.Instance(Reference.MOD_ID)
    public static ExmorCraftRun instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void invalidFingerprint(FMLFingerprintViolationEvent event)
    {
        // Report (log) to the user that the version of Exmorcraft
        // they are using has been changed/tampered with
        if (Reference.FINGERPRINT.equals(Names.Security.CHECK))
        {
            //LogHelper.info(Messages.NO_FINGERPRINT_MESSAGE);
            LogHelper.warn(Messages.NO_FINGERPRINT_MESSAGE_DEV);
        }
        else
        {
            LogHelper.warn(Messages.INVALID_FINGERPRINT_MESSAGE);
        }
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        LogHelper.info("################################################");
        LogHelper.info("#####-----###--##--###-----###-----###-----#####");
        LogHelper.info("#####-########----####-#-#-###-###-###-#########");
        LogHelper.info("#####-----#####--#####-#-#-###-###-###-#########");
        LogHelper.info("#####-########----####-#-#-###-###-###-#########");
        LogHelper.info("#####-----###--##--###-###-###-----###-#########");
        LogHelper.info("################################################");
        LogHelper.info("Mod     : " + Reference.MOD_NAME);
        LogHelper.info("Version : " + Reference.VERSION);
        LogHelper.info("Author  : " + Reference.AUTHOR);
        LogHelper.info("This will be removed when EXMORCRAFT is out of ALPHA");
        LogHelper.info("################################################");
        proxy.registerKeyBindings();

        ModOre.init();
            ModIngots.init();
                ModDusts.init();
                    ModTools.init();
                        ModItems.init();
                            ModDyes.init();
                                ModBlocks.init();


        //World Gen
        LogHelper.info("############# Generating Ores ##################");

            WorldGenRegistration.mainRegistry();

        LogHelper.info("############# Pre Initialization Complete! #####");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());
    //####################################################################################### Registering In Ore Dictionary
        oreRegistration.init();
            itemRegistration.init();
                dyeRegistration.init();
                    ingotRegistration.init();
                        dustRegistration.init();
    //####################################################################################### Recipes
        ComponentRecipes.init();
            HandGrinderRecipes.init();
                ToolsRecipes.init();
                    DyeRecipes.init();
                        Smelting.init();


        LogHelper.info("############# Initialization Complete! #########");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("############# Seeing What Mods Are Installed #########");

        //Applied Energyistics 2
        if (Loader.isModLoaded(ModCheck.AE2.AE2_MOD_NAME))
        {
            LogHelper.info(ModCheck.AE2.AE2_INSTALLED);
          //TODO Add API for AE2 and add grinder recipies
        }
        else
        {
            LogHelper.info(ModCheck.AE2.AE2_NOT_INSTALLED);
            LogHelper.info(ModCheck.AE2.AE2_WEB);
        }

       if (Loader.isModLoaded(ModCheck.TE3.TE3_MOD_NAME))
        {
            LogHelper.info(ModCheck.TE3.TE3_INSTALLED);
        }
        else
        {
            LogHelper.info(ModCheck.TE3.TE3_NOT_INSTALLED);
            LogHelper.info(ModCheck.TE3.TE3_WEB);
        }

        if (Loader.isModLoaded(ModCheck.IC2.IC2_MOD_NAME))
        {
            LogHelper.info(ModCheck.IC2.IC2_INSTALLED);
        }
        else
        {
            LogHelper.info(ModCheck.IC2.IC2_NOT_INSTALLED);
            LogHelper.info(ModCheck.IC2.IC2_WEB);
        }

        LogHelper.info("Post Initialization Complete!");
        LogHelper.info("Getting Ore List");
        for (String oreName : OreDictionary.getOreNames())
        {
            LogHelper.info(oreName);
            OreDictionary.getOres(oreName); // Replace "oreName with name of ore you are searching for
        }

        LogHelper.warn("########## Exmor-Craft Load Complete ###########");
    }
}
//TODO Change textures from test textures to own textures
//   /gamerule doDaylightCycle false
//   /time set 6000