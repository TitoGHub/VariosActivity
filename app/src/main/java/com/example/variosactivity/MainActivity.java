package com.example.variosactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText extTextoEnviarP1;
    public static String ExtraMensage = "java.com.example.variosactivity.mensaje";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        extTextoEnviarP1 = (EditText) findViewById(R.id.etxtPantallaUno);
    }

    public void enviarPantallaDos(View view) {
        Intent intent = new Intent(this, Activity2.class);
        String texto = String.valueOf(extTextoEnviarP1);
        intent.putExtra(ExtraMensage, texto);
        startActivity(intent);
    }
}