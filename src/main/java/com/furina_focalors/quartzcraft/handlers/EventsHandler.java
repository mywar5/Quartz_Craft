package com.furina_focalors.quartzcraft.handlers;
import java.util.Random;

import net.minecraft.server.MinecraftServer;
import net.minecraft.world.gen.NoiseGeneratorOctaves;

public class EventsHandler {
    static NoiseGeneratorOctaves featureScatter;
    static MinecraftServer server;

    public static void init() {
        featureScatter = new NoiseGeneratorOctaves(new  Random(1337), 3);

    }
}


