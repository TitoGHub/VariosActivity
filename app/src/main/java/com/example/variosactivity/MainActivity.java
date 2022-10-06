package com.example.variosactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

   public EditText extTextoEnviarP1;
    public static String ExtraMensage = "java.com.example.variosactivity.mensaje";
    Button btbPagDos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        extTextoEnviarP1 = (EditText) findViewById(R.id.etxtPantallaUno);
        btbPagDos = findViewById(R.id.btbPagDos);
        btbPagDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                String texto = extTextoEnviarP1.getText().toString();
                intent.putExtra("x", texto);
                startActivity(intent);
            }
        });
    }

    /*
    public void enviarPantallaDos(View view) {
        Intent intent = new Intent(MainActivity.this, Activity2.class);
        String texto = String.valueOf(extTextoEnviarP1);
        intent.putExtra(ExtraMensage, texto);
        startActivity(intent);
    }
    */
}