package de.lukas.Blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import de.lukas.mod.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

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
			
			public static Block blockCrusherIdle;
			public static Block blockCrusherActive;
			
			
			
		
	
	protected BasicBlocks(Material mat) {
		super(mat);
		this.setCreativeTab(Main.tabMod);
		this.setStepSound(soundTypeStone);
		
		
	}

	public static void Blocks(){
		
		//Copper
			CopperOre = new BasicBlocks(Material.rock).setBlockName("CopperOre").setBlockTextureName(Main.MODID + ":CopperOre");
			GameRegistry.registerBlock(CopperOre, "CopperOre");
			
			CopperBlock = new BasicBlocks(Material.iron).setBlockName("CopperBlock").setBlockTextureName(Main.MODID + ":CopperBlock");
			GameRegistry.registerBlock(CopperBlock, "CopperBlock");
	
		//Tin	
			TinOre = new BasicBlocks(Material.rock).setBlockName("TinOre").setBlockTextureName(Main.MODID + ":TinOre");
			GameRegistry.registerBlock(TinOre, "TinOre");

			TinBlock = new BasicBlocks(Material.iron).setBlockName("TinBlock").setBlockTextureName(Main.MODID + ":TinBlock");
			GameRegistry.registerBlock(TinBlock, "TinBlock");
			
		//Lead
			LeadOre = new BasicBlocks(Material.rock).setBlockName("LeadOre").setBlockTextureName(Main.MODID + ":LeadOre");
			GameRegistry.registerBlock(LeadOre, "LeadOre");

			LeadBlock = new BasicBlocks(Material.iron).setBlockName("LeadBlock").setBlockTextureName(Main.MODID + ":LeadBlock");
			GameRegistry.registerBlock(LeadBlock, "LeadBlock");
		
		//MagicMetal
			MagicMetalOre = new BasicBlocks(Material.rock).setBlockName("MagicMetalOre").setBlockTextureName(Main.MODID + ":MagicMetalOre");
			GameRegistry.registerBlock(MagicMetalOre, "MagicMetalOre");

			MagicMetalBlock = new BasicBlocks(Material.iron).setBlockName("MagicMetalBlock").setBlockTextureName(Main.MODID + ":MagicMetalBlock");
			GameRegistry.registerBlock(MagicMetalBlock, "MagicMetalBlock");
		
		//Platin
			PlatinOre = new BasicBlocks(Material.rock).setBlockName("PlatinOre").setBlockTextureName(Main.MODID + ":PlatinOre");
			GameRegistry.registerBlock(PlatinOre, "PlatinOre");

			PlatinBlock = new BasicBlocks(Material.iron).setBlockName("PlatinBlock").setBlockTextureName(Main.MODID + ":PlatinBlock");
			GameRegistry.registerBlock(PlatinBlock, "PlatinBlock");
			
		//Machines
			
			blockWorkSurface = new WorkSurface().setBlockName("blockWorkSurface");
			GameRegistry.registerBlock(blockWorkSurface, "WorkSurface");
			
			blockCrusherIdle = new Crusher(false).setBlockName("blockCrusherIdle");
			blockCrusherActive = new Crusher(true).setBlockName("blockCrusherActive");

	}
}
