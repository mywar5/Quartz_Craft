package com.furina_focalors.quartzcraft.items;

import java.util.List;

import com.furina_focalors.quartzcraft.main.QuartzCraftCore;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemQuartzKnife extends Item {

    public ItemQuartzKnife(String name,ToolMaterial material,int MaxDamage) {
        super();
        super.setMaxStackSize(1);
        this.setMaxDamage(5);
        super.setContainerItem(this);
        this.setRegistryName("quartz_knife");
        this.setUnlocalizedName("quartz_knife");
        this.setCreativeTab(QuartzCraftCore.QuartzCraft_Tab);
    }

    public boolean doesContainerItemLeaveCraftingGrid(ItemStack stack)
    {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack)
    {
        ItemStack stack = itemStack.copy();
        stack.setCount(1);

        return stack;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
        tooltip.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.knife").getFormattedText());
    }
}
