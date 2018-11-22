package com.dragontechdevelopments.projectshadow.block.blacksmithbellows;

import com.dragontechdevelopments.projectshadow.block.BlockPS;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockBlacksmithBellows extends BlockPS {

	public BlockBlacksmithBellows(Material material, String unlocalizedName, String registryName) {
		super(material, unlocalizedName, registryName);
		setSoundType(SoundType.CLOTH);
	}

}
