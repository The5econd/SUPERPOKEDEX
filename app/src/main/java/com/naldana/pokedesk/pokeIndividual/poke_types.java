package com.naldana.pokedesk.pokeIndividual;

import java.util.ArrayList;

public class poke_types {
    private int slot;
    public  class type{
        public type() {
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
    private type type;

    public poke_types.type getType() {
        return type;
    }

    public void setType(poke_types.type type) {
        this.type = type;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }
}
