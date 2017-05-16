package de.lukas.GUI;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import de.lukas.Blocks.BasicBlocks;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,	int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		
	    //WorkSurface
		if(ID == BasicBlocks.guiIDWorkSurface) {
			return ID == BasicBlocks.guiIDWorkSurface && world.getBlock(x, y, z) == BasicBlocks.blockWorkSurface ? new ContainerWorkSurface(player.inventory, world, x, y, z) : null;
		}
		
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,	int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
	
		//WorkSurface
		if(ID == BasicBlocks.guiIDWorkSurface) {
			return ID == BasicBlocks.guiIDWorkSurface && world.getBlock(x, y, z) == BasicBlocks.blockWorkSurface ? new GuiWorkSurface(player.inventory, world, x, y, z) : null;
		}
		
		return null;
	}

}