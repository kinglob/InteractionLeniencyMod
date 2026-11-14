package com.kinglobstuff.configurableinteractionleniency;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.config.ModConfigEvent;
import org.slf4j.Logger;

import java.awt.event.InputEvent;

@Mod("interactionleniencymod")
public class InteractionLeniencyMod {
    private static final Logger LOGGER = LogUtils.getLogger();

    private void onConfigLoading(ModConfigEvent.Loading e) {
        if (e.getConfig().getSpec() != Config.SPEC) return;
        LOGGER.info("Loaded InteractionLeniency config!");
        LOGGER.info(
                "InteractionLeniency value set to: {}",
                Config.InteractionLeniency.get()
        );
    }

    public InteractionLeniencyMod(
            IEventBus modEventBus,
            ModContainer container
    ) {
        container.registerConfig(
                ModConfig.Type.SERVER,
                Config.SPEC
        );

        modEventBus.addListener(this::onConfigLoading);
    }
}
