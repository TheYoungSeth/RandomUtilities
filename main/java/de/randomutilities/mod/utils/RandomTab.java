package de.randomutilities.mod.utils;

import de.randomutilities.mod.register.RandomItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RandomTab {
	 
		public static CreativeTabs randomTab = new CreativeTabs("randomTab") {
			public Item getTabIconItem() {
				return new ItemStack(RandomItems.titanium_ingot).getItem();
			}
		};

}
