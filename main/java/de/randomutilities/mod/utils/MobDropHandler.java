package de.randomutilities.mod.utils;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import de.randomutilities.mod.register.RandomItems;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class MobDropHandler {
	
	@SubscribeEvent
	public void onMobDrops(LivingDropsEvent event) {
		if (event.entity instanceof EntitySpider) {
			event.drops.clear();
			ItemStack stack = new ItemStack(RandomItems.meatSpider);
			EntityItem drop = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, stack);
			ItemStack stack2 = new ItemStack(Items.string, 1);
			EntityItem drop2 = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, stack2);
			event.drops.add(drop);
			event.drops.add(drop2);
		}
	}

}
