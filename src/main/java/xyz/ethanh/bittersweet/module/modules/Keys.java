package xyz.ethanh.bittersweet.module.modules;

import xyz.ethanh.bittersweet.BitterSweet;
import xyz.ethanh.bittersweet.module.Category;
import xyz.ethanh.bittersweet.module.Module;

public class Keys extends Module {
  public Keys() {
    super("Keys", Category.RENDER);
  }

  public void onEnable() {
    BitterSweet.CONFIG.get().getGeneral().setKeysToggled(true);
  }

  public void onDisable() {
    BitterSweet.CONFIG.get().getGeneral().setKeysToggled(false);
  }

}
