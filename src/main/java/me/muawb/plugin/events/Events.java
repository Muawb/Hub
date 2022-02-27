package me.muawb.plugin.events;

import me.muawb.plugin.Main;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.List;

public class Events implements Listener {

    private Main plugin;

    public Events(Main plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void onHub(Player e){
        Player p = e.getPlayer();

        if(p.isOnline()){
            Location loc = new Location(Bukkit.getWorld("pustoy"), -5.52, 8, 13.35);
            p.teleport(loc);

        }
    }
    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();

        if(p.isOnline()){
            Location loc = new Location(Bukkit.getWorld("pustoy"), -5.52, 8, 13.35);
            p.teleport(loc);
        }

    }
   
}
