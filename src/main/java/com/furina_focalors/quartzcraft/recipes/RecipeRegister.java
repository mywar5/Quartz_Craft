package com.furina_focalors.quartzcraft.recipes;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

public class RecipeRegister {
    public static void register() {

    }
    private static void addRecipe(Block material, Block result)
    {
        if (material != null && result != null)
        {
            FurnaceRecipes.instance().addSmelting(Item.getItemFromBlock(material), new ItemStack(result), 0);
        }
    }
    private static void addRecipe(Block material, ItemStack result)
    {
        if (material != null)
        {
            FurnaceRecipes.instance().addSmelting(Item.getItemFromBlock(material), result, 0);
        }
    }

    private static void addRecipe(Item material, Block result)
    {
        if (result != null)
        {
            FurnaceRecipes.instance().addSmelting(material, new ItemStack(result), 0);
        }
    }
}
