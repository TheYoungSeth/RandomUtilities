package de.randomutilities.mod.register.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockTitanium extends Block {

	public BlockTitanium(Material material) {
		super(material);
		this.setHardness(1.5f);
		this.setResistance(200000.0f);
		this.setHarvestLevel("pickaxe", 5);
	}

}
