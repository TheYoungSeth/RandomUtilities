package de.randomutilities.mod.register;

import cpw.mods.fml.common.registry.GameRegistry;
import de.randomutilities.mod.utils.RandomTab;
import de.randomutilities.mod.utils.References;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class RandomItems {
	
	public static Item chainmail;
	public static Item iron_nugget;
	public static Item obsidian_ingot;
	public static Item titanium_ingot;
	public static Item meatSpider;
	public static Item cookedMeatSpider;
	
	public static void init() {
		//initialize
		chainmail = new Item().setUnlocalizedName("chainmail").setTextureName(References.MODID + ":chainmail").setCreativeTab(RandomTab.randomTab);
		iron_nugget = new Item().setUnlocalizedName("iron_nugget").setTextureName(References.MODID + ":iron_nugget").setCreativeTab(RandomTab.randomTab);
		obsidian_ingot = new Item().setUnlocalizedName("obsidian_ingot").setTextureName(References.MODID + ":obsidian_ingot").setCreativeTab(RandomTab.randomTab);
		titanium_ingot = new Item().setUnlocalizedName("titanium_ingot").setTextureName(References.MODID + ":titanium_ingot").setCreativeTab(RandomTab.randomTab);
		meatSpider = new ItemFood(3, 0.5F, true).setUnlocalizedName("meatSpider").setTextureName(References.MODID + ":meatSpider").setCreativeTab(RandomTab.randomTab);
		cookedMeatSpider = new ItemFood(3, 0.5F, true).setUnlocalizedName("cookedMeatSpider").setTextureName(References.MODID + ":cookedMeatSpider").setCreativeTab(RandomTab.randomTab);
		//register
		GameRegistry.registerItem(chainmail, chainmail.getUnlocalizedName());
		GameRegistry.registerItem(iron_nugget, iron_nugget.getUnlocalizedName());
		GameRegistry.registerItem(obsidian_ingot, obsidian_ingot.getUnlocalizedName());
		GameRegistry.registerItem(titanium_ingot, titanium_ingot.getUnlocalizedName());
		GameRegistry.registerItem(meatSpider, meatSpider.getUnlocalizedName());
		GameRegistry.registerItem(cookedMeatSpider, cookedMeatSpider.getUnlocalizedName());
	}
}
