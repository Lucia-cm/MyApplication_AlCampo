package com.example.myapplication_alcampo;

import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity_all_playgames extends AppCompatActivity {
    private RecyclerView reciclador;
    private RecyclerView.Adapter adaptador;
    private RecyclerView.LayoutManager gestor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prueba_all_products);

        ArrayList<Product>products_playgames=new ArrayList<Product>();
        products_playgames.add(new Product(31,R.drawable.pokemon01,"Pokémon X","Nintendo","45,95",4.3f,"Clasificado: No recomendada para menores de 7 años\\nLlega la aventura Pokémon más esperada: creada con un estilo visual 3D por primera vez y con numerosas novedades que enriquecen la forma de jugar. Pokémon X presenta una nueva generación de la licencia Pokémon. El juego incluye numerosos Pokémon totalmente nuevos, viejos conocidos y nuevas evoluciones de algunos de los más populares."));
        products_playgames.add(new Product(32,R.drawable.warcraft01,"World of Warcraft: Battle for Azeroth","Blizzard","21,74",4.5f,"Clasificado: No recomendada para menores de 12 años\\nLlega la aventura Pokémon más esperada: creada con un estilo visual 3D por primera vez y con numerosas novedades que enriquecen la forma de jugar. Pokémon X presenta una nueva generación de la licencia Pokémon. El juego incluye numerosos Pokémon totalmente nuevos, viejos conocidos y nuevas evoluciones de algunos de los más populares."));
        products_playgames.add(new Product(33,R.drawable.witcher01,"The Witcher 3: Wild Hunt","BANDAI NAMCO","33,90",4.7f,"Clasificado: No recomendada para menores de 18 años\\nJuega a la versión más completa y pulida del juego más galardonado de 2015 -The Witcher 3: Wild Hunt. Ahora disponible con todas las expansiones y el contenido adicional. ¡Conviértete en un cazador de monstruos profesional y embárcate en una aventura épica! Desde su lanzamiento, The Witcher 3: Wild Hunt se convirtió en un clásico, con más de 250 premios Game of the Year."));
        products_playgames.add(new Product(34,R.drawable.dragon_ball01,"Dragon Ball Fusions","Nintendo","49,99",4.5f,"Clasificado: No recomendada para menores de 12 años\\nDRAGON BALL Fusions es un juego de acción-RPG, con una combinación de lucha, personalización y recopilación de objetos, que da vida al mundo de Dragon Ball. El juego cuenta con un extenso elenco de personajes que abarca todo el universo de películas y series de anime de Dragon Ball. Los jugadores tendrán la oportunidad de sumergirse en una nueva y original historia con el modo de aventura de DRAGON BALL Fusions, o demostrar su destreza en la lucha en el modo de combate multijugador."));
        products_playgames.add(new Product(35,R.drawable.sims01,"Los Sims 4 + Rumbo a la Fama","Electronic Arts","30,68",4.7f,"Clasificado: No recomendada para menores de 12 años\\nAlcanza las estrellas y el estatus de celebrity con Los Sims 4 ¡Rumbo a la fama! Trabaja para conseguir el estrellato con la carrera de actor, conviértete en un famoso de primera fila y guía a tus Sims por el impredecible camino de la fama. Desde el estudio a las fiestas VIP, tú eliges cómo tu Sim puede ser aclamado mundialmente."));
        products_playgames.add(new Product(36,R.drawable.fifa01,"Pack FIFA 22","Electronic Arts","44,98",4.6f,"Clasificado: No recomendada para menores de 3 años\\nEste pack contiene: FIFA 22 CIAB PCWIN ES PG FRONTLINE y FIFA 22 Ultimate Team 1050 FIFA Points | Código Origin para PC"));
        products_playgames.add(new Product(37,R.drawable.mario_r01,"MARIO + RABBIDS SPARKS OF HOPE SWITCH","Nintendo","40,99",4.7f,"Clasificado: No recomendada para menores de 7 años\\nÚnete a Mario, Luigi, Princesa Peach, Rabbid Peach, Rabbid Luigi y sus amigos, y embárcate en un viaje galáctico para derrotar a una entidad malévola y salvar a tus compañeros Spark. ¡Explora planetas y viaja por la galaxia descubriendo misteriosos secretos y completando emocionantes misiones! La Gold Edition incluye: El juego principal El pase de temporada, que contiene los futuros paquetes de contenido descargable, como historia adicional con un nuevo personaje, misiones y batallas. También incluye la colección Prestigio galáctico, con tres aspectos de arma exclusivos y elegantes para tu equipo, desbloqueados al instante. ¡Salva la galaxia con estilo!"));
        products_playgames.add(new Product(38,R.drawable.mario_k01,"Mario Kart 8 Deluxe Game Switch","Nintendo","60,20",4.7f,"Clasificado: No recomendada para menores de 3 años\\nDisfruta del Mario Kart definitivo donde quieras y cuando quieras con Mario Kart 8 Deluxe para Nintendo Switch, incluso en partidas multijugador local para hasta ocho pilotos.\\nLos populares circuitos y personajes de la versión de Wii U regresan, junto a los circuitos y personajes descargables, además de personajes nuevos: Inkling chico e Inkling chica de Splatoon; el Rey Boo; Huesitos y Bowsy. Y cuando la competición es tan elevada, cada piloto necesitará llevar ahora dos objetos simultáneamente, incluyendo novedades como el ladrón de objetos Boo o la pluma, que permite saltar en las batallas."));

        reciclador=(RecyclerView) findViewById(R.id.reciclador);
        reciclador.setHasFixedSize(true);
        //definir la salida de los datos en X columnas
        int numberOfColumns = 2;
        reciclador.setLayoutManager(new GridLayoutManager(this, numberOfColumns));

        adaptador=new Adaptador_prueba(products_playgames);
        reciclador.setAdapter(adaptador);

        Intent go_description=new Intent(MainActivity_all_playgames.this, MainActivity_description_one_product.class);

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

                    go_description.putExtra("name",products_playgames.get(position).getName());
                    go_description.putExtra("brand",products_playgames.get(position).getBrand());
                    go_description.putExtra("price",products_playgames.get(position).getPrice());
                    go_description.putExtra("description",products_playgames.get(position).getDescription());
                    go_description.putExtra("image",String.valueOf(products_playgames.get(position).getImage()));

                    startActivity(go_description);
                }
                return false;
            }

            @Override
            public void onTouchEvent(@NonNull RecyclerView rv, @NonNull MotionEvent e) {}

            @Override
            public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {}
        });





    }

}