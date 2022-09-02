package net.sydokiddo.mothlib;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MothLib implements ModInitializer {

	public static final String MOD_ID = "mothlib";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		// Registry:

		LOGGER.info("Hello Fabric world!");
	}
}
