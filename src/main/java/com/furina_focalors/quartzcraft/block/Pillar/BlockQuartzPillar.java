package com.furina_focalors.quartzcraft.block.Pillar;

import com.furina_focalors.quartzcraft.block.Base.BlockQCPillar;
import com.furina_focalors.quartzcraft.main.QuartzCraftCore;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockQuartzPillar extends BlockQCPillar {
    public BlockQuartzPillar(String name, Material material, SoundType sound, MapColor color) {
        super("quartz_pillar",Material.ROCK,MapColor.QUARTZ,SoundType.STONE);
        this.setUnlocalizedName("quartz_pillar");


    }
}
