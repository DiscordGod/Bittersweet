package xyz.ethanh.bittersweet;

import java.io.File;

import com.google.gson.GsonBuilder;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.util.Identifier;
import xyz.ethanh.bittersweet.config.BitterSweetConfig;
import xyz.ethanh.bittersweet.config.JsonConfig;
import xyz.ethanh.bittersweet.event.Event;

public class BitterSweet implements ModInitializer {
	
	public static final JsonConfig<BitterSweetConfig> CONFIG = new JsonConfig<>("bittersweet" + "/" + "bittersweet", BitterSweetConfig.class)
			.withGson(new GsonBuilder()
				.setPrettyPrinting()
				.registerTypeAdapter(Identifier.class, new Identifier.Serializer())
				.create()
			);

	public void onInitialize() {
		new File(FabricLoader.getInstance().getConfigDirectory(), "bittersweet").mkdir();
		BitterSweet.CONFIG.save();
		Event.init();
		Event.moduleManager.sprint.setEnabled(BitterSweet.CONFIG.get().getGeneral().isSprintToggled());
		System.out.println("BitterSweet Class Initialized");
	}

	public static void handleKeybinds() {
	}
}
