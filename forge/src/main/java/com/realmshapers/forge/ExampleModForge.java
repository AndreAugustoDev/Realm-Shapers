package com.realmshapers.forge;

import dev.architectury.platform.forge.EventBuses;
import com.realmshapers.RealmShapers;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(RealmShapers.MOD_ID)
public class ExampleModForge {
    public ExampleModForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(RealmShapers.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        RealmShapers.init();
    }
}
