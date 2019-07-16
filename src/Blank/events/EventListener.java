package Blank.events;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;

public class EventListener implements Listener {

	private Plugin plugin;

	public EventListener(Plugin plugin) {
		this.plugin = plugin;
	}

	@EventHandler
	public void on(PlayerJoinEvent e) {
		Bukkit.broadcastMessage(this.plugin.getConfig().getString("blank"));
	}
}