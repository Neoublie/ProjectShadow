package com.dragontechdevelopments.projectshadow.item;

import com.dragontechdevelopments.projectshadow.ProjectShadowMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBasic extends Item {
	 
    public ItemBasic(String unlocalizedName, String registryName) {
        setUnlocalizedName(ProjectShadowMod.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(CreativeTabs.MISC);
    }
 
}