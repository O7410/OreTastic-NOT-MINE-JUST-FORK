package net.zeropercent.oretastic.world.gen;

public class ModWorldGeneration {
    public static void generateModWorldGen() {
        ModOreGeneration.generateOres();
        ModTreeGeneration.generateTrees();
        ModEntityGeneration.addSpawns();
    }
}
