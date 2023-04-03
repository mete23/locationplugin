package org.example;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import org.example.commands.WhereAmICommandExecutor;
import org.example.commands.WhereIsCommandExecutor;

public final class WherePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getLogger().info(ChatColor.GREEN + "enabling WherePlugin!");
        getCommand("whereami").setExecutor(new WhereAmICommandExecutor());
        getCommand("whereis").setExecutor(new WhereIsCommandExecutor());
    }

    @Override
    public void onDisable() {
        this.getLogger().info(ChatColor.RED + "disabling WherePlugin!");
    }
}
