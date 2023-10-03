package com.example.listadapterss;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListAdapter extends BaseAdapter {
    //para saber donde esta la aplicacion
    Context contexto;
    String [] nombres,mensajes,horaUltimoMensaje,numeroTelefono,pais;
    //para identificar la clase
    int idImagen;

    LayoutInflater inflater;

    public ListAdapter(Context contexto, String[] nombres, String[] mensajes, String[] horaUltimoMensaje, String[] numeroTelefono, String[] pais, int idImagen) {
        this.contexto = contexto;
        this.nombres = nombres;
        this.mensajes = mensajes;
        this.horaUltimoMensaje = horaUltimoMensaje;
        this.numeroTelefono = numeroTelefono;
        this.pais = pais;
        this.idImagen = idImagen;
        inflater = LayoutInflater.from(contexto);
    }

    @Override
    //pasara saber cuantos datos llegaron en el arreglo nombres
    public int getCount(){return nombres.length;} //devuelve la cantidad de datos recibidos

    @Override
    //regresa un objeto vacio  y recibe la cantidad de datos i
    public  Object getItem(int i){return null;}

    @Override
    //
    public long getItemId(int i){return 0;}

    @Override
    //obtener la vista (LA PARTE GRAFICA)
    public View getView(int i, View vista, ViewGroup viewGroup){
        vista = inflater.inflate(R.layout.list_item,null);
        ImageView fotoPerfil = vista.findViewById(R.id.imagenPerfil);
        TextView nombreUsuario = vista.findViewById(R.id.nombrePersona);
        TextView ultimoMensaje = vista.findViewById(R.id.ultimoMensaje);
        TextView horaMensaje = vista.findViewById(R.id.horaMensaje);
        fotoPerfil.setImageResource(idImagen);
        nombreUsuario.setText(nombres[i]);
        ultimoMensaje.setText(mensajes[i]);
        horaMensaje.setText(horaUltimoMensaje[i]);
        return vista;
    }


}
