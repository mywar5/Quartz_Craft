package com.furina_focalors.quartzcraft.config;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.minecraft.block.Block;
import net.minecraftforge.common.config.Configuration;
import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;
import com.furina_focalors.quartzcraft.block.BlocksRegister;
import com.furina_focalors.quartzcraft.items.ItemsRegister;




public class ConfigLoader {
    private static Configuration config;

    private static boolean[] registerBiomes;
    //private static boolean[] registerBlocks;
    private static boolean[] registerItems;

    private static int indexBiome;
    //private static int indexBlock;
    private static int indexItems;

    private static int biomeSizeXZ;
    private static int biomeSizeY;

    private static Map<String, Boolean> registerBlocks;

    private static boolean hasCleaningPass;
    private static boolean hasNetherWart;

    private static int cityDistance;

    private static boolean hasCities;
    public static void load (File file){
        List<Boolean> items = new ArrayList<Boolean>();
        config = new Configuration(file);
        config.load();

        registerBlocks = new HashMap<String, Boolean>();
        for (Field f : BlocksRegister.class.getDeclaredFields())
            if (f.getType().isAssignableFrom(Block.class))
                registerBlocks.put(f.getName().toLowerCase(), config.getBoolean(f.getName().toLowerCase(), "Blocks", true, "Enables|Disables block"));
        for (Field f : ItemsRegister.class.getDeclaredFields())
            if (f.getType().isAssignableFrom(Item.class))
                items.add(config.getBoolean(f.getName().toLowerCase(), "Items", true, "Enables|Disables item"));
        registerItems = new boolean[items.size()];
        for (int i = 0; i < items.size(); i++)
            registerItems[i] = items.get(i);
        items.clear();
        items = null;
    }
    public static boolean mustInitBlock(Field field)
    {
        String s = field.getName().toLowerCase();
        return registerBlocks.containsKey(s) && registerBlocks.get(s);
    }

    public static boolean mustInitBlock(String key)
    {
        String s = key.toLowerCase();
        return registerBlocks.containsKey(s) && registerBlocks.get(s);
    }
    public static boolean mustInitItem()
    {
        return registerItems[indexItems++];
    }

    public static void resetItemIndex()
    {
        indexItems = 0;
    }
    public static void dispose()
    {
        config.save();
        registerBlocks = null;
        registerBiomes = null;
        registerItems = null;
    }
}

