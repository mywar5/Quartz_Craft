package com.furina_focalors.quartzcraft.proxy;

import com.furina_focalors.quartzcraft.block.BlocksRegister;
import com.furina_focalors.quartzcraft.items.ItemsRegister;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends Proxy {
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);

    }
    @Override
    public void init(FMLInitializationEvent event) {
        BlocksRegister.registerRender();
        //ItemsRegister.registerRender();

    }
    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }
}
