package de.lukas.Blocks;

import java.util.Random;

import cpw.mods.fml.common.registry.GameRegistry;
import de.lukas.GUI.TileEntityCrusher;
import de.lukas.GUI.TileEntitySmelter;
import de.lukas.mod.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BasicBlocks extends Block{

	//Blocks
			public static Block CopperOre;
			public static Block CopperBlock;
			public static Block TinOre;
			public static Block TinBlock;
			public static Block LeadOre;
			public static Block LeadBlock;
			public static Block MagicMetalOre;
			public static Block MagicMetalBlock;
			public static Block PlatinOre;
			public static Block PlatinBlock;
	//Machines
			public static Block blockWorkSurface;
			public static final int guiIDWorkSurface = 1;
			
			public static Block blockSmelterIdle;
			public static Block blockSmelterActive;
			public static final int guiIDSmelter = 0;
			
			public static Block blockCrusherIdle;
			public static Block blockCrusherActive;
			public static final int guiIDCrusher = 2;
			
			
	
	protected BasicBlocks(Material mat) {
		super(mat);
		this.setCreativeTab(Main.tabMod);
		this.setStepSound(soundTypeStone);
		
	}
	
	
	

	public static void Blocks(){
		
		//Copper
			CopperOre = new CopperOre(Material.rock).setBlockName("CopperOre").setBlockTextureName(Main.MODID + ":CopperOre").setHardness(2.0F);
			GameRegistry.registerBlock(CopperOre, "CopperOre");
			
			CopperBlock = new OreBlock(Material.iron).setBlockName("CopperBlock").setBlockTextureName(Main.MODID + ":CopperBlock");
			GameRegistry.registerBlock(CopperBlock, "CopperBlock");
	
		//Tin	
			TinOre = new TinOre(Material.rock).setBlockName("TinOre").setBlockTextureName(Main.MODID + ":TinOre");
			GameRegistry.registerBlock(TinOre, "TinOre");

			TinBlock = new OreBlock(Material.iron).setBlockName("TinBlock").setBlockTextureName(Main.MODID + ":TinBlock");
			GameRegistry.registerBlock(TinBlock, "TinBlock");
			
		//Lead
			LeadOre = new LeadOre(Material.rock).setBlockName("LeadOre").setBlockTextureName(Main.MODID + ":LeadOre");
			GameRegistry.registerBlock(LeadOre, "LeadOre");

			LeadBlock = new OreBlock(Material.iron).setBlockName("LeadBlock").setBlockTextureName(Main.MODID + ":LeadBlock");
			GameRegistry.registerBlock(LeadBlock, "LeadBlock");
		
		//MagicMetal
			MagicMetalOre = new MagicMetalOre(Material.rock).setBlockName("MagicMetalOre").setBlockTextureName(Main.MODID + ":MagicMetalOre");
			GameRegistry.registerBlock(MagicMetalOre, "MagicMetalOre");

			MagicMetalBlock = new OreBlock(Material.iron).setBlockName("MagicMetalBlock").setBlockTextureName(Main.MODID + ":MagicMetalBlock");
			GameRegistry.registerBlock(MagicMetalBlock, "MagicMetalBlock");
		
		//Platin
			PlatinOre = new PlatinOre(Material.rock).setBlockName("PlatinOre").setBlockTextureName(Main.MODID + ":PlatinOre");
			GameRegistry.registerBlock(PlatinOre, "PlatinOre");

			PlatinBlock = new OreBlock(Material.iron).setBlockName("PlatinBlock").setBlockTextureName(Main.MODID + ":PlatinBlock");
			GameRegistry.registerBlock(PlatinBlock, "PlatinBlock");
			
		//Machines
			
			//WorkSurface
			blockWorkSurface = new WorkSurface().setBlockName("blockWorkSurface");
			GameRegistry.registerBlock(blockWorkSurface, "WorkSurface");
			
			//Smelter
			blockSmelterIdle = new Smelter(false).setBlockName("blockSmelterIdle").setCreativeTab(Main.tabMod);
			GameRegistry.registerBlock(blockSmelterIdle, "blockSmelterIdle");
			blockSmelterActive = new Smelter(true).setBlockName("blockSmelterActive").setLightLevel(0.625F).setCreativeTab(Main.tabMod);
			GameRegistry.registerBlock(blockSmelterActive, "blockSmelterActive");
			GameRegistry.registerTileEntityWithAlternatives(TileEntitySmelter.class, "TileEntitySmelter");
			
			blockCrusherIdle = new Crusher(false).setBlockName("blockCrusherIdle").setCreativeTab(Main.tabMod);
			GameRegistry.registerBlock(blockCrusherIdle, "blockCrusherIdle");
			blockCrusherActive = new Crusher(true).setBlockName("blockCrusherActive").setCreativeTab(Main.tabMod);
			GameRegistry.registerBlock(blockCrusherActive, "blockCrusherActive");
			GameRegistry.registerTileEntity(TileEntityCrusher.class, "TileEntityCrusher");

	}
}
