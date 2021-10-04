package it.coralmc.tebexpapi.parser;

import java.util.ArrayList;

public class SubholderList {

    private ArrayList<ParsedHolder> placeholders;

    public SubholderList() {
        placeholders = new ArrayList<>();

        registerHolder(new CommunityGoalsHolder());
    }

    public void registerHolder(ParsedHolder holder) {
        this.placeholders.add(holder);
    }

    public ArrayList<ParsedHolder> getPlaceholders() {
        return this.placeholders;
    }

    public String parseGlobal(String placeholder) {
        String identifier = placeholder.split("_")[0];
        String args = placeholder.replaceAll(identifier+"_", "");

        for(ParsedHolder holder : getPlaceholders()) {
            if(holder.getIdentifier().equals(identifier)) {
                return holder.parsePlaceholder(args);
            }
        }
    }
}
