package com.naldana.pokedesk;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.google.gson.Gson;
import com.naldana.pokedesk.utilities.NetworkUtils;
import com.naldana.pokedesk.utilities.poke;
import com.naldana.pokedesk.utilities.pokeInd;

import java.io.IOException;
import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;

public class ventana_info extends AppCompatActivity {
    TextView name_to_show, weight_to_show, type_to_show, height_to_show, speed_to_show, specialD_to_show,
            specialA_to_show,defense_to_show, atack_to_show, hp_to_show, abilities_to_show;
    public String message = "vacio";
    String nombre, tipo, tipoS, peso, altura;
    //ArrayList<String> listaHABILIDADES;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ventana_info_datos);
        bindView();

        //TextView urlPokemon = findViewById(R.id.url_recibido);
        Intent newIntent = this.getIntent();
        if (newIntent != null){
            //message ya es mi URL del pokemon en la nueva ventana
            message = newIntent.getStringExtra(AppConstants.INTENT_MESSAGE_KEY);
        }
        new FetchPokemonTask().execute();
        //urlPokemon.setText(message);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    void bindView(){
        name_to_show = findViewById(R.id.new_window_pk_name);
        weight_to_show = findViewById(R.id.new_window_pk_weight);
        type_to_show = findViewById(R.id.new_window_pk_type);
        height_to_show = findViewById(R.id.new_window_pk_height);

        speed_to_show = findViewById(R.id.new_window_pk_speed);
        specialD_to_show = findViewById(R.id.new_window_pk_specialDefense);
        specialA_to_show = findViewById(R.id.new_window_pk_specialAtack);
        defense_to_show = findViewById(R.id.new_window_pk_defense);
        atack_to_show = findViewById(R.id.new_window_pk_atack);
        hp_to_show = findViewById(R.id.new_window_pk_hp);
        abilities_to_show = findViewById(R.id.new_window_pk_abilities);
    }
    private class FetchPokemonTask extends AsyncTask<String,Void,ArrayList<ArrayList>>{

        @Override
        protected ArrayList<ArrayList> doInBackground(String... strings) {
            ArrayList<ArrayList> todasListas = new ArrayList<>();
            ArrayList<String> listaSTATS = new ArrayList<>();
            ArrayList<String> listaHABILIDADES = new ArrayList<>();
            Gson g = new Gson();
            URL pokeAPI = NetworkUtils.getUrls(message);
            String result;
            try {
                result = NetworkUtils.getResponseFromHttpUrl(pokeAPI);
                pokeInd pokemonJSON = g.fromJson(result, pokeInd.class);
                //////hagarrando los datos que quiero de los pokemones/////////////////
                nombre = pokemonJSON.getName();
                peso = Integer.toString(pokemonJSON.getWeight()/10);
                tipoS = "";
                for (int i =0; i < pokemonJSON.getTypes().size(); i++){
                    if(pokemonJSON.getTypes().size() == 2){
                        tipo = pokemonJSON.getTypes().get(i).getType().getName();
                        tipoS =tipoS + " / " + tipo;
                    }else {
                        tipoS = pokemonJSON.getTypes().get(i).getType().getName();
                    }
                }
                altura = Integer.toString(pokemonJSON.getHeight()*10);
                ///////////////////STATS//////////////////////////////
                for (int i = 0; i < pokemonJSON.getStats().size(); i++){
                    String statIndividual = Integer.toString(pokemonJSON.getStats().get(i).getBase_stat());
                    listaSTATS.add(statIndividual);
                }
                //////////////////HABILIDADES/////////////////////////////////////////
                for (int i = 0; i < pokemonJSON.getMoves().size(); i++){
                    String habilidadIndividual = pokemonJSON.getMoves().get(i).getMove().getName();
                    listaHABILIDADES.add(habilidadIndividual);
                }///////////////////meter las listas en una sola//////////////////////
                todasListas.add(listaSTATS);
                todasListas.add(listaHABILIDADES);
                //////////////////////////////////////////////////////////////////////
            } catch (IOException e) {
                e.printStackTrace();
            }
            return todasListas;
        }
        @Override
        protected void onPostExecute(ArrayList<ArrayList> pokemonInfo) {
            if (pokemonInfo != null || !pokemonInfo.equals("")) {
                name_to_show.setText("NAME: " + nombre);
                type_to_show.setText("TYPE: " + tipoS);
                weight_to_show.setText("WEIGHT: " + peso + "kg");
                height_to_show.setText("HEIGHT: " + altura + "cm");

                ArrayList<String> nuevaListaStats = new ArrayList<>();
                ArrayList<String> nuevaListaHabilidades = new ArrayList<>();

                for (int i = 0; i < pokemonInfo.get(0).size(); i++){
                    nuevaListaStats.add(pokemonInfo.get(0).get(i).toString());
                }
                for (int i = 0; i < pokemonInfo.get(1).size(); i++){
                    nuevaListaHabilidades.add(pokemonInfo.get(1).get(i).toString());
                }

                speed_to_show.setText(nuevaListaStats.get(0));
                specialD_to_show.setText(nuevaListaStats.get(1));
                specialA_to_show.setText(nuevaListaStats.get(2));
                defense_to_show.setText(nuevaListaStats.get(3));
                atack_to_show.setText(nuevaListaStats.get(4));
                hp_to_show.setText(nuevaListaStats.get(5));
                for (int i = 0; i < nuevaListaHabilidades.size() ; i++){
                    String habilidad = abilities_to_show.getText().toString();
                    abilities_to_show.setText(habilidad + nuevaListaHabilidades.get(i) + "\n");
                }
            }

        }
    }
}
