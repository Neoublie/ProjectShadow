package com.dragontechdevelopments.projectshadow.block.blacksmithforge;

import com.dragontechdevelopments.projectshadow.block.BlockPS;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockBlacksmithForge extends BlockPS {

	public BlockBlacksmithForge(Material material, String unlocalizedName, String registryName) {
		super(material, unlocalizedName, registryName);
		setSoundType(SoundType.METAL);
	}
}
