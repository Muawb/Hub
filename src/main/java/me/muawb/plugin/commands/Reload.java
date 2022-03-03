package me.muawb.plugin.commands;

import me.muawb.plugin.Main;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Reload implements CommandExecutor{

    private Main plugin;

    public Reload(Main plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        Player p = (Player) sender;
        if(!sender.hasPermission("hub.info")){
            p.sendMessage(ChatColor.RED + "У вас нету прав");
            return true;
        }

        if(args.length == 0){
            p.sendMessage(ChatColor.GOLD +      "  Hub");
            p.sendMessage("");
            p.sendMessage(ChatColor.GREEN +     "Commands:");
            p.sendMessage(ChatColor.YELLOW +    "/hub - " + ChatColor.GRAY + "Teleport to lobby");
            p.sendMessage(ChatColor.YELLOW +    "/hb reload - " + ChatColor.GRAY + "Reloading plugin");
            return true;
        }

        if(args[0].equalsIgnoreCase("reload")){
            plugin.reloadConfig();
            p.sendMessage(ChatColor.GREEN + "Плагин перезагружен");
            return true;
        }
        return false;
    }
}
