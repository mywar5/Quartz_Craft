package com.furina_focalors.quartzcraft.block.Wall;

import com.furina_focalors.quartzcraft.block.Base.BlockQCRail;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockChiseledQuartzRail extends BlockQCRail {
    public BlockChiseledQuartzRail(String name, Material material, MapColor color, SoundType sound) {
        super(name, material,MapColor.QUARTZ, sound);
        this.setUnlocalizedName("chiseled_quartz_rail");
    }
}
