package it.coralmc.tebexpapi;


import com.google.gson.Gson;
import it.coralmc.tebexpapi.tebex.CommunityGoal;
import it.coralmc.tebexpapi.tebex.TebexAPI;

import java.io.IOException;

public class TestMain {

    public static void main(String[] args) throws IOException {
        String tebexSecret = "";

        TebexAPI api = new TebexAPI(tebexSecret);

        CommunityGoal goal = api.getCommunityGoal(32159);

        System.out.println(goal.getTarget());
    }
}
