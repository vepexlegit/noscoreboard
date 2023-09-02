package de.vepexlegit.noscoreboard.mixins;

import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.scoreboard.ScoreObjective;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GuiIngame.class)
public class MixinGuiIngame {
    @Inject(method = "renderScoreboard", at = { @At("HEAD") }, cancellable = true)
    private void renderScoreboard(final ScoreObjective objective, final ScaledResolution scaledRes, final CallbackInfo callbackInfo) {
        callbackInfo.cancel();
    }
}
