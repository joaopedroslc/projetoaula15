package com.example.arqdsis.projeto;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BuscaActivity extends AppCompatActivity {

    private EditText busca;
    private Button buscar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busca);

        busca = (EditText) findViewById(R.id.busca);
        buscar = (Button) findViewById(R.id.btnBuscar);
        buscar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String bu = busca.getEditableText().toString();
                Intent intent = new Intent (BuscaActivity.this, ListaActivity.class);
                intent.putExtra("busca", bu);
                startActivity(intent);
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BuscaActivity.this, NovoActivity.class);
                startActivity(intent);

            }
        });
    }

}