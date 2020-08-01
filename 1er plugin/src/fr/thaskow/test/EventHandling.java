package fr.thaskow.test;

import org.bukkit.plugin.java.JavaPlugin;


public class EventHandling extends JavaPlugin {
	
	@Override
	public void onEnable() {
		new PlayerListener(this);
		System.out.println("Le plugin ce lance lo !");
		
	}
	
	@Override
	public void onDisable() {
		System.out.println("C'est la fin hellllpppp");
	}
	
}
