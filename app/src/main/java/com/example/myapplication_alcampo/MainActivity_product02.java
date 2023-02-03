package com.example.myapplication_alcampo;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity_product02 extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description_product);

        ArrayList<Product> data=new ArrayList<Product>();
        data.add(new Product(1,R.drawable.snowy_tree01,"Arbol de navidad nevado","HOMCOM","54,99",3.5f,"Este árbol artificial tiene la belleza de un abeto natural gracias a la combinación de ramas y bayas.\\nSu estructura y soporte metálico se pueden montar y desmontar fácilmente.\\nAltura: 150 cm.\\nLas 554 ramas y las 41 bayas dan un aspecto natural y original al árbol.\\nLas ramas se abren automáticamente para facilitar el montaje."));

        Intent intent_final=new Intent(MainActivity_product02.this, MainActivity_final.class);

        LinearLayout layout=(LinearLayout)findViewById(R.id.description_layout);

        LayoutInflater inflater=LayoutInflater.from(this);
        View description_product=inflater.inflate(R.layout.activity_description_product,layout,false);

        ImageView image=(ImageView) description_product.findViewById(R.id.description_image);
        image.setImageResource(data.get(1).getImage());

        TextView name=(TextView) description_product.findViewById(R.id.description_name);
        name.setText(data.get(1).getName());
        TextView brand=(TextView) description_product.findViewById(R.id.description_brand);
        brand.setText(data.get(1).getBrand());
        TextView price=(TextView) description_product.findViewById(R.id.description_price);
        price.setText(data.get(1).getPrice()+"€");
        TextView description=(TextView) description_product.findViewById(R.id.description_description);
        price.setText(data.get(1).getDescription());

        /*
        layout=(ListView) findViewById(R.id.listView_main);
        texto=(TextView) findViewById(R.id.text_informative);


        layout.setAdapter(new Adaptador(this,R.layout.entrada,datos) {
            @Override
            public void onEntrada(Object entrada, View view){
                if(entrada!=null){
                    texto_superior_entrada=(TextView) view.findViewById(R.id.texto_titulo);
                    TextView texto_inferior_entrada=(TextView) view.findViewById(R.id.texto_datos);
                    ImageView imagen_entrada=(ImageView) view.findViewById(R.id.imagen);
                    RadioButton miRadio=(RadioButton) view.findViewById(R.id.boton);

                    texto_superior_entrada.setText(((Encapsulador)entrada).getTitulo());
                    texto_inferior_entrada.setText(((Encapsulador)entrada).getTexto());
                    imagen_entrada.setImageResource(((Encapsulador)entrada).getImagen());

                    miRadio.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(radioButton_pulsado!=null)
                                radioButton_pulsado.setChecked(false);
                            radioButton_pulsado=(RadioButton) view;
                            if(radioButton_pulsado.isChecked()==true)
                                texto.setText(((Encapsulador)entrada).getTitulo());
                            if(radioButton_pulsado.isChecked()==false)
                                texto.setText("NINGUNA OPCION SELECCIONADA");
                        }
                    });
                }
            }
        });


         */
    }
}
