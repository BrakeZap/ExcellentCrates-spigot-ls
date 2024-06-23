package su.nightexpress.excellentcrates.currency.impl;

import org.jetbrains.annotations.NotNull;
import su.nightexpress.excellentcrates.Placeholders;
import su.nightexpress.excellentcrates.api.currency.Currency;
import su.nightexpress.excellentcrates.api.currency.CurrencyHandler;
import su.nightexpress.nightcore.util.StringUtil;
import su.nightexpress.nightcore.util.placeholder.PlaceholderMap;

public class HeartsCurrency implements Currency {

    private final String          id;
    private final String          name;
    private final String          format;
    private final CurrencyHandler handler;
    private final PlaceholderMap  placeholderMap;

    public HeartsCurrency(boolean enabled, @NotNull String id, @NotNull String name, @NotNull String format, @NotNull CurrencyHandler handler) {
        this.id = StringUtil.lowerCaseUnderscore(id);
        this.name = name;
        this.format = format;
        this.handler = handler;
        this.placeholderMap = Placeholders.forCurrency(this);
    }
    @Override
    public @NotNull CurrencyHandler getHandler() {
        return handler;
    }

    @Override
    public @NotNull String getId() {
        return id;
    }

    @Override
    public @NotNull String getName() {
        return name;
    }

    @Override
    public @NotNull String getFormat() {
        return format;
    }

    @Override
    public @NotNull PlaceholderMap getPlaceholders() {
        return placeholderMap;
    }
}
