package com.furina_focalors.quartzcraft.block.FullCube;

import java.util.Random;

import com.furina_focalors.quartzcraft.main.QuartzCraftCore;
import com.furina_focalors.quartzcraft.items.ItemsRegister;
import net.minecraft.block.BlockOre;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BlockQuartzIDOre extends BlockOre
{
    public BlockQuartzIDOre(String name,SoundType sound,MapColor color)
    {
        super(MapColor.GOLD);
        this.setHardness(3.0F);
        this.setResistance(5.0F);
        this.setSoundType(SoundType.STONE);
        this.setCreativeTab(QuartzCraftCore.QuartzCraft_Tab);
        this.setUnlocalizedName("quartzid_ore");
        this.setRegistryName("quartzid_ore");
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return ItemsRegister.QuartzID;
    }
}

