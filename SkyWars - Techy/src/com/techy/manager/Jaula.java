package com.techy.manager;

import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import com.techy.configmanager.Config;
import com.techy.enuns.SkyWarsState;
import com.techy.itens.Itens;
import com.techy.prefix.Tab;
import com.techy.scoreboard.isJaula;
import com.techy.skywars.Main;

public class Jaula {

	SkyWarsState jaula = SkyWarsState.JAULA;

	public static int tempo = 15;

	public Jaula(Player p) {

		

		Config.Teleport(p);

		isJaula.Score(p);

		new Tab(p);

		Itens.addPlayer(p);

		if (!Main.jogadores.contains(p)) {
			Main.jogadores.add(p);
		}

		if (Main.jogadores.size() == 1) {

			p.sendMessage(Main.m.getConfig().getString("partida").replace("%player%", p.getName()).replace("&", "§"));
			p.sendMessage("§bNão há jogadores suficientes para a partida começar!");
			return;
		}
		if (Main.jogadores.size() == 2 || Main.jogadores.size() < 10) {

			new BukkitRunnable() {

				@Override
				public void run() {
					p.sendMessage(
							Main.m.getConfig().getString("partida").replace("%player%", p.getName()).replace("&", "§"));
					new Jogando(p);
					return;
				}
			}.runTaskTimer(Main.m, 0, 20);

		}

	}

}
