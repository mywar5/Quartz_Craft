package com.furina_focalors.quartzcraft.block.FullCube;


import com.furina_focalors.quartzcraft.main.QuartzCraftCore;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockSmoothQuartz extends Block {
    public BlockSmoothQuartz(Material material, String name, SoundType sound, MapColor color) {
        super(Material.ROCK,MapColor.QUARTZ);
        this.setUnlocalizedName("smooth_quartz");
        this.setRegistryName("smooth_quartz");
        this.setSoundType(SoundType.STONE);
        this.setHardness(2.0F);
        this.setCreativeTab(QuartzCraftCore.QuartzCraft_Tab);

    }
}
