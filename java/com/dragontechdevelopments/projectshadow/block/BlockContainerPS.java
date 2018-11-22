package com.dragontechdevelopments.projectshadow.block;

import com.dragontechdevelopments.projectshadow.ProjectShadowMod;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class BlockContainerPS extends BlockContainer {

	private static boolean hasTileEntoty;
	
	protected BlockContainerPS(Material material, String unlocalizedName, String registryName) {
		super(material);
		setUnlocalizedName(unlocalizedName);
		setRegistryName(registryName);
		setCreativeTab(ProjectShadowMod.PROJECTSHADOWBLOCK_TAB);
		setSoundType(SoundType.METAL);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return null;
	}

}
