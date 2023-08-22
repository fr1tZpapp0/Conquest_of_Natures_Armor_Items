package com.fritz.conquestnature.block;

import com.fritz.conquestnature.ConquestOfNaturesArmorsAndItems;
import com.fritz.conquestnature.block.custom.CloverCropBlock;
import com.fritz.conquestnature.block.custom.SprigCropBlock;
import com.fritz.conquestnature.block.custom.ToadstoolCropBlock;
import com.fritz.conquestnature.item.ModCreativeModeTab;
import com.fritz.conquestnature.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister
            .create(ForgeRegistries.BLOCKS, ConquestOfNaturesArmorsAndItems.MODID);


    public static final RegistryObject<Block> CLOVER_CROP = BLOCKS.register("clover_crop",
            () -> new CloverCropBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS)));

    public static final RegistryObject<Block> SPRIG_CROP = BLOCKS.register("sprig_crop",
            () -> new SprigCropBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS)));

    public static final RegistryObject<Block> TOADSTOOL_CROP = BLOCKS.register("toadstool_crop",
            () -> new ToadstoolCropBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS)));






    private static <T extends Block> RegistryObject<T> registerBlock
            (String name, Supplier<T> block, CreativeModeTab tab) {RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
