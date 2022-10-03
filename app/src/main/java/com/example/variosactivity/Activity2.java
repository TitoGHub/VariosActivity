package com.example.variosactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    private TextView txtRecibido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        txtRecibido = (TextView) findViewById(R.id.txtPantallaDos);

        Intent intent = getIntent(); //Enlazo con el intent recibido
        if (intent != null){
            String textoRecibido = intent.getStringExtra(MainActivity.ExtraMensage);
            txtRecibido.setText(textoRecibido);

            //PREGUNTAR PROFESOR MENSAJE NO SE MUESTRA BIEN EN PANTALLA2.
        }
    }
}