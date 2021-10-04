package it.coralmc.tebexpapi;

import it.coralmc.tebexpapi.parser.SubholderList;
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
        return SubholderList.getHolders().parseGlobal(params);
    }
}
