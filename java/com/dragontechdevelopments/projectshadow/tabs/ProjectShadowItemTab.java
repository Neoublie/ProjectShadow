package com.dragontechdevelopments.projectshadow.tabs;

import com.dragontechdevelopments.projectshadow.ProjectShadowMod;
import com.dragontechdevelopments.projectshadow.init.ProjectShadowItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ProjectShadowItemTab extends CreativeTabs  {

	public ProjectShadowItemTab(String name) {
		super(ProjectShadowMod.MODID + "." + name);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ProjectShadowItems.INGOT_COPPER);
	}

}
