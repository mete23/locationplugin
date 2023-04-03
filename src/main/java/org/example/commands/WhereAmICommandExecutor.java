package org.example.commands;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.example.util.LocationUtils;

public class WhereAmICommandExecutor implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (args.length > 0) {
            return false;
        }
        Player player = (Player) sender;
        Location location = player.getLocation();
        player.sendMessage(LocationUtils.getLocationString(location));
        return true;
    }
}
