package com.furina_focalors.quartzcraft.Tab;

import java.util.Comparator;

import com.furina_focalors.quartzcraft.block.BlocksRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class CreativeTab extends CreativeTabs
{

    public CreativeTab()
    {
        super("quartz_craft");
    }

    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(BlocksRegister.CHISELED_QUARTZ_ID);
    }

    @Override
    public void displayAllRelevantItems(NonNullList<ItemStack> itemList)
    {
        for (Item item : Item.REGISTRY)
        {
            item.getSubItems(this, itemList);
        }
        Comparator<? super ItemStack> comparator = new ItemComparator();
        itemList.sort(comparator);
    }

    static class ItemComparator implements Comparator
    {
        @Override
        public int compare(Object arg0, Object arg1)
        {
            return compareStack((ItemStack) arg0, (ItemStack) arg1);
        }

        private int compareStack(ItemStack stack1, ItemStack stack2)
        {

            String name1 = stack1.getUnlocalizedName();
            String name2 = stack2.getUnlocalizedName();
            return name1.compareTo(name2);
        }
    }

}
