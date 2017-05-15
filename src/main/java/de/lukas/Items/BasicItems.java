package de.lukas.Items;

import cpw.mods.fml.common.registry.GameRegistry;
import de.lukas.mod.Main;
import net.minecraft.item.Item;

public class BasicItems extends Item{

	//Items
	
	//ZauberStäbe
		public static Item WandoftheDay;
		public static Item WandoftheNight;
		public static Item WandoftheExplosion;
		
	//Ingots/Materials
		public static Item CopperIngot;
		public static Item CopperDust;
		public static Item TinIngot;
		public static Item TinDust;
		public static Item LeadIngot;
		public static Item LeadDust;
		public static Item MagicMetalIngot;
		public static Item MagicMetalDust;
		public static Item PlatinIngot;
		public static Item PlatinDust;
	
	public static void Items(){
		
		//WandoftheDay
			WandoftheDay = new WandoftheDay();
			GameRegistry.registerItem(WandoftheDay, "WandoftheDay");
		//WandoftheNight
			WandoftheNight = new WandoftheNight();
			GameRegistry.registerItem(WandoftheNight, "WandoftheNight");
		//WandoftheExplosion
			WandoftheExplosion = new WandoftheExplosion();
			GameRegistry.registerItem(WandoftheExplosion, "WandoftheExplosion");
		//Copper
			CopperIngot = new BasicItems().setCreativeTab(Main.tabMod).setUnlocalizedName("CopperIngot").setTextureName(Main.MODID + ":CopperIngot");
			GameRegistry.registerItem(CopperIngot, "CopperIngot");
			
			CopperDust = new BasicItems().setCreativeTab(Main.tabMod).setUnlocalizedName("CopperDust").setTextureName(Main.MODID + ":CopperDust");
			GameRegistry.registerItem(CopperDust, "CopperDust");
		//Tin
			TinIngot = new BasicItems().setCreativeTab(Main.tabMod).setUnlocalizedName("TinIngot").setTextureName(Main.MODID + ":TinIngot");
			GameRegistry.registerItem(TinIngot, "TinIngot");

			TinDust = new BasicItems().setCreativeTab(Main.tabMod).setUnlocalizedName("TinDust").setTextureName(Main.MODID + ":TinDust");
			GameRegistry.registerItem(TinDust, "TinDust");
		//Lead
			LeadIngot = new BasicItems().setCreativeTab(Main.tabMod).setUnlocalizedName("LeadIngot").setTextureName(Main.MODID + ":LeadIngot");
			GameRegistry.registerItem(LeadIngot, "LeadIngot");

			LeadDust = new BasicItems().setCreativeTab(Main.tabMod).setUnlocalizedName("LeadDust").setTextureName(Main.MODID + ":LeadDust");
			GameRegistry.registerItem(LeadDust, "LeadDust");
			
		//MagicMetal
			MagicMetalIngot = new BasicItems().setCreativeTab(Main.tabMod).setUnlocalizedName("MagicMetalIngot").setTextureName(Main.MODID + ":MagicMetalIngot");
			GameRegistry.registerItem(MagicMetalIngot, "MagicMetalIngot");

			MagicMetalDust = new BasicItems().setCreativeTab(Main.tabMod).setUnlocalizedName("MagicMetalDust").setTextureName(Main.MODID + ":MagicMetalDust");
			GameRegistry.registerItem(MagicMetalDust, "MagicMetalDust");
			
		//MagicMetal
			PlatinIngot = new BasicItems().setCreativeTab(Main.tabMod).setUnlocalizedName("PlatinIngot").setTextureName(Main.MODID + ":PlatinIngot");
			GameRegistry.registerItem(PlatinIngot, "PlatinIngot");

			PlatinDust = new BasicItems().setCreativeTab(Main.tabMod).setUnlocalizedName("PlatinDust").setTextureName(Main.MODID + ":PlatinDust");
			GameRegistry.registerItem(PlatinDust, "PlatinDust");	
			
	}
	
	
}
