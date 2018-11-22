package com.dragontechdevelopments.projectshadow.events;

import com.dragontechdevelopments.projectshadow.init.ProjectShadowItems;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.event.world.BlockEvent.PlaceEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ProjectShadowEventHandler {
	@SubscribeEvent
	public void yourPlayerHarvestEvent(HarvestDropsEvent event) {
	   	
		// Override Iron vanilla Ore Harvest 
		// TODO need to add a way to craft iron ore, possibly ore chunk with smooth stone in crafting bench or furnace. TBD
		if (event.getHarvester() != null) {
			if (event.getState() == Blocks.IRON_ORE.getDefaultState()) {
				event.getDrops().clear();
				event.getDrops().add(new ItemStack(ProjectShadowItems.CHUNK_IRON, 1));
			}
		}
	}
}