package com.example.pm01v22024;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import configuracion.SQLiteConexion;

public class ActivityList extends AppCompatActivity {

    SQLiteConexion conexion;
    ListView listpersonas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
    }
}