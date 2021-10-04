package it.coralmc.tebexpapi.parser;

public class CommunityGoalsHolder implements ParsedHolder {
    @Override
    public String getIdentifier() {
        return "communitygoals";
    }

    @Override
    public String parsePlaceholder(String toParse) {
        return null;
    }
}
