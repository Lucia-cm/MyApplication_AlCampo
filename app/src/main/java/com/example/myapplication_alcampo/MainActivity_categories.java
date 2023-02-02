package com.example.myapplication_alcampo;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity_categories extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_product_of_category);

        GridView list=(GridView) findViewById(R.id.list_products);

        ArrayList<Product>products=new ArrayList<Product>();
        products.add(new Product(R.drawable.snowy_tree01,"Arbol de navidad nevado","HOMCOM","54,99",3.5f));
        products.add(new Product(R.drawable.christmas_balls01,"Bolas árbol de navidad","STJERNE","6,99",4.5f));
        products.add(new Product(R.drawable.christmas_tree01,"Arbol de navidad","NIDUD","62,00",4f));
        products.add(new Product(R.drawable.elfs01,"Duendes de Navidad","JYSK","4,00",5f));
        products.add(new Product(R.drawable.snowman01,"Muñeco de nieve","BALDER","8,00",5f));
        products.add(new Product(R.drawable.candle_holders,"Portavelas","SKINFAXE","2,50",4.5f));
        products.add(new Product(R.drawable.crown01,"Corona","FENRIS","15,20",4.6f));
        products.add(new Product(R.drawable.tablecloth01,"Mantel de vinilo","FERSKENSTEN","7,50",5f));

        ArrayAdapter<Product>adapter=new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, products);
        list.setAdapter(new Adapter_All_Products(this,R.layout.product,products){

        });


    }
}
