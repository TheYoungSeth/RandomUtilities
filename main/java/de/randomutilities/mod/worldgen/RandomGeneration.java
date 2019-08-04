package de.randomutilities.mod.worldgen;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import de.randomutilities.mod.register.RandomBlocks;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class RandomGeneration implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
			case 0:
				generate(world, random, chunkX, chunkZ);
				break;
		}
	}
	
	public void generate(World world, Random rand, int x, int z) {
		generateOre(RandomBlocks.titanium_ore, world, rand, x, z, 1, 2, 1, 0, 12, Blocks.stone);
	}
	
	public void generateOre(Block block, World world, Random random, int chunkX, int chunkZ, int minVienSize, int maxVienSize, int chance, int minY, int maxY, Block generateIn) {
		int VienSize = minVienSize + random.nextInt(maxVienSize - minVienSize);
		int heightRange = maxY + minY;
		WorldGenMinable gen = new WorldGenMinable(block, VienSize, generateIn);
		for(int i = 0; i < chance; i++) {
			int xRand = chunkX * 16 + random.nextInt(16);
			int yRand = random.nextInt(heightRange) + minY;
			int zRand = chunkZ * 16 + random.nextInt(16);
			gen.generate(world, random, xRand, yRand, zRand);
		}
	}

}
