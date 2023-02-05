package com.example.myapplication_alcampo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter_All_Products02 extends BaseAdapter {
    private  Context context;
    private ArrayList<Product>data;

    private int R_layout_idView;

    public Adapter_All_Products02(Context context, int R_layout_idView, ArrayList<Product> data){
        super();
        this.context=context;
        this.R_layout_idView=R_layout_idView;
        this.data=data;

    }
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView==null){
            LayoutInflater vi=(LayoutInflater)
                    context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=vi.inflate(R_layout_idView,null);
        }
        onEntrada(data.get(position),convertView);

        return convertView;
    }

    public void onEntrada(Object entrada, View view) {

    }


}
