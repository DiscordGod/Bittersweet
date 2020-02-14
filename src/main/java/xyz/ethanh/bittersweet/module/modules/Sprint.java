package xyz.ethanh.bittersweet.module.modules;

import xyz.ethanh.bittersweet.BitterSweet;
import xyz.ethanh.bittersweet.module.Category;
import xyz.ethanh.bittersweet.module.Module;

public class Sprint extends Module {

    public Sprint() {
        super("Sprint", Category.MOVEMENT);
    }

    public void playerTick() {
        if(mc.player.getHungerManager().getFoodLevel() > 6.0F) {
            mc.player.setSprinting(true);
        }
    }

    public void onEnable() {
        BitterSweet.CONFIG.get().getGeneral().setSprintToggled(true);
    }

    public void onDisable() {
        if(mc.world != null) {
            mc.player.setSprinting(false);
        }
        BitterSweet.CONFIG.get().getGeneral().setSprintToggled(false);
    }

}