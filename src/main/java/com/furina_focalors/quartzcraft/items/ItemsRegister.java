package com.furina_focalors.quartzcraft.items;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.furina_focalors.quartzcraft.armor.ItemQuartzArmor;
import com.furina_focalors.quartzcraft.config.ConfigLoader;
import com.furina_focalors.quartzcraft.material.ArmorMaterial;
import com.furina_focalors.quartzcraft.material.QuartzToolMaterial;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemsRegister {
    public static Item QuartzAxe;
    public static Item QuartzPickaxe;
    public static Item QuartzSword;
    public static Item QuartzHoe;
    public static Item QuartzSpade;
    public static Item QuartzKnife;
    public static Item QuartzHelmet;
    public static Item QuartzChestplate;
    public static Item QuartzLeggings;
    public static Item QuartzBoots;
    public static Item QuartzID;
    public static Item QuartzNugget;
    public static Item DiamondNugget;


    private static List<Item> render = new ArrayList<Item>();

    public static void register() {
        QuartzAxe = registerItem(new ItemQuartzAxe("quartz_axe", QuartzToolMaterial.QUARTZ,200,5));
        QuartzHoe = registerItem(new ItemQuartzHoe("quartz_hoe",QuartzToolMaterial.QUARTZ,100));
        QuartzPickaxe = registerItem(new ItemQuartzPickaxe("quartz_pickaxe", QuartzToolMaterial.QUARTZ,300,5));
        QuartzSword = registerItem(new ItemQuartzSword("quartz_sword",QuartzToolMaterial.QUARTZ,200));
        QuartzSpade = registerItem(new ItemQuartzSpade("quartz_spade",QuartzToolMaterial.QUARTZ,200));
        QuartzKnife = registerItem(new ItemQuartzKnife("quartz_knife",QuartzToolMaterial.QUARTZ,100));
        QuartzHelmet = registerItem(new ItemQuartzArmor("quartz_helmet", ArmorMaterial.QUARTZ,1,EntityEquipmentSlot.HEAD));
        QuartzChestplate = registerItem(new ItemQuartzArmor("quartz_chestplate", ArmorMaterial.QUARTZ,1,EntityEquipmentSlot.CHEST));
        QuartzLeggings = registerItem(new ItemQuartzArmor("quartz_leggins", ArmorMaterial.QUARTZ,2,EntityEquipmentSlot.LEGS));
        QuartzBoots = registerItem(new ItemQuartzArmor("quartz_boots", ArmorMaterial.QUARTZ,1,EntityEquipmentSlot.FEET));
        QuartzID = registerItem(new ItemQuartzID());
        QuartzNugget = registerItem(new ItemQuartzNugget());
        DiamondNugget = registerItem(new ItemDiamondNugget());





    }
    @SideOnly(Side.CLIENT)
    public static void registerRender() {
        for (Item item : render) {
            registerModel(item);
        }
    }
    private static Item registerItem(Item item) {
        if (ConfigLoader.mustInitItem()){
            ForgeRegistries.ITEMS.register(item);
            render.add(item);
            return item;
        }
        else
            return Items.AIR;
    }
    @SideOnly(Side.CLIENT)
    private static void registerModel(Item item)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Objects.requireNonNull(item.getRegistryName()), "inventory"));
    }



}
