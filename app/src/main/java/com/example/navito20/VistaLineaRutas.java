package com.example.navito20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

public class VistaLineaRutas extends AppCompatActivity {
    ListView listalineas;

    String datos[][]={
            {"Tusug","Servicio: 5:50 hrs a 22:00 hrs"},
            {"Choferes del Sur","Servicio: 5:50 hrs a 22:00 hrs"},
            {"Tugdosa","Servicio: 5:50 hrs a 22:00 hrs"},
            {"Sertexa","Servicio: 5:50 hrs a 22:00 hrs"}

    };

    int[] img ={R.drawable.maps,R.drawable.maps,R.drawable.maps,R.drawable.maps};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_linea_rutas);
        listalineas= (ListView)findViewById(R.id.listarutas);

        listalineas.setAdapter(new AdaptadorLineaRutas(this,datos,img));
    }
}
