package com.example.myapplication_alcampo.books;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.myapplication_alcampo.Adapter_All_Products;
import com.example.myapplication_alcampo.MainActivity_home;
import com.example.myapplication_alcampo.Product;
import com.example.myapplication_alcampo.R;

import java.util.ArrayList;

public class MainActivity_products_of_categories_books extends AppCompatActivity {
    CardView cardView;
    TextView name_category;
    Toolbar toolbar;
    ImageButton auchan;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_product_of_category);

        toolbar=(Toolbar)findViewById(R.id.toolbar);
        auchan=(ImageButton)findViewById(R.id.imageButton);

        name_category=(TextView)findViewById(R.id.categoryTitle);
        name_category.setText("Libros");

        Intent go_home=new Intent(MainActivity_products_of_categories_books.this, MainActivity_home.class);

        auchan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(go_home);
            }
        });
        /*setSupportActionBar(binding.toolbar);
        toolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(go_home);
            }
        });*/



        GridView list=(GridView) findViewById(R.id.list_products);

        ArrayList<Product>products_books=new ArrayList<Product>();
        products_books.add(new Product(11,R.drawable.monk,"El monje que vendió su Ferrari","ROBIN SHARMA","17,00",4.5f,"El monje que vendió su Ferrari es una fábula espiritual que, desde hace más de quince años, ha marcado la vida de millones de personas en todo el mundo."));
        products_books.add(new Product(12,R.drawable.fathers,"Padre rico, padre pobre","ROBERT T. KIYOSAKI","9,99",5f,"Padre rico, padre pobre es el libro de finanzas personales nº 1 en todo el mundo, el manual de Robert T. Kiyosaki que enseña a las personas a hacerse millonarias."));
        products_books.add(new Product(13,R.drawable.fathers_pack,"PACK Padre rico, padre pobre","ROBERT T. KIYOSAKI","15,99",5f,"Una edición pack que reúne dos de los títulos imprescindibles de Robert T. Kiyosaki, el «maestro» millonario. El pack incluye: Padre rico, padre pobre y El cuadrante del dinero."));
        products_books.add(new Product(14,R.drawable.the_lord,"PACK El señor de los anillos","J.R.R. TOLKIEN","32,95",5f,"El pack incluye: La Comunidad del Anillo, Las Dos Torres y El Retorno del Rey."));
        products_books.add(new Product(15,R.drawable.hobbit,"El Hobbit",".R.R. TOLKIEN","10,40",5f,"Un gran clásico moderno y el preludio de las vastas y poderosas mitologías de El Señor de los Anillos Smaug parecía profundamente dormido cuando Bilbo espió una vez más desde la entrada. ¡Pero fingía estar dormido! ¡Estaba vigilando la entrada del túnel!... Sacado de su cómodo agujero-hobbit por Gandalf y una banda de enanos, Bilbo se encuentra de pronto en medio de una conspiración que pretende apoderarse del tesoro de Smaug el Magnífico, un enorme y muy peligroso dragón...\\n«Todos los que aman esos libros para niños que pueden ser leídos y releídos por adultos han de tomar buena nota de que una nueva estrella ha aparecido en esa constelación.» C.S. LEWIS"));
        products_books.add(new Product(16,R.drawable.fire_blood1,"Fuego y Sangre (Canción de hielo y fuego) I","GEORGE R.R. MARTIN","14,20",4.5f,"Aquí tenemos el primero de los dos volúmenes en el que el autor de Juego de tronos nos cuenta, con todo lujo de detalles, la historia de tan fascinante familia: empezando por Aegon I Targaryen, creador del icónico Trono de Hierro, y seguido por el resto de las generaciones de Targaryens que lucharon con fiereza por conservar el poder, y el trono, hasta la llegada de la guerra civil que casi acaba con ellos."));
        products_books.add(new Product(17,R.drawable.wheel_time,"La rueda del tiempo: El ojo del Mundo","ROBERT JORDAN","18,95",5f,"La vida de Rand Al’Thor y sus amigos en Campo de Emond ha resultado bastante monótona hasta que una joven misteriosa llega al pueblo. Moraine, una maga capaz de encauzar el Poder Único, anuncia el despertar de una terrible amenaza."));
        products_books.add(new Product(18,R.drawable.encrypted,"La encrucijada mundial","PEDRO BAÑOS","20,80",4.5f,"Si en sus anteriores libros Pedro Baños ofrecía un lúcido análisis de las relaciones de poder, esta nueva obra no solo describe con detalle las excepcionales circunstancias que se están dando en el presente y las que padeceremos en el futuro inmediato en nuestro mundo hiperconectado, sino que va mucho más allá y propone soluciones que sirvan a todas las personas, en cualquier país, convirtiéndose en un manual práctico imprescindible. Las fórmulas del siglo pasado ya no son válidas. Hemos entrado de lleno en la era digital, una verdadera revolución industrial, económica y social cuyos efectos apenas empezamos a vislumbrar."));

        ArrayAdapter<Product>adapter=new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, products_books);
        list.setAdapter(new Adapter_All_Products(this,R.layout.product,products_books){

        });



     /*   public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.go_home:
                startActivity(go_home);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


}
}*/







    }
}
