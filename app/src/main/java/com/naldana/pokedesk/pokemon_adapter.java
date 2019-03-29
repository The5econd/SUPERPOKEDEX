package com.naldana.pokedesk;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class pokemon_adapter extends RecyclerView.Adapter<pokemon_adapter.Viewholder> {

    ArrayList<String> lista_poke;

    public pokemon_adapter(ArrayList<String> lista_poke) {
        this.lista_poke = lista_poke;
    }


    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pokemones_view,null,false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder viewholder, int i) {
        viewholder.set_on_list(lista_poke.get(i));
    }

    @Override
    public int getItemCount() {
        return lista_poke.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        TextView nombre, tipo, peso;
        public Viewholder(@NonNull View itemView) {
            super(itemView);

            nombre = itemView.findViewById(R.id.nombre_pokemon);
        }
        public void set_on_list(String s){
            nombre.setText(s);
        }
    }
}
