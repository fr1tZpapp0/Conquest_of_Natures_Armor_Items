package com.fritz.conquestnature.item;

import com.fritz.conquestnature.ConquestOfNaturesArmorsAndItems;
import com.fritz.conquestnature.block.ModBlocks;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister
            .create(ForgeRegistries.ITEMS, ConquestOfNaturesArmorsAndItems.MODID);



    public static final RegistryObject<Item> PEBBLE = ITEMS.register("pebble",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CONQUESTNATURE_ITEMS)));

    public static final RegistryObject<Item> LEAF = ITEMS.register("leaf",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CONQUESTNATURE_ITEMS)));




    public static final RegistryObject<Item> CLOVER_LEAF_SEEDS = ITEMS.register("clover_leaf_seeds",
            () -> new ItemNameBlockItem(ModBlocks.CLOVER_CROP.get(), new Item.Properties().tab(ModCreativeModeTab.CONQUESTNATURE_FOODS)));

    public static final RegistryObject<Item> SPRIG_ROOT_SEEDS = ITEMS.register("sprig_root_seeds",
            () -> new ItemNameBlockItem(ModBlocks.SPRIG_CROP.get(), new Item.Properties().tab(ModCreativeModeTab.CONQUESTNATURE_FOODS)));

    public static final RegistryObject<Item> TOADSTOOL_MUSHROOM_SEEDS = ITEMS.register("toadstool_mushroom_seeds",
            () -> new ItemNameBlockItem(ModBlocks.TOADSTOOL_CROP.get(), new Item.Properties().tab(ModCreativeModeTab.CONQUESTNATURE_FOODS)));




    public static final RegistryObject<Item> CLOVER_LEAF = ITEMS.register("clover_leaf",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CONQUESTNATURE_FOODS)
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(2).build())));

    public static final RegistryObject<Item> SPRIG_ROOT = ITEMS.register("sprig_root",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CONQUESTNATURE_FOODS)
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(2).build())));

    public static final RegistryObject<Item> TOADSTOOL_MUSHROOM = ITEMS.register("toadstool_mushroom",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CONQUESTNATURE_FOODS)
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(2).build())));


    public static final RegistryObject<Item>DRIED_CLOVER_LEAF = ITEMS.register("dried_clover_leaf",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(3).build())
                    .tab(ModCreativeModeTab.CONQUESTNATURE_FOODS)));

    public static final RegistryObject<Item> CRISPY_SPRIG_ROOT = ITEMS.register("crispy_sprig_root",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(3).build())
                    .tab(ModCreativeModeTab.CONQUESTNATURE_FOODS)));

    public static final RegistryObject<Item>TOADSTOOL_MUSHROOM_STEW = ITEMS.register("toadstool_mushroom_stew",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(3).build())
                    .tab(ModCreativeModeTab.CONQUESTNATURE_FOODS)));




    public static final RegistryObject<Item> LEAF_HELMET = ITEMS.register("leaf_helmet",
            () -> new ArmorItem(ModArmorMaterials.LEAF, EquipmentSlot.HEAD, new Item.Properties()
                    .tab(ModCreativeModeTab.CONQUESTNATURE_ARMORS)));

public static final RegistryObject<Item> LEAF_CHESTPLATE = ITEMS.register("leaf_chestplate",
            () -> new ArmorItem(ModArmorMaterials.LEAF, EquipmentSlot.CHEST, new Item.Properties()
                    .tab(ModCreativeModeTab.CONQUESTNATURE_ARMORS)));

public static final RegistryObject<Item> LEAF_LEGGINGS = ITEMS.register("leaf_leggings",
            () -> new ArmorItem(ModArmorMaterials.LEAF, EquipmentSlot.LEGS, new Item.Properties()
                    .tab(ModCreativeModeTab.CONQUESTNATURE_ARMORS)));

public static final RegistryObject<Item> LEAF_BOOTS = ITEMS.register("leaf_boots",
            () -> new ArmorItem(ModArmorMaterials.LEAF, EquipmentSlot.FEET, new Item.Properties()
                    .tab(ModCreativeModeTab.CONQUESTNATURE_ARMORS)));


    public static final RegistryObject<Item> PEBBLE_HELMET = ITEMS.register("pebble_helmet",
            () -> new ArmorItem(ModArmorMaterials.PEBBLE, EquipmentSlot.HEAD, new Item.Properties()
                    .tab(ModCreativeModeTab.CONQUESTNATURE_ARMORS)));

    public static final RegistryObject<Item> PEBBLE_CHESTPLATE = ITEMS.register("pebble_chestplate",
            () -> new ArmorItem(ModArmorMaterials.PEBBLE, EquipmentSlot.CHEST, new Item.Properties()
                    .tab(ModCreativeModeTab.CONQUESTNATURE_ARMORS)));

    public static final RegistryObject<Item> PEBBLE_LEGGINGS = ITEMS.register("pebble_leggings",
            () -> new ArmorItem(ModArmorMaterials.PEBBLE, EquipmentSlot.LEGS, new Item.Properties()
                    .tab(ModCreativeModeTab.CONQUESTNATURE_ARMORS)));

    public static final RegistryObject<Item> PEBBLE_BOOTS = ITEMS.register("pebble_boots",
            () -> new ArmorItem(ModArmorMaterials.PEBBLE, EquipmentSlot.FEET, new Item.Properties()
                    .tab(ModCreativeModeTab.CONQUESTNATURE_ARMORS)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
