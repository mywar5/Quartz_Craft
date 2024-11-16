package com.furina_focalors.quartzcraft.block.Base;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockQCDoubleSlab extends BlockQCSlab
{
    public BlockQCDoubleSlab(String name, Material material, MapColor color, SoundType sound)
    {
        super(name , material, color, sound);
    }

    @Override
    public boolean isDouble()
    {
        return true;
    }
}
