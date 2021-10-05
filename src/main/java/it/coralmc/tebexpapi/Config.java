package it.coralmc.tebexpapi;

import com.google.gson.Gson;

import java.io.*;
import java.nio.charset.Charset;

public class Config {
    private String tebexSecret = "";
    private int cacheExpire = 30;

    public String getSecret() {
        return this.tebexSecret;
    }
    public int getExpire() {
        return this.cacheExpire;
    }

    private static Config instance;
    private Config() {}

    public static Config getConfig() throws IOException {
        Gson gson = new Gson();
        File configFile = new File("plugins/PlaceholderAPI/expansions/tebex_conf.json");

        if(!configFile.exists()) {
            Config newConf = new Config();
            String json = gson.toJson(newConf);

            if(configFile.createNewFile()) {
                FileWriter writer = new FileWriter(configFile);
                writer.write(json);
                writer.close();
            } else {
                System.out.println("!!!Failed to create TebexPAPI config file!!!");
            }

            return newConf;
        }
        else {
            BufferedReader reader = new BufferedReader(new FileReader(configFile, Charset.forName("UTF8")));
            String fullFile = "";
            try {
                String line;
                while((line = reader.readLine()) != null) {
                    fullFile += line;
                }
            } finally {
                reader.close();
            }

            instance = gson.fromJson(fullFile, Config.class);
        }

        return instance;
    }
}
