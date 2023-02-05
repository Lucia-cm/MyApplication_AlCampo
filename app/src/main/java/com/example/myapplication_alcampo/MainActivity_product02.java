package com.example.myapplication_alcampo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity_product02 extends AppCompatActivity {
    LinearLayout layout;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description_product);

        ArrayList<Product> data=new ArrayList<Product>();
        data.add(new Product(1,R.drawable.snowy_tree01,"Arbol de navidad nevado","HOMCOM","54,99",3.5f,"Este árbol artificial tiene la belleza de un abeto natural gracias a la combinación de ramas y bayas.\\nSu estructura y soporte metálico se pueden montar y desmontar fácilmente.\\nAltura: 150 cm.\\nLas 554 ramas y las 41 bayas dan un aspecto natural y original al árbol.\\nLas ramas se abren automáticamente para facilitar el montaje."));

        Intent intent_final=new Intent(MainActivity_product02.this, MainActivity_congratulations_final.class);


    }
}
