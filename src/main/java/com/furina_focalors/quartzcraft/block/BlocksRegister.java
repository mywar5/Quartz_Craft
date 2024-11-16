package com.furina_focalors.quartzcraft.block;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.furina_focalors.quartzcraft.block.Base.BlockQCDoor;
import com.furina_focalors.quartzcraft.block.Base.BlockQCDoubleSlab;
import com.furina_focalors.quartzcraft.block.Base.BlockQCHalfSlab;
import com.furina_focalors.quartzcraft.block.Base.BlockQCSlab;
import com.furina_focalors.quartzcraft.block.Door.BlockChiseledQuartzDoorID;
import com.furina_focalors.quartzcraft.block.Door.BlockChiseledQuartzDoorIG;
import com.furina_focalors.quartzcraft.block.Door.BlockChiseledQuartzDoorIS;
import com.furina_focalors.quartzcraft.block.Door.BlockQuartzDoor;
import com.furina_focalors.quartzcraft.block.Fence.*;
import com.furina_focalors.quartzcraft.block.FullCube.*;
import com.furina_focalors.quartzcraft.block.Pillar.*;
import com.furina_focalors.quartzcraft.block.Stairs.*;
import com.furina_focalors.quartzcraft.block.Wall.*;
import com.furina_focalors.quartzcraft.config.ConfigLoader;
import com.furina_focalors.quartzcraft.main.QuartzCraftCore;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.*;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

public class BlocksRegister {
    private static List<Block> additional;
    public static Block LAPIS_WALL;
    public static Block LAPIS_FENCE;
    public static Block LAPIS_PILLAR;
    public static Block LAPIS_DOUBLE_SLAB;
    public static Block LAPIS_HALF_SLAB;
    public static Block LAPIS_STAIRS;
    public static Block LAPIS_WALL2;



    public static Block CHISELED_QUARTZ_DOOR;
    public static Block CHISELED_QUARTZ_DOOR_ID;
    public static Block CHISELED_QUARTZ_DOOR_IG;
    public static Block CHISELED_QUARTZ_DOOR_IL;
    public static Block CHISELED_QUARTZ_DOOR_IS;
    public static Block CHISELED_QUARTZ_DOUBLE_SLAB;
    public static Block CHISELED_QUARTZ_DOUBLE_SLAB_ID;
    public static Block CHISELED_QUARTZ_DOUBLE_SLAB_IG;
    public static Block CHISELED_QUARTZ_DOUBLE_SLAB_IL;
    public static Block CHISELED_QUARTZ_DOUBLE_SLAB_IS;
    public static Block CHISELED_QUARTZ_FENCE;
    public static Block CHISELED_QUARTZ_FENCE_ID;
    public static Block CHISELED_QUARTZ_FENCE_IG;
    public static Block CHISELED_QUARTZ_FENCE_IL;
    public static Block CHISELED_QUARTZ_FENCE_IS;
    public static Block CHISELED_QUARTZ_HALF_SLAB;
    public static Block CHISELED_QUARTZ_HALF_SLAB_ID;
    public static Block CHISELED_QUARTZ_HALF_SLAB_IG;
    public static Block CHISELED_QUARTZ_HALF_SLAB_IL;
    public static Block CHISELED_QUARTZ_HALF_SLAB_IS;
    public static Block CHISELED_QUARTZ_ID;
    public static Block CHISELED_QUARTZ_IG;
    public static Block CHISELED_QUARTZ_IL;
    public static Block CHISELED_QUARTZ_IS;
    public static Block CHISELED_QUARTZ_PILLAR;
    public static Block CHISELED_QUARTZ_PILLAR_ID;
    public static Block CHISELED_QUARTZ_PILLAR_IG;
    public static Block CHISELED_QUARTZ_PILLAR_IL;
    public static Block CHISELED_QUARTZ_PILLAR_IS;
    public static Block CHISELED_QUARTZ_STAIRS;
    public static Block CHISELED_QUARTZ_STAIRS_ID;
    public static Block CHISELED_QUARTZ_STAIRS_IG;
    public static Block CHISELED_QUARTZ_STAIRS_IL;
    public static Block CHISELED_QUARTZ_STAIRS_IS;
    public static Block CHISELED_QUARTZ_WALL;
    public static Block CHISELED_QUARTZ_WALL_ID;
    public static Block CHISELED_QUARTZ_WALL_IG;
    public static Block CHISELED_QUARTZ_WALL_IL;
    public static Block CHISELED_QUARTZ_WALL_IS;
    public static Block CHISELED_QUARTZ_WALL2;
    public static Block CHISELED_QUARTZ_WALL_ID2;
    public static Block CHISELED_QUARTZ_WALL_IG2;
    public static Block CHISELED_QUARTZ_WALL_IL2;
    public static Block CHISELED_QUARTZ_WALL_IS2;

    public static Block QUARTZ_DOOR;
    public static Block QUARTZ_FENCE;
    public static Block QUARTZ_PILLAR;
    public static Block QUARTZ_WALL;
    public static Block QUARTZ_WALL2;

    public static Block SMOOTH_QUARTZ;
    public static Block SMOOTH_QUARTZ_DOUBLE_SLAB;
    public static Block SMOOTH_QUARTZ_HALF_SLAB;
    public static Block SMOOTH_QUARTZ_PILLAR;
    public static Block SMOOTH_QUARTZ_STAIRS;

    public static Block Quartz_ID_ORE;



    private static List<Block> renders = new ArrayList<Block>();
    @SideOnly(Side.CLIENT)
    public static void registerRender()
    {
        for (Block b : renders)
            setRender(b);
    }


    public static void register() {
        Block[] slabs;
        LAPIS_FENCE = registerBlock(new BlockLapisFence(Material.ROCK,"lapis_fence",MapColor.LAPIS),"LAPIS_FENCE");
        LAPIS_PILLAR = registerBlock(new BlockLapisPillar("lapis_pillar",Material.ROCK,MapColor.LAPIS,SoundType.STONE),"LAPIS_PILLAR");
        LAPIS_STAIRS = registerBlock(new BlockLapisStairs(Material.ROCK,"lapis_pillar",SoundType.STONE,MapColor.LAPIS),"LAPIS_STAIRS");
        LAPIS_WALL = registerBlock(new BlockLapisWall("lapis_wall",Material.ROCK,MapColor.LAPIS,SoundType.STONE),"LAPIS_WALL");
        LAPIS_WALL2 = registerBlock(new BlockLapisWall2("lapis_wall2",Material.ROCK,MapColor.LAPIS,SoundType.STONE),"LAPIS_WALL2");
        slabs = registerBlockSlab(
                new BlockQCHalfSlab("lapis_half_slab",Material.ROCK,MapColor.LAPIS,SoundType.STONE),
                new BlockQCDoubleSlab("lapis_double_slab",Material.ROCK,MapColor.LAPIS,SoundType.STONE),LAPIS_STAIRS,
                "LAPIS_DOUBLE_SLAB","LAPIS_HALF_SLAB");
        LAPIS_DOUBLE_SLAB = slabs[1];
        LAPIS_HALF_SLAB = slabs[0];





        //CHISELED_QUARTZ_DOOR = registerBlockDoor(new BlockQCDoor("chiseled_quartz_door",Material.ROCK,SoundType.STONE),"CHISELED_QUARTZ_DOOR");
        //CHISELED_QUARTZ_DOOR_ID = registerBlockDoor(new BlockChiseledQuartzDoorID("chiseled_quartz_door_id",Material.ROCK,SoundType.STONE),"CHISELED_QUARTZ_DOOR_ID");
        //CHISELED_QUARTZ_DOOR_IG = registerBlockDoor(new BlockChiseledQuartzDoorIG("chiseled_quartz_door_ig",Material.ROCK,SoundType.STONE),"CHISELED_QUARTZ_DOOR_IG");
        //CHISELED_QUARTZ_DOOR_IL = registerBlockDoor(new BlockChiseledQuartzDoorIL("chiseled_quartz_door_il",Material.ROCK,SoundType.STONE),"CHISELED_QUARTZ_DOOR_IL");
        //CHISELED_QUARTZ_DOOR_IS = registerBlockDoor(new BlockChiseledQuartzDoorIS("chiseled_quartz_door_is",Material.ROCK,SoundType.STONE),"CHISELED_QUARTZ_DOOR_IS");
        CHISELED_QUARTZ_FENCE = registerBlock(new BlockChiseledQuartzFence(Material.ROCK,"chiseled_quartz_fence",MapColor.QUARTZ),"CHISELED_QUARTZ_FENCE");
        CHISELED_QUARTZ_FENCE_ID = registerBlock(new BlockChiseledQuartzFenceID(Material.ROCK,"chiseled_quartz_fence_id",MapColor.QUARTZ),"CHISELED_QUARTZ_FENCE_ID");
        CHISELED_QUARTZ_FENCE_IG = registerBlock(new BlockChiseledQuartzFenceIG(Material.ROCK,"chiseled_quartz_fence_ig",MapColor.QUARTZ),"CHISELED_QUARTZ_FENCE_IG");
        //CHISELED_QUARTZ_FENCE_IL = registerBlock(new BlockChiseledQuartzFenceIL(Material.ROCK,"chiseled_quartz_fence_il",MapColor.QUARTZ),"CHISELED_QUARTZ_FENCE_IL");
        CHISELED_QUARTZ_FENCE_IS = registerBlock(new BlockChiseledQuartzFenceIS(Material.ROCK,"chiseled_quartz_fence_is",MapColor.QUARTZ),"CHISELED_QUARTZ_FENCE_IS");
        CHISELED_QUARTZ_ID = registerBlock(new BlockChiseledQuartzID("chiseled_quartz_id",Material.ROCK,SoundType.STONE),"CHISELED_QUARTZ_ID");
        CHISELED_QUARTZ_IG = registerBlock(new BlockChiseledQuartzIG("chiseled_quartz_ig",Material.ROCK,SoundType.STONE),"CHISELED_QUARTZ_IG");
        //CHISELED_QUARTZ_IL = registerBlock(new BlockChiseledQuartzIL("chiseled_quartz_il",Material.ROCK,SoundType.STONE),"CHISELED_QUARTZ_IL");
        CHISELED_QUARTZ_IS = registerBlock(new BlockChiseledQuartzIS("chiseled_quartz_is",Material.ROCK,SoundType.STONE),"CHISELED_QUARTZ_IS");
        CHISELED_QUARTZ_STAIRS = registerBlock(new BlockChiseledQuartzStairs(Material.ROCK,"chiseled_quartz_stairs",SoundType.STONE,MapColor.QUARTZ),"CHISELED_QUARTZ_STAIRS");
        CHISELED_QUARTZ_STAIRS_ID = registerBlock(new BlockChiseledQuartzStairsID(Material.ROCK,"chiseled_quartz_stairs_id",SoundType.STONE,MapColor.QUARTZ),"CHISELED_QUARTZ_STAIRS_ID");
        CHISELED_QUARTZ_STAIRS_IG = registerBlock(new BlockChiseledQuartzStairsIG(Material.ROCK,"chiseled_quartz_stairs_ig",SoundType.STONE,MapColor.QUARTZ),"CHISELED_QUARTZ_STAIRS_IG");
        //CHISELED_QUARTZ_STAIRS_IL = registerBlock(new BlockChiseledQuartzStairsIL(Material.ROCK,"chiseled_quartz_stairs_il",SoundType.STONE,MapColor.QUARTZ),"CHISELED_QUARTZ_STAIRS_IL");
        CHISELED_QUARTZ_STAIRS_IS = registerBlock(new BlockChiseledQuartzStairsIS(Material.ROCK,"chiseled_quartz_stairs_is",SoundType.STONE,MapColor.QUARTZ),"CHISELED_QUARTZ_STAIRS_IS");
        CHISELED_QUARTZ_PILLAR = registerBlock(new BlockChiseledQuartzPillar("chiseled_quartz_pillar",Material.ROCK,MapColor.QUARTZ,SoundType.STONE),"CHISELED_QUARTZ_PILLAR");
        CHISELED_QUARTZ_PILLAR_ID = registerBlock(new BlockChiseledQuartzPillarID("chiseled_quartz_pillar_id",Material.ROCK,MapColor.QUARTZ,SoundType.STONE),"CHISELED_QUARTZ_PILLAR_ID");
        CHISELED_QUARTZ_PILLAR_IG = registerBlock(new BlockChiseledQuartzPillarIG("chiseled_quartz_pillar_ig",Material.ROCK,MapColor.QUARTZ,SoundType.STONE),"CHISELED_QUARTZ_PILLAR_IG");
        //CHISELED_QUARTZ_PILLAR_IL = registerBlock(new BlockChiseledQuartzPillarIL("chiseled_quartz_pillar_il",Material.ROCK,MapColor.QUARTZ,SoundType.STONE),"CHISELED_QUARTZ_PILLAR_IL");
        CHISELED_QUARTZ_PILLAR_IS = registerBlock(new BlockChiseledQuartzPillarIS("chiseled_quartz_pillar_is",Material.ROCK,MapColor.QUARTZ,SoundType.STONE),"CHISELED_QUARTZ_PILLAR_IS");
        CHISELED_QUARTZ_WALL = registerBlock(new BlockChiseledQuartzWall("chiseled_quartz_wall",Material.ROCK,MapColor.QUARTZ,SoundType.STONE),"CHISELED_QUARTZ_WALL");
        CHISELED_QUARTZ_WALL_ID = registerBlock(new BlockChiseledQuartzWallID("chiseled_quartz_wall_id",Material.ROCK,MapColor.QUARTZ,SoundType.STONE),"CHISELED_QUARTZ_WALL_ID");
        CHISELED_QUARTZ_WALL_IG = registerBlock(new BlockChiseledQuartzWallIG("chiseled_quartz_wall_ig",Material.ROCK,MapColor.QUARTZ,SoundType.STONE),"CHISELED_QUARTZ_WALL_IG");
        //CHISELED_QUARTZ_WALL_IL = registerBlock(new BlockChiseledQuartzWallIL("chiseled_quartz_wall_il",Material.ROCK,MapColor.QUARTZ,SoundType.STONE),"CHISELED_QUARTZ_WALL_IL");
        CHISELED_QUARTZ_WALL_IS = registerBlock(new BlockChiseledQuartzWallIS("chiseled_quartz_wall_is",Material.ROCK,MapColor.QUARTZ,SoundType.STONE),"CHISELED_QUARTZ_WALL_IS");
        CHISELED_QUARTZ_WALL2 = registerBlock(new BlockChiseledQuartzWall2("chiseled_quartz_wall2",Material.ROCK,MapColor.QUARTZ,SoundType.STONE),"CHISELED_QUARTZ_WALL2");
        CHISELED_QUARTZ_WALL_ID2 = registerBlock(new BlockChiseledQuartzWallID2("chiseled_quartz_wall_id2",Material.ROCK,MapColor.QUARTZ,SoundType.STONE),"CHISELED_QUARTZ_WALL_ID2");
        CHISELED_QUARTZ_WALL_IG2 = registerBlock(new BlockChiseledQuartzWallIG2("chiseled_quartz_wall_ig2",Material.ROCK,MapColor.QUARTZ,SoundType.STONE),"CHISELED_QUARTZ_WALL_IG2");
        //CHISELED_QUARTZ_WALL_IL2 = registerBlock(new BlockChiseledQuartzWallIL2("chiseled_quartz_wall_il2",Material.ROCK,MapColor.QUARTZ,SoundType.STONE),"CHISELED_QUARTZ_WALL_IL2");
        CHISELED_QUARTZ_WALL_IS2 = registerBlock(new BlockChiseledQuartzWallIS2("chiseled_quartz_wall_is2",Material.ROCK,MapColor.QUARTZ,SoundType.STONE),"CHISELED_QUARTZ_WALL_IS2");

        //QUARTZ_DOOR = registerBlockDoor(new BlockQuartzDoor("quartz_door",Material.ROCK,SoundType.STONE),"QUARTZ_DOOR");
        QUARTZ_FENCE = registerBlock(new BlockQuartzFence("quartz_fence",Material.ROCK,SoundType.STONE,MapColor.QUARTZ),"QUARTZ_FENCE");
        QUARTZ_WALL = registerBlock(new BlockQuartzWall("quartz_wall",Material.ROCK,MapColor.QUARTZ,SoundType.STONE),"QUARTZ_WALL");
        QUARTZ_WALL2 = registerBlock(new BlockQuartzWall2("quartz_wall2",Material.ROCK,MapColor.QUARTZ,SoundType.STONE),"QUARTZ_WALL2");
        QUARTZ_PILLAR = registerBlock(new BlockQuartzPillar("quartz_pillar",Material.ROCK,SoundType.STONE,MapColor.QUARTZ),"QUARTZ_PILLAR");
        //Quartz_ID_ORE = registerBlock(new BlockQuartzIDOre("quartz_id_ore",SoundType.STONE,MapColor.GOLD),"QUARTZ_ID_ORE");

        SMOOTH_QUARTZ_PILLAR = registerBlock(new BlockSmoothQuartzPillar("smooth_quartz_pillar",Material.ROCK,MapColor.QUARTZ,SoundType.STONE),"SMOOTH_QUARTZ_PILLAR");
        SMOOTH_QUARTZ = registerBlock(new BlockSmoothQuartz(Material.ROCK,"smooth_quartz",SoundType.STONE,MapColor.QUARTZ),"SMOOTH_QUARTZ");
        SMOOTH_QUARTZ_STAIRS = registerBlock(new BlockSmoothQuartzStairs(Material.ROCK,"smooth_quartz_stairs",SoundType.STONE,MapColor.QUARTZ),"SMOOTH_QUARTZ_STAIRS");



        //slabs
        slabs = registerBlockSlab(
                new BlockQCHalfSlab("smooth_quartz_half_slab",Material.ROCK,MapColor.QUARTZ,SoundType.STONE),
                new BlockQCDoubleSlab("smooth_quartz_double_slab",Material.ROCK,MapColor.QUARTZ,SoundType.STONE),SMOOTH_QUARTZ,
                "SMOOTH_QUARTZ_DOUBLE_SLAB","SMOOTH_QUARTZ_HALF_SLAB");
        SMOOTH_QUARTZ_DOUBLE_SLAB = slabs[1];
        SMOOTH_QUARTZ_HALF_SLAB = slabs[0];
        slabs = registerBlockSlab(
                new BlockQCHalfSlab("chiseled_quartz_half_slab",Material.ROCK,MapColor.QUARTZ,SoundType.STONE),
                new BlockQCDoubleSlab("chiseled_quartz_double_slab",Material.ROCK,MapColor.QUARTZ,SoundType.STONE),QUARTZ_FENCE,
                "CHISELED_QUARTZ_DOUBLE_SLAB","CHISELED_QUARTZ_HALF_SLAB");
        CHISELED_QUARTZ_DOUBLE_SLAB = slabs[1];
        CHISELED_QUARTZ_HALF_SLAB = slabs[0];
        slabs = registerBlockSlab(
                new BlockQCHalfSlab("chiseled_quartz_half_slab_id",Material.ROCK,MapColor.QUARTZ,SoundType.STONE),
                new BlockQCDoubleSlab("chiseled_quartz_double_slab_id",Material.ROCK,MapColor.QUARTZ,SoundType.STONE),CHISELED_QUARTZ_ID,
                "CHISELED_QUARTZ_DOUBLE_SLAB_ID","CHISELED_QUARTZ_HALF_SLAB_ID");
        CHISELED_QUARTZ_DOUBLE_SLAB_ID = slabs[1];
        CHISELED_QUARTZ_HALF_SLAB_ID = slabs[0];
        slabs = registerBlockSlab(
                new BlockQCHalfSlab("chiseled_quartz_half_slab_ig",Material.ROCK,MapColor.QUARTZ,SoundType.STONE),
                new BlockQCDoubleSlab("chiseled_quartz_double_slab_ig",Material.ROCK,MapColor.QUARTZ,SoundType.STONE),CHISELED_QUARTZ_IG,
                "CHISELED_QUARTZ_DOUBLE_SLAB_IG","CHISELED_QUARTZ_HALF_SLAB_IG");
        CHISELED_QUARTZ_DOUBLE_SLAB_IG = slabs[1];
        CHISELED_QUARTZ_HALF_SLAB_IG = slabs[0];
        /*slabs = registerBlockSlab(
                new BlockQCHalfSlab("chiseled_quartz_half_slab_il",Material.ROCK,MapColor.QUARTZ,SoundType.STONE),
                new BlockQCDoubleSlab("chiseled_quartz_double_slab_il",Material.ROCK,MapColor.QUARTZ,SoundType.STONE),CHISELED_QUARTZ_IL,
                "CHISELED_QUARTZ_DOUBLE_SLAB_IL","CHISELED_QUARTZ_HALF_SLAB_IL");
        CHISELED_QUARTZ_DOUBLE_SLAB_IL = slabs[1];
        CHISELED_QUARTZ_HALF_SLAB_IL = slabs[0];*/
        slabs = registerBlockSlab(
                new BlockQCHalfSlab("chiseled_quartz_half_slab_is",Material.ROCK,MapColor.QUARTZ,SoundType.STONE),
                new BlockQCDoubleSlab("chiseled_quartz_double_slab_is",Material.ROCK,MapColor.QUARTZ,SoundType.STONE),CHISELED_QUARTZ_IS,
                "CHISELED_QUARTZ_DOUBLE_SLAB_IS","CHISELED_QUARTZ_HALF_SLAB_IS");
        CHISELED_QUARTZ_DOUBLE_SLAB_IS = slabs[1];
        CHISELED_QUARTZ_HALF_SLAB_IS = slabs[0];

    }
    public static void registerOreDictionary()
    {
        addToDictionary("oreQuartzid",Quartz_ID_ORE);
    }
    private static void addToDictionary(String name, Block block)
    {
        if (block!= Blocks.AIR)
        {
            OreDictionary.registerOre(name, new ItemStack(block));
        }
    }




    private static Block registerBlock(Block block, String key)
    {
        if (ConfigLoader.mustInitBlock(key))
        {
            ForgeRegistries.BLOCKS.register(block);
            ForgeRegistries.ITEMS.register(new ItemBlock(block).setRegistryName(Objects.requireNonNull(block.getRegistryName())));
            renders.add(block);
            return block;
        }
        else
            return Blocks.AIR;
    }
    private static Block registerBlock(Block block, Block parrent, String key)
    {
        if (parrent != Blocks.AIR)
            return registerBlock(block, key);
        else
            return Blocks.AIR;
    }

    private static Block registerBlockDoor(Block block, String key)
    {
        if (ConfigLoader.mustInitBlock(key))
        {
            ForgeRegistries.BLOCKS.register(block);
            ForgeRegistries.ITEMS.register(
                    new ItemDoor(block)
                            .setRegistryName(Objects.requireNonNull(block.getRegistryName()))
                            .setCreativeTab(QuartzCraftCore.QuartzCraft_Tab));
            renders.add(block);
            return block;
        }
        else
            return Blocks.AIR;
    }
    private static Block[] registerBlockSlab(Block blockSingle, Block blockDouble, Block parrent, String key1, String key2)
    {
        Block[] res = new Block[2];
        if (ConfigLoader.mustInitBlock(key1) && ConfigLoader.mustInitBlock(key2) && parrent!= Blocks.AIR)
        {
            ((BlockQCSlab) blockDouble).setDrop(blockSingle);
            ((BlockQCHalfSlab) blockSingle).setDoubleSlab(blockDouble);
            ForgeRegistries.BLOCKS.register(blockSingle);
            ForgeRegistries.BLOCKS.register(blockDouble);
            ForgeRegistries.ITEMS.register(new ItemSlab(blockSingle, (net.minecraft.block.BlockSlab) blockSingle, (net.minecraft.block.BlockSlab) blockDouble)
                    .setRegistryName(Objects.requireNonNull(blockSingle.getRegistryName())));
            renders.add(blockSingle);
            res[0] = blockSingle;
            res[1] = blockDouble;
        }
        return res;
    }
    @SideOnly(Side.CLIENT)
    private static void setRender(Block block)
    {
        Item item = Item.getItemFromBlock(block);
        if (item instanceof ItemCloth)
            for (int i = 0; i < 16; i++)
            {
                Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, i, new ModelResourceLocation(item.getRegistryName(), "color="+ EnumDyeColor.byMetadata(i).getDyeColorName()));
            }
        else
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }

}
