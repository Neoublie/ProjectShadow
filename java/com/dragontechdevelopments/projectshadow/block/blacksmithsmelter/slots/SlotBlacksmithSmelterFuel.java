package com.dragontechdevelopments.projectshadow.block.blacksmithsmelter.slots;

import com.dragontechdevelopments.projectshadow.block.blacksmithsmelter.TileEntityBlacksmithSmelter;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotBlacksmithSmelterFuel extends Slot {

	public SlotBlacksmithSmelterFuel(IInventory inventory, int index, int xPosition, int yPosition) {
		super(inventory, index, xPosition, yPosition);
	}
	
	@Override
	public boolean isItemValid(ItemStack stack) {
		return TileEntityBlacksmithSmelter.isItemFuel(stack);
	}
	
	@Override
	public int getItemStackLimit(ItemStack stack) {
		return super.getItemStackLimit(stack);
	}

}
