package it.coralmc.tebexpapi.tebex;

import com.google.gson.Gson;
import it.coralmc.tebexpapi.Request;
import it.coralmc.tebexpapi.tebex.communitygoals.CommunityGoal;
import it.coralmc.tebexpapi.tebex.information.Information;
import it.coralmc.tebexpapi.tebex.listing.Listing;

import java.io.IOException;

public class TebexAPI {

    private String secret; //Tebex secret key
    private Gson gson = new Gson(); //Gson object for JSON parsing

    public TebexAPI(String secret) {
        this.secret = secret;
    }

    public CommunityGoal getCommunityGoal(int goalId) throws IOException {
        return this.getCommunityGoal(goalId+"");
    }
    public CommunityGoal getCommunityGoal(String goalId) throws IOException {
        Request.Response response = new Request("https://plugin.tebex.io/")
                .appendPath("community_goals")
                .appendPath(goalId)
                .setMethod(Request.Method.GET)
                .setHeader("X-Tebex-Secret", this.secret)
                .complete();

        return gson.fromJson(response.getContent(), CommunityGoal.class);
    }

    public Information getInformation() throws IOException {
        Request.Response response = new Request("https://plugin.tebex.io/")
                .appendPath("information")
                .setMethod(Request.Method.GET)
                .setHeader("X-Tebex-Secret", this.secret)
                .complete();

        return gson.fromJson(response.getContent(), Information.class);
    }

    public Listing getListing() throws IOException {
        Request.Response response = new Request("https://plugin.tebex.io/")
                .appendPath("listing")
                .setMethod(Request.Method.GET)
                .setHeader("X-Tebex-Secret", this.secret)
                .complete();

        return gson.fromJson(response.getContent(), Listing.class);
    }
}
