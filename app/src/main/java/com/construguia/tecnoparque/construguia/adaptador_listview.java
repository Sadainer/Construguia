package com.construguia.tecnoparque.construguia;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.construguia.tecnoparque.construguia.DTO.itemLista;

/**
 * Created by YOLIMA on 26/04/2016.
 */
public class adaptador_listview extends ArrayAdapter<itemLista> {

    itemLista[] datos;
    Context cnt;
    int layout_list;
    public adaptador_listview(Context context, int resource, itemLista[] objects) {
        super(context, resource, objects);
        datos=objects;
        cnt=context;
        layout_list=resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(layout_list, null);

        TextView lblTitulo = (TextView)item.findViewById(R.id.textTitulo);
        lblTitulo.setText(datos[position].getTitulo());

        TextView lblSubtitulo = (TextView)item.findViewById(R.id.textSubTitulo);
        lblSubtitulo.setText(datos[position].getSubtitulo());

        return(item);

    }
}


