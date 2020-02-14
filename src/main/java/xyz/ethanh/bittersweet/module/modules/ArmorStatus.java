package xyz.ethanh.bittersweet.module.modules;

import xyz.ethanh.bittersweet.BitterSweet;
import xyz.ethanh.bittersweet.module.Category;
import xyz.ethanh.bittersweet.module.Module;

public class ArmorStatus extends Module {
  public ArmorStatus() {
    super("Armor Status", Category.RENDER);
  }

  public void onEnable() {
    BitterSweet.CONFIG.get().getGeneral().setArmorStatusToggled(true);
  }

  public void onDisable() {
    BitterSweet.CONFIG.get().getGeneral().setArmorStatusToggled(false);
  }

}
