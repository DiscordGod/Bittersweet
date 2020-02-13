package xyz.ethanh.bittersweet.mixin;

import xyz.ethanh.bittersweet.BitterSweetClient;
import xyz.ethanh.bittersweet.event.Event;

import net.minecraft.client.MinecraftClient;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({MinecraftClient.class})
public class MixinMinecraftClient
{
  @Inject(method={"tick"}, at={@At("TAIL")})
  private void clientTick(CallbackInfo callbackInfo) {
    Event.clientTick();
  }
  
  @Inject(method={"handleInputEvents"}, at={@At("TAIL")})
  private void handleKeybinds(CallbackInfo callbackInfo) {
    BitterSweetClient.handleKeybinds();
  }

}
