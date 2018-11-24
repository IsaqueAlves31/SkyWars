package com.techy.prefix;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class Tab {

	public Tab(Player p) {

		for (Player all : Bukkit.getOnlinePlayers()) {
			p.setCustomName("§c" + all.getName());
			p.setCustomNameVisible(true);
			p.setPlayerListName("§c" + all.getName());
		}

		p.setCustomName("§a" + p.getName());
		p.setCustomNameVisible(true);
		p.setPlayerListName("§a" + p.getName());
	}

}
