package me.muawb.plugin;

import me.muawb.plugin.commands.ToHub;
import me.muawb.plugin.events.Events;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

    @Override
    public void onEnable(){
        System.out.println("Load plugin...");
        Bukkit.getPluginManager().registerEvents(new Events(this), this);
        getCommand("hub").setExecutor(new ToHub(this));
    }
}
