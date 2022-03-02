package fr.katsuo.spell.commands;

import fr.katsuo.spell.Spell;


public class CommandRegistry {

    public void registry(Spell spell){
        spell.getCommand("spell").setExecutor(new SpellCommand());
    }

}
