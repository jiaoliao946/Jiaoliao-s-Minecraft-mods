package jiaoliao.ocean12.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

@EventBusSubscriber
public class ItemRegistryHandler
{
    public static final ItemClamShell CLAM_SHELL = new ItemClamShell();
    @SubscribeEvent
    public static void onRegistry(Register<Item> event)
    {
        IForgeRegistry<Item> registry = event.getRegistry();
        registry.register(CLAM_SHELL);
    }
    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void onModelRegistry(ModelRegistryEvent event)
    {
        ModelLoader.setCustomModelResourceLocation(CLAM_SHELL, 0, new ModelResourceLocation(CLAM_SHELL.getRegistryName(), "inventory"));
    }
}
