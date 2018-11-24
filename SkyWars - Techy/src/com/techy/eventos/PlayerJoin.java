package com.techy.eventos;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.techy.kits.Guerreiro;
import com.techy.npcs.Solo;

public class PlayerJoin implements Listener {
	
	@EventHandler
	public void aoEntrar(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		e.setJoinMessage(null);
		Solo.getNpc(p);
		
	}

}
