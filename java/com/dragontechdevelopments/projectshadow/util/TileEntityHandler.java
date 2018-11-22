package com.dragontechdevelopments.projectshadow.util;

import com.dragontechdevelopments.projectshadow.block.blacksmithsmelter.TileEntityBlacksmithSmelter;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler {

	public static void registerTileEntities() {
		GameRegistry.registerTileEntity(TileEntityBlacksmithSmelter.class, "blacksmithsmelter");
		
	}
}
