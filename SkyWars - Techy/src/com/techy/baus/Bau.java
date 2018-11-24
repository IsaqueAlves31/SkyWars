package com.techy.baus;

import java.util.ArrayList;
import java.util.Random;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class Bau implements Listener{

	public static int i = 0;

	static ArrayList<ItemStack> itens = new ArrayList<>();

	@EventHandler
	public void aoClicar(BlockPlaceEvent e) {
		Player p = e.getPlayer();
		Block bloco = e.getBlockPlaced();

		if (bloco instanceof Chest) {

			Inventory inv = ((Chest) bloco).getInventory();
			itens.add(new ItemStack(Material.APPLE));

			int r = new Random().nextInt(itens.size());

			inv.setItem(0, itens.get(r));

		}
	}

}
