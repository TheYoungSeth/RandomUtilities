package de.randomutilities.mod.utils;

import cpw.mods.fml.common.registry.GameRegistry;
import de.randomutilities.mod.register.RandomBlocks;
import de.randomutilities.mod.register.RandomItems;
import de.randomutilities.mod.register.RandomTools;
import net.minecraft.block.*;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.*;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class ModRecipes {
	
	public static void init() {
		//Chainmail Armor
		GameRegistry.addShapedRecipe(new ItemStack(Items.chainmail_boots), "   ", "X X", "X X", 'X', RandomItems.chainmail);
		GameRegistry.addShapedRecipe(new ItemStack(Items.chainmail_boots), "X X", "X X", "   ", 'X', RandomItems.chainmail);
		GameRegistry.addShapedRecipe(new ItemStack(Items.chainmail_helmet), "   ", "XXX", "X X", 'X', RandomItems.chainmail);
		GameRegistry.addShapedRecipe(new ItemStack(Items.chainmail_helmet), "XXX", "X X", "   ", 'X', RandomItems.chainmail);
		GameRegistry.addShapedRecipe(new ItemStack(Items.chainmail_leggings), "XXX", "X X", "X X", 'X', RandomItems.chainmail);
		GameRegistry.addShapedRecipe(new ItemStack(Items.chainmail_chestplate), "X X", "XXX", "XXX", 'X', RandomItems.chainmail);
		//Iron Nuggets
		GameRegistry.addShapelessRecipe(new ItemStack(RandomItems.iron_nugget, 9), Items.iron_ingot);
		GameRegistry.addRecipe(new ItemStack(Items.iron_ingot), "XXX", "XXX", "XXX", 'X', RandomItems.iron_nugget);
		//Chainmail
		GameRegistry.addRecipe(new ItemStack(RandomItems.chainmail), "XXX", "X X", "XXX", 'X', RandomItems.iron_nugget);
		//Obsidian Stuff
		GameRegistry.addSmelting(Blocks.obsidian, new ItemStack(RandomItems.obsidian_ingot), 0.7F);
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(RandomTools.ToolObsidianSword), " X ", " X ", " I ", 'X', "ingotObsidian", 'I', Items.stick));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(RandomTools.ToolObsidianPickaxe), "XXX", " I ", " I ", 'X', "ingotObsidian", 'I', Items.stick));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(RandomTools.ToolObsidianHoe), " XX", " I ", " I ", 'X', "ingotObsidian", 'I', Items.stick));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(RandomTools.ToolObsidianAxe), " XX", " IX", " I ", 'X', "ingotObsidian", 'I', Items.stick));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(RandomTools.ToolObsidianAxe), " XX", "XI ", " I ", 'X', "ingotObsidian", 'I', Items.stick));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(RandomTools.ToolObsidianShovel), " X ", " I ", " I ", 'X', "ingotObsidian", 'I', Items.stick));
		//Titanium Stuff
		GameRegistry.addSmelting(RandomBlocks.titanium_ore, new ItemStack(RandomItems.titanium_ingot), 0.8F);
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(RandomTools.ToolTitaniumSword), " X ", " X ", " I ", 'X', "ingotTitanium", 'I', Items.stick));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(RandomTools.ToolTitaniumPickaxe), "XXX", " I ", " I ", 'X', "ingotTitanium", 'I', Items.stick));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(RandomTools.ToolTitaniumHoe), " XX", " I ", " I ", 'X', "ingotTitanium", 'I', Items.stick));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(RandomTools.ToolTitaniumAxe), " XX", " IX", " I ", 'X', "ingotTitanium", 'I', Items.stick));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(RandomTools.ToolTitaniumAxe), " XX", "XI ", " I ", 'X', "ingotTitanium", 'I', Items.stick));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(RandomTools.ToolTitaniumShovel), " X ", " I ", " I ", 'X', "ingotTitanium", 'I', Items.stick));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(RandomBlocks.titanium_block), "XXX", "XXX", "XXX", 'X', "ingotTitanium"));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(RandomItems.titanium_ingot, 9), "blockTitanium"));
		//Food
		GameRegistry.addSmelting(RandomItems.meatSpider, new ItemStack(RandomItems.cookedMeatSpider), 0.8F);
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(RandomBlocks.hardenedGlass), "XXX", "XTX", "XXX", 'X', "glass", 'T', "ingotTitanium"));
		
	}

}
