package me.muawb.plugin;


import me.muawb.plugin.commands.Reload;
import me.muawb.plugin.commands.ToHub;
import me.muawb.plugin.events.Events;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class Main extends JavaPlugin{


    @Override
    public void onEnable(){

        File config = new File(getDataFolder() + File.separator + "config.yml");
        if(!config.exists()){
            getConfig().options().copyDefaults(true);
            saveDefaultConfig();
            System.out.println("Create config complete");
        }

        Bukkit.getPluginManager().registerEvents(new Events(this), this);
        getCommand("hub").setExecutor(new ToHub(this));
        getCommand("hb").setExecutor(new Reload(this));
        System.out.println("Load plugin complete");
    }
}
