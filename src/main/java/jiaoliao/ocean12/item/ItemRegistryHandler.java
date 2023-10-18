package jiaoliao.ocean12.item;

import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@EventBusSubscriber
public class ItemRegistryHandler
{
    public static final ItemClamShell CLAM_SHELL = new ItemClamShell();
    @SubscribeEvent
    public static void onRegistry(Register<Item> event)     //Register
    {
        event.getRegistry().registerAll(     //Register all item at once
                CLAM_SHELL     //Register clam_shell
        );
    }
    @SubscribeEvent
    @SideOnly(Side.CLIENT)     //Only for client
    public static void onModelRegistry(ModelRegistryEvent event)     //Set resource location
    {
        CLAM_SHELL.setSubtypeResourceLocation(3);     //Set resource location to clam_shell
    }
}
