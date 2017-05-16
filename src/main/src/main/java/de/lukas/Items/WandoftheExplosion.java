package de.lukas.Items;

import de.lukas.mod.Main;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class WandoftheExplosion extends Item{

	public WandoftheExplosion(){
		this.setCreativeTab(Main.tabMod);
		this.setUnlocalizedName("WandoftheExplosion");
		this.setTextureName(Main.MODID + ":WandoftheExplosion");
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player){
		
		world.createExplosion(player, 75.0, 57.0, 577.0, 4.0F, false);
		return itemstack;
		
	}
	
	
	
}
