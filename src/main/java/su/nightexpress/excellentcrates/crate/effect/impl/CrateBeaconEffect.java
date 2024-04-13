package su.nightexpress.excellentcrates.crate.effect.impl;

import org.bukkit.Location;
import org.jetbrains.annotations.NotNull;
import su.nightexpress.excellentcrates.crate.effect.AbstractEffect;
import su.nightexpress.nightcore.util.wrapper.UniParticle;

public class CrateBeaconEffect extends AbstractEffect {

    public CrateBeaconEffect() {
        super(3L, 40);
    }

    @Override
    public void doStep(@NotNull Location location, @NotNull UniParticle particle, int step) {
        double n2 = 0.8975979010256552 * step;
        for (int i = step; i > Math.max(0, step - 25); --i) {
            particle.play(getPointOnCircle(location, true, n2, 0.55, i * 0.75), 0.0f, 0.15f, 0.0f, 0.0f, 4);
        }
    }
}
