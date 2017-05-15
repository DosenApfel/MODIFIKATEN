package de.lukas.mod;

import cpw.mods.fml.common.registry.GameRegistry;

public class Handler {

	
	public static void ModHandler(){
		
		GameRegistry.registerWorldGenerator(new WorldGen(), 1);
	
	}
	
	
}
