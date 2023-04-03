package org.example.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.example.util.LocationUtils;

public class WhereIsCommandExecutor implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length != 1) return false;

        var playerName = args[0];
        var player = Bukkit.getPlayer(playerName);
        if (player == null)  {
            sender.sendMessage(ChatColor.RED + "There is no Player with this name!");
            return false;
        }
        sender.sendMessage(player.getName() + " " + LocationUtils.getLocationString(player.getLocation()));
        return true;
    }
}
