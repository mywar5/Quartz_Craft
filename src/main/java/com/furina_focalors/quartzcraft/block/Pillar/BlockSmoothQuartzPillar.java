package com.furina_focalors.quartzcraft.block.Pillar;


import com.furina_focalors.quartzcraft.block.Base.BlockQCPillar;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockSmoothQuartzPillar extends BlockQCPillar {
    public BlockSmoothQuartzPillar(String name, Material material, MapColor color, SoundType sound) {
        super(name,Material.ROCK,MapColor.QUARTZ,SoundType.STONE);
        this.setUnlocalizedName("smooth_quartz_pillar");

    }
}

