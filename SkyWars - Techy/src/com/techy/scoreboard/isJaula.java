package com.techy.scoreboard;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;


public class isJaula {
	static HashMap<Scoreboard, Player> boards = new HashMap<>();

	static int tempo = 15;
	public static void Score(Player p) {

		Scoreboard score = Bukkit.getScoreboardManager().getNewScoreboard();

		Objective obj = score.registerNewObjective("isJaula", "dumy");

		obj.setDisplaySlot(DisplaySlot.SIDEBAR);

		obj.setDisplayName("§6§lSKY WARS");

		Team nada4 = score.registerNewTeam("nada4");
		nada4.setPrefix("§a ");
		nada4.addEntry(ChatColor.DARK_RED.toString());

		obj.getScore(ChatColor.DARK_RED.toString()).setScore(5);
		
		
		
		Team iniciando = score.registerNewTeam("iniciando");
		iniciando.setPrefix("§aIniciando em: ");
		iniciando.setSuffix("§e" + tempo);
		iniciando.addEntry(ChatColor.RED.toString());

		obj.getScore(ChatColor.RED.toString()).setScore(3);
		
		Team jogadores = score.registerNewTeam("jogadores");
		jogadores.setPrefix("§ajogadores: ");
		jogadores.setSuffix("§e" + Bukkit.getOnlinePlayers().size());
		jogadores.addEntry(ChatColor.AQUA.toString());

		obj.getScore(ChatColor.AQUA.toString()).setScore(2);
		
		
		
		
		
		Team nada3 = score.registerNewTeam("nada3");
		nada3.setPrefix("§a ");
		nada3.addEntry(ChatColor.DARK_BLUE.toString());

		obj.getScore(ChatColor.DARK_BLUE.toString()).setScore(1);
		
		
		Team site = score.registerNewTeam("site");
		site.setPrefix("§eredestechy.com");
		site.addEntry(ChatColor.DARK_AQUA.toString());

		obj.getScore(ChatColor.DARK_AQUA.toString()).setScore(0);


		p.setScoreboard(score);
	}

}
