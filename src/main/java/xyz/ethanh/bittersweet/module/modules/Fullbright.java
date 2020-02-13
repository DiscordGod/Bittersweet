package xyz.ethanh.bittersweet.module.modules;

import xyz.ethanh.bittersweet.BitterSweet;
import xyz.ethanh.bittersweet.module.Category;
import xyz.ethanh.bittersweet.module.Module;

public class Fullbright extends Module {

    public Fullbright() {
        super("Fullbright", Category.RENDER);
    }

    public void onEnable() {
        if(mc.options.gamma < 16f) mc.options.gamma = 16f;
        BitterSweet.CONFIG.get().getGeneral().setFullbrightToggled(true);
    }

    public void onDisable() {
        if(mc.options.gamma == 16f) mc.options.gamma = .5f;
        BitterSweet.CONFIG.get().getGeneral().setFullbrightToggled(false);
    }

}