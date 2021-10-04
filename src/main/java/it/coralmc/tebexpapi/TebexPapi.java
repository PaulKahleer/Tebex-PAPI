package it.coralmc.tebexpapi;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.OfflinePlayer;

public class TebexPapi extends PlaceholderExpansion {

    @Override
    public String getIdentifier() {
        return "tebex";
    }

    @Override
    public String getAuthor() {
        return "DisabledMallis";
    }

    @Override
    public String getVersion() {
        return "1.0";
    }

    @Override
    public String onRequest(OfflinePlayer player, String params) {
        String[] args = params.split("_");
        String endpoint = args[0];
    }
}
