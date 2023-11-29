package jiaoliao.ocean12.block;

import jiaoliao.ocean12.Ocean12;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockStrangeSand extends Block {
    public BlockStrangeSand() {
        super(Material.SAND);
        this.setUnlocalizedName(Ocean12.MODID + ".strangeSand");
        this.setRegistryName("strange_sand");
        this.setHarvestLevel("shovel", 0);     //Harvest level
        this.setHardness(0.5F);     //Hardness
        this.setResistance(0.5F / 3.0F);     //Explosion resistance(1/3)
    }
}