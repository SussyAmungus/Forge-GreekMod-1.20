package net.ashkun.greekmod.util;

import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.ashkun.greekmod.GreekMod;
import org.apache.commons.compress.compressors.lz77support.LZ77Compressor;

public class ModTags {
    public static class Blocks{
        public static final TagKey<Block> NEEDS_IRON_TOOL = tag("needs_iron_tool");

        private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(GreekMod.MOD_ID,name));
        }
    }

    public static class Items{

        private static TagKey<Item> tag(String name){

            return ItemTags.create(new ResourceLocation(GreekMod.MOD_ID,name));

        }
    }
}

