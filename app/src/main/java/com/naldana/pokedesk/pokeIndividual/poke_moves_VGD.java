package com.naldana.pokedesk.pokeIndividual;

import java.util.ArrayList;

public class poke_moves_VGD {
    private int level_learned_at;
    private ArrayList<poke_moves_VGD_MLM> move_learn_method;

    public int getLevel_learned_at() {
        return level_learned_at;
    }

    public void setLevel_learned_at(int level_learned_at) {
        this.level_learned_at = level_learned_at;
    }

    public ArrayList<poke_moves_VGD_MLM> getMove_learn_method() {
        return move_learn_method;
    }

    public void setMove_learn_method(ArrayList<poke_moves_VGD_MLM> move_learn_method) {
        this.move_learn_method = move_learn_method;
    }
}
