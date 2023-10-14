package jiaoliao.ocean12.item;

import jiaoliao.ocean12.Ocean12;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class SubtypeItem extends Item     //The item that has subtype
{
    public SubtypeItem()
    {
        setHasSubtypes(true);     //State that this item has subtype
        setMaxDamage(0);     //Set max damage to 0 to prevent the bug that will copy this item
        setNoRepair();     //Prevent repairing this item
    }
    public ResourceLocation getSubtypeName(String stack)
    {
        return new ResourceLocation(this.getRegistryName().getResourceDomain(), this.getRegistryName().getResourcePath() + stack);
    }
}

class ItemClamShell extends SubtypeItem
{
    public ItemClamShell()
    {
        this.setUnlocalizedName(Ocean12.MODID + ".clamShell");
        this.setRegistryName("clam_shell");
        this.setMaxStackSize(64);
    }
}
