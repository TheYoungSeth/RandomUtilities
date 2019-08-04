package de.randomutilities.mod.register;

import cpw.mods.fml.common.registry.GameRegistry;
import de.randomutilities.mod.register.blocks.BlockHardenedGlass;
import de.randomutilities.mod.register.blocks.BlockTitanium;
import de.randomutilities.mod.register.blocks.ChestDirt;
import de.randomutilities.mod.register.blocks.OreTitanium;
import de.randomutilities.mod.utils.RandomTab;
import de.randomutilities.mod.utils.References;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;

public class RandomBlocks {
	
	public static Block titanium_ore;
	public static Block titanium_block;
	public static Block chestDirt;
	public static Block hardenedGlass;
	
	public static void init() {
		//Initialize
		titanium_ore = new OreTitanium(Material.rock).setBlockName("titanium_ore").setBlockTextureName(References.MODID + ":titanium_ore").setCreativeTab(RandomTab.randomTab);
		titanium_block = new BlockTitanium(Material.iron).setBlockName("titanium_block").setBlockTextureName(References.MODID + ":titanium_block").setCreativeTab(RandomTab.randomTab);
		hardenedGlass = new BlockHardenedGlass(Material.glass).setBlockName("hardenedGlass").setBlockTextureName(References.MODID + ":hardened_glass");
		//Register
		GameRegistry.registerBlock(titanium_ore, titanium_ore.getUnlocalizedName());
		GameRegistry.registerBlock(titanium_block, titanium_block.getUnlocalizedName());
		GameRegistry.registerBlock(hardenedGlass, hardenedGlass.getUnlocalizedName());
	}

}
