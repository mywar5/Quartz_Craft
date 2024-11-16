package com.furina_focalors.quartzcraft.material;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class ArmorMaterial {
    public static  ItemArmor.ArmorMaterial QUARTZ;
    static {
        QUARTZ = EnumHelper.addArmorMaterial("QUARTZ","",50,new int[]{2,6,4,2},50,SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,1.0F);
    }
}
