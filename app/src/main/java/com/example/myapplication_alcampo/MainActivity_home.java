package com.example.myapplication_alcampo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity_home extends AppCompatActivity {
    LinearLayout toys;
    LinearLayout decoration;
    CardView playgames;
    CardView books;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_home);

        Intent intent_products_categories=new Intent(MainActivity_home.this, MainActivity_categories.class);
        Intent intent_final=new Intent(MainActivity_home.this, MainActivity_final.class);

        toys=(LinearLayout) findViewById(R.id.option_toys);
        decoration=(LinearLayout) findViewById(R.id.option_decoration);

        toys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent_final);
            }
        });

        decoration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent_products_categories);
            }
        });



    }
}