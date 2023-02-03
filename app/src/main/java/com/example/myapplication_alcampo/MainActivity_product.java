package com.example.myapplication_alcampo;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity_product extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description_product);

        ArrayList<Product> products_decoration=new ArrayList<Product>();
        products_decoration.add(new Product(1,R.drawable.snowy_tree01,"Arbol de navidad nevado","HOMCOM","54,99",3.5f,"Este árbol artificial tiene la belleza de un abeto natural gracias a la combinación de ramas y bayas.\\nSu estructura y soporte metálico se pueden montar y desmontar fácilmente.\\nAltura: 150 cm.\\nLas 554 ramas y las 41 bayas dan un aspecto natural y original al árbol.\\nLas ramas se abren automáticamente para facilitar el montaje."));

        Intent intent_final=new Intent(MainActivity_product.this, MainActivity_final.class);

        LinearLayout layout=(LinearLayout)findViewById(R.id.description_layout);

        LayoutInflater inflater=LayoutInflater.from(this);
        View description_product=inflater.inflate(R.layout.activity_description_product,layout,false);

        ImageView image=(ImageView) description_product.findViewById(R.id.description_image);
        image.setImageResource(products_decoration.get(1).getImage());

        TextView name=(TextView) description_product.findViewById(R.id.description_name);
        name.setText(products_decoration.get(1).getName());
        TextView brand=(TextView) description_product.findViewById(R.id.description_brand);
        brand.setText(products_decoration.get(1).getBrand());
        TextView price=(TextView) description_product.findViewById(R.id.description_price);
        price.setText(products_decoration.get(1).getPrice()+"€");
        TextView description=(TextView) description_product.findViewById(R.id.description_description);
        price.setText(products_decoration.get(1).getDescription());

    }
}
