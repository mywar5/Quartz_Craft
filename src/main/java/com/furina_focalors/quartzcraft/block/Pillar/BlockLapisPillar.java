package com.furina_focalors.quartzcraft.block.Pillar;


import com.furina_focalors.quartzcraft.block.Base.BlockQCPillar;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockLapisPillar extends BlockQCPillar {
    public BlockLapisPillar(String name, Material material, MapColor color, SoundType sound) {
        super(name,Material.ROCK,MapColor.LAPIS,SoundType.STONE);
        this.setUnlocalizedName("lapis_pillar");

    }
}

