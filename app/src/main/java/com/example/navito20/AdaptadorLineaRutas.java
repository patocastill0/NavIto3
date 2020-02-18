package com.example.navito20;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class AdaptadorLineaRutas extends BaseAdapter {
    //Es para instanciar el archivo xml de la lista
    private static LayoutInflater inflater=null;
    Context contexto;
    String[][] datos;
    int []img;
    public AdaptadorLineaRutas(Context conexto,String [][]datos, int[] imagenes){
        this.contexto=conexto;
        this.datos=datos;
        this.img= imagenes;
        inflater=(LayoutInflater)conexto.getSystemService(conexto.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        final View vista= inflater.inflate(R.layout.elemento_linea_rutas,null);
        TextView linea = (TextView)vista.findViewById(R.id.id_textolinea);
        TextView servicio =(TextView)vista.findViewById(R.id.id_servicio);

        ImageView imagenlinea= (ImageView)vista.findViewById(R.id.id_imglineas);

        linea.setText(datos[i][0]);
        servicio.setText(datos[i][1]);
        imagenlinea.setImageResource(img[i]);

        return vista;
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
