package de.lukas.mod;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import de.lukas.GUI.GuiHandler;

public class Handler {

	
	public static void ModHandler(){
		
		GameRegistry.registerWorldGenerator(new WorldGen(), 1);
		NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new GuiHandler());
		
	
	}
	
	
}
