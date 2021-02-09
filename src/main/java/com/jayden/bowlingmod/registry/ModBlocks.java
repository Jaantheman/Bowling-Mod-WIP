package com.jayden.bowlingmod.registry;

import com.jayden.bowlingmod.bowlingmod;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

      public static final Block SILVER_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(3).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().strength(4f,50.0f).sounds(BlockSoundGroup.METAL));


      public static void registerBlock () {
          Registry.register(Registry.BLOCK, new Identifier(bowlingmod.MOD_ID, "silver_block.json"), SILVER_BLOCK);
    }

}
