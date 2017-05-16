package de.lukas.mod;

import cpw.mods.fml.common.registry.GameRegistry;
import de.lukas.Blocks.BasicBlocks;
import de.lukas.Items.BasicItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Crafting {

	
	public static void Craftings(){
		
		//Blocks
			GameRegistry.addRecipe(new ItemStack(BasicBlocks.CopperBlock, 1), "XXX",
																			  "XXX",
																			  "XXX",
			'X', new ItemStack(BasicItems.CopperIngot));
			
			GameRegistry.addRecipe(new ItemStack(BasicBlocks.TinBlock, 1), "XXX",
					                                                       "XXX",
					                                                       "XXX",
            'X', new ItemStack(BasicItems.TinIngot));
			
			GameRegistry.addRecipe(new ItemStack(BasicBlocks.LeadBlock, 1), "XXX",
					                                                       "XXX",
					                                                       "XXX",
			'X', new ItemStack(BasicItems.LeadIngot));
			
			GameRegistry.addRecipe(new ItemStack(BasicBlocks.MagicMetalBlock, 1), "XXX",
                                                                                  "XXX",
                                                                                  "XXX",
            'X', new ItemStack(BasicItems.MagicMetalIngot));
			
			GameRegistry.addRecipe(new ItemStack(BasicBlocks.PlatinBlock, 1),     "XXX",
																				  "XXX",
                    															  "XXX",
                                         'X', new ItemStack(BasicItems.PlatinIngot));
			
			//Blocks to Ingot
			GameRegistry.addShapelessRecipe(new ItemStack(BasicItems.CopperIngot, 9), new ItemStack(BasicBlocks.CopperBlock));
			GameRegistry.addShapelessRecipe(new ItemStack(BasicItems.TinIngot, 9), new ItemStack(BasicBlocks.TinBlock));
			GameRegistry.addShapelessRecipe(new ItemStack(BasicItems.LeadIngot, 9), new ItemStack(BasicBlocks.LeadBlock));
			GameRegistry.addShapelessRecipe(new ItemStack(BasicItems.MagicMetalIngot, 9), new ItemStack(BasicBlocks.MagicMetalBlock));
			GameRegistry.addShapelessRecipe(new ItemStack(BasicItems.PlatinIngot, 9), new ItemStack(BasicBlocks.PlatinBlock));
			
			//WorkSurface
			GameRegistry.addRecipe(new ItemStack(BasicBlocks.blockWorkSurface, 1), "CMC",
																				   "PWP",
																				   "PCP",
			'C', new ItemStack(BasicBlocks.CopperBlock),
			'W', new ItemStack(Blocks.crafting_table),
			'P', new ItemStack(BasicBlocks.PlatinBlock),
			'M', new ItemStack(BasicBlocks.MagicMetalBlock));
		
	}
	
	
}
