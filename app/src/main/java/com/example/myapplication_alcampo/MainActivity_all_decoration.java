package com.example.myapplication_alcampo;

import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity_all_decoration extends AppCompatActivity {
    private RecyclerView reciclador;
    private RecyclerView.Adapter adaptador;

    ImageButton house_home;
    ImageButton auchan_home;
    ImageButton return_view;

    TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_products);
        title=(TextView)findViewById(R.id.categoryTitle);
        title.setText("Decoración navideña");

        ArrayList<Product>products_decoration=new ArrayList<Product>();
        products_decoration.add(new Product(21,R.drawable.snowy_tree01,"Arbol de navidad nevado","HOMCOM","54,99",3.5f,"Este árbol artificial tiene la belleza de un abeto natural gracias a la combinación de ramas y bayas.\\nSu estructura y soporte metálico se pueden montar y desmontar fácilmente.\\nAltura: 150 cm.\\nLas 554 ramas y las 41 bayas dan un aspecto natural y original al árbol.\\nLas ramas se abren automáticamente para facilitar el montaje."));
        products_decoration.add(new Product(22,R.drawable.christmas_balls01,"Bolas árbol de navidad","STJERNE","6,99",4.5f,"Material:\tAluminio, Vidrio, PET, Papel\\nTamaño:\\tDiámetro: 6 cm, Altura: 8 cm"));
        products_decoration.add(new Product(23,R.drawable.christmas_tree01,"Arbol de navidad","NIDUD","62,00",4f,"Árbol de madera bien hecha. La mejor relación calidad-precio.\\nRamas gruesas y soporte estable.\\nMontaje fácil.\\nDiámetro: 109 cm, Altura: 180 cm"));
        products_decoration.add(new Product(24,R.drawable.elfs01,"Duendes de Navidad","JYSK","4,00",5f,"Materiales: Polipropileno, Poliester y Arena\\nTamaño: Ancho: 9,5cm, Longitud: 9 cm, Altura: 23 cm\\nUsar: Para interior."));
        products_decoration.add(new Product(25,R.drawable.snowman01,"Muñeco de nieve","BALDER","8,00",5f,"Materiales: Metal, Poliester y Arena\\nTamaño: Ancho: 12 cm, Longitud: 24 cm, Altura: 40 cm\\nUsar: Para interior.\\nAdvertencia: No apto para niños menores de tres años."));
        products_decoration.add(new Product(26,R.drawable.candle_holders,"Portavelas","SKINFAXE","2,50",4.5f,"Material:\tDolomita\\nTamaño: Diámetro: 7 cm, Altura: 10 cm\\nColor: Blanco, Verde, Rojo\\nUsar: Para interior."));
        products_decoration.add(new Product(27,R.drawable.crown01,"Corona","FENRIS","15,20",4.6f,"Materiales: Plástico\\nTamaño: Diámetro: 40 cm, Altura: 7 cm\\nUsar: Para interior/exterior.\\nSin función de temporizador.\\nCantidad de pilas necesarias: 2\\nTamaño de las pilas: AA"));
        products_decoration.add(new Product(28,R.drawable.tablecloth01,"Mantel de vinilo","FERSKENSTEN","7,50",5f,"Materiales: PEVA y Poliester \\nTamaño: Ancho: 140 cm\\nLimpieza en seco."));

        reciclador=(RecyclerView) findViewById(R.id.reciclador);
        reciclador.setHasFixedSize(true);
        //definir la salida de los datos en X columnas
        int numberOfColumns = 2;
        reciclador.setLayoutManager(new GridLayoutManager(this, numberOfColumns));

        adaptador=new Adapter_product(products_decoration);
        reciclador.setAdapter(adaptador);

        Intent go_description=new Intent(MainActivity_all_decoration.this, MainActivity_description_one_product.class);

        reciclador.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {
            GestureDetector gestureDetector=new GestureDetector(getApplicationContext(),new GestureDetector.SimpleOnGestureListener(){
                @Override
                public boolean onSingleTapUp(MotionEvent e) {
                    return true;
                }
            });
            @Override
            public boolean onInterceptTouchEvent(@NonNull RecyclerView rv, @NonNull MotionEvent e) {
                View hijo=rv.findChildViewUnder(e.getX(),e.getY());

                if(hijo!=null && gestureDetector.onTouchEvent(e)){
                    int position=rv.getChildAdapterPosition(hijo);

                    go_description.putExtra("name",products_decoration.get(position).getName());
                    go_description.putExtra("brand",products_decoration.get(position).getBrand());
                    go_description.putExtra("price",products_decoration.get(position).getPrice());
                    go_description.putExtra("description",products_decoration.get(position).getDescription());
                    go_description.putExtra("image",String.valueOf(products_decoration.get(position).getImage()));

                    startActivity(go_description);
                }
                return false;
            }

            @Override
            public void onTouchEvent(@NonNull RecyclerView rv, @NonNull MotionEvent e) {}

            @Override
            public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {}
        });

        house_home=(ImageButton) findViewById(R.id.toHome);
        auchan_home=(ImageButton)findViewById(R.id.auchanButton);
        return_view=(ImageButton)findViewById(R.id.toPrevious);
        house_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goHome();
            }
        });
        auchan_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goHome();
            }
        });
        return_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goPrevious();
            }
        });

    }

    public void goHome(){
        Intent goHome=new Intent(MainActivity_all_decoration.this,MainActivity_home.class);
        startActivity(goHome);
    }
    public void goPrevious(){
        onBackPressed();
    }

}