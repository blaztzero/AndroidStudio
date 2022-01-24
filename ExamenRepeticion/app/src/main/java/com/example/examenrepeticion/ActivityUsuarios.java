package com.example.examenrepeticion;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityUsuarios extends AppCompatActivity {

    EditText edTxtIdUsuario, edtxtnombredeusuario ,edtxtContrasena;
    Button btnGuardarUsuario;
    CheckBox checkboxAdministrador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuarios);
        edTxtIdUsuario=(EditText) findViewById(R.id.edTxtIdUsuario);
        edtxtnombredeusuario=(EditText) findViewById(R.id.edtxtnombredeusuario);
        edtxtContrasena=(EditText) findViewById(R.id.edtxtContrasena);
        checkboxAdministrador=(CheckBox) findViewById(R.id.checkboxAdministrador);
        btnGuardarUsuario=(Button) findViewById(R.id.btnGuardarUsuario);

        final AdminSQLiteOpenHelper bd=new AdminSQLiteOpenHelper(getApplicationContext());

        btnGuardarUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tipoUsuario = "";

                if(checkboxAdministrador.isChecked()){
                      tipoUsuario = "Administrador";
                }else{
                      tipoUsuario = "Usuario";
                };
                bd.ingresar(edTxtIdUsuario.getText().toString(),edtxtnombredeusuario.getText().toString(),edtxtContrasena.getText().toString(), tipoUsuario);
                Toast.makeText(getApplicationContext(), "Registrado Correctamente Sr "+edtxtnombredeusuario.getText().toString(), Toast.LENGTH_SHORT).show();

            }
        });

    }





}
