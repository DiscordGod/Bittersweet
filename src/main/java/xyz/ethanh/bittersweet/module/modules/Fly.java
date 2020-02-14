package xyz.ethanh.bittersweet.module.modules;

import xyz.ethanh.bittersweet.BitterSweet;
import xyz.ethanh.bittersweet.module.Category;
import xyz.ethanh.bittersweet.module.Module;

public class Fly extends Module {

    public Fly() {
        super("Fly", Category.MOVEMENT);
    }

    public void playerTick() {
        mc.player.abilities.allowFlying = true;
    }

    public void onEnable() {
        BitterSweet.CONFIG.get().getGeneral().setFlyToggled(true);
    }

    public void onDisable() {
        mc.player.abilities.allowFlying = false;
        BitterSweet.CONFIG.get().getGeneral().setFlyToggled(false);
    }

}