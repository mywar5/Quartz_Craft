package com.furina_focalors.quartzcraft.items;

import com.furina_focalors.quartzcraft.main.QuartzCraftCore;
import com.furina_focalors.quartzcraft.material.QuartzToolMaterial;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ItemQuartzPickaxe extends ItemPickaxe {
    private float speed;

    public ItemQuartzPickaxe(String name,ToolMaterial material,float maxdamage,float speed) {
        super(QuartzToolMaterial.QUARTZ);
        this.setUnlocalizedName("quartz_pickaxe");
        this.setRegistryName("quartz_pickaxe");
        this.setMaxDamage(4);
        this.setMaxStackSize(1);
        this.speed = 3.0F;
        this.setCreativeTab(QuartzCraftCore.QuartzCraft_Tab);

    }
    public float getDestroySpeed(ItemStack stack, IBlockState state)
    {
        return super.getDestroySpeed(stack, state) * speed;
    }
}
