package de.randomutilities.mod.register.blocks;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import de.randomutilities.mod.utils.RandomTab;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;

public class BlockHardenedGlass extends Block {

	public BlockHardenedGlass(Material material) {
		super(material);
		this.setCreativeTab(RandomTab.randomTab);
		this.setHardness(0.3F);
		this.setResistance(3.0F);
		this.setStepSound(this.soundTypeGlass);
	}
	
    public boolean isOpaqueCube()
    {
	    return false;
    }
    
    public int quantityDropped(Random p_149745_1_)
    {
        return 0;
    }
    
    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass()
    {
        return 0;
    }
    
    public boolean renderAsNormalBlock()
    {
        return false;
    }
    
    protected boolean canSilkHarvest()
    {
        return true;
    }

}
