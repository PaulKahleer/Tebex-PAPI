package it.coralmc.tebexpapi.parser;

import it.coralmc.tebexpapi.Config;
import it.coralmc.tebexpapi.tebex.TebexAPI;
import it.coralmc.tebexpapi.tebex.communitygoals.CommunityGoal;

import java.io.IOException;
import java.lang.reflect.Field;

public class CommunityGoalsHolder implements ParsedHolder {
    @Override
    public String getIdentifier() {
        return "communitygoals";
    }

    @Override
    public String parsePlaceholder(String toParse) {
        String[] split = toParse.split("_");
        String goalId = split[0];
        String property = split[1];

        try {
            TebexAPI api = new TebexAPI(Config.getConfig().getSecret());
            CommunityGoal goal = api.getCommunityGoal(goalId);
            Field field = CommunityGoal.class.getDeclaredField(property);
            field.setAccessible(true);
            return String.valueOf(field.get(goal));
        } catch (IOException | NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }
}
