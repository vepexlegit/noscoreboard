package de.vepexlegit.noscoreboarddebug;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = NoScoreBoardDebug.MODID, version = NoScoreBoardDebug.VERSION)
public class NoScoreBoardDebug {
    public static final String MODID = "noscoreboarddebug";
    public static final String VERSION = "1.0";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("DIRT BLOCK >> " + Blocks.dirt.getUnlocalizedName());
    }
}
