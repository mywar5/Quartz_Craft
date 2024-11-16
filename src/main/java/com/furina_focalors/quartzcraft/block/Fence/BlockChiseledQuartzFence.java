package com.furina_focalors.quartzcraft.block.Fence;

import com.furina_focalors.quartzcraft.main.QuartzCraftCore;
import net.minecraft.block.BlockFence;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockChiseledQuartzFence extends BlockFence {

    public BlockChiseledQuartzFence(Material material,String name, MapColor color) {
        super(Material.ROCK,MapColor.QUARTZ);
        this.setHardness(2.0F);
        this.setResistance(1F);
        this.setCreativeTab(QuartzCraftCore.QuartzCraft_Tab);
        this.setSoundType(SoundType.STONE);
        this.setRegistryName("chiseled_quartz_fence");
        this.setUnlocalizedName("chiseled_quartz_fence");
    }
}
