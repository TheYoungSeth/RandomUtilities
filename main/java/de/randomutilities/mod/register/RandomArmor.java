package de.randomutilities.mod.register;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;
import de.randomutilities.mod.register.armor.*;
import de.randomutilities.mod.utils.RandomTab;
import de.randomutilities.mod.utils.References;

public class RandomArmor {
	
	public static Item helmetTitanium;
	public static Item chestplateTitanium;
	public static Item leggingsTitanium;
	public static Item shoesTitanium;
	
	public static final ItemArmor.ArmorMaterial titanium = EnumHelper.addArmorMaterial("Titanium", 690, new int[]{5, 7, 6, 4}, 5);
	
	public static void init() {
		//Initialize
		helmetTitanium = new armorTitanium(titanium, 0, 0).setUnlocalizedName("helmetTitanium").setTextureName(References.MODID + ":helmetTitanium").setCreativeTab(RandomTab.randomTab);
		chestplateTitanium = new armorTitanium(titanium, 0, 1).setUnlocalizedName("chestplateTitanium").setTextureName(References.MODID + ":chestplateTitanium").setCreativeTab(RandomTab.randomTab);
		leggingsTitanium = new armorTitanium(titanium, 0, 2).setUnlocalizedName("leggingsTitanium").setTextureName(References.MODID + ":leggingsTitanium").setCreativeTab(RandomTab.randomTab);
		shoesTitanium = new armorTitanium(titanium, 0, 3).setUnlocalizedName("shoesTitanium").setTextureName(References.MODID + ":shoesTitanium").setCreativeTab(RandomTab.randomTab);
		//Register
		GameRegistry.registerItem(helmetTitanium, helmetTitanium.getUnlocalizedName());
		GameRegistry.registerItem(chestplateTitanium, chestplateTitanium.getUnlocalizedName());
		GameRegistry.registerItem(leggingsTitanium, leggingsTitanium.getUnlocalizedName());
		GameRegistry.registerItem(shoesTitanium, shoesTitanium.getUnlocalizedName());
	}

}
