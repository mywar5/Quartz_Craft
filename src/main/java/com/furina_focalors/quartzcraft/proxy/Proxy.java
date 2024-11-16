package com.furina_focalors.quartzcraft.proxy;

import com.furina_focalors.quartzcraft.block.BlocksRegister;
import com.furina_focalors.quartzcraft.config.ConfigLoader;
import com.furina_focalors.quartzcraft.handlers.EventsHandler;
import com.furina_focalors.quartzcraft.items.ItemsRegister;
import com.furina_focalors.quartzcraft.recipes.RecipeRegister;
import net.minecraft.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.event.*;


public class Proxy
{
    public void preInit(FMLPreInitializationEvent event) {
        ConfigLoader.load(event.getSuggestedConfigurationFile());
        EventsHandler.init();
        BlocksRegister.register();
        BlocksRegister.registerOreDictionary();
        //ItemsRegister.register();
        RecipeRegister.register();
        MinecraftForge.EVENT_BUS.register(new EventsHandler());

    }
    public void init(FMLInitializationEvent event) {

    }
    public void postInit(FMLPostInitializationEvent event) {
        ConfigLoader.dispose();
    }

}
