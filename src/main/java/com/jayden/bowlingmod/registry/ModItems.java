package com.jayden.bowlingmod.registry;

import com.jayden.bowlingmod.bowlingmod;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {
   //Regular Items
   public static final Item SILVER = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

  //Block Items
   public static final BlockItem SILVER_BLOCK = new BlockItem(ModBlocks.SILVER_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

   public static void registerItems() {
       Registry.register(Registry.ITEM, new Identifier(bowlingmod.MOD_ID,"silver"), SILVER);
       Registry.register(Registry.ITEM, new Identifier(bowlingmod.MOD_ID,"silver_block.json"), SILVER_BLOCK);
   }


}
