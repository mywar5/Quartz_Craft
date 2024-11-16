package com.furina_focalors.quartzcraft.block.Stairs;

import com.furina_focalors.quartzcraft.main.QuartzCraftCore;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;


public class BlockChiseledQuartzStairsIG extends BlockStairs
{
    public BlockChiseledQuartzStairsIG(Material material, String name, SoundType sound, MapColor color)
    {
        super(Blocks.QUARTZ_STAIRS.getDefaultState());
        this.setRegistryName("chiseled_quartz_stairs_ig");
        this.setSoundType(SoundType.STONE);
        this.setUnlocalizedName("chiseled_quartz_stairs_ig");
        this.setHardness(2.5F);
        this.setCreativeTab(QuartzCraftCore.QuartzCraft_Tab);
        this.useNeighborBrightness = true;
    }
}