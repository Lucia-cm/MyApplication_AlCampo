package com.example.myapplication_alcampo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity_categories02 extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_product_of_category);

        Intent new_intent=new Intent(MainActivity_categories02.this, MainActivity_product.class);

        GridView list=(GridView) findViewById(R.id.list_products);

        ArrayList<Product>products_decoration=new ArrayList<Product>();
        products_decoration.add(new Product(1,R.drawable.snowy_tree01,"Arbol de navidad nevado","HOMCOM","54,99",3.5f,"Este árbol artificial tiene la belleza de un abeto natural gracias a la combinación de ramas y bayas.\\nSu estructura y soporte metálico se pueden montar y desmontar fácilmente.\\nAltura: 150 cm.\\nLas 554 ramas y las 41 bayas dan un aspecto natural y original al árbol.\\nLas ramas se abren automáticamente para facilitar el montaje."));
        products_decoration.add(new Product(2,R.drawable.christmas_balls01,"Bolas árbol de navidad","STJERNE","6,99",4.5f,"Material:\tAluminio, Vidrio, PET, Papel\\nTamaño:\\tDiámetro: 6 cm, Altura: 8 cm"));
        products_decoration.add(new Product(3,R.drawable.christmas_tree01,"Arbol de navidad","NIDUD","62,00",4f,"Árbol de madera bien hecha. La mejor relación calidad-precio.\\nRamas gruesas y soporte estable.\\nMontaje fácil.\\nDiámetro: 109 cm, Altura: 180 cm"));
        products_decoration.add(new Product(4,R.drawable.elfs01,"Duendes de Navidad","JYSK","4,00",5f,"Materiales: Polipropileno, Poliester y Arena\\nTamaño: Ancho: 9,5cm, Longitud: 9 cm, Altura: 23 cm\\nUsar: Para interior."));
        products_decoration.add(new Product(5,R.drawable.snowman01,"Muñeco de nieve","BALDER","8,00",5f,"Materiales: Metal, Poliester y Arena\\nTamaño: Ancho: 12 cm, Longitud: 24 cm, Altura: 40 cm\\nUsar: Para interior.\\nAdvertencia: No apto para niños menores de tres años."));
        products_decoration.add(new Product(6,R.drawable.candle_holders,"Portavelas","SKINFAXE","2,50",4.5f,"Material:\tDolomita\\nTamaño: Diámetro: 7 cm, Altura: 10 cm\\nColor: Blanco, Verde, Rojo\\nUsar: Para interior."));
        products_decoration.add(new Product(7,R.drawable.crown01,"Corona","FENRIS","15,20",4.6f,"Materiales: Plástico\\nTamaño: Diámetro: 40 cm, Altura: 7 cm\\nUsar: Para interior/exterior.\\nSin función de temporizador.\\nCantidad de pilas necesarias: 2\\nTamaño de las pilas: AA"));
        products_decoration.add(new Product(8,R.drawable.tablecloth01,"Mantel de vinilo","FERSKENSTEN","7,50",5f,"Materiales: PEVA y Poliester \\nTamaño: Ancho: 140 cm\\nLimpieza en seco."));

        ArrayAdapter<Product>adapter=new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, products_decoration);

        list.setAdapter(new Adapter_All_Products(this,R.layout.product,products_decoration){
            public void onEntrada(Object entrada, View view){}
        });



    }
}
