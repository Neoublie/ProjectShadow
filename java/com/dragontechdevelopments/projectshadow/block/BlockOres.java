package com.dragontechdevelopments.projectshadow.block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockOres extends BlockPS {

	public BlockOres(Material material, String unlocalizedName, String registryName) {
		super(material, unlocalizedName, registryName);
		setSoundType(SoundType.STONE);
	}	
}