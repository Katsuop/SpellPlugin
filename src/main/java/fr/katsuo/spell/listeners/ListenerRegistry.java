package fr.katsuo.spell.listeners;

import fr.katsuo.spell.Spell;
import fr.katsuo.spell.commands.SpellCommand;

public class ListenerRegistry {

    public void registry(Spell spell){
        spell.getServer().getPluginManager().registerEvents(new BookInteract(), spell);
    }

}
