package de.vepexlegit.noscoreboarddebug.mixins;

import de.vepexlegit.noscoreboarddebug.NoScoreBoard;
import de.vepexlegit.noscoreboarddebug.command.NoScoreBoardCommand;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraftforge.client.ClientCommandHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GuiIngame.class)
public class MixinGuiIngame {
    @Inject(method = "updateTick", at = @At("RETURN"))
    private void startGame(final CallbackInfo ci) {
        ClientCommandHandler.instance.registerCommand(new NoScoreBoardCommand());
    }

    @Inject(method = "renderScoreboard", at = @At("HEAD"), cancellable = true)
    private void renderScoreboard(final ScoreObjective objective, final ScaledResolution scaledRes, final CallbackInfo callbackInfo) {
        if (NoScoreBoard.INSTANCE.isEnabled()) {
            callbackInfo.cancel();
        }
    }
}
