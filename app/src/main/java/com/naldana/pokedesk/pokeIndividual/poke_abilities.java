package com.naldana.pokedesk.pokeIndividual;

import java.util.ArrayList;

public class poke_abilities {
    public poke_abilities() {
    }
    public class ability{
        public ability() {
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
    private ability ability;
    private boolean is_hidden;
    private int slot;

    public poke_abilities.ability getAbility() {
        return ability;
    }

    public void setAbility(poke_abilities.ability ability) {
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
