package net.whg.plugintemplate;

import java.util.logging.Level;

import org.bukkit.plugin.java.JavaPlugin;

public class PluginTemplate extends JavaPlugin {
  @Override
  public void onEnable() {
    getLogger().log(Level.INFO, "Plugin Template enabled!");
  }
}