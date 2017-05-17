package de.lukas.Blocks;

import de.lukas.mod.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TinOre extends Block{

	protected TinOre(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setHardness(2.0F);
		this.setHarvestLevel("pickaxe", 1);
		this.setCreativeTab(Main.tabMod);
	}

}
