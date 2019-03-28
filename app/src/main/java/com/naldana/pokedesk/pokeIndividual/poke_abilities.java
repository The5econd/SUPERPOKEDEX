package com.naldana.pokedesk.pokeIndividual;

import java.util.ArrayList;

public class poke_abilities {
    private ArrayList<poke_abilities_ability> ability;
    private boolean is_hidden;
    private int slot;

    public ArrayList<poke_abilities_ability> getAbility() {
        return ability;
    }

    public void setAbility(ArrayList<poke_abilities_ability> ability) {
        this.ability = ability;
    }

    public boolean isIs_hidden() {
        return is_hidden;
    }

    public void setIs_hidden(boolean is_hidden) {
        this.is_hidden = is_hidden;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }
}
