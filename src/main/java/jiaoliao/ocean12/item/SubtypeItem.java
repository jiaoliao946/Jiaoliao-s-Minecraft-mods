package jiaoliao.ocean12.item;

import jiaoliao.ocean12.Ocean12;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class SubtypeItem extends Item     //The item that has subtype
{
    public SubtypeItem()
    {
        setHasSubtypes(true);     //State that this item has subtype
        setMaxDamage(0);     //Set max damage to 0 to prevent the bug that will copy this item
        setNoRepair();     //Prevent repairing this item
    }
    public ResourceLocation getSubtypeName(String meta)
    {
        return new ResourceLocation(this.getRegistryName().getResourceDomain(),
                this.getRegistryName().getResourcePath() + meta);
    }
    public void setSubtypeResourceLocation(int maxData)     //Set resource location to each subtype
    {
        for (int i = 0; i <= maxData; ++i)
        {
            String meta = Integer.toString(i);
            ModelLoader.setCustomModelResourceLocation(this, i,
                    new ModelResourceLocation(this.getSubtypeName(meta), "inventory"));
        }
    }
}

class ItemClamShell extends SubtypeItem     //Clam-Shell
{
    public ItemStack blue, green, yellow, red;
    public ItemClamShell()
    {
        this.blue = new ItemStack(this, 1, 0);
        this.green = new ItemStack(this, 1, 1);
        this.yellow = new ItemStack(this, 1, 2);
        this.red = new ItemStack(this, 1, 3);     //Set item-stack by metadata
        this.setUnlocalizedName(Ocean12.MODID + ".clamShell");
        this.setRegistryName("clam_shell");     //Set registry name
        this.setMaxStackSize(64);     //Set max stack size
    }
    @Override     //Overwrite get unlocalized name function
    public String getUnlocalizedName(ItemStack stack)
    {
        switch (stack.getMetadata())
        {
            case 0 :
                return this.getUnlocalizedName() + ".blue";
            case 1 :
                return this.getUnlocalizedName() + ".green";
            case 2 :
                return this.getUnlocalizedName() + ".yellow";
            default:
                return this.getUnlocalizedName() + ".red";     //Set different unlocalized name for different color
        }
    }
}
