package de.randomutilities.mod.register.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OreTitanium extends Block {
	
	public OreTitanium(Material material) {
		super(material);
		this.setResistance(20000000.0f);
		this.setHarvestLevel("pickaxe", 5);
		this.setHardness(1.7F);
	}

}
