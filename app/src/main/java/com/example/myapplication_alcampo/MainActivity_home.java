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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_home);

        Intent intent_final=new Intent(MainActivity_home.this, MainActivity_final.class);

        toys=(CardView) findViewById(R.id.option_toys);

        toys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity_home.this, "JUGUETES", Toast.LENGTH_SHORT).show();
                //Log.i("", "PRUEBA DE TEXTO");
                //startActivity(intent_final);
            }
        });



    }
}