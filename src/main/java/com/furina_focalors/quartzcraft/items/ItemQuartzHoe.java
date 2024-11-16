package com.furina_focalors.quartzcraft.items;

import com.furina_focalors.quartzcraft.main.QuartzCraftCore;
import com.furina_focalors.quartzcraft.material.QuartzToolMaterial;
import net.minecraft.item.ItemHoe;

public class ItemQuartzHoe extends ItemHoe {
    public ItemQuartzHoe(String name, ToolMaterial material,int MaxDamage) {
        super(QuartzToolMaterial.QUARTZ);
        this.setUnlocalizedName("quartz_hoe");
        this.setRegistryName("quartz_hoe");
        this.setMaxDamage(3);
        this.setCreativeTab(QuartzCraftCore.QuartzCraft_Tab);

    }
}
