package com.furina_focalors.quartzcraft.items;

import com.furina_focalors.quartzcraft.main.QuartzCraftCore;
import com.furina_focalors.quartzcraft.material.QuartzToolMaterial;
import net.minecraft.item.ItemSword;

public class ItemQuartzSword  extends ItemSword {
    public ItemQuartzSword(String name,ToolMaterial material, int Maxdamage) {
        super(QuartzToolMaterial.QUARTZ);
        this.setUnlocalizedName("quartz_sword");
        this.setRegistryName("quartz_sword");
        this.setMaxDamage(6);
        this.setMaxStackSize(1);
        this.setCreativeTab(QuartzCraftCore.QuartzCraft_Tab);

    }
}
