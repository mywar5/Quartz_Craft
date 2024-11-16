package com.furina_focalors.quartzcraft.block.Fence;

import net.minecraft.block.BlockFence;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import com.furina_focalors.quartzcraft.main.QuartzCraftCore;

public class BlockQuartzFence extends BlockFence {

    public BlockQuartzFence(String name,Material material,SoundType sound, MapColor color) {
        super(Material.ROCK,MapColor.QUARTZ);
        this.setHardness(2.0F);
        this.setResistance(1F);
        this.setSoundType(SoundType.STONE);
        this.setCreativeTab(QuartzCraftCore.QuartzCraft_Tab);
        this.setRegistryName("quartz_fence");
        this.setUnlocalizedName("quartz_fence");
    }
}
