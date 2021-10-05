package it.coralmc.tebexpapi;

import it.coralmc.tebexpapi.parser.SubholderList;
import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;

public class TebexPapi extends PlaceholderExpansion {
    public TebexPapi() {
        Bukkit.getLogger().info("Loading TebexPAPI expansion...");
        try {
            Config conf = Config.getConfig();
            Bukkit.getLogger().info("Loaded TebexPAPI config");

            Bukkit.getLogger().info("Loaded TebexPAPI expansion!");
        } catch (Exception ex) {
            Bukkit.getLogger().warning("Failed to load TebexPAPI extension! Tebex placeholders will not work!");
        }
    }

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
