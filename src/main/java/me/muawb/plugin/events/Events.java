package me.muawb.plugin.events;

import me.muawb.plugin.Main;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;


public class Events implements Listener {

    private Main plugin;

    public Events(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
     Player p = e.getPlayer();
        if(p.isOnline()){
            String world = plugin.getConfig().getString("Settings.World");
            String x = plugin.getConfig().getString("Settings.Location.x");
            String y = plugin.getConfig().getString("Settings.Location.y");
            String z = plugin.getConfig().getString("Settings.Location.z");

            Location loc = new Location(Bukkit.getWorld(world),
                    Integer.parseInt(x),Integer.parseInt(y), Integer.parseInt(z));
            p.teleport(loc);
        }
    }
}

