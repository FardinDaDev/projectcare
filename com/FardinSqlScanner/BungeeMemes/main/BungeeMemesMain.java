/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  net.md_5.bungee.api.ProxyServer
 *  net.md_5.bungee.api.plugin.Command
 *  net.md_5.bungee.api.plugin.Plugin
 *  net.md_5.bungee.api.plugin.PluginManager
 */
package com.FardinSqlScanner.BungeeMemes.main;

import com.FardinSqlScanner.BungeeMemes.main.BroadCastDankMemes;
import com.FardinSqlScanner.BungeeMemes.main.MSGDankMemes;
import com.FardinSqlScanner.BungeeMemes.main.PingDankMemes;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Command;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.api.plugin.PluginManager;

public class BungeeMemesMain
extends Plugin {
    public List<String> canRead = new ArrayList<String>();

    public void onEnable() {
        this.registerCommands();
        System.out.println("[BungeeMemes] The Memes are now dank enough!");
        this.canRead.add("FardinSqlScan");
    }

    public void onDisable() {
        System.out.println("[BungeeMemes] The Memes are dying by the illuminati! Quick install MLG ANTIVIRUS! Call: 1-800-mlg-antivirus for microsoft indian scam service m80!");
    }

    private void registerCommands() {
        ProxyServer.getInstance().getPluginManager().registerCommand((Plugin)this, (Command)new BroadCastDankMemes("broadcast"));
        ProxyServer.getInstance().getPluginManager().registerCommand((Plugin)this, (Command)new MSGDankMemes("msg", this));
        ProxyServer.getInstance().getPluginManager().registerCommand((Plugin)this, (Command)new PingDankMemes());
    }
}

