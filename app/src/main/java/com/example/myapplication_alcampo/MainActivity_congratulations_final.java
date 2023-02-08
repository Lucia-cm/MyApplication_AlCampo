package com.example.myapplication_alcampo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_congratulations_final extends AppCompatActivity {
    ImageButton house_home;
    ImageButton auchan_home;
    ImageButton return_view;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        String name=getIntent().getStringExtra("name");
        String brand=getIntent().getStringExtra("brand");
        String image=getIntent().getStringExtra("image");

        TextView nameP=(TextView) findViewById(R.id.nameProduct);
        TextView brandP=(TextView) findViewById(R.id.brandProduct);
        ImageView imageP=(ImageView) findViewById(R.id.productBuyed);

        nameP.setText(name);
        brandP.setText(brand);
        imageP.setImageResource(Integer.parseInt(image));

        house_home=(ImageButton) findViewById(R.id.toHome);
        auchan_home=(ImageButton)findViewById(R.id.auchanButton);
        return_view=(ImageButton)findViewById(R.id.toPrevious);
        house_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goHome();
            }
        });
        auchan_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goHome();
            }
        });
        return_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goPrevious();
            }
        });

    }

    public void goHome(){
        Intent goHome=new Intent(MainActivity_congratulations_final.this,MainActivity_home.class);
        startActivity(goHome);
    }
    public void goPrevious(){
        onBackPressed();
    }
}
