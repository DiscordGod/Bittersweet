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
	private static final Identifier FLY_KEYBIND = new Identifier("bittersweet", "fly");
	private static final Identifier NOFALL_KEYBIND = new Identifier("bittersweet", "nofall");
	private static final Identifier COORDS_KEYBIND = new Identifier("bittersweet", "coords");
	private static final Identifier KEYS_KEYBIND = new Identifier("bittersweet", "keys");
	private static final Identifier ARMORSTATUS_KEYBIND = new Identifier("bittersweet", "armorstatus");
	private static FabricKeyBinding sprint;
	private static FabricKeyBinding fullbright;
	private static FabricKeyBinding fly;
	private static FabricKeyBinding nofall;
	private static FabricKeyBinding coords;
	private static FabricKeyBinding keys;
	private static FabricKeyBinding armorStatus;

  	public void onInitializeClient() {
		KeyBindingRegistryImpl.INSTANCE.addCategory(KEYBIND_CATEGORY);
		KeyBindingRegistryImpl.INSTANCE.register(sprint = FabricKeyBinding.Builder.create(SPRINT_KEYBIND, InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_B, KEYBIND_CATEGORY).build());
		KeyBindingRegistryImpl.INSTANCE.register(fullbright = FabricKeyBinding.Builder.create(FULLBRIGHT_KEYBIND, InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_V, KEYBIND_CATEGORY).build());
		KeyBindingRegistryImpl.INSTANCE.register(fly = FabricKeyBinding.Builder.create(FLY_KEYBIND, InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_N, KEYBIND_CATEGORY).build());
		KeyBindingRegistryImpl.INSTANCE.register(nofall = FabricKeyBinding.Builder.create(NOFALL_KEYBIND, InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_M, KEYBIND_CATEGORY).build());
		KeyBindingRegistryImpl.INSTANCE.register(coords = FabricKeyBinding.Builder.create(COORDS_KEYBIND, InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_L, KEYBIND_CATEGORY).build());
		KeyBindingRegistryImpl.INSTANCE.register(keys = FabricKeyBinding.Builder.create(KEYS_KEYBIND, InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_P, KEYBIND_CATEGORY).build());
		KeyBindingRegistryImpl.INSTANCE.register(armorStatus = FabricKeyBinding.Builder.create(ARMORSTATUS_KEYBIND, InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_O, KEYBIND_CATEGORY).build());
    	System.out.println("BitterSweet Client Class Initialized");
  	}
  
  	public static void handleKeybinds() {
    	if ((sprint == null) || (fullbright == null) || (fly == null) || (nofall == null) || (coords == null) || (keys == null) || (armorStatus == null)) {
    	  	return;
    	}
    	while (sprint.wasPressed()) {
    		ToggleUtil.toggle(Event.moduleManager.sprint);
    	}
    	while (fullbright.wasPressed()) {
    		ToggleUtil.toggle(Event.moduleManager.fullbright);
    	}
    	while (keys.wasPressed()) {
    		ToggleUtil.toggle(Event.moduleManager.keys);
    	}
    	while (armorStatus.wasPressed()) {
    		ToggleUtil.toggle(Event.moduleManager.armorStatus);
    	}
    	while (coords.wasPressed()) {
    		ToggleUtil.toggle(Event.moduleManager.coords);
    	}
    	while (fly.wasPressed() && (BitterSweet.CONFIG.get().getGeneral().areCheatsToggled() == true)) {
    		ToggleUtil.toggle(Event.moduleManager.fly);
    	}
    	while (nofall.wasPressed() && (BitterSweet.CONFIG.get().getGeneral().areCheatsToggled() == true)) {
    		ToggleUtil.toggle(Event.moduleManager.nofall);
    	}
  }
}
