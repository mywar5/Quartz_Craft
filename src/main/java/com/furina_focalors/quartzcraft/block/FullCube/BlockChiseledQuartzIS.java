package com.furina_focalors.quartzcraft.block.FullCube;

import com.furina_focalors.quartzcraft.main.QuartzCraftCore;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockChiseledQuartzIS extends Block {
    public BlockChiseledQuartzIS(String name, Material material, SoundType sound) {
        super(Material.ROCK, MapColor.QUARTZ);
        this.setUnlocalizedName("chiseled_quartz_is");
        this.setRegistryName("chiseled_quartz_is" );
        this.setHardness(2.5F);
        this.setCreativeTab(QuartzCraftCore.QuartzCraft_Tab);
        this.setSoundType(SoundType.STONE);

    }
}
