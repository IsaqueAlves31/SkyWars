package com.techy.manager;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;

import com.techy.configmanager.Config;

public class Jogando {

	public Jogando(Player p) {

			Config.Teleport(p);

			for (Player all : Bukkit.getOnlinePlayers()) {
				all.setGameMode(GameMode.SURVIVAL);
				all.getInventory().clear();
				all.getActivePotionEffects().clear();
				p.sendMessage("§b§lAVISO: §fO uso de Hacker: §aPunição permanente!");
			
		}
	}

}
