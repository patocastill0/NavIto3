package com.example.navito20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button segundapagina;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        segundapagina=(Button)findViewById(R.id.id_RutaActiva);

        segundapagina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent segundapaginas= new Intent(MainActivity.this,VistaRutasActivas.class);
                startActivity(segundapaginas);
            }
        });
    }
}
