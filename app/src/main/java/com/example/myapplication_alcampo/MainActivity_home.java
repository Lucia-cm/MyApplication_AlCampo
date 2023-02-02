package com.example.myapplication_alcampo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity_home extends AppCompatActivity {
    CardView toys;
    CardView decoration;
    CardView playgames;
    CardView books;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_home);

        Intent intent_products_categories=new Intent(MainActivity_home.this, MainActivity_categories.class);
        Intent intent_final=new Intent(MainActivity_home.this, MainActivity_final.class);

        toys=(CardView) findViewById(R.id.option_toys);
        decoration=(CardView) findViewById(R.id.option_decoration);

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