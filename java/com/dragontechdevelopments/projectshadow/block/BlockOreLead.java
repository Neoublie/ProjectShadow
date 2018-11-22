package com.dragontechdevelopments.projectshadow.block;

import java.util.Random;

import com.dragontechdevelopments.projectshadow.init.ProjectShadowItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockOreLead extends BlockOres {

	public BlockOreLead(Material material, String unlocalizedName, String registryName) {
		super(material, unlocalizedName, registryName);
		this.setHardness(3.0F);
	    this.setResistance(5.0F);
	    this.setSoundType(SoundType.STONE);
        this.setHarvestLevel("pickaxe", 2);
	}
	
	// The 3 functions below, getItemDropped, quantityDroppedWithBonus and damageDropped work together to determine the drops
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return ProjectShadowItems.CHUNK_LEAD;
    }
    @Override
    public int quantityDroppedWithBonus(int fortune, Random random)
    {
        return Math.max(0, random.nextInt(fortune + 2) - 1) + 1;
    }
    @Override
    public int damageDropped(IBlockState state)
    {
        return this.getMetaFromState(state);
    }

    // Drop experience
//    @Override
//    public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune)
//    {
//        Random rand = world instanceof World ? ((World)world).rand : new Random();
//        return MathHelper.getInt(rand, 3, 7);
//    }

}
