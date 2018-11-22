package com.dragontechdevelopments.projectshadow.block.strongbox;

import java.util.Random;

import com.dragontechdevelopments.projectshadow.ProjectShadowMod;
import com.dragontechdevelopments.projectshadow.block.BlockContainerPS;
import com.dragontechdevelopments.projectshadow.gui.ModGuiHandler;
import com.dragontechdevelopments.projectshadow.init.ProjectShadowBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockStrongBox extends BlockContainerPS{

	protected BlockStrongBox(Material material, String unlocalizedName, String registryName) {
		super(material, unlocalizedName, registryName);
		setTickRandomly(false);
		setSoundType(SoundType.METAL);
	}
	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float x, float y, float z) {
		if (!world.isRemote) {
			player.openGui(ProjectShadowMod.instance, ModGuiHandler.GUI_STRONGBOX_ID, world, pos.getX(), pos.getY(), pos.getZ());
		}
		return true;
	}
	
	@Override
	public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
		// TODO Auto-generated method stub
		super.breakBlock(worldIn, pos, state);
	}
	
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(ProjectShadowBlocks.SAFE_STRONGBOX);
		
	}
	
	@Override
	public void onBlockAdded(World world, BlockPos pos, IBlockState state) {

	}


	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		// TODO Auto-generated method stub
		return null;
	}

}
