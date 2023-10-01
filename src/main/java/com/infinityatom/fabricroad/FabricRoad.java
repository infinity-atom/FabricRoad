package com.infinityatom.fabricroad;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FabricRoad implements ModInitializer {

	public static final String MODID = "fabricroad";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {

		RoadBlocksSetup.registerModBlocks();

	}
}