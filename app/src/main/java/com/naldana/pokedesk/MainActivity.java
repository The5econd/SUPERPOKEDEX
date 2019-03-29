package com.naldana.pokedesk;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.naldana.pokedesk.pokeIndividual.poke_abilities;
import com.naldana.pokedesk.pokeIndividual.poke_indices;
import com.naldana.pokedesk.pokeIndividual.poke_moves;
import com.naldana.pokedesk.pokeIndividual.poke_moves_VGD;
import com.naldana.pokedesk.pokeIndividual.poke_stats;
import com.naldana.pokedesk.pokeIndividual.poke_types;
import com.naldana.pokedesk.utilities.pokeInd;
import com.naldana.pokedesk.utilities.NetworkUtils;
import com.naldana.pokedesk.utilities.poke;
import com.naldana.pokedesk.utilities.pokeResults;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;

public class MainActivity extends AppCompatActivity {

    EditText mPokemonNumber;
    Button mSearchButton;
    TextView mResultText;
    ArrayList<String> lista_poke;
    RecyclerView Rview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista_poke = new ArrayList<String>();
        bindView();

        new FetchPokemonTask().execute();
        /*
        mSearchButton.setOnClickListener(view -> {
            String pokemonNumber = mPokemonNumber.getText().toString().trim();
            if (pokemonNumber.isEmpty()) {
                mResultText.setText(R.string.text_nothing_to_show);
            } else {

                new FetchPokemonTask().execute(pokemonNumber);
            }
        });*/
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    void bindView() {
        mPokemonNumber = findViewById(R.id.et_pokemon_number);
        mSearchButton = findViewById(R.id.bt_search_pokemon);
        //mResultText = findViewById(R.id.tv_result);

    }


    private class FetchPokemonTask extends AsyncTask<String, Void, ArrayList<poke>> {

        @Override
        protected ArrayList<poke> doInBackground(String... pokemonNumbers) {
            ArrayList<poke> todos = new ArrayList<>();
            Gson g = new Gson();

            URL pokeAPI = NetworkUtils.buildUrl();
            String result;
            try {
                result = NetworkUtils.getResponseFromHttpUrl(pokeAPI);
                poke pokemon = g.fromJson(result, poke.class);
                for (int i = 0; i < pokemon.getResults().size(); i++){
                    todos.add(pokemon);
                    lista_poke.add(pokemon.getResults().get(i).getName());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
/*
            Gson g = new Gson();
            poke pokemon = g.fromJson(result, poke.class);*/

  /*          while (pokemon.getNext()!=null){
                /*for(int i = 0;i < pokemon.getResults().size(); i++){
                    //Log.d("hola1", pokemon.getResults().get(i).getName());
                }*/

       /*         for (int i = 0; i < pokemon.getResults().size(); i++){
                    URL pokeData = NetworkUtils.getUrls(pokemon.getResults().get(i).getUrl());
                    try {
                        String response = NetworkUtils.getResponseFromHttpUrl(pokeData);
                        Gson g1 = new Gson();
                        pokeInd pokemon2 = g1.fromJson(response, pokeInd.class);
                        //Log.d("hola1", pokemon.getResults().get(i).getName());
                        Log.d("URLS", pokemon.getResults().get(i).getUrl());
                        lista_poke.add(pokemon2.getName());
                        /*for(int j= 0; j < lista_poke.size(); j++){
                            Log.d("lista",lista_poke.get(j));
                        }*/
                        //return response;
                    /*} catch (IOException e) {
                        e.printStackTrace();
                    }*/

                //}
                /*for(int i= 0; i < lista_poke.size(); i++){
                    Log.d("lista",lista_poke.get(i));
                }*/
                /*URL next = NetworkUtils.getUrls(pokemon.getNext());
                try {
                    String urls = NetworkUtils.getResponseFromHttpUrl(next);
                    pokemon = g.fromJson(urls, poke.class);
                    //Log.d("hola2",lista_poke.toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }*/
            return todos;
        }

        @Override
        protected void onPostExecute(ArrayList<poke> pokemonInfo) {
            if (pokemonInfo != null || !pokemonInfo.equals("")) {
                Rview = findViewById(R.id.reciclador);

                Rview.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                pokemon_adapter adapter = new pokemon_adapter(lista_poke);
                Rview.setAdapter(adapter);
            }

        }

    }


}