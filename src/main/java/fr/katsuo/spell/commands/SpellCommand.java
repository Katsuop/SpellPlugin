package fr.katsuo.spell.commands;

import com.google.common.collect.Multimap;
import fr.katsuo.spell.items.GiveItem;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.tags.CustomItemTagContainer;
import org.bukkit.persistence.PersistentDataContainer;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SpellCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            if(args.length == 0){
                p.sendMessage(ChatColor.LIGHT_PURPLE + "------------------------------------------------");
                p.sendMessage("");
                p.sendMessage(ChatColor.DARK_PURPLE + "Spell" + ChatColor.BLUE + " -> " + ChatColor.LIGHT_PURPLE + "Affiche toutes le commandes disponibles");
                p.sendMessage(ChatColor.DARK_PURPLE + "Spell give" + ChatColor.BLUE + " -> " + ChatColor.LIGHT_PURPLE + "Spell give : Donne les sorts (Uniquement pour le développeur trop beau)");
                p.sendMessage("");
                p.sendMessage(ChatColor.LIGHT_PURPLE + "------------------------------------------------");
            }
            else if (args[0].equalsIgnoreCase("give")){
                p.sendMessage(ChatColor.DARK_PURPLE + "Spell" + ChatColor.BLUE + " -> " + ChatColor.LIGHT_PURPLE + "Give item for spell !");
                GiveItem give = new GiveItem();
                ItemStack is = new ItemStack(Material.BOOK);
                ItemMeta im = is.getItemMeta();
                give.give(p, is, im,"bite");
            }
        }
        return true;
    }

}
