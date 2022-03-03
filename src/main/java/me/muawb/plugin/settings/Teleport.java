package me.muawb.plugin.settings;

import me.muawb.plugin.Main;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;


public class Teleport {

    private Main plugin;

    public Teleport(Main plugin){
        this.plugin = plugin;
    }

    public void tpLobby(Player p) {
        String x = plugin.getConfig().getString("Settings.Location.x");
        String y = plugin.getConfig().getString("Settings.Location.y");
        String z = plugin.getConfig().getString("Settings.Location.z");

        String world = plugin.getConfig().getString("Settings.World");

        Location loc = new Location(Bukkit.getWorld(world),
                Integer.parseInt(x), Integer.parseInt(y), Integer.parseInt(z));
        p.teleport(loc);
    }


    public void tpMassage(Player p){
        String massage = plugin.getConfig().getString("Settings.Massage");
        massage = massage.replace("&", "\u00A7");
        p.sendMessage(massage);
    }
}
