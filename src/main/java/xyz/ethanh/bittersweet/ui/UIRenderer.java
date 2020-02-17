package xyz.ethanh.bittersweet.ui;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.MinecraftClient;
import xyz.ethanh.bittersweet.BitterSweet;
import xyz.ethanh.bittersweet.utils.CPSHelper;
import xyz.ethanh.bittersweet.utils.YHelper;

public class UIRenderer {
  private MinecraftClient mc = MinecraftClient.getInstance();

  public void draw() {
    drawString("[FPS] " + mc.fpsDebugString.split("fps ")[0] + "fps ", 2, YHelper.y("fps"), 0xffffff);
    drawString(BitterSweet.CONFIG.get().getGeneral().isCoordsToggled() ? "[XYZ] " + Math.round(mc.player.getX()) + "/" + Math.round(mc.player.getY()) + "/" + Math.round(mc.player.getZ()) : "", 2, YHelper.y("xyz"), 0xffffff);
    GlStateManager.scaled(2.0, 2.0, 2.0);
    drawString(BitterSweet.CONFIG.get().getGeneral().isKeysToggled() ? "W" : "", 11, YHelper.y("keysW"), mc.options.keyForward.isPressed() ? 0x00ff00 : 0xff0000);
    drawString(BitterSweet.CONFIG.get().getGeneral().isKeysToggled() ? "S" : "", 11, YHelper.y("keysA"), mc.options.keyBack.isPressed() ? 0x00ff00 : 0xff0000);
    drawString(BitterSweet.CONFIG.get().getGeneral().isKeysToggled() ? "A" : "", 1, YHelper.y("keysS"), mc.options.keyLeft.isPressed() ? 0x00ff00 : 0xff0000);
    drawString(BitterSweet.CONFIG.get().getGeneral().isKeysToggled() ? "D": "", 21, YHelper.y("keysD"), mc.options.keyRight.isPressed() ? 0x00ff00 : 0xff0000);
    GlStateManager.scaled(0.5, 0.5, 0.5);
    drawString("Sprint", 2, YHelper.y("sprintorcps"), mc.player.isSprinting() ? 0x00ff00 : 0xff0000);
    drawString("CPS: " + CPSHelper.getClicks(), 6 + mc.textRenderer.getStringWidth("Sprint"), YHelper.y("sprintorcps"), CPSHelper.getClicks() > 0  ? 0x00ff00 : 0xff0000);
    drawString("Swinging", 2, YHelper.y("swinging"), mc.player.isHandSwinging ? 0x00ff00 : 0xff0000);
    drawString(BitterSweet.CONFIG.get().getGeneral().isArmorStatusToggled() ? "Helmet Durability: " + (mc.player.inventory.getArmorStack(3).getMaxDamage() - mc.player.inventory.getArmorStack(3).getDamage()) + "/" + mc.player.inventory.getArmorStack(3).getMaxDamage() : "", 2, YHelper.y("armorHelm"), mc.player.inventory.getArmorStack(3) != null ? getColorByCurrentAndMax(mc.player.inventory.getArmorStack(3).getMaxDamage() - mc.player.inventory.getArmorStack(3).getDamage(), mc.player.inventory.getArmorStack(3).getMaxDamage()) : 0xffffff);
    drawString(BitterSweet.CONFIG.get().getGeneral().isArmorStatusToggled() ? "Chestplate Durability: " + (mc.player.inventory.getArmorStack(2).getMaxDamage() - mc.player.inventory.getArmorStack(2).getDamage()) + "/" + mc.player.inventory.getArmorStack(2).getMaxDamage() : "", 2, YHelper.y("armorChest"), mc.player.inventory.getArmorStack(2) != null ? getColorByCurrentAndMax(mc.player.inventory.getArmorStack(2).getMaxDamage() - mc.player.inventory.getArmorStack(2).getDamage(), mc.player.inventory.getArmorStack(2).getMaxDamage()) : 0xffffff);
    drawString(BitterSweet.CONFIG.get().getGeneral().isArmorStatusToggled() ? "Leggings Durability: " + (mc.player.inventory.getArmorStack(1).getMaxDamage() - mc.player.inventory.getArmorStack(1).getDamage()) + "/" + mc.player.inventory.getArmorStack(1).getMaxDamage() : "", 2, YHelper.y("armorLeggings"), mc.player.inventory.getArmorStack(1) != null ? getColorByCurrentAndMax(mc.player.inventory.getArmorStack(1).getMaxDamage() - mc.player.inventory.getArmorStack(1).getDamage(), mc.player.inventory.getArmorStack(1).getMaxDamage()) : 0xffffff);
    drawString(BitterSweet.CONFIG.get().getGeneral().isArmorStatusToggled() ? "Boots Durability: " + (mc.player.inventory.getArmorStack(0).getMaxDamage() - mc.player.inventory.getArmorStack(0).getDamage()) + "/" + mc.player.inventory.getArmorStack(0).getMaxDamage() : "", 2, YHelper.y("armorBoots"), mc.player.inventory.getArmorStack(0) != null ? getColorByCurrentAndMax(mc.player.inventory.getArmorStack(0).getMaxDamage() - mc.player.inventory.getArmorStack(0).getDamage(), mc.player.inventory.getArmorStack(0).getMaxDamage()) : 0xffffff);
  }
  
  private int getColorByCurrentAndMax(int current, int max) {
    double currentD = (double)current;
    double maxD = (double)max;
    if (currentD / maxD >= 0.9)
      return 32768;
    if (currentD / maxD <= 0.9 && currentD / maxD >= 0.8)
      return 1017600;
    if (currentD / maxD <= 0.8 && currentD / maxD >= 0.7)
      return 6336256;
    if (currentD / maxD <= 0.7 && currentD / maxD >= 0.6)
      return 11195392;
    if (currentD / maxD <= 0.6 && currentD / maxD >= 0.5)
      return 14150400;
    if (currentD / maxD <= 0.5 && currentD / maxD >= 0.4)
      return 16580096;
    if (currentD / maxD <= 0.4 && currentD / maxD >= 0.3)
      return 16764160;
    if (currentD / maxD <= 0.3 && currentD / maxD >= 0.2)
      return 16756224;
    if (currentD / maxD <= 0.2 && currentD / maxD >= 0.1)
      return 16734720;
    if (currentD / maxD <= 0.1) {
      return 16711680;
    }
    return 0xffffff;
  }
  
  private void drawString(String text, float x, float y, int color) {
    mc.textRenderer.drawWithShadow(text, x, y, color);
  }

}
