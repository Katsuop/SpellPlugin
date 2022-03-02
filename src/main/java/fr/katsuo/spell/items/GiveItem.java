package fr.katsuo.spell.items;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GiveItem {

    public void give(Player player, ItemStack is, ItemMeta im, String name){
        im.setDisplayName(name);
        is.setItemMeta(im);
        player.getInventory().addItem(is);
    }
}
