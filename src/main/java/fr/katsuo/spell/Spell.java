package fr.katsuo.spell;

import fr.katsuo.spell.commands.CommandRegistry;
import fr.katsuo.spell.listeners.ListenerRegistry;
import org.bukkit.plugin.java.JavaPlugin;

public class Spell extends JavaPlugin {

    @Override
    public void onEnable() {
        CommandRegistry cR = new CommandRegistry();
        ListenerRegistry lR = new ListenerRegistry();
        cR.registry(this);
        lR.registry(this);
    }

    @Override
    public void onDisable() {

    }
}
