package com.example.myapplication_alcampo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adaptador_prueba extends RecyclerView.Adapter <Adaptador_prueba.MiHolder> {
    private List<Product> entradas;

    public Adaptador_prueba(List<Product> entradas) {
        this.entradas = entradas;
    }

    @NonNull
    @Override
    public MiHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //View view= LayoutInflater.from(parent.getContext()).inflate(R_layout_IdView,parent,false);
        //no funciona, el siguiente le sustituye:
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.product, parent, false);
        return new MiHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MiHolder holder, int position) {
        holder.imagen.setImageResource(entradas.get(position).getImage());
        holder.name.setText(entradas.get(position).getName());
        holder.brand.setText(String.valueOf(entradas.get(position).getBrand()));
        holder.price.setText(String.valueOf(entradas.get(position).getPrice())+"€");
        holder.valuation.setRating(entradas.get(position).getValuation());
    }

    @Override
    public int getItemCount() {
        return entradas.size();
    }


    public static class MiHolder extends RecyclerView.ViewHolder{
        public ImageView imagen;
        public TextView name;
        public TextView brand;
        public TextView price;
        public RatingBar valuation;
        public MiHolder(View view){
            super(view);
            imagen=(ImageView) view.findViewById(R.id.image_product);
            name=(TextView) view.findViewById(R.id.name_product);
            brand=(TextView) view.findViewById(R.id.brand_product);
            price=(TextView) view.findViewById(R.id.price_product);
            valuation=(RatingBar) view.findViewById(R.id.valuation_product);
        }
    }

}
