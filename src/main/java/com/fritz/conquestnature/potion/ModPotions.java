package com.fritz.conquestnature.potion;

import com.fritz.conquestnature.ConquestOfNaturesArmorsAndItems;
import com.fritz.conquestnature.effect.ModEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPotions {

    public static final DeferredRegister<Potion> POTIONS = DeferredRegister
            .create(ForgeRegistries.POTIONS, ConquestOfNaturesArmorsAndItems.MODID);

    public static final RegistryObject<Potion> BASIC_SHRINKING_POTION = POTIONS.register("basic_shrinking_potion",
            () -> new Potion(new MobEffectInstance(ModEffects.BASIC_SHRINK.get(), 3200, 0)));

    public static final RegistryObject<Potion> MEDIUM_SHRINKING_POTION = POTIONS.register("medium_shrinking_potion",
            () -> new Potion(new MobEffectInstance(ModEffects.MEDIUM_SHRINK.get(), 4000, 0)));

    public static final RegistryObject<Potion> CRAZY_SHRINKING_POTION = POTIONS.register("crazy_shrinking_potion",
            () -> new Potion(new MobEffectInstance(ModEffects.CRAZY_SHRINK.get(), 7500, 0)));

    public static final RegistryObject<Potion> INSANE_SHRINKING_POTION = POTIONS.register("insane_shrinking_potion",
            () -> new Potion(new MobEffectInstance(ModEffects.INSANE_SHRINK.get(), 15000, 0)));

    public static void register (IEventBus eventBus) { POTIONS.register(eventBus); }
}
