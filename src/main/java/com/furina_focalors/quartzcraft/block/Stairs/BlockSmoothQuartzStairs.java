package com.furina_focalors.quartzcraft.block.Stairs;

import com.furina_focalors.quartzcraft.main.QuartzCraftCore;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;

public class BlockSmoothQuartzStairs extends BlockStairs
{
    public BlockSmoothQuartzStairs(Material material, String name, SoundType sound, MapColor color)
    {
        super(Blocks.QUARTZ_STAIRS.getDefaultState());
        this.setRegistryName("smooth_quartz_stairs");
        this.setSoundType(SoundType.STONE);
        this.setCreativeTab(QuartzCraftCore.QuartzCraft_Tab);
        this.setUnlocalizedName("smooth_quartz_stairs");
        this.setHardness(2.0F);
        this.useNeighborBrightness = true;
    }
}