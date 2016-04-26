package com.construguia.tecnoparque.construguia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ListView;

import com.construguia.tecnoparque.construguia.DTO.itemLista;

public class ConstruirActivity extends AppCompatActivity {

    ListView listItemConstruir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_construir);

        itemLista[] datos =
                new itemLista[]{
                        new itemLista("Piso", "Todo tipo de pisos", R.drawable.piso),
                        new itemLista("Pared", "Todo tipo de paredes", R.drawable.pared),
                        new itemLista("Techo", "Todo tipo de techos", R.drawable.pared),
                        new itemLista("Puerta", "Todo tipo de puertas", R.drawable.piso),
                        new itemLista("Ventana", "Todo tipo de ventanas", R.drawable.pared),
                        new itemLista("Luminaria", "Todo tipo de luminarias", R.drawable.piso),
                };

        adaptador_listview adaptador =
                new adaptador_listview(this, R.id.listViewConstruir,datos);

        listItemConstruir = (ListView)findViewById(R.id.listViewConstruir);

        listItemConstruir.setAdapter(adaptador);

    }
}
