package com.example.examenrepeticion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityChocolates extends AppCompatActivity {
       private ArrayList<Chocolates>  ListaChocolates;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chocolates);
        ListaChocolates =new ArrayList<Chocolates>();
        ListaChocolates.add(new Chocolates(1,"Golden Nust","Chocolate con almendas enteras","1500" ));
        ListaChocolates.add(new Chocolates(2,"Blanco Rama","Chocolate con almendas enteras","2500" ));
        ListaChocolates.add(new Chocolates(3,"Negro Rama","Chocolate con almendas enteras","3500" ));
        ListaChocolates.add(new Chocolates(4,"70% cacao","Chocolate con almendas enteras","5500" ));
        ListaChocolates.add(new Chocolates(5,"Blanco Rama","Chocolate con almendas enteras","6500" ));
        ListaChocolates.add(new Chocolates(6,"80% cacao","Chocolate con almendas enteras","9500" ));
        ListaChocolates.add(new Chocolates(7,"90% cacao","Chocolate con almendas enteras","3500" ));
        ListaChocolates.add(new Chocolates(8,"99% cacao","Chocolate con almendas enteras","4500" ));
        ListaChocolates.add(new Chocolates(9,"10% cacao","Chocolate con almendas enteras","500" ));
        ListaChocolates.add(new Chocolates(10,"Blanco Rama","Chocolate con almendas enteras","8500" ));

        AdaptadorChocolates adaptador =new AdaptadorChocolates(this);
        ListView lv1=(ListView) findViewById(R.id.Lista1);
        lv1.setAdapter(adaptador);

    }

    class AdaptadorChocolates extends ArrayAdapter<Chocolates> {
        AppCompatActivity appCompatActivity;

        public AdaptadorChocolates(AppCompatActivity context) {
            super(context, R.layout.chocolates, ListaChocolates);
            appCompatActivity = context;
        }

        public View getView (int position, View convertView, ViewGroup parent){
            LayoutInflater inflater =appCompatActivity.getLayoutInflater();

            View item =inflater.inflate(R.layout.chocolates, null);

            TextView textView5=(TextView)item.findViewById(R.id.textView3);
            textView5.setText(ListaChocolates.get(position).getNombreChocolate());

            ImageView imagenView2=(ImageView)item.findViewById(R.id.imageView2);

            if(ListaChocolates.get(position).getNombreChocolate().equals("Blanco Rama"))
                imagenView2.setImageResource(R.mipmap.iconoblanco);
            else
                imagenView2.setImageResource(R.mipmap.icononegro);

            TextView textView6=(TextView)item.findViewById(R.id.textView4);
            textView6.setText(ListaChocolates.get(position).getPrecio());

            return(item);
        }
    }
    }
