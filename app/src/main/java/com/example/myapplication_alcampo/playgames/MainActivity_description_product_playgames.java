package com.example.myapplication_alcampo.playgames;

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

import com.example.myapplication_alcampo.MainActivity_congratulations_final;
import com.example.myapplication_alcampo.Product;
import com.example.myapplication_alcampo.R;

public class MainActivity_description_product_playgames extends AppCompatActivity {
    Button buy;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description_product);

        Product one= new Product(33,R.drawable.witcher01,"The Witcher 3: Wild Hunt","BANDAI NAMCO","33,90",4.7f,"Clasificado: No recomendada para menores de 18 años\\nJuega a la versión más completa y pulida del juego más galardonado de 2015 -The Witcher 3: Wild Hunt. Ahora disponible con todas las expansiones y el contenido adicional. ¡Conviértete en un cazador de monstruos profesional y embárcate en una aventura épica! Desde su lanzamiento, The Witcher 3: Wild Hunt se convirtió en un clásico, con más de 250 premios Game of the Year.");


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

        Intent intent_final=new Intent(MainActivity_description_product_playgames.this, MainActivity_congratulations_final.class);

        buy=(Button) findViewById(R.id.description_buy);
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent_final);
            }
        });

    }
}
