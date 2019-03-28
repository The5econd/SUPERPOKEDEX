package com.naldana.pokedesk;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.naldana.pokedesk.utilities.pokeInd;
import com.naldana.pokedesk.utilities.NetworkUtils;
import com.naldana.pokedesk.utilities.poke;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.Collection;

public class MainActivity extends AppCompatActivity {

    EditText mPokemonNumber;
    Button mSearchButton;
    TextView mResultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
        mResultText = findViewById(R.id.tv_result);
    }


    private class FetchPokemonTask extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... pokemonNumbers) {

            URL pokeAPI = NetworkUtils.buildUrl();
            String result;
            try {
                result = NetworkUtils.getResponseFromHttpUrl(pokeAPI);
                //Log.d("carajo",result);
            } catch (IOException e) {
                e.printStackTrace();
                return "";
            }

            Gson g = new Gson();
            poke pokemon = g.fromJson(result, poke.class);

            while (pokemon.getNext()!=null){
                for(int i = 0;i < pokemon.getResults().size(); i++){
                    Log.d("carajo", pokemon.getResults().get(i).getName());
                }

                for (int i = 0; i < pokemon.getResults().size(); i++){
                    URL pokeData = NetworkUtils.getUrls(pokemon.getResults().get(i).getUrl());
                    try {
                        String urlData = NetworkUtils.getResponseFromHttpUrl(pokeData);
                        Gson g1 = new Gson();
                        pokeInd pokemon2 = g1.fromJson(urlData, pokeInd.class);
                        Log.d("prueba", Integer.toString(pokemon2.getWeight()));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
                URL next = NetworkUtils.getUrls(pokemon.getNext());
                try {
                    String urls = NetworkUtils.getResponseFromHttpUrl(next);
                    pokemon = g.fromJson(urls, poke.class);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            return null;
        }
/*
        @Override
        protected void onPostExecute(String pokemonInfo) {
            if (pokemonInfo != null || !pokemonInfo.equals("")) {
                mResultText.setText(pokemonInfo);
            }

        }*/
    }
}