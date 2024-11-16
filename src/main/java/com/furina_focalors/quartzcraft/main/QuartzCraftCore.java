package com.furina_focalors.quartzcraft.main;

import com.furina_focalors.quartzcraft.Tab.CreativeTab;
import com.furina_focalors.quartzcraft.proxy.Proxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;
import org.apache.logging.log4j.Logger;


@Mod(modid = QuartzCraftCore.MODID, name = QuartzCraftCore.NAME, version = QuartzCraftCore.VERSION)
public class QuartzCraftCore
{
    public static final String MODID = "quartzcraft";
    public static final String NAME = "quartzcraft";
    public static final String VERSION = "0.1.0";

    public static final CreativeTabs QuartzCraft_Tab = new CreativeTab();

    @SidedProxy(clientSide = "com.furina_focalors.quartzcraft.proxy.ClientProxy",serverSide = "com.furina_focalors.quartzcraft.proxy.Proxy")
    public static Proxy proxy;

    private static Object mod;
    public static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        mod= this;
        proxy.preInit(event);
        InitArmor.init();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
    public static Object getMod()
    {
        return mod;
    }
}

