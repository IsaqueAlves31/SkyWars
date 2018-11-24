package com.techy.skywars;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import com.techy.baus.Bau;
import com.techy.comandos.SkyWarsComandos;
import com.techy.enuns.SkyWarsState;
import com.techy.eventos.Npc;
import com.techy.eventos.PlayerInteract;
import com.techy.eventos.PlayerJoin;

public class Main extends JavaPlugin {

	public static Main m;
	public static SkyWarsState state;

	public static ArrayList<Player> jogadores = new ArrayList<>();

	@Override
	public void onEnable() {

		saveDefaultConfig();
		m = this;

		getCommand("sw").setExecutor(new SkyWarsComandos());
		Bukkit.getPluginManager().registerEvents(new PlayerJoin(), m);
		Bukkit.getPluginManager().registerEvents(new PlayerInteract(), m);
		Bukkit.getPluginManager().registerEvents(new Bau(), m);
		Bukkit.getPluginManager().registerEvents(new Npc(), m);
		Bukkit.getConsoleSender().sendMessage("§a§l[SKYWARS] §c§l- §b§lPLUGIN DE SKYWARS INICIADO COM SUCESSO.");

	}

}
