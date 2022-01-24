package com.example.examenrepeticion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class ActivityBDexterna extends AppCompatActivity {

    EditText codigoChocolates, nombreChocolates, precioChocolates;
    Button btnAgregar, btnEliminarChocolate,btnModificarChocolate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bdexterna);

        codigoChocolates = (EditText) findViewById(R.id.codigoChocolates);
        nombreChocolates = (EditText) findViewById(R.id.nombreChocolates);
        precioChocolates = (EditText) findViewById(R.id.precioChocolates);
        precioChocolates = (EditText) findViewById(R.id.precioChocolates);
        btnAgregar = (Button) findViewById(R.id.btnAgregar);
        btnEliminarChocolate = (Button) findViewById(R.id.btnEliminarChocolate);
        btnModificarChocolate= (Button) findViewById(R.id.btnModificarChocolate);

        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ejecutarIngreso("http://192.168.2.104/android/insertar.php");

            }
        });
        btnEliminarChocolate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ejecutarIngreso("http://192.168.2.104/android/eliminar.php");

            }
        });
        btnModificarChocolate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ejecutarIngreso("http://192.168.2.104/android/modificar.php");

            }
        });
    }
    public void VistaChocolates(View v){



        Intent i = new Intent(this,ActivityChocolates.class);
        startActivity(i);
    }

    public void ejecutarIngreso(String URL) {
        StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {

            @Override
            public void onResponse(String response) {
                Toast.makeText(getApplicationContext(), "Operación Exitosa", Toast.LENGTH_SHORT).show();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), error.toString(), Toast.LENGTH_SHORT).show();
            }
        }) {
            protected Map<String, String> getParams() throws AuthFailureError {

                Map<String, String> parametros = new HashMap<String, String>();
                parametros.put("codigoChocolates", codigoChocolates.getText().toString());
                parametros.put("nombreChocolates", nombreChocolates.getText().toString());
                parametros.put("precioChocolates", precioChocolates.getText().toString());

                return parametros;
            }


        };
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);

    }
}