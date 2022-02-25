package me.muawb.plugin.commands;

import me.muawb.plugin.Main;
import me.muawb.plugin.events.Events;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;

public class ToHub implements CommandExecutor{

    private Main plugin;

    public ToHub(Main plugin){
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        Player p = (Player) sender;
        if(!sender.hasPermission("hub.join")){
            p.sendMessage(ChatColor.DARK_RED + "У вас нету прав");
            return true;
        }
        if(command.getName().equalsIgnoreCase("hub")){
            Events events = new Events(this.plugin);
            events.onHub(p);
            return true;
        }

        return false;
    }
}
