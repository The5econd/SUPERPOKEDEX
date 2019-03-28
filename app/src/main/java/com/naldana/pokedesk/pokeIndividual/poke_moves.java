package com.naldana.pokedesk.pokeIndividual;

import java.util.ArrayList;

public class poke_moves {
    private ArrayList<poke_moves_move> move;
    private ArrayList<poke_moves_VGD> version_group_details;

    public ArrayList<poke_moves_move> getMove() {
        return move;
    }

    public void setMove(ArrayList<poke_moves_move> move) {
        this.move = move;
    }

    public ArrayList<poke_moves_VGD> getVersion_group_details() {
        return version_group_details;
    }

    public void setVersion_group_details(ArrayList<poke_moves_VGD> version_group_details) {
        this.version_group_details = version_group_details;
    }
}
