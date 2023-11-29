package jiaoliao.ocean12.block;

import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class BlockRegistryHandler {
    public static final BlockStrangeSand BLOCK_STRANGE_SAND = new BlockStrangeSand();
    @SubscribeEvent
    public static void onRegistry(Register<Block> event) {
        event.getRegistry().registerAll(
                BLOCK_STRANGE_SAND
        );
    }
}