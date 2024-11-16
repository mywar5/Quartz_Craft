package com.furina_focalors.quartzcraft.items;

import com.furina_focalors.quartzcraft.main.QuartzCraftCore;
import com.furina_focalors.quartzcraft.material.QuartzToolMaterial;
import net.minecraft.item.ItemSpade;

public class ItemQuartzSpade extends ItemSpade {
    public ItemQuartzSpade(String Name, ToolMaterial material,int MaxDamage) {
        super(QuartzToolMaterial.QUARTZ);
        this.setUnlocalizedName("quartz_spade");
        this.setRegistryName("quartz_spade");
        this.setMaxStackSize(1);
        this.setMaxDamage(3);
        this.setCreativeTab(QuartzCraftCore.QuartzCraft_Tab);


    }
}
