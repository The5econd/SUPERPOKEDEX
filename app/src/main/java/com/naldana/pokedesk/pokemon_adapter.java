package com.naldana.pokedesk;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.naldana.pokedesk.utilities.poke;
import com.naldana.pokedesk.utilities.pokeResults;

import org.w3c.dom.Text;

import java.util.ArrayList;

public abstract class pokemon_adapter extends RecyclerView.Adapter<pokemon_adapter.Viewholder> {

    ArrayList<pokeResults> lista_poke;

    public pokemon_adapter(ArrayList<pokeResults> lista_poke) {
        this.lista_poke = lista_poke;
    }


    @NonNull
    @Override
    public Viewholder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pokemones_view,null,false);
        view.setLayoutParams(new RecyclerView.LayoutParams(RecyclerView.LayoutParams.MATCH_PARENT,RecyclerView.LayoutParams.WRAP_CONTENT));
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(Viewholder viewHolderObj, final int i) {
        viewHolderObj.set_on_list(lista_poke.get(i));
        viewHolderObj.pokemonButton.setOnClickListener((v) -> {
            OnSendData(lista_poke.get(i).getUrl());
        });
    }

    @Override
    public int getItemCount() {
        return lista_poke.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        public TextView nombre;
        public Button pokemonButton;
        public Viewholder(View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.nombre_pokemon_boton);
            pokemonButton = itemView.findViewById(R.id.nombre_pokemon_boton);
        }
        public void set_on_list(pokeResults s){
            nombre.setText(s.getName());
        }
    }
    public abstract void OnSendData(String pokemonData);
}
