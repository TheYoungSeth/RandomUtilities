package de.randomutilities.mod.register.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class armorTitanium extends ItemArmor {

	public armorTitanium(ArmorMaterial material, int renderIndex, int i) {
		super(material, renderIndex, i);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if (this.armorType == 2) {
			return "randomutilities:textures/models/armor/titanium_layer_2.png";
		}
		return "randomutilities:textures/models/armor/titanium_layer_1.png";
		
	}
	
}
