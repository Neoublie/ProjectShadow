package com.dragontechdevelopments.projectshadow.world;

import java.util.Random;

import com.dragontechdevelopments.projectshadow.init.ProjectShadowBlocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModWorldGen implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		if (world.provider.getDimension() == 0) { // the overworld
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		} else if (world.provider.getDimension() == 0) { // the Nether
			generateNether(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
	}

	private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		generateOre(ProjectShadowBlocks.ORE_COPPER.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 40, 64, 4 + random.nextInt(4), 6);
		generateOre(ProjectShadowBlocks.ORE_LEAD.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 40, 4 + random.nextInt(4), 6);
		generateOre(ProjectShadowBlocks.ORE_MITHRIL.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 4, 12, 1 + random.nextInt(2), 2);
		generateOre(ProjectShadowBlocks.ORE_SILVER.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 40, 4 + random.nextInt(4), 6);
		generateOre(ProjectShadowBlocks.ORE_TIN.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 40, 64, 4 + random.nextInt(4), 6);
	}
	
	private void generateNether(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
//		generateOre(ProjectShadowBlocks.ORE_COPPER.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, 4 + random.nextInt(4), 6);
//		generateOre(ProjectShadowBlocks.ORE_LEAD.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, 4 + random.nextInt(4), 6);
//		generateOre(ProjectShadowBlocks.ORE_MITHRIL.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, 4 + random.nextInt(4), 6);
//		generateOre(ProjectShadowBlocks.ORE_SILVER.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, 4 + random.nextInt(4), 6);
//		generateOre(ProjectShadowBlocks.ORE_TIN.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, 4 + random.nextInt(4), 6);
	}

	private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) {
		int deltaY = maxY - minY;

		for (int i = 0; i < chances; i++) {
			BlockPos pos= new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));

			WorldGenMinable generator = new WorldGenMinable(ore, size);
			generator.generate(world, random, pos);
		}
	}

}
