package xyz.ethanh.bittersweet.mixin;

import net.minecraft.client.render.GameRenderer;
import xyz.ethanh.bittersweet.event.Event;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Slice;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({GameRenderer.class})
public class MixinGameRenderer {
  @Inject(method = "render", slice = @Slice(from = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/hud/InGameHud;render(F)V")), at = @At(value = "INVOKE", ordinal = 0))
  private void renderOverlay(float tickDelta, long startTime, boolean tick, CallbackInfo callbackInfo) {
    Event.uiRenderer.draw();
  }
}
