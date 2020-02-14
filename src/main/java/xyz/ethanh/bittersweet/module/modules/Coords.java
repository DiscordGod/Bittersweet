package xyz.ethanh.bittersweet.module.modules;

import xyz.ethanh.bittersweet.BitterSweet;
import xyz.ethanh.bittersweet.module.Category;
import xyz.ethanh.bittersweet.module.Module;

public class Coords extends Module {

    public Coords() {
        super("Coords", Category.RENDER);
    }

    public void onEnable() {
        BitterSweet.CONFIG.get().getGeneral().setCoordsToggled(true);
    }

    public void onDisable() {
        BitterSweet.CONFIG.get().getGeneral().setCoordsToggled(false);
    }

}
