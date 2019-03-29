package com.naldana.pokedesk.pokeIndividual;

import java.util.ArrayList;

public class poke_indices {
    public poke_indices() {
    }
    private int game_index;
    public class version{
        public version() {
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
    private version version;


    public poke_indices.version getVersion() {
        return version;
    }

    public void setVersion(poke_indices.version version) {
        this.version = version;
    }

    public int getGame_index() {
        return game_index;
    }

    public void setGame_index(int game_index) {
        this.game_index = game_index;
    }
}
