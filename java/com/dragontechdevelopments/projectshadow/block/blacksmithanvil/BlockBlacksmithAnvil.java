package com.dragontechdevelopments.projectshadow.block.blacksmithanvil;

import com.dragontechdevelopments.projectshadow.block.BlockPS;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockBlacksmithAnvil extends BlockPS {

	public BlockBlacksmithAnvil(Material material, String unlocalizedName, String registryName) {
		super(material, unlocalizedName, registryName);
		setSoundType(SoundType.METAL);
	}
}
