package com.jayden.bowlingmod;

import com.jayden.bowlingmod.registry.ModBlocks;
import com.jayden.bowlingmod.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class bowlingmod implements ModInitializer {

    public static final String MOD_ID = "bowling";


    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlock();
    }
}
