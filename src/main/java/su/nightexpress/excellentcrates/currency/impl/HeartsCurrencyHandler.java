package su.nightexpress.excellentcrates.currency.impl;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import su.nightexpress.excellentcrates.CratesPlugin;
import su.nightexpress.excellentcrates.api.currency.CurrencyHandler;

public class HeartsCurrencyHandler implements CurrencyHandler {
    @Override
    public @NotNull String getDefaultName() {
        return "Hearts";
    }

    @Override
    public double getBalance(@NotNull Player player) {
        return CratesPlugin.lifeStealInstance.getPlayerHearts(player.getUniqueId());
    }

    @Override
    public void give(@NotNull Player player, double amount) {
        CratesPlugin.lifeStealInstance.addPlayerHearts(player.getUniqueId(), (int) amount);
    }

    @Override
    public void take(@NotNull Player player, double amount) {
        CratesPlugin.lifeStealInstance.removePlayerHearts(player.getUniqueId(), (int) amount, false);
    }

    @Override
    public void set(@NotNull Player player, double amount) {
        CratesPlugin.lifeStealInstance.setPlayerHearts(player.getUniqueId(), (int) amount);
    }
}
