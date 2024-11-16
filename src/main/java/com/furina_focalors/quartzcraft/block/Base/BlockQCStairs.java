package com.furina_focalors.quartzcraft.block.Base;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

public class BlockQCStairs extends net.minecraft.block.BlockStairs
{
    protected BlockQCStairs(String name, Block block)
    {
        super(block == null ? Blocks.AIR.getDefaultState() : block.getDefaultState());
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.useNeighborBrightness = true;
    }
}
