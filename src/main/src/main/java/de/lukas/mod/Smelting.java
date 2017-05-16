package de.lukas.mod;

import cpw.mods.fml.common.registry.GameRegistry;
import de.lukas.Blocks.BasicBlocks;
import de.lukas.Items.BasicItems;
import net.minecraft.item.ItemStack;

public class Smelting {

	
	
	
	
	public static void ModSmelting(){
		
		//Erze
		GameRegistry.addSmelting(new ItemStack(BasicBlocks.CopperOre), new ItemStack(BasicItems.CopperIngot), 1.0F);
		GameRegistry.addSmelting(new ItemStack(BasicBlocks.TinOre), new ItemStack(BasicItems.TinIngot), 1.0F);
		GameRegistry.addSmelting(new ItemStack(BasicBlocks.LeadOre), new ItemStack(BasicItems.LeadIngot), 1.0F);
		GameRegistry.addSmelting(new ItemStack(BasicBlocks.MagicMetalOre), new ItemStack(BasicItems.MagicMetalIngot), 2.0F);
		GameRegistry.addSmelting(new ItemStack(BasicBlocks.PlatinOre), new ItemStack(BasicItems.PlatinIngot), 3.0F);
		
		
	}
	
	
}
