package jiaoliao.ocean12.item;

import jiaoliao.ocean12.Ocean12;
import net.minecraft.item.Item;


public class ItemClamShell extends Item
{
    public ItemClamShell()
    {
        this.setUnlocalizedName(Ocean12.MODID + ".clamShell");
        this.setRegistryName("clam_shell");
        this.setMaxStackSize(64);
    }
}
