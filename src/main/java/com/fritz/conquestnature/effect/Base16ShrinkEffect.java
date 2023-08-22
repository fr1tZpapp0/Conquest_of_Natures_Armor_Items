package com.fritz.conquestnature.effect;


import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import virtuoel.pehkui.api.ScaleData;
import virtuoel.pehkui.api.ScaleTypes;


public class Base16ShrinkEffect extends MobEffect {


    protected Base16ShrinkEffect(MobEffectCategory mobEffectCategory, int color) {
        super(mobEffectCategory, color);
    }

    public void addAttributeModifiers (LivingEntity entity, AttributeMap attributes, int amplifier) {
        ScaleData scaleH = ScaleTypes.HEIGHT.getScaleData(entity);
        ScaleData scaleW = ScaleTypes.WIDTH.getScaleData(entity);
        ScaleData scaledSpeed = ScaleTypes.MOTION.getScaleData(entity);

        float newScale = scaleH.getBaseScale() / 16;
        float newWidth = scaleW.getBaseScale() / 16;
        float newSpeed = scaledSpeed.getBaseScale() / 16;

        scaleH.setTargetScale(newScale);
        scaleW.setTargetScale(newWidth);
        scaledSpeed.setTargetScale(newSpeed);
    }

    public void removeAttributeModifiers (LivingEntity entity, AttributeMap attributes, int amplifier) {
        ScaleData scaleH = ScaleTypes.HEIGHT.getScaleData(entity);
        ScaleData scaleW = ScaleTypes.WIDTH.getScaleData(entity);
        ScaleData scaledSpeed = ScaleTypes.MOTION.getScaleData(entity);

        float newScale = scaleH.getBaseScale() * 16;
        float newWidth = scaleW.getBaseScale() * 16;
        float newSpeed = scaledSpeed.getBaseScale() * 16;

        scaleH.setTargetScale(newScale);
        scaleW.setTargetScale(newWidth);
        scaledSpeed.setTargetScale(newSpeed);
    }


}
