package com.construguia.tecnoparque.construguia;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.construguia.tecnoparque.construguia.DTO.itemLista;

public class ConstruirActivity extends AppCompatActivity {

    ListView listItemConstruir;
    Context cnt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_construir);
        cnt=this;
        itemLista[] datos =
                new itemLista[]{
                        new itemLista("Piso", "Todo tipo de pisos", R.drawable.piso),
                        new itemLista("Pared", "Todo tipo de paredes", R.drawable.pared),
                        new itemLista("Techo", "Todo tipo de techos", R.drawable.pared),
                        new itemLista("Puerta", "Todo tipo de puertas", R.drawable.piso),
                        new itemLista("Ventana", "Todo tipo de ventanas", R.drawable.pared),
                        new itemLista("Luminaria", "Todo tipo de luminarias", R.drawable.piso),
                };

        AdaptadorListview adaptador =
                new AdaptadorListview(this,R.layout.layout_adaptador_listview,datos);

        listItemConstruir = (ListView)findViewById(R.id.listViewConstruir);

        listItemConstruir.setAdapter(adaptador);

        listItemConstruir.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                itemLista item = (itemLista)parent.getItemAtPosition(position);
                Toast.makeText(cnt,item.getTitulo().toString(),Toast.LENGTH_SHORT).show();
            }
        });

    }
}
