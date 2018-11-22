package com.dragontechdevelopments.projectshadow.gui;

import com.dragontechdevelopments.projectshadow.block.blacksmithsmelter.ContainerBlacksmithSmelter;
import com.dragontechdevelopments.projectshadow.block.blacksmithsmelter.GuiBlacksmithSmelter;
import com.dragontechdevelopments.projectshadow.block.blacksmithsmelter.TileEntityBlacksmithSmelter;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class ModGuiHandler implements IGuiHandler {
	
	

	public static final int GUI_SMELTER_ID = 0;
	public static final int GUI_FORGE_ID = 1;
	public static final int GUI_ANVIL_ID = 2;
	
	public static final int GUI_STRONGBOX_ID = 3;
	
	
	@Override
	public Container getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

		switch (ID) {
			case GUI_SMELTER_ID:
				return new ContainerBlacksmithSmelter(player.inventory, (TileEntityBlacksmithSmelter)world.getTileEntity(new BlockPos(x,y,z)));
			case GUI_FORGE_ID:
				return null;
			case GUI_ANVIL_ID:
				return null;
			case GUI_STRONGBOX_ID:
				return null;
			default:
				return null;
		}
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

		switch(ID) {
		case GUI_SMELTER_ID:
			return new GuiBlacksmithSmelter(player.inventory, (TileEntityBlacksmithSmelter)world.getTileEntity(new BlockPos(x,y,z)));
		case GUI_FORGE_ID:
			return null;
		case GUI_ANVIL_ID:
			return null;
		case GUI_STRONGBOX_ID:
			return null;
		default:
			return null;
		}
	}

}
