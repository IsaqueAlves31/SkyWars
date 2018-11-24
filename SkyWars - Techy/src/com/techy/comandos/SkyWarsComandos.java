package com.techy.comandos;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import com.techy.configmanager.Config;
import com.techy.kitsmanager.KitsConfig;
import com.techy.manager.Jaula;
import com.techy.npcs.Solo;
import com.techy.skywars.Main;

public class SkyWarsComandos implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lb, String[] args) {
		if (!(sender instanceof Player)) {
			return true;
		} else {
			Player p = (Player) sender;
			if (cmd.getName().equalsIgnoreCase("sw")) {
				if (args.length == 0) {
					p.sendMessage("§a§l/sw setlobby §b§l- §e§lSete um Lobby!");
					p.sendMessage("§a§l/sw addspawn §b§l- §e§lAdicione um Spawn a Arena");
					p.sendMessage("§a§l/sw jogar §b§l- §e§lJogue em uma Arena Random");
					return true;

				}

				if (args.length == 1 && args[0].equalsIgnoreCase("solo")) {

					Solo.setNpc(p);

					p.sendMessage("§a§l[SKYWARS] - Npc adicionado com sucesso.");
				}

				if (args.length == 1 && args[0].equalsIgnoreCase(args[0])) {
					KitsConfig.Kits(args[0]);
					KitsConfig.saveConfig();
				}

				p.sendMessage("§a§l[SKYWARS] - Npc adicionado com sucesso.");
			}

			if (args.length == 1 && args[0].equalsIgnoreCase("setlobby")) {

				Config.Configs(p);

				Config.getConfig().set("Lobby", p.getLocation());

				Config.saveConfig();

				Main.m.getConfig().set("Lobby", p.getLocation());

				p.sendMessage("§a§l[SKYWARS] - Lobby adicionado com sucesso.");
			}

			if (args.length == 1 && args[0].equalsIgnoreCase("addspawn")) {
				Config.Configs(p);
				Config.getConfig().set("Spawn", p.getLocation());

				Config.saveConfig();

				p.sendMessage("§a§l[SKYWARS] - Spawn adicionado com sucesso.");
			}

			if (args.length == 1) {
				if (args[0].equalsIgnoreCase("jogar")) {
					Config.Configs(p);

					Config.saveDef();
					p.sendMessage("§aProcurando mapa...");
					new Jaula(p);

				}
			}
		}

		return false;

	}

}
