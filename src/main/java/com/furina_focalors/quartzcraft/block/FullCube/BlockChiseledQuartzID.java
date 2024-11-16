package com.furina_focalors.quartzcraft.block.FullCube;

import com.furina_focalors.quartzcraft.main.QuartzCraftCore;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockChiseledQuartzID extends Block {
    public BlockChiseledQuartzID(String name, Material material, SoundType sound) {
        super(Material.ROCK, MapColor.QUARTZ);
        this.setUnlocalizedName("chiseled_quartz_id");
        this.setRegistryName("chiseled_quartz_id" );
        this.setHardness(2.5F);
        this.setCreativeTab(QuartzCraftCore.QuartzCraft_Tab);
        this.setSoundType(SoundType.STONE);

    }
}
