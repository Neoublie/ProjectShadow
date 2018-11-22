package com.dragontechdevelopments.projectshadow.block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockBlacksmithSmelterLarge extends BlockPS {

	public BlockBlacksmithSmelterLarge(Material material, String unlocalizedName, String registryName) {
		super(material, unlocalizedName, registryName);
		setSoundType(SoundType.METAL);
	}
}
