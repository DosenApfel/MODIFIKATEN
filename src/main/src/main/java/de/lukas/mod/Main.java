package de.lukas.mod;

import com.google.common.base.Strings;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import de.lukas.Blocks.BasicBlocks;
import de.lukas.Items.BasicItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main {

    public static final String MODID = "Mod";
    public static final String MODNAME = "Mod";
    public static final String VERSION = "1.0.0";
    
    @Instance
    public static Main instance = new Main();
        
    //CreativeTabs
   public static final CreativeTabs tabMod = new CreativeTabs("tabMod"){
	   @Override public Item getTabIconItem(){
		   return BasicItems.WandoftheDay;
	   }
   };
     
   
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
    	
               BasicItems.Items();
               BasicBlocks.Blocks();
               Crafting.Craftings();
               Smelting.ModSmelting();
               Handler.ModHandler();
               
    }
        
    @EventHandler
    public void init(FMLInitializationEvent e) {
   
    	
    	
    }
        
    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
    	
    	
    
    }
}