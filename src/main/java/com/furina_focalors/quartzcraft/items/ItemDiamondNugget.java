package com.furina_focalors.quartzcraft.items;

import com.furina_focalors.quartzcraft.main.QuartzCraftCore;
import net.minecraft.item.Item;

public class ItemDiamondNugget extends Item {
    public ItemDiamondNugget() {
        super();
        this.setUnlocalizedName("diamond_nugget");
        this.setRegistryName("diamond_nugget");
        this.setMaxStackSize(64);
        this.setCreativeTab(QuartzCraftCore.QuartzCraft_Tab);
    }
}
