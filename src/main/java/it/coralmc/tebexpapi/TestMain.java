package it.coralmc.tebexpapi;


import com.google.gson.Gson;
import it.coralmc.tebexpapi.tebex.communitygoals.CommunityGoal;
import it.coralmc.tebexpapi.tebex.TebexAPI;
import it.coralmc.tebexpapi.tebex.information.Information;
import it.coralmc.tebexpapi.tebex.listing.Category;
import it.coralmc.tebexpapi.tebex.listing.Listing;
import it.coralmc.tebexpapi.tebex.listing.Package;

import java.io.IOException;

public class TestMain {

    public static void main(String[] args) throws IOException {
        //String tebexSecret = Config.getConfig().tebexSecret;

        Gson gson = new Gson();

        String json = "{\"id\":32159,\"created_at\":\"2021-10-04 00:35:27\",\"updated_at\":\"2021-10-04 00:35:27\",\"account\":626846,\"name\":\"Test goal\",\"description\":\"<p>A test goal<\\/p>\",\"image\":\"\",\"target\":\"10.00\",\"current\":\"0.00\",\"repeatable\":0,\"last_achieved\":null,\"times_achieved\":0,\"status\":\"active\",\"sale\":0}";

        CommunityGoal goal = gson.fromJson(json, CommunityGoal.class);
        System.out.println(gson.toJson(goal));

        /*TebexAPI api = new TebexAPI(tebexSecret);

        CommunityGoal goal = api.getCommunityGoal(32159);
        Information info = api.getInformation();
        Listing listing = api.getListing();

        System.out.println(goal.getTarget());
        System.out.println(info.getServer().getName());
        for (Category cat : listing.getCategories()) {
            System.out.println(cat.getName());
            for (Package pack : cat.getPackages()) {
                System.out.println(pack.getName());
            }
        }*/
    }
}
