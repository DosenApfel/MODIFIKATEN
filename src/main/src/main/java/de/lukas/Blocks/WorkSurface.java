package de.lukas.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import de.lukas.mod.Main;

public class WorkSurface extends Block {

	@SideOnly(Side.CLIENT)
	private IIcon workSurfaceTop;
	
	@SideOnly(Side.CLIENT)
	private IIcon workSurfaceBottom;
	
	
	public WorkSurface() {
		super(Material.wood);
		this.setCreativeTab(Main.tabMod);
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon (int side, int metadata) {
		return side == 1 ? this.workSurfaceTop : side == 0 ? this.workSurfaceBottom : this.blockIcon;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons (IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(Main.MODID + ":" + "WorkSurfaceSide");
		this.workSurfaceTop = iconRegister.registerIcon(Main.MODID + ":" + "WorkSurfaceTop");
		this.workSurfaceBottom = iconRegister.registerIcon(Main.MODID + ":" + "WorkSurfaceBottom");
	}
	
	public boolean onBlockActivated (World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
		
		if (!player.isSneaking()) {
			player.openGui(Main.instance, BasicBlocks.guiIDWorkSurface, world, x, y, z);
			return true;
		}else{
			return false;
		}
	}
	

}