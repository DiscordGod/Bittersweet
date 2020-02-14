package xyz.ethanh.bittersweet.module.modules;

import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import xyz.ethanh.bittersweet.BitterSweet;
import xyz.ethanh.bittersweet.module.Category;
import xyz.ethanh.bittersweet.module.Module;

public class NoFall extends Module{
    
    public NoFall() {
        super("NoFall", Category.PLAYER);
    }

    public void playerTick() {
        ClientPlayerEntity player = mc.player;
		if(player.fallDistance <= 2) return;
		player.networkHandler.sendPacket(new PlayerMoveC2SPacket(true));
    }

    public void onEnable() {
        BitterSweet.CONFIG.get().getGeneral().setNoFallToggled(true);
    }

    public void onDisable() {
        BitterSweet.CONFIG.get().getGeneral().setNoFallToggled(false);
    }
}