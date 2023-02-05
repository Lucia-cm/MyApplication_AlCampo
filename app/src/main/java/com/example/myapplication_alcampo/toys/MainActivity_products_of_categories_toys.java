package com.example.myapplication_alcampo.toys;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.myapplication_alcampo.Adapter_All_Products;
import com.example.myapplication_alcampo.MainActivity_product02;
import com.example.myapplication_alcampo.Product;
import com.example.myapplication_alcampo.R;

import java.util.ArrayList;

public class MainActivity_products_of_categories_toys extends AppCompatActivity {
    CardView cardView;
    TextView name;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_product_of_category);

        Intent new_intent=new Intent(MainActivity_products_of_categories_toys.this, MainActivity_product02.class);

        GridView list=(GridView) findViewById(R.id.list_products);

        ArrayList<Product>products_toys=new ArrayList<Product>();
        products_toys.add(new Product(11,R.drawable.beach_toy01,"Juguetes de playa","BeachToys","8,00",3.5f,"Nuestro juego de playa contiene 13 productos distintos.\\nSe incluye 1 cubo y la tapa del cubo, 1 pala, 1 regadera, 1 molde de castillo de arena, 2 juegos de herramientas para la arena, 6 moldes para arena de playa.\\nTodos los artículos están bien empaquetado en una bolsa resistente de PVC ideal para viajar fácilmente.\\nDimensiones del producto: 28 x 23 x 17 cm\\nPeso: 530 gramos\\n"));
        products_toys.add(new Product(12,R.drawable.cars_toy01,"Coches de madera","CarToys","30,50",4f,"Pista de coches de juguete para niños pequeños.\\nAutos juguetes y pista de carros de juguete resistentes hechos de madera natural y teñidos con pinturas no tóxicas a base de agua y suaves sin bordes afilados, por lo que no dañará a los niños.\\nEste juego de carreras de coches ha sido diseñado para niños de 1 a 4 años."));
        products_toys.add(new Product(13,R.drawable.chess01,"Ajedrez","Cuadrados","17,00",5f,"Ajedrez de madera maciza\\nDimensiones del ablero: 30 x 30 cm\\nFichas de madera barnizadas y con filtro en la base\\nIncluye: 16 piezas negras y 16 piezas blancas\\nPRECAUCIONES: No mantener al alcance de los niños. La ingestión de alguna pieza podría causar asfixia."));
        products_toys.add(new Product(14,R.drawable.lego01,"Super Mario Lego 123a","Lego Ty","51,99",5f,"Este pack cuenta con figuras interactivas con sensores de color.\\nLas figuras requieren dos pilas AAA."));
        products_toys.add(new Product(15,R.drawable.monopoly01,"Monopoly","Ty Monopoly","29,99",5f,"EMOCIONANTE JUEGO DE LAS PROPIEDADES INMOBILIARIAS. En él los jugadores compran, venden, sueñan y preparan su camino hacia las riquezas.\\nDimensiones del producto: 4.1 x 40 x 26.6 cm\\nPeso estimado:910 gramos\\nEdad recomendada: +8 años."));
        products_toys.add(new Product(16,R.drawable.parchis01,"Parchís","Parchís Toy","12,90",4.5f,"Juego completo de parchís para 4 jugadores, que incluye el tablero, fichas rojas amarillas, verdes y azules, dados y cubiletes.\\nEdad recomendada: +4 años."));
        products_toys.add(new Product(17,R.drawable.teddy01,"Doggy","Teddy's Mar","5,79",3f,"Hecho de algodón suave, no dañará la piel de los niños.\\nLa tela súper suave lo hace extra tierno y cómodo.\\nSe puede lavar a mano o a máquina, enjuagar lentamente.\\nNo secar en secadora, solo al aire natural."));
        products_toys.add(new Product(18,R.drawable.uno,"Uno","Uno's play","13,25",4.5f,"Juego de cartas\\nJuega con una sola persona o junta a un grupo de hasta 10 amigos y que empiece la fiesta. Juegues como juegues, encontraras divertidas y competitivas partidas.\\nPosee unas normas sencillas."));

        ArrayAdapter<Product>adapter=new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, products_toys);
        list.setAdapter(new Adapter_All_Products(this,R.layout.product,products_toys){

        });

    }
}
