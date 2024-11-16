package com.furina_focalors.quartzcraft.block.Pillar;


import com.furina_focalors.quartzcraft.block.Base.BlockQCPillar;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockChiseledQuartzPillarID extends BlockQCPillar {
    public BlockChiseledQuartzPillarID(String name, Material material, MapColor color, SoundType sound) {
        super(name,Material.ROCK,MapColor.QUARTZ,SoundType.STONE);
        this.setUnlocalizedName("chiseled_quartz_pillar_id");

    }
}

