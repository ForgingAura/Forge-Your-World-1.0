package forgingaura.forgeyourworld.fdecostuff.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class AndesiteBrickCracked extends Block{
	
	public AndesiteBrickCracked(String unlocalizedName) {
		super(Material.ROCK);
		setUnlocalizedName(unlocalizedName);
		setRegistryName(unlocalizedName);
		setHardness(3.0F);
		setHarvestLevel("pickaxe", 0);
	}

}
