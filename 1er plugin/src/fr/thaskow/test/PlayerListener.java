package fr.thaskow.test;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemBreakEvent;

public class PlayerListener implements Listener{

	public PlayerListener(EventHandling plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onBreak(PlayerItemBreakEvent e) {
		Player player = e.getPlayer();
		
		player.sendMessage(ChatColor.RED + "Casse pas tes items fait ATTENTION !");
	}
	
}
