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
			
			GameRegistry.addRecipe(new ItemStack(BasicBlocks.PlatinBlock, 1), "XXX",
																				  "XXX",
                    															  "XXX",
                                         'X', new ItemStack(BasicItems.PlatinIngot));
		
	}
	
	
}
