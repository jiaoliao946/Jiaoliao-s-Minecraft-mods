package jiaoliao.ocean12.item;

import jiaoliao.ocean12.block.BlockRegistryHandler;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Objects;

@EventBusSubscriber
public class ItemRegistryHandler {
    public static final ItemClamShell CLAM_SHELL = new ItemClamShell();
    public static final ItemBlock ITEM_STRANGE_SAND = new
            MyItemBlock(BlockRegistryHandler.BLOCK_STRANGE_SAND);     //Define item-block
    @SubscribeEvent
    public static void onRegistry(Register<Item> event) {     //Register
        event.getRegistry().registerAll(     //Register all item at once
                CLAM_SHELL,      //Register clam_shell
                ITEM_STRANGE_SAND
        );
    }
    @SideOnly(Side.CLIENT)
    private static void setResourceLocation(Item item) {     //Simplify the registry of normal item's model
        ModelLoader.setCustomModelResourceLocation(item, 0,
                new ModelResourceLocation(Objects.requireNonNull(item.getRegistryName()), "inventory"));
    }
    @SubscribeEvent
    @SideOnly(Side.CLIENT)     //Only for client
    public static void onModelRegistry(ModelRegistryEvent event) {     //Set resource location
        CLAM_SHELL.setSubtypeResourceLocation(3);     //Set resource location to clam_shell
        setResourceLocation(ITEM_STRANGE_SAND);
    }
}
