package com.kinglobstuff.configurableinteractionleniency;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.config.ModConfigEvent;
import net.neoforged.neoforge.common.ModConfigSpec;

public class Config {
    private Config() {};
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    public static final  ModConfigSpec.DoubleValue InteractionLeniency = BUILDER
            .comment("The interaction leniency used by the server.")
            .defineInRange(
                    "interactionLeniency",
                    1.0D,
                    0.0D,
                    1000.0D
            );

    static final ModConfigSpec SPEC = BUILDER.build();
}
