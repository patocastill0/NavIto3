package com.example.navito20;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class AdaptadorRutaProxima extends BaseAdapter {
    //Es para instanciar el archivo xml de la lista
    private static LayoutInflater inflater=null;
    Context contexto;
    String[][] datos;
    public AdaptadorRutaProxima(Context conexto, String [][]datos){
        this.contexto=conexto;
        this.datos=datos;
        inflater=(LayoutInflater)conexto.getSystemService(conexto.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        final View vistaproximas = inflater.inflate(R.layout.elemento_rutas_activas,null);
        TextView rutas=(TextView)vistaproximas.findViewById(R.id.id_ruta);
        TextView destinos = (TextView)vistaproximas.findViewById(R.id.id_destino);
        TextView calles = (TextView)vistaproximas.findViewById(R.id.id_calles);

        rutas.setText(datos[i][0]);
        destinos.setText(datos[i][1]);
        calles.setText(datos[i][2]);
        return vistaproximas;
    }

    @Override
    public int getCount() {
        return datos.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


}
