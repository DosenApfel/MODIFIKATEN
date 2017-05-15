package de.lukas.Items;

import de.lukas.mod.Main;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class WandoftheDay extends Item{

	public WandoftheDay(){
		this.setCreativeTab(Main.tabMod);
		this.setUnlocalizedName("WandoftheDay");
		this.setTextureName(Main.MODID + ":WandoftheDay");
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player){
		
		world.setWorldTime(1000);
		return itemstack;
		
	}
	
	
	
}
