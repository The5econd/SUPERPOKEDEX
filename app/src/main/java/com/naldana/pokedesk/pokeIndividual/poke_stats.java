package com.naldana.pokedesk.pokeIndividual;

import java.util.ArrayList;

public class poke_stats {
    private int base_stat;
    private int effort;
    public class stat{
        public stat() {
        }
        private String name;
        private String url;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
    private stat stat;

    public poke_stats.stat getStat() {
        return stat;
    }

    public void setStat(poke_stats.stat stat) {
        this.stat = stat;
    }

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
}
