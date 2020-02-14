package xyz.ethanh.bittersweet.event;

import net.minecraft.client.MinecraftClient;
import xyz.ethanh.bittersweet.module.Module;
import xyz.ethanh.bittersweet.module.ModuleManager;
import xyz.ethanh.bittersweet.ui.UIRenderer;

public class Event {
    public static ModuleManager moduleManager;
    public static UIRenderer uiRenderer;
  
    public static void init() {
        moduleManager = new ModuleManager();
        uiRenderer = new UIRenderer();
        moduleManager.init();
    }
  
    public static void clientTick() {
        for (Module module : moduleManager.getEnabledModules()) {
            if (MinecraftClient.getInstance().player != null) {
                module.playerTick();
            }
            module.clientTick();
        }
    }
}