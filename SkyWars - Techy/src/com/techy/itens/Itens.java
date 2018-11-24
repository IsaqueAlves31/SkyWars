package com.techy.itens;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Itens implements Listener {

	public static ItemStack kits;

	public static ItemMeta kitsmeta;

	public static ItemStack habilidades;

	public static ItemMeta habilidadesmetas;

	public static void addPlayer(Player p) {

		kits = new ItemStack(Material.NETHER_STAR);
		kitsmeta = kits.getItemMeta();
		kitsmeta.setDisplayName("§6Kits§7(Clique direito)");
		kits.setItemMeta(kitsmeta);

		habilidades = new ItemStack(Material.EXP_BOTTLE);
		
		habilidadesmetas = habilidades.getItemMeta();
		
		habilidadesmetas.setDisplayName("§6Habilidades§7(Clique direito)");
		habilidades.setItemMeta(habilidadesmetas);

		p.getInventory().clear();
		p.getInventory().setItem(3, kits);
		p.getInventory().setItem(6, habilidades);

	}
	
	@EventHandler
	public void aoClicar(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		ItemStack hand = p.getItemInHand();
		if(hand.hasItemMeta()) {
			if(hand.getItemMeta().hasDisplayName()) {
				if(hand.getItemMeta().getDisplayName().equals("§6Kits§7(Clique direito)")) {
					
				}
				
			}
		}
	}

}
