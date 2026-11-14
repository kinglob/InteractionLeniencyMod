package com.kinglobstuff.configurableinteractionleniency;

import net.minecraft.server.network.ServerGamePacketListenerImpl;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(ServerGamePacketListenerImpl.class)
public abstract class InteractionLeniencyMixin {
    @ModifyConstant(
            method = "handleInteract",
            constant = @Constant(doubleValue = 1.0D),
            require = 1,
            allow = 1
    )
    private double ModifyInteractionLeniency(double original) {
        return Config.InteractionLeniency.get();
    }
}
