package com.fritz.conquestnature;

import com.fritz.conquestnature.block.ModBlocks;
import com.fritz.conquestnature.effect.ModEffects;
import com.fritz.conquestnature.item.ModItems;
import com.fritz.conquestnature.potion.ModPotions;
import com.fritz.conquestnature.util.BetterBrewingRecipe;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ConquestOfNaturesArmorsAndItems.MODID)
public class ConquestOfNaturesArmorsAndItems
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "conquestnature";
    private static final Logger LOGGER = LogUtils.getLogger();

    public ConquestOfNaturesArmorsAndItems()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModEffects.register(modEventBus);
        ModPotions.register(modEventBus);


        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);


        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.AWKWARD,
                Items.BROWN_MUSHROOM, ModPotions.BASIC_SHRINKING_POTION.get()));

        BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(ModPotions.BASIC_SHRINKING_POTION.get(),
                Items.BROWN_MUSHROOM, ModPotions.MEDIUM_SHRINKING_POTION.get()));

        BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(ModPotions.MEDIUM_SHRINKING_POTION.get(),
                Items.BROWN_MUSHROOM, ModPotions.CRAZY_SHRINKING_POTION.get()));

        BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(ModPotions.CRAZY_SHRINKING_POTION.get(),
                Items.BROWN_MUSHROOM, ModPotions.INSANE_SHRINKING_POTION.get()));
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
