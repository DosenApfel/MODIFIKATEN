package de.lukas.mod;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import de.lukas.Blocks.BasicBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class WorldGen implements IWorldGenerator{

	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		chunkX *= 16;
		chunkZ *= 16;
		switch(world.provider.dimensionId) {
			case -1:
				break;
			case 0:
				generateSurface(world, rand, chunkX, chunkZ);
				break;
			case 1:
				break;
		}
	}

	private void generateSurface(World world, Random rand, int chunkX, int chunkZ) {
		//Copper
		int max = 5;
		for(int i = 0; i < max; i++) {
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(66);
			int randPosZ = chunkZ + rand.nextInt(16);
			(new WorldGenMinable(BasicBlocks.CopperOre, 10, Blocks.stone)).generate(world, rand, randPosX, randPosY, randPosZ);
		
	}
		
		//Tin
				max = 7;
				for(int i = 0; i <max; i++ ) {
					int randPosX = chunkX + rand.nextInt(16);
					int randPosY = rand.nextInt(66);
					int randPosZ = chunkZ + rand.nextInt(16);
					(new WorldGenMinable(BasicBlocks.TinOre, 10,  Blocks.stone)).generate(world, rand, randPosX, randPosY, randPosZ);
				}
				
		//MagicMetal		
				max = 6;
				for(int i = 0; i <max; i++ ) {
					int randPosX = chunkX + rand.nextInt(16);
					int randPosY = rand.nextInt(20);
					int randPosZ = chunkZ + rand.nextInt(16);
					(new WorldGenMinable(BasicBlocks.MagicMetalOre, 3,  Blocks.stone)).generate(world, rand, randPosX, randPosY, randPosZ);
					
	}
				
				//Lead
				int max1 = 4;
				for(int i = 0; i < max1; i++) {
					int randPosX = chunkX + rand.nextInt(16);
					int randPosY = rand.nextInt(66);
					int randPosZ = chunkZ + rand.nextInt(16);
					(new WorldGenMinable(BasicBlocks.LeadOre, 10, Blocks.stone)).generate(world, rand, randPosX, randPosY, randPosZ);
				
			}
				
				//Platin
				int max11 = 4;
				for(int i = 0; i < max11; i++) {
					int randPosX = chunkX + rand.nextInt(16);
					int randPosY = rand.nextInt(66);
					int randPosZ = chunkZ + rand.nextInt(16);
					(new WorldGenMinable(BasicBlocks.PlatinOre, 10, Blocks.stone)).generate(world, rand, randPosX, randPosY, randPosZ);
				
	}}}