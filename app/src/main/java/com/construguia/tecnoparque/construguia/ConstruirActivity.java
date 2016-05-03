package com.construguia.tecnoparque.construguia;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

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
                        new itemLista("Techo", "Todo tipo de techos", R.drawable.techo),
                        new itemLista("Puerta", "Todo tipo de puertas", R.drawable.puerta),
                        new itemLista("Ventana", "Todo tipo de ventanas", R.drawable.ventana),
                        new itemLista("Luminaria", "Todo tipo de luminarias", R.drawable.luminaria),
                };

        AdaptadorListview adaptador =
                new AdaptadorListview(this,R.layout.layout_adaptador_listview,datos);

        listItemConstruir = (ListView)findViewById(R.id.listViewConstruir);

        listItemConstruir.setAdapter(adaptador);

        listItemConstruir.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                itemLista item = (itemLista)parent.getItemAtPosition(position);

                Intent intent_next=new Intent(ConstruirActivity.this,ConstruirTipoActivity.class);
                startActivity(intent_next);
                overridePendingTransition(R.anim.left_in,
                        R.anim.left_out);

            }
        });

    }
}
