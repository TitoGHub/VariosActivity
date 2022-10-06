package com.example.variosactivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    private static final String EXTRA_MENSAJE_RESPUESTA = "xx";
    TextView txtRecibido;
    private EditText etxtRespuestaP2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        txtRecibido = findViewById(R.id.txtPantallaDos);
        etxtRespuestaP2 = (EditText) findViewById(R.id.etxtResponderP2);

        Intent intent = getIntent(); //Enlazo con el intent recibido
            String textoRecibido = intent.getStringExtra("x");
            txtRecibido.setText("Texto recibido: " + textoRecibido);

            //PREGUNTAR PROFESOR MENSAJE NO SE MUESTRA BIEN EN PANTALLA2.

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    public void enviarRespuesta(View view) {
    String txtRespuesta = String.valueOf(etxtRespuestaP2.getText());
    Intent intentRespuesta = new Intent();
    intentRespuesta.putExtra(EXTRA_MENSAJE_RESPUESTA,txtRespuesta);
    setResult(RESULT_OK, intentRespuesta);
    finish();

    }
}