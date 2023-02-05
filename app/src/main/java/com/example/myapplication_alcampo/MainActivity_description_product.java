package com.example.myapplication_alcampo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity_description_product extends AppCompatActivity {
    Button buy;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description_product);

        ArrayList<Product> products_decoration=new ArrayList<Product>();
        Product one= new Product(1,R.drawable.snowy_tree01,"Arbol de navidad nevado","HOMCOM","54,99",3.5f,"Este árbol artificial tiene la belleza de un abeto natural gracias a la combinación de ramas y bayas.\\nSu estructura y soporte metálico se pueden montar y desmontar fácilmente.\\nAltura: 150 cm.\\nLas 554 ramas y las 41 bayas dan un aspecto natural y original al árbol.\\nLas ramas se abren automáticamente para facilitar el montaje.");
            products_decoration.add(one);

        LinearLayout parentLayout = (LinearLayout) findViewById(R.id.parent_description);
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View inflatedLayout= inflater.inflate(R.layout.activity_description_product, parentLayout, true);
        ImageView image=inflatedLayout.findViewById(R.id.description_image);
        image.setImageResource(one.getImage());
        TextView name=(TextView) inflatedLayout.findViewById(R.id.description_name);
        name.setText(one.getName());
        TextView brand=(TextView) inflatedLayout.findViewById(R.id.description_brand);
        brand.setText(one.getBrand());
        TextView price=(TextView) inflatedLayout.findViewById(R.id.description_price);
        price.setText(one.getPrice()+"€");
        TextView description=(TextView) inflatedLayout.findViewById(R.id.description_description);
        description.setText(one.getDescription());

        Intent intent_final=new Intent(MainActivity_description_product.this, MainActivity_congratulations_final.class);

        buy=(Button) findViewById(R.id.description_buy);
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent_final);
            }
        });

    }
}
