package xyz.ethanh.bittersweet.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.Mouse;
import xyz.ethanh.bittersweet.utils.CPSHelper;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({Mouse.class})
public class MixinMouseClick
{
  @Inject(method={"onMouseButton"}, at={@At("TAIL")})
  private void onMouseButton(CallbackInfo callbackInfo)
  {
    if (MinecraftClient.getInstance().mouse.wasLeftButtonClicked()) {
      CPSHelper.addClick();
    }
  }
}
