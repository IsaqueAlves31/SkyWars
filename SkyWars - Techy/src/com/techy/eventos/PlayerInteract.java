package com.techy.eventos;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import com.techy.manager.Jogando;

public class PlayerInteract implements Listener {

	@EventHandler
	public void aoClicar(PlayerInteractAtEntityEvent e) {
		Player p = e.getPlayer();
		Entity npc = e.getRightClicked();
		if (npc instanceof Villager) {
			new Jogando(p);
		}
	}

}
