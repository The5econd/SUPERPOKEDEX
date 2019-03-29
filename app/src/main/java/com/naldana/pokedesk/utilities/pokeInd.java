package com.naldana.pokedesk.utilities;

import com.naldana.pokedesk.pokeIndividual.poke_abilities;
import com.naldana.pokedesk.pokeIndividual.poke_form;
import com.naldana.pokedesk.pokeIndividual.poke_held_items;
import com.naldana.pokedesk.pokeIndividual.poke_indices;
import com.naldana.pokedesk.pokeIndividual.poke_moves;
import com.naldana.pokedesk.pokeIndividual.poke_species;
import com.naldana.pokedesk.pokeIndividual.poke_sprites;
import com.naldana.pokedesk.pokeIndividual.poke_stats;
import com.naldana.pokedesk.pokeIndividual.poke_types;

import java.util.ArrayList;

public class pokeInd {
    public pokeInd() {
    }
    private ArrayList<poke_abilities> abilities;
    private int base_experience;
    private ArrayList<poke_form> forms;
    private ArrayList<poke_indices> game_indices;
    private int height;
    private ArrayList<poke_held_items> held_items;
    private int id;
    private boolean is_default;
    private String location_area_encounters;
    private ArrayList<poke_moves> moves;
    private String name;
    private int order;
    public static class species{
        public species() {
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
    public static class sprites{
        public sprites() {
        }
        private String back_default;
        private String back_female;
        private String back_shiny;
        private String back_shiny_female;
        private String front_default;
        private String front_female;
        private String front_shiny;
        private String front_shiny_female;

        public String getBack_default() {
            return back_default;
        }

        public void setBack_default(String back_default) {
            this.back_default = back_default;
        }

        public String getBack_female() {
            return back_female;
        }

        public void setBack_female(String back_female) {
            this.back_female = back_female;
        }

        public String getBack_shiny() {
            return back_shiny;
        }

        public void setBack_shiny(String back_shiny) {
            this.back_shiny = back_shiny;
        }

        public String getBack_shiny_female() {
            return back_shiny_female;
        }

        public void setBack_shiny_female(String back_shiny_female) {
            this.back_shiny_female = back_shiny_female;
        }

        public String getFront_default() {
            return front_default;
        }

        public void setFront_default(String front_default) {
            this.front_default = front_default;
        }

        public String getFront_female() {
            return front_female;
        }

        public void setFront_female(String front_female) {
            this.front_female = front_female;
        }

        public String getFront_shiny() {
            return front_shiny;
        }

        public void setFront_shiny(String front_shiny) {
            this.front_shiny = front_shiny;
        }

        public String getFront_shiny_female() {
            return front_shiny_female;
        }

        public void setFront_shiny_female(String front_shiny_female) {
            this.front_shiny_female = front_shiny_female;
        }
    }
    private ArrayList<poke_stats> stats;
    private ArrayList<poke_types> types;
    private int weight;

    public ArrayList<poke_abilities> getAbilities() {
        return abilities;
    }

    public void setAbilities(ArrayList<poke_abilities> abilities) {
        this.abilities = abilities;
    }

    public int getBase_experience() {
        return base_experience;
    }

    public void setBase_experience(int base_experience) {
        this.base_experience = base_experience;
    }

    public ArrayList<poke_form> getForms() {
        return forms;
    }

    public void setForms(ArrayList<poke_form> forms) {
        this.forms = forms;
    }

    public ArrayList<poke_indices> getGame_indices() {
        return game_indices;
    }

    public void setGame_indices(ArrayList<poke_indices> game_indices) {
        this.game_indices = game_indices;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public ArrayList<poke_held_items> getHeld_items() {
        return held_items;
    }

    public void setHeld_items(ArrayList<poke_held_items> held_items) {
        this.held_items = held_items;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isIs_default() {
        return is_default;
    }

    public void setIs_default(boolean is_default) {
        this.is_default = is_default;
    }

    public String getLocation_area_encounters() {
        return location_area_encounters;
    }

    public void setLocation_area_encounters(String location_area_encounters) {
        this.location_area_encounters = location_area_encounters;
    }

    public ArrayList<poke_moves> getMoves() {
        return moves;
    }

    public void setMoves(ArrayList<poke_moves> moves) {
        this.moves = moves;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public ArrayList<poke_stats> getStats() {
        return stats;
    }

    public void setStats(ArrayList<poke_stats> stats) {
        this.stats = stats;
    }

    public ArrayList<poke_types> getTypes() {
        return types;
    }

    public void setTypes(ArrayList<poke_types> types) {
        this.types = types;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
