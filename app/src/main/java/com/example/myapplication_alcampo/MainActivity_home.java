package com.example.myapplication_alcampo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.myapplication_alcampo.books.MainActivity_products_of_categories_books;
import com.example.myapplication_alcampo.decoration.MainActivity_products_of_categories_decoration;
import com.example.myapplication_alcampo.playgames.MainActivity_products_of_categories_playgames;
import com.example.myapplication_alcampo.toys.MainActivity_products_of_categories_toys;

public class MainActivity_home extends AppCompatActivity {
    LinearLayout ll_toys;
    LinearLayout ll_decoration;
    LinearLayout ll_playgames;
    LinearLayout ll_books;

    CardView cv_playgames;
    CardView cv_books;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_home);

        Intent intent_products_categories=new Intent(MainActivity_home.this, MainActivity_products_of_categories.class);
        Intent intent_final=new Intent(MainActivity_home.this, MainActivity_congratulations_final.class);
        Intent intent_description=new Intent(MainActivity_home.this, MainActivity_description_product.class);

        Intent intent_all_toys=new Intent(MainActivity_home.this, MainActivity_products_of_categories_toys.class);
        Intent intent_all_decoration=new Intent(MainActivity_home.this, MainActivity_products_of_categories_decoration.class);
        Intent intent_all_playgames=new Intent(MainActivity_home.this, MainActivity_products_of_categories_playgames.class);
        Intent intent_all_books=new Intent(MainActivity_home.this,MainActivity_products_of_categories_books.class);

        ll_toys=(LinearLayout) findViewById(R.id.option_toys);
        ll_decoration=(LinearLayout) findViewById(R.id.option_decoration);
        ll_playgames=(LinearLayout) findViewById(R.id.option_playgames);
        ll_books=(LinearLayout) findViewById(R.id.option_books);

        ll_toys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent_all_toys);
            }
        });

        ll_decoration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent_all_decoration);
            }
        });

        ll_playgames.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent_all_playgames);
            }
        });

        ll_books.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent_all_books);
            }
        });


    }
}