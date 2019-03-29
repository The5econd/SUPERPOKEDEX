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
import java.net.URL;
import java.util.ArrayList;

public class ventana_info extends AppCompatActivity {
    TextView name_to_show, weight_to_show, type_to_show, height_to_show;
    public String message = "vacio";
    String nombre, tipo, peso, altura;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ventana_info_datos);
        bindView();

        TextView urlPokemon = findViewById(R.id.url_recibido);
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
    }
    private class FetchPokemonTask extends AsyncTask<String,Void,ArrayList<pokeInd>>{

        @Override
        protected ArrayList<pokeInd> doInBackground(String... strings) {
            ArrayList<pokeInd> todos = new ArrayList<>();
            Gson g = new Gson();

            URL pokeAPI = NetworkUtils.getUrls(message);
            String result;
            try {
                result = NetworkUtils.getResponseFromHttpUrl(pokeAPI);
                pokeInd pokemonJSON = g.fromJson(result, pokeInd.class);
                //////hagarrando los datos que quiero de los pokemones
                nombre = pokemonJSON.getName();
                peso = Integer.toString(pokemonJSON.getWeight()/10);
                for (int i =0; i < pokemonJSON.getTypes().size(); i++){
                    tipo = pokemonJSON.getTypes().get(i).getType().getName();
                }
                altura = Integer.toString(pokemonJSON.getHeight()*10);
                ////////////////////////////////////////////////////////
            } catch (IOException e) {
                e.printStackTrace();
            }
            return todos;
        }
        @Override
        protected void onPostExecute(ArrayList<pokeInd> pokemonInfo) {
            if (pokemonInfo != null || !pokemonInfo.equals("")) {
                name_to_show.setText("NAME: " + nombre);
                type_to_show.setText("TYPE: " + tipo);
                weight_to_show.setText("WEIGHT: " + peso + "kg");
                height_to_show.setText("HEIGHT: " + altura + "cm");
            }

        }
    }
}
