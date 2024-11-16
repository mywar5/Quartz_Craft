package com.furina_focalors.quartzcraft.items;

import com.furina_focalors.quartzcraft.main.QuartzCraftCore;
import net.minecraft.item.Item;

public class ItemQuartzNugget extends Item {
    public ItemQuartzNugget() {
        super();
        this.setUnlocalizedName("quartz_nugget");
        this.setRegistryName("quartz_nugget");
        this.setMaxStackSize(64);
        this.setCreativeTab(QuartzCraftCore.QuartzCraft_Tab);

    }
}
