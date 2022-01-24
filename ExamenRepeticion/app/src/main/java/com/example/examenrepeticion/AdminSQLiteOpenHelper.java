package com.example.examenrepeticion;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class AdminSQLiteOpenHelper extends SQLiteOpenHelper {

    private static final String NOMBRE_BD = "bdUsuarios"; //variable con el nombre de la base de datos
    private static final int VERSION_BD = 1; // variable con la versión de la base de datos
    //variable que tendrá la creación de la tabla a usar
    private static final String TABLA_USUARIOS = "create table Usuario (idUsuario integer primary key , nombre text, pass text, nivelUsuario text)";

    public AdminSQLiteOpenHelper(Context context) {
        super(context, NOMBRE_BD, null, VERSION_BD);
    }

    @Override
    public void onCreate(SQLiteDatabase SQLiteDatabase) {
        SQLiteDatabase.execSQL(TABLA_USUARIOS); //Ejecutar la creación de la tabla
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void ingresar(String IdUsuario ,String nombre, String pass, String nivelUsuario) {
        SQLiteDatabase bd = getWritableDatabase();//se otorga permiso de escritura a la base de datos

        if (bd != null) {
            //ejecutar la inserción
            bd.execSQL("insert into Usuario values('" + IdUsuario + "','" + nombre + "', '" + pass + "', '" + nivelUsuario + "' )");
            bd.close();//Cerrar la base de datos

        }
    }
}