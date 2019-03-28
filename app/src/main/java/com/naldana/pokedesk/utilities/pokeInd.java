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
    private ArrayList<poke_species> species;
    private ArrayList<poke_sprites> sprites;
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

    public ArrayList<poke_species> getSpecies() {
        return species;
    }

    public void setSpecies(ArrayList<poke_species> species) {
        this.species = species;
    }

    public ArrayList<poke_sprites> getSprites() {
        return sprites;
    }

    public void setSprites(ArrayList<poke_sprites> sprites) {
        this.sprites = sprites;
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
