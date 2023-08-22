package com.fritz.conquestnature.effect;

import com.fritz.conquestnature.ConquestOfNaturesArmorsAndItems;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS = DeferredRegister
            .create(ForgeRegistries.MOB_EFFECTS, ConquestOfNaturesArmorsAndItems.MODID);

    public static final RegistryObject<MobEffect> BASIC_SHRINK = MOB_EFFECTS.register("basic_shrink",
            () -> new Base2ShrinkEffect(MobEffectCategory.NEUTRAL, 3124687));

    public static final RegistryObject<MobEffect> MEDIUM_SHRINK = MOB_EFFECTS.register("medium_shrink",
            () -> new Base4ShrinkEffect(MobEffectCategory.NEUTRAL, 3124687));

    public static final RegistryObject<MobEffect> CRAZY_SHRINK = MOB_EFFECTS.register("crazy_shrink",
            () -> new Base8ShrinkEffect(MobEffectCategory.NEUTRAL, 3124687));

    public static final RegistryObject<MobEffect> INSANE_SHRINK = MOB_EFFECTS.register("insane_shrink",
            () -> new Base16ShrinkEffect(MobEffectCategory.NEUTRAL, 3124687));

    public static void register (IEventBus eventBus) { MOB_EFFECTS.register(eventBus); }

}
