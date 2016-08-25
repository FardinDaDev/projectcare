/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  net.md_5.bungee.api.CommandSender
 *  net.md_5.bungee.api.ProxyServer
 *  net.md_5.bungee.api.connection.ProxiedPlayer
 *  net.md_5.bungee.api.plugin.Command
 */
package com.FardinSqlScanner.BungeeMemes.main;

import com.FardinSqlScanner.BungeeMemes.main.BungeeMemesMain;
import java.util.List;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class MSGDankMemes
extends Command {
    private BungeeMemesMain plugin;

    public MSGDankMemes(String name, BungeeMemesMain plugin) {
        super(name);
        this.plugin = plugin;
    }

    public void execute(CommandSender sender, String[] args) {
        if (sender instanceof ProxiedPlayer) {
            ProxiedPlayer pp = (ProxiedPlayer)sender;
            if (args.length > 1) {
                ProxiedPlayer target = ProxyServer.getInstance().getPlayer(args[0]);
                if (target == null) {
                    pp.sendMessage("\u00a7cThis overdanked memelord player \u00a7a" + target.getName() + " \u00a7cis not online");
                    return;
                }
                String msg = "";
                int i = 1;
                while (i < args.length) {
                    msg = String.valueOf(msg) + " " + args[i];
                    ++i;
                }
                pp.sendMessage("\u00a78me(dank memer) -> \u00a7c" + target.getName() + "\u00a7r:" + msg);
                target.sendMessage("\u00a7c" + pp.getName() + " \u00a78->me(dank memer)\u00a7r:" + msg);
                for (String all : this.plugin.canRead) {
                    ProxiedPlayer teamer = ProxyServer.getInstance().getPlayer(all);
                    if (teamer == null) continue;
                    teamer.sendMessage("\u00a77-->\u00a7a" + pp.getName() + " \u00a77hat \u00a7c" + target.getName() + " \u00a77folgendes privat mitgeteilt: \u00a7r" + msg);
                }
            }
        }
    }
}

