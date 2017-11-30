package com.example.arqdsis.projeto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListaActivity extends AppCompatActivity {

    ListView nomesListView;
    private List<String> lista = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        nomesListView = (ListView) findViewById(R.id.nomesListView);
        inicializaLista();
        Intent origem = getIntent();
        String busca = origem.getStringExtra("busca");
        //Toast.makeText(this, busca, Toast.LENGTH_SHORT).show();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, realizaBusca(busca));
        nomesListView.setAdapter(adapter);
    }

    private void inicializaLista (){
        lista.add("Carlos Drummond de Andrade");
        lista.add("Manuel Bandeira");
        lista.add("Olavo Bilac");
        lista.add("Vinícius de Moraes");
        lista.add("Cecília Meireles");
        lista.add("Castro Alves");
        lista.add("Gonçalves Dias");
        lista.add("Ferreira Gullar");
        lista.add("Machado de Assis");
        lista.add("Mário de Andrade");
        lista.add("Cora Coralina");
        lista.add("Manoel de Barros");
        lista.add("João Cabral de Melo Neto");
        lista.add("Casimiro de Abreu");
        lista.add("Paulo Leminski");
        lista.add("Álvares de Azevedo");
        lista.add("Guilherme de Almeida");
        lista.add("Alphonsus de Guimarães");
        lista.add("Mário Quintana");
        lista.add("Gregório de Matos");
        lista.add("Augusto dos Anjos");
    }

    private List<String> realizaBusca (String busca){
        if (busca == null || busca.length() == 0){
            return lista;
        }
        List <String> devolucao = new ArrayList<>();
        for (String elemento : lista){
            if (elemento.contains(busca)){
                devolucao.add(elemento);
            }
        }
        return devolucao;
    }
}