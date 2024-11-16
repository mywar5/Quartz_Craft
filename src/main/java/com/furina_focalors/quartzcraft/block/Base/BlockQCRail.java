package com.furina_focalors.quartzcraft.block.Base;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BlockQCRail extends Block {
    public BlockQCRail(String name, Material material, MapColor color, SoundType sound) {
        super(Material.ROCK);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setHardness(2.0F);
        this.setSoundType(SoundType.STONE);


    }
    public boolean isFullCube(IBlockState state) {
        return false;
    }
}
