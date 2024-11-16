package com.furina_focalors.quartzcraft.block.Door;

import com.furina_focalors.quartzcraft.main.QuartzCraftCore;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

import java.util.Random;

public class BlockChiseledQuartzDoorIG extends BlockDoor {
    public BlockChiseledQuartzDoorIG(String name, Material material, SoundType sound) {
        super(Material.ROCK);
        this.setHardness(2.0F);
        this.setResistance(1F);
        this.setSoundType(SoundType.STONE);
        this.setCreativeTab(QuartzCraftCore.QuartzCraft_Tab);
        this.setRegistryName("chiseled_quartz_door_ig");
        this.setUnlocalizedName("chiseled_quartz_door_ig");
    }
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(this);
    }

    public boolean canPlaceBlockAt(World world, BlockPos pos)
    {
        return world.getBlockState(pos.down()).isSideSolid(world, pos.down(), EnumFacing.UP) &&
                world.getBlockState(pos).getBlock().isReplaceable(world, pos) &&
                world.getBlockState(pos.up()).getBlock().isReplaceable(world, pos.up());
    }
    public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player)
    {
        return new ItemStack(this);
    }

}
