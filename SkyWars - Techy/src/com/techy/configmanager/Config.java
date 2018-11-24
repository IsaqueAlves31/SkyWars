package com.techy.configmanager;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.configuration.file.YamlConfigurationOptions;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import com.techy.skywars.Main;

public class Config {

	public static YamlConfiguration config;
	public static File file;

	public static YamlConfiguration teste;
	public static File teste1;

	public static int tempo = 8;
	public static int i = 0;

	public static void Configs(Player p) {
		file = new File("plugins/TechySkyWars/Arenas/", p.getWorld().getName() + ".yml");
		config = YamlConfiguration.loadConfiguration(file);

	}

	public static void TeleportLobby(Player p) {
		Config.Configs(p);
		for (File f : new File("plugins/TechySkyWars/" + File.separator + "/Arenas/").listFiles()) {
			file = new File("plugins/TechySkyWars/Arenas/", f.getName());
			config = YamlConfiguration.loadConfiguration(file);
			config = YamlConfiguration.loadConfiguration(f);
			p.teleport((Location) config.get("Lobby", f.getName()));
			return;

		}

	}

	public static void Teleport(Player p) {
		Config.Configs(p);
		for (File f : new File("plugins/TechySkyWars/" + File.separator + "/Arenas/").listFiles()) {
			file = new File("plugins/TechySkyWars/Arenas/", f.getName());
			config = YamlConfiguration.loadConfiguration(file);
			p.teleport((Location) config.get("Spawn", f.getName()));
			return;

		}

	}

	public static void saveConfig() {
		try {
			getConfig().save(getFile());
		} catch (Exception e) {
		}
	}

	public static void saveDef() {

		for (File f : new File("plugins/TechySkyWars/" + File.separator + "/Arenas/").listFiles()) {
			file = new File("plugins/TechySkyWars/Arenas/", f.getName());
			

		}
	}

	public static YamlConfiguration getConfig() {
		return config;
	}

	public static void setConfig(YamlConfiguration config) {
		Config.config = config;
	}

	public static File getFile() {
		return file;
	}

	public static void setFile(File file) {
		Config.file = file;
	}

}
