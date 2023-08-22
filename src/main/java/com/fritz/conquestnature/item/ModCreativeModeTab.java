package com.fritz.conquestnature.item;

import com.fritz.conquestnature.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab CONQUESTNATURE_ITEMS = new CreativeModeTab("conquestitemstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.LEAF.get());
        }
    };

    public static final CreativeModeTab CONQUESTNATURE_ARMORS = new CreativeModeTab("conquestarmorstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.LEAF_HELMET.get());
        }
    };


    public static final CreativeModeTab CONQUESTNATURE_FOODS = new CreativeModeTab("conquestfoodstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.DRIED_CLOVER_LEAF.get());
        }
    };

}
