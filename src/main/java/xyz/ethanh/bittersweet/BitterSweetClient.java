package xyz.ethanh.bittersweet;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.keybinding.FabricKeyBinding;
import net.fabricmc.fabric.impl.client.keybinding.KeyBindingRegistryImpl;
import net.minecraft.client.util.InputUtil;
import net.minecraft.util.Identifier;
import xyz.ethanh.bittersweet.event.Event;
import xyz.ethanh.bittersweet.module.ToggleUtil;

import org.lwjgl.glfw.GLFW;

public class BitterSweetClient implements ClientModInitializer {
	
	private static final String KEYBIND_CATEGORY = "key.bittersweet.category";
	private static final Identifier SPRINT_KEYBIND = new Identifier("bittersweet", "sprint");
	private static final Identifier FULLBRIGHT_KEYBIND = new Identifier("bittersweet", "fullbright");
	private static FabricKeyBinding sprint;
	private static FabricKeyBinding fullbright;

  	public void onInitializeClient() {
		KeyBindingRegistryImpl.INSTANCE.addCategory(KEYBIND_CATEGORY);
		KeyBindingRegistryImpl.INSTANCE.register(sprint = FabricKeyBinding.Builder.create(SPRINT_KEYBIND, InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_B, KEYBIND_CATEGORY).build());
		KeyBindingRegistryImpl.INSTANCE.register(fullbright = FabricKeyBinding.Builder.create(FULLBRIGHT_KEYBIND, InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_V, KEYBIND_CATEGORY).build());
    	System.out.println("BitterSweet Client Class Initialized");
  	}
  
  	public static void handleKeybinds() {
    	if ((sprint == null) || (fullbright == null)) {
    	  	return;
    	}
    	while (sprint.wasPressed()) {
    		ToggleUtil.toggle(Event.moduleManager.sprint);
    	}
    	while (fullbright.wasPressed()) {
    		ToggleUtil.toggle(Event.moduleManager.fullbright);
    	}
  }
}
