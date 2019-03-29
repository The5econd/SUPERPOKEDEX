package com.naldana.pokedesk.pokeIndividual;

import java.util.ArrayList;

public class poke_moves {
    public poke_moves() {
    }
    public class move{
        public move() {
        }
        String name;
        String url;

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
    private move move;

    public poke_moves.move getMove() {
        return move;
    }

    public void setMove(poke_moves.move move) {
        this.move = move;
    }

    private ArrayList<poke_moves_VGD> version_group_details;


    public ArrayList<poke_moves_VGD> getVersion_group_details() {
        return version_group_details;
    }

    public void setVersion_group_details(ArrayList<poke_moves_VGD> version_group_details) {
        this.version_group_details = version_group_details;
    }
}
