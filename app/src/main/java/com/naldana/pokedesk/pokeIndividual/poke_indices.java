package com.naldana.pokedesk.pokeIndividual;

import java.util.ArrayList;

public class poke_indices {
    private int game_index;
    private ArrayList<poke_indices_version> version;

    public int getGame_index() {
        return game_index;
    }

    public void setGame_index(int game_index) {
        this.game_index = game_index;
    }

    public ArrayList<poke_indices_version> getVersion() {
        return version;
    }

    public void setVersion(ArrayList<poke_indices_version> version) {
        this.version = version;
    }
}
