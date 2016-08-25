/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  net.md_5.bungee.api.ChatColor
 *  net.md_5.bungee.api.CommandSender
 *  net.md_5.bungee.api.ProxyServer
 *  net.md_5.bungee.api.connection.ProxiedPlayer
 *  net.md_5.bungee.api.plugin.Command
 */
package com.FardinSqlScanner.BungeeMemes.main;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class BroadCastDankMemes
extends Command {
    public BroadCastDankMemes(String name) {
        super(name);
    }

    public void execute(CommandSender sender, String[] args) {
        if (sender instanceof ProxiedPlayer) {
            // empty if block
        }
        ProxiedPlayer pp = (ProxiedPlayer)sender;
        if (args.length > 0) {
            String message = "";
            int i = 0;
            while (i < args.length) {
                message = String.valueOf(message) + args[i] + " ";
                ++i;
            }
            message = ChatColor.translateAlternateColorCodes((char)'&', (String)message);
            ProxyServer.getInstance().broadcast(message);
        } else {
            pp.sendMessage("\u00a7c/broadcast <dank memes>");
        }
    }
}

