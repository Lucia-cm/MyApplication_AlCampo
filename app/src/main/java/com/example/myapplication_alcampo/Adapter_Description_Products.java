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

public class Adapter_Description_Products extends BaseAdapter {
    private  Context context;
    private ArrayList<Product>data;
    private int R_layout_idView;

    public Adapter_Description_Products(Context context, int R_layout_idView, ArrayList<Product> data){
        super();
        this.context=context;
        this.R_layout_idView=R_layout_idView;
        this.data=data;
    }
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
        View description_product=inflater.inflate(R.layout.activity_description_product,parent,false);

        ImageView image=(ImageView) description_product.findViewById(R.id.description_image);
        image.setImageResource(data.get(position).getImage());

        TextView name=(TextView) description_product.findViewById(R.id.description_name);
        name.setText(data.get(position).getName());
        TextView brand=(TextView) description_product.findViewById(R.id.description_brand);
        brand.setText(data.get(position).getBrand());
        TextView price=(TextView) description_product.findViewById(R.id.description_price);
        price.setText(data.get(position).getPrice()+"€");
        TextView description=(TextView) description_product.findViewById(R.id.description_description);
        description.setText(data.get(position).getDescription());

        if(description_product==null){
            LayoutInflater vi=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            description_product=vi.inflate(R_layout_idView,null);
        }
        onEntrada(data.get(position),description_product);

        return description_product;
    }

    private void onEntrada(Product product, View product1) {
    }


}
