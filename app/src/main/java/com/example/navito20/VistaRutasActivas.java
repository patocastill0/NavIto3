package com.example.navito20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class VistaRutasActivas extends AppCompatActivity {
    ListView lista,lista2;
    Button rutasproximas;
    String [][] datos = {
            {"Ruta 69","1RA. ETAPA U.H.","Centro"},
            {"Ruta 72","COL. MONTE ALBAN","Central de abastos"},
            {"Ruta 75","FRACC. EL ROSARIO","J.P. Garcia"},
            {"Ruta 23","FRACC. BENITO JUAREZ - MONUMENTO","Sta. Lucia"},
            {"Ruta 33","VIGUERA - 1RA. ETAPA","Centro"},
            {"Ruta 43","PANTEON JARDIN - ALAMOS INFONAVIT","Centro"}
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_rutas_activas);
        lista=(ListView)findViewById(R.id.listview1);
        lista.setAdapter(new AdaptadorRutaActiva(this,datos));
        rutasproximas=(Button)findViewById(R.id.id_BTNproximas);
        rutasproximas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent proximas = new Intent(VistaRutasActivas.this,VistaRutasProximas.class);
                startActivity(proximas);
            }
        });
    }
}
