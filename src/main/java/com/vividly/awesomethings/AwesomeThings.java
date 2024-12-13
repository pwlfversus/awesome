package com.vividly.awesomethings;

import com.vividly.awesomethings.block.ModBlocks;
import com.vividly.awesomethings.item.ModItemGroups;
import com.vividly.awesomethings.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AwesomeThings implements ModInitializer {
	public static final String MOD_ID = "awesomethings";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}