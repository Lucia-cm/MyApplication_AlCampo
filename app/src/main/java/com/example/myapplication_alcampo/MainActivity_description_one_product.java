package com.example.myapplication_alcampo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_description_one_product extends AppCompatActivity {
    Button buy;

    ImageButton house_home;
    ImageButton auchan_home;
    ImageButton return_view;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description_product);

        String name=getIntent().getStringExtra("name");
        String brand=getIntent().getStringExtra("brand");
        String price=getIntent().getStringExtra("price");
        String description=getIntent().getStringExtra("description");
        String image=getIntent().getStringExtra("image");

        TextView nameD=(TextView) findViewById(R.id.description_name);
        TextView brandD=(TextView) findViewById(R.id.description_brand);
        TextView priceD=(TextView) findViewById(R.id.description_price);
        TextView descriptionD=(TextView) findViewById(R.id.description_description);
        ImageView imgD=(ImageView) findViewById(R.id.description_image);

        nameD.setText(name);
        brandD.setText(brand);
        priceD.setText(price+"€");
        descriptionD.setText(description);
        imgD.setImageResource(Integer.parseInt(image));

        Intent intent_final=new Intent(MainActivity_description_one_product.this, MainActivity_congratulations_final.class);

        buy=(Button) findViewById(R.id.description_buy);
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent_final.putExtra("name",name);
                intent_final.putExtra("brand",brand);
                intent_final.putExtra("image",image);

                startActivity(intent_final);
            }
        });
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
        Intent goHome=new Intent(MainActivity_description_one_product.this,MainActivity_home.class);
        startActivity(goHome);
    }
    public void goPrevious(){
        onBackPressed();
    }
}
