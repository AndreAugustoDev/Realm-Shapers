package com.realmshapers.fabric;

import com.realmshapers.RealmShapers;
import net.fabricmc.api.ModInitializer;

public class ExampleModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        RealmShapers.init();
    }
}
