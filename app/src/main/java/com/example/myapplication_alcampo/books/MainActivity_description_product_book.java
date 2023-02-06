package com.example.myapplication_alcampo.books;

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

import java.util.ArrayList;

public class MainActivity_description_product_book extends AppCompatActivity {
    Button buy;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description_product);

        Product one= new Product(11,R.drawable.monk,"El monje que vendió su Ferrari","ROBIN SHARMA","17,00",4.5f,"El monje que vendió su Ferrari es una fábula espiritual que, desde hace más de quince años, ha marcado la vida de millones de personas en todo el mundo.");


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

        Intent intent_final=new Intent(MainActivity_description_product_book.this, MainActivity_congratulations_final.class);

        buy=(Button) findViewById(R.id.description_buy);
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent_final);
            }
        });

    }
}
