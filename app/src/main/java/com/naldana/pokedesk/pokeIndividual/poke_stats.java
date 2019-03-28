package com.naldana.pokedesk.pokeIndividual;

import java.util.ArrayList;

public class poke_stats {
    private int base_stat;
    private int effort;
    private ArrayList<poke_stats_stat> stat;

    public int getBase_stat() {
        return base_stat;
    }

    public void setBase_stat(int base_stat) {
        this.base_stat = base_stat;
    }

    public int getEffort() {
        return effort;
    }

    public void setEffort(int effort) {
        this.effort = effort;
    }

    public ArrayList<poke_stats_stat> getStat() {
        return stat;
    }

    public void setStat(ArrayList<poke_stats_stat> stat) {
        this.stat = stat;
    }
}
