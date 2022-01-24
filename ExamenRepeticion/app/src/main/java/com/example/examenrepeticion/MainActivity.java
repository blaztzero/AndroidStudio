package com.example.examenrepeticion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edTextNombreUsuario, edTextPass;

    Button btnIniciarSeccion , btnNuevoUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edTextNombreUsuario=(EditText) findViewById(R.id.edTextNombreUsuario);
        edTextPass=(EditText) findViewById(R.id.edTextPass);
        btnNuevoUsuario=(Button) findViewById(R.id.btnNuevoUsuario);

        final AdminSQLiteOpenHelper bd=new AdminSQLiteOpenHelper(getApplicationContext());
/*
        btnIniciarSeccion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bd.ingresar(edTextNombreUsuario.getText().toString(),edTextPass.getText().toString(), );
                Toast.makeText(getApplicationContext(), "Ingreso correcto", Toast.LENGTH_SHORT).show();
               et1.setText("");
                et2.setText("");

            }
        );
*/

    }

    public void RegistarUsuario(View v){



        Intent i = new Intent(this,ActivityUsuarios.class);
        startActivity(i);
    }
    public void VistaBDexterna(View v){



        Intent i = new Intent(this,ActivityBDexterna.class);
        startActivity(i);
    }


    public void consultaUsuario(View v){
        final AdminSQLiteOpenHelper bd=new AdminSQLiteOpenHelper(getApplicationContext());
        SQLiteDatabase bd1=bd.getWritableDatabase();
        String usuarioAccede=edTextNombreUsuario.getText().toString();
        String pass=edTextPass.getText().toString();
        Cursor fila=bd1.rawQuery("select * from usuario where nombre = "+usuarioAccede+ " " ,null);

        if (fila.moveToFirst()){
            Toast.makeText(this, "bienvenido usuario "+fila.getString(1), Toast.LENGTH_SHORT).show();


            Intent i = new Intent(this,ActivityBDexterna.class);
            startActivity(i);

        } else{
            Toast.makeText(this, "No existe el Usuario", Toast.LENGTH_SHORT).show();
        }
        bd1.close();

    }


}