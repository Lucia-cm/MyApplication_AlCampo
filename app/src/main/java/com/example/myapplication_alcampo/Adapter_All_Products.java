package com.example.myapplication_alcampo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter_All_Products extends BaseAdapter {
    Context context;
    ArrayList<Product>data;

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View product=inflater.inflate(R.layout.product,parent,false);

        ImageView image=(ImageView) product.findViewById(R.id.image_product);
        image.setImageResource(data.get(position).getImage());

        TextView name=(TextView) product.findViewById(R.id.name_product);
        name.setText(data.get(position).getName());
        TextView brand=(TextView) product.findViewById(R.id.brand_product);
        brand.setText(data.get(position).getBrand());
        TextView price=(TextView) product.findViewById(R.id.price_product);
        price.setText(data.get(position).getPrice()+"€");

        RatingBar valuation=(RatingBar) product.findViewById(R.id.valuation_product);
        valuation.setRating(data.get(position).getValuation());

        return product;
    }
}
