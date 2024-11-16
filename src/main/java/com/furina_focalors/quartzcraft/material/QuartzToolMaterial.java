package com.furina_focalors.quartzcraft.material;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class QuartzToolMaterial {
    public static Item.ToolMaterial QUARTZ;
    //public static Item.ToolMaterial ;

    static
    {
        QUARTZ = EnumHelper.addToolMaterial("QUARTZ", 2, 512, 6.0F,  3, 50);
        //  = EnumHelper.addToolMaterial("", , , 0.0F,  , );

    }
}

