package fr.katsuo.spell.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class BookInteract implements Listener {

    @EventHandler
    public void onInteract(PlayerInteractEvent event){
        Player player = event.getPlayer();
        Action Action = event.getAction();
        if(Action == Action.PHYSICAL ||  event.getItem() == null || event.getItem().getType() == Material.AIR){
            return;
        }

        if(event.getItem().getType() == Material.BOOK){
            if(event.getItem().getItemMeta().getDisplayName() == ""){
                player.sendMessage("");
            }
            return;
        }
    }
}
