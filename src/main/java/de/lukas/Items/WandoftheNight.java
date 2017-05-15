package de.lukas.Items;

import de.lukas.mod.Main;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class WandoftheNight extends Item{

	public WandoftheNight(){
		this.setCreativeTab(Main.tabMod);
		this.setUnlocalizedName("WandoftheNight");
		this.setTextureName(Main.MODID + ":WandoftheNight");
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player){
		
		world.setWorldTime(15000);
		return itemstack;
		
	}
	
	
	
}
