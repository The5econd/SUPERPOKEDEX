package com.naldana.pokedesk.pokeIndividual;

import java.util.ArrayList;

public class poke_types {
    private int slot;
    private ArrayList<poke_types_type> type;

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public ArrayList<poke_types_type> getType() {
        return type;
    }

    public void setType(ArrayList<poke_types_type> type) {
        this.type = type;
    }
}
