package de.randomutilities.mod.main;

import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import de.randomutilities.mod.utils.MobDropHandler;
import de.randomutilities.mod.utils.ModRecipes;
import de.randomutilities.mod.utils.RandomOreDictionary;
import de.randomutilities.mod.utils.RandomTab;
import de.randomutilities.mod.utils.References;
import de.randomutilities.mod.worldgen.RandomGeneration;
import de.randomutilities.mod.register.RandomArmor;
import de.randomutilities.mod.register.RandomBlocks;
import de.randomutilities.mod.register.RandomItems;
import de.randomutilities.mod.register.RandomTools;
import de.randomutilities.mod.register.tools.*;

@Mod(modid=References.MODID, version=References.VERSION, name=References.NAME)
public class Main
{
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println("PreInit is initialized");
	}
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	RandomItems.init();
    	RandomTools.init();
    	RandomBlocks.init();
    	RandomArmor.init();
    	MinecraftForge.EVENT_BUS.register(new MobDropHandler());
    	System.out.println("Init is initialized");
    }
		

	@EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	ModRecipes.init();
    	RandomOreDictionary.init();
    	GameRegistry.registerWorldGenerator(new RandomGeneration(), 0);
    	System.out.println("postInit is initialized");
    }
}
