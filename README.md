# Tebex-PAPI
PlaceholderAPI placeholders for Tebex stores

# Setup
This is a PlaceholderAPI expansion, and as a result [PlaceholderAPI](https://www.spigotmc.org/resources/placeholderapi.6245/) is required.
To use this expansion,
1. place the jar into `/plugins/PlaceholderAPI/expansions/`
2. Start the server OR reload PlaceholderAPI using `/papi reload`
3. Edit the `tebex_conf.json` found inside `/plugins/PlaceholderAPI/expansions/`
    - Set the `tebexSecret` to your tebex game server secret key found [here](https://server.tebex.io/game-servers)
    - Change the `cacheExpire` if the default causes problems
4. Reload PlaceholderAPI again or restart the server to reload the config

# Placeholders
Every placeholder begins with `%tebex_` as `tebex` is the PlaceholderAPI identifier

## Goals
Tebex lets you feature donation goals, and this extension allows you to pull information about community goals directly in placeholders.

Here is an example API response from the Tebex [documentation](https://docs.tebex.io/plugin/endpoints/community-goals).

```
[
   {
       "id": 4,
       "created_at": "2019-03-13 13:11:57",
       "updated_at": "2019-04-09 10:59:26",
       "account": 55,
       "name": "Demo Community Goal",
       "description": "<p>Demo Community Goal</p>",
       "image": "",
       "target": "100.00",
       "current": "72.00",
       "repeatable": 0,
       "last_achieved": null,
       "times_achieved": 0,
       "status": "active",
       "sale": 0
   }
]
```
We can easily read all of this data in our placeholder by following this format:

```%tebex_communitygoals_{goalId}_{property}```

So, if we wanted to get the target for the goal (which would be 100.00 for this example), we would do `%tebex_communitygoals_4_target%`, which would be replaced with `100.00`