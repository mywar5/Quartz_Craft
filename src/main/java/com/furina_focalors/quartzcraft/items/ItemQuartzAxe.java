package com.furina_focalors.quartzcraft.items;

import com.furina_focalors.quartzcraft.main.QuartzCraftCore;
import com.furina_focalors.quartzcraft.material.QuartzToolMaterial;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ItemQuartzAxe extends ItemPickaxe{
    private final float speed;

    public ItemQuartzAxe(String name,Item.ToolMaterial material,float maxDamage,float speed) {
        super(QuartzToolMaterial.QUARTZ);
        this.setUnlocalizedName("quartz_axe");
        this.setRegistryName("quartz_axe");
        this.speed =5.0F;
        this.setCreativeTab(QuartzCraftCore.QuartzCraft_Tab);
        this.setMaxStackSize(1);
        this.setMaxDamage(7);

    }
    public float getDestroySpeed(ItemStack stack, IBlockState state)
    {
        return super.getDestroySpeed(stack, state) * speed;
    }
}

