package com.example.myapplication_alcampo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_home extends AppCompatActivity {
    LinearLayout ll_toys;
    LinearLayout ll_decoration;
    LinearLayout ll_playgames;
    LinearLayout ll_books;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_home);

        Intent intent_all_toys=new Intent(MainActivity_home.this, MainActivity_all_toys.class);
        Intent intent_all_decoration=new Intent(MainActivity_home.this, MainActivity_all_decoration.class);
        Intent intent_all_playgames=new Intent(MainActivity_home.this, MainActivity_all_playgames.class);
        Intent intent_all_books=new Intent(MainActivity_home.this, MainActivity_all_books.class);

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