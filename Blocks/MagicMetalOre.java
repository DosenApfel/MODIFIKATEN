package de.lukas.Blocks;

import de.lukas.mod.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class MagicMetalOre extends Block{

	protected MagicMetalOre(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setHardness(3.0F);
		this.setHarvestLevel("pickaxe", 2);
		this.setCreativeTab(Main.tabMod);
	}

}
