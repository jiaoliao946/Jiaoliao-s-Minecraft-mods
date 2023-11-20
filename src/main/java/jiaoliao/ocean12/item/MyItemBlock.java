package jiaoliao.ocean12.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

import java.util.Objects;

public class MyItemBlock extends ItemBlock {
    public MyItemBlock(Block block) {     //There is no default constructor available in ItemBlock
        super(block);
        this.setRegistryName(Objects.requireNonNull(block.getRegistryName()));     //Set registry name
    }
}
