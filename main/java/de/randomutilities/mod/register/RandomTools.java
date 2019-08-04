package de.randomutilities.mod.register;

import de.randomutilities.mod.register.tools.*;
import de.randomutilities.mod.utils.RandomTab;
import de.randomutilities.mod.utils.References;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class RandomTools {
		public static Item ToolObsidianPickaxe;
		public static Item ToolObsidianAxe;
		public static Item ToolObsidianHoe;
		public static Item ToolObsidianShovel;
		public static Item ToolObsidianSword;
		
		public static Item ToolTitaniumPickaxe;
		public static Item ToolTitaniumAxe;
		public static Item ToolTitaniumHoe;
		public static Item ToolTitaniumShovel;
		public static Item ToolTitaniumSword;
		
		public static final Item.ToolMaterial obsidian = EnumHelper.addToolMaterial("obsidian", 5, 350, 8.0F, 4, 3);
		public static final Item.ToolMaterial titanium = EnumHelper.addToolMaterial("titanium", 5, 1600, 10.0F, 5, 4);
		
		public static void init() {
			//Initialize
			ToolObsidianPickaxe = new ToolObsidianPickaxe(obsidian).setUnlocalizedName("obsidian_pickaxe").setTextureName(References.MODID + ":obsidian_pickaxe").setCreativeTab(RandomTab.randomTab);
			ToolObsidianAxe = new ToolObsidianAxe(obsidian).setUnlocalizedName("obsidian_axe").setTextureName(References.MODID + ":obsidian_axe").setCreativeTab(RandomTab.randomTab);
			ToolObsidianSword = new ToolObsidianSword(obsidian).setUnlocalizedName("obsidian_sword").setTextureName(References.MODID + ":obsidian_sword").setCreativeTab(RandomTab.randomTab);
			ToolObsidianHoe = new ToolObsidianHoe(obsidian).setUnlocalizedName("obsidian_hoe").setTextureName(References.MODID + ":obsidian_hoe").setCreativeTab(RandomTab.randomTab);
			ToolObsidianShovel = new ToolObsidianShovel(obsidian).setUnlocalizedName("obsidian_shovel").setTextureName(References.MODID + ":obsidian_shovel").setCreativeTab(RandomTab.randomTab);
			
			ToolTitaniumPickaxe = new ToolTitaniumPickaxe(titanium).setUnlocalizedName("titanium_pickaxe").setTextureName(References.MODID + ":titanium_pickaxe").setCreativeTab(RandomTab.randomTab);
			ToolTitaniumAxe = new ToolTitaniumAxe(titanium).setUnlocalizedName("titanium_axe").setTextureName(References.MODID + ":titanium_axe").setCreativeTab(RandomTab.randomTab);
			ToolTitaniumSword = new ToolTitaniumSword(titanium).setUnlocalizedName("titanium_sword").setTextureName(References.MODID + ":titanium_sword").setCreativeTab(RandomTab.randomTab);
			ToolTitaniumHoe = new ToolTitaniumHoe(titanium).setUnlocalizedName("titanium_hoe").setTextureName(References.MODID + ":titanium_hoe").setCreativeTab(RandomTab.randomTab);
			ToolTitaniumShovel = new ToolTitaniumShovel(titanium).setUnlocalizedName("titanium_shovel").setTextureName(References.MODID + ":titanium_shovel").setCreativeTab(RandomTab.randomTab);
			//Register
			GameRegistry.registerItem(ToolObsidianPickaxe, ToolObsidianPickaxe.getUnlocalizedName());
			GameRegistry.registerItem(ToolObsidianAxe, ToolObsidianAxe.getUnlocalizedName());
			GameRegistry.registerItem(ToolObsidianSword, ToolObsidianSword.getUnlocalizedName());
			GameRegistry.registerItem(ToolObsidianHoe, ToolObsidianHoe.getUnlocalizedName());
			GameRegistry.registerItem(ToolObsidianShovel, ToolObsidianShovel.getUnlocalizedName());
			
			GameRegistry.registerItem(ToolTitaniumPickaxe, ToolTitaniumPickaxe.getUnlocalizedName());
			GameRegistry.registerItem(ToolTitaniumAxe, ToolTitaniumAxe.getUnlocalizedName());
			GameRegistry.registerItem(ToolTitaniumSword, ToolTitaniumSword.getUnlocalizedName());
			GameRegistry.registerItem(ToolTitaniumHoe, ToolTitaniumHoe.getUnlocalizedName());
			GameRegistry.registerItem(ToolTitaniumShovel, ToolTitaniumShovel.getUnlocalizedName());
		}
}
