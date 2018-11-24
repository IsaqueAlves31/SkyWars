package com.techy.eventos;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

import com.techy.npcs.Solo;

public class Npc implements Listener {

	@EventHandler
	public void aoClicar(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		Solo.aoCLicar(p);
		e.setCancelled(true);
		
	}

}
