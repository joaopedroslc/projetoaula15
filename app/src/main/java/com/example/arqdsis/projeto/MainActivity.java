package com.example.arqdsis.projeto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText usuario;
    EditText senha;
    Button logar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuario = (EditText) findViewById(R.id.usuario);
        senha = (EditText) findViewById(R.id.senha);
        logar = (Button) findViewById(R.id.logar);

        logar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(usuario.getText().length() != 0 && senha.getText().length() != 0){
                    Intent intent = new Intent(MainActivity.this, BuscaActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this, "Digite um usuário e senha", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}