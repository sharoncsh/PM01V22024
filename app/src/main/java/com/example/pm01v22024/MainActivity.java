package com.example.pm01v22024;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import configuracion.SQLiteConexion;
import configuracion.Transacciones;

public class  MainActivity extends AppCompatActivity {
    /*declaracion de las variables globales*/
    EditText nombres,apellidos,telefono;
    Button btnproceso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*amarrando la interfas grafica a la logica*/

        nombres = (EditText) findViewById(R.id.nombres);
        apellidos = (EditText) findViewById(R.id.apellidos);
        telefono = (EditText) findViewById(R.id.telefono);
        btnproceso = (Button) findViewById(R.id.btnprocesar);

        btnproceso.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                AddPerson();
            }
        });

    }

    private void AddPerson()
    {
        SQLiteConexion conexion = new SQLiteConexion( this, Transacciones.DBName, null, 1);
        SQLiteDatabase db = conexion.getWritableDatabase();

        ContentValues valores = new ContentValues();
        valores.put(Transacciones.nombres, nombre.getText().toString());
    }
}
