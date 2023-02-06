package com.example.myapplication_alcampo.decoration;

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

public class MainActivity_description_product_decoration extends AppCompatActivity {
    Button buy;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description_product);

        Product one= new Product(24,R.drawable.elfs01,"Duendes de Navidad","JYSK","4,00",5f,"Materiales: Polipropileno, Poliester y Arena\\nTamaño: Ancho: 9,5cm, Longitud: 9 cm, Altura: 23 cm\\nUsar: Para interior.");


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

        Intent intent_final=new Intent(MainActivity_description_product_decoration.this, MainActivity_congratulations_final.class);

        buy=(Button) findViewById(R.id.description_buy);
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent_final);
            }
        });

    }
}
