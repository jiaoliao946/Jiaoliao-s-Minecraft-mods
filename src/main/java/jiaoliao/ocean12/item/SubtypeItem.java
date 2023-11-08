package jiaoliao.ocean12.item;

import jiaoliao.ocean12.Ocean12;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Objects;

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
        return new ResourceLocation(Objects.requireNonNull(this.getRegistryName()).getResourceDomain(),
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
    public ItemClamShell()
    {
        this.setUnlocalizedName(Ocean12.MODID + ".clamShell");
        this.setRegistryName("clam_shell");     //Set registry name
        this.setMaxStackSize(64);     //Set max stack size
    }
    @Override     //Overwrite get subtype item function
    @ParametersAreNonnullByDefault     //Parameters are nullable
    public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
    {
        if(this.isInCreativeTab(tab))
        {
            for(int i = 0; i < 4; ++i)
            {
                items.add(new ItemStack(this, 1, i));
            }
        }
    }
    @Override     //Overwrite get unlocalized name function
    @Nonnull     //Can't return null
    public String getUnlocalizedName(ItemStack stack)
    {
        switch (stack.getMetadata())
        {
            case 0 : return this.getUnlocalizedName() + ".blue";
            case 1 : return this.getUnlocalizedName() + ".green";
            case 2 : return this.getUnlocalizedName() + ".yellow";
            default : return this.getUnlocalizedName() + ".red";     //Set different unlocalized name for different color
        }
    }
}
