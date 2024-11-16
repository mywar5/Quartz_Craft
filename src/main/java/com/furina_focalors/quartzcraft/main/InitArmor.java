package com.furina_focalors.quartzcraft.main;

import com.furina_focalors.quartzcraft.armor.ItemQuartzArmor;
import com.furina_focalors.quartzcraft.handlers.ArmorHandler;
import com.furina_focalors.quartzcraft.material.ArmorMaterial;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class InitArmor {


    // Quartz
    public static ItemArmor quartz_helmet;
    public static ItemArmor quartz_chestplate;
    public static ItemArmor quartz_leggings;
    public static ItemArmor quartz_boots;
    /*
    public static ItemArmor _helmet;
    public static ItemArmor _chestplate;
    public static ItemArmor _leggins;
    public static ItemArmor _boots;

    */
    public static void init() {
        if (ArmorHandler.quartz_armor) {
            quartz_helmet =  new ItemQuartzArmor("quartz_helmet", ArmorMaterial.QUARTZ, 1, EntityEquipmentSlot.HEAD);
            quartz_chestplate =  new ItemQuartzArmor("quartz_chestplate", ArmorMaterial.QUARTZ, 1, EntityEquipmentSlot.CHEST);
            quartz_leggings =  new ItemQuartzArmor("quartz_leggins", ArmorMaterial.QUARTZ, 2, EntityEquipmentSlot.LEGS);
            quartz_boots =  new ItemQuartzArmor("quartz_boots", ArmorMaterial.QUARTZ, 1, EntityEquipmentSlot.FEET);

            /*
            _helmet = new Item  Atmor("_helmet",ArmorMaterial.,,EntityEquipmentSlot.HEAD);
            _chestplate = new Item  Armor("_chestplate",ArmorMaterial.,,EntityEquipmentSlot.CHEST);
            _leggins = new Item  Armor("_leggins",ArmorMaterial.,,EntityEquipmentSlot.LEGS);
            _boots = new Item  Armor("_boots",ArmorMaterial.,,EntityEquipmentSlot.FEET);
            */
        }
    }
}

