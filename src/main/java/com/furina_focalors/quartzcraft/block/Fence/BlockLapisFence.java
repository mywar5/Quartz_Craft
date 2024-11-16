package com.furina_focalors.quartzcraft.block.Fence;

import com.furina_focalors.quartzcraft.main.QuartzCraftCore;
import net.minecraft.block.BlockFence;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockLapisFence extends BlockFence {

    public BlockLapisFence(Material material,String name, MapColor color) {
        super(Material.ROCK,MapColor.LAPIS);
        this.setHardness(2.0F);
        this.setResistance(1F);
        this.setCreativeTab(QuartzCraftCore.QuartzCraft_Tab);
        this.setSoundType(SoundType.STONE);
        this.setRegistryName("lapis_fence");
        this.setUnlocalizedName("lapis_fence");
    }
}
