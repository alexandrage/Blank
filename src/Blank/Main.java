package Blank;

import org.bukkit.plugin.java.JavaPlugin;

import Blank.cmd.CommandListener;
import Blank.events.EventListener;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		this.saveDefaultConfig();
		this.reloadConfig();
		this.getServer().getPluginManager().registerEvents(new EventListener(this), this);
		this.getCommand("blank").setExecutor(new CommandListener(this));
	}
}