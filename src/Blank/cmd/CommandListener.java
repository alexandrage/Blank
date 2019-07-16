package Blank.cmd;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

public class CommandListener implements CommandExecutor {

	private Plugin plugin;

	public CommandListener(Plugin plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
		Bukkit.broadcastMessage(this.plugin.getConfig().getString("blank"));
		return false;
	}
}