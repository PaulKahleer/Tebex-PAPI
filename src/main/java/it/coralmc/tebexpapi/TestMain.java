package it.coralmc.tebexpapi;


import it.coralmc.tebexpapi.tebex.communitygoals.CommunityGoal;
import it.coralmc.tebexpapi.tebex.TebexAPI;
import it.coralmc.tebexpapi.tebex.information.Information;
import it.coralmc.tebexpapi.tebex.listing.Category;
import it.coralmc.tebexpapi.tebex.listing.Listing;
import it.coralmc.tebexpapi.tebex.listing.Package;

import java.io.IOException;

public class TestMain {

    public static void main(String[] args) throws IOException {
        String tebexSecret = Config.getConfig().tebexSecret;

        TebexAPI api = new TebexAPI(tebexSecret);

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
        }
    }
}
