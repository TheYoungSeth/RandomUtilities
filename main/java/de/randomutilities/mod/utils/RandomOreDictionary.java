package de.randomutilities.mod.utils;

import de.randomutilities.mod.register.RandomBlocks;
import de.randomutilities.mod.register.RandomItems;
import de.randomutilities.mod.register.RandomTools;
import net.minecraftforge.oredict.OreDictionary;

public class RandomOreDictionary {
	
	public static void init() {
		OreDictionary.registerOre("ingotObsidian", RandomItems.obsidian_ingot);
		OreDictionary.registerOre("pickaxeObsidian", RandomTools.ToolObsidianPickaxe);
		OreDictionary.registerOre("axeObsidian", RandomTools.ToolObsidianAxe);
		OreDictionary.registerOre("hoeObsidian", RandomTools.ToolObsidianHoe);
		OreDictionary.registerOre("swordObsidian", RandomTools.ToolObsidianSword);
		OreDictionary.registerOre("spadeObsidian", RandomTools.ToolObsidianShovel);
		OreDictionary.registerOre("shovelObsidian", RandomTools.ToolObsidianShovel);
		OreDictionary.registerOre("oreTitanium", RandomBlocks.titanium_ore);
		OreDictionary.registerOre("ingotTitanium", RandomItems.titanium_ingot);
		OreDictionary.registerOre("blockTitanium", RandomBlocks.titanium_block);
		OreDictionary.registerOre("hardenedGlass", RandomBlocks.hardenedGlass);
	}

}
