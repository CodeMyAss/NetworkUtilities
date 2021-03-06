package me.olivervscreeper.networkutilities.game.extensions;

import me.olivervscreeper.networkutilities.NetworkUtilities;
import me.olivervscreeper.networkutilities.game.Game;

import org.bukkit.Bukkit;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;

/**
 * Created by User on 06/12/2014.
 */
public abstract class GameExtension {

  public Game gameInstance;
  private String name;

  public GameExtension(Game gameInstance, String name) {
    this.gameInstance = gameInstance;
    this.name = name;
  }

  public abstract boolean onEnable();

  public void registerListener(Listener classInstance) {
    Bukkit.getPluginManager().registerEvents(classInstance, NetworkUtilities.plugin);
  }

  public void unregisterListener(Listener classInstance) {
    HandlerList.unregisterAll(classInstance);
  }

  public String getName(){
    return name;
  }

}
