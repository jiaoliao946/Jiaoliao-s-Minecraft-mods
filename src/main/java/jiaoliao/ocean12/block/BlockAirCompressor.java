package jiaoliao.ocean12.block;

import jiaoliao.ocean12.Ocean12;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockAirCompressor extends Block {
    public BlockAirCompressor() {
        super(Material.IRON);
        this.setUnlocalizedName(Ocean12.MODID + ".airCompressor");
        this.setRegistryName("air_compressor");
        this.setHarvestLevel("pickaxe", 2);
        this.setHardness(5.0F);
        this.setResistance(5.0F / 3.0F);     //Set explosion resistance(1/3)
    }
}