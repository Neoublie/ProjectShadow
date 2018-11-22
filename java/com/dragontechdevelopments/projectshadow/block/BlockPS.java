package com.dragontechdevelopments.projectshadow.block;

import com.dragontechdevelopments.projectshadow.ProjectShadowMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockPS extends Block{

	public BlockPS(Material material, String unlocalizedName, String registryName) {
		super(material);
		setUnlocalizedName(ProjectShadowMod.MODID + "." + unlocalizedName);
		setRegistryName(registryName);
		setCreativeTab(ProjectShadowMod.PROJECTSHADOWBLOCK_TAB);
		//setSoundType(sound);
	}
	
	
	
	

}
