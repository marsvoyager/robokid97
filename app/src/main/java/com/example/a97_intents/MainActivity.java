package com.example.a97_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.nio.file.Files;

public class MainActivity extends AppCompatActivity {

    EditText et_recogeParm;
    Button et_Prueba;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_recogeParm = findViewById(R.id.etPAsaParmid);

        et_Prueba = findViewById(R.id.etPAsaDatid4);
    }

    public void goToSecondActivity(View view) {
        Intent intent2onActiv = new Intent(MainActivity.this, SecondActivity.class);
        intent2onActiv.putExtra("PasoParm", "Un String");
        intent2onActiv.putExtra("PasoParmEntero", 22222);
        startActivity(intent2onActiv);

    }

    public void PasaDato(View view) {
        Intent intent2onActiv = new Intent(MainActivity.this, SecondActivity.class);
        if(et_recogeParm.getText().toString().isEmpty())
        {
            Toast.makeText(this,
                    "No puc iniciar l'activitat sense dades", Toast.LENGTH_LONG)
            .show();
        }
        else{
            intent2onActiv.putExtra("PasoParm",
                    et_recogeParm.getText().toString());
            Toast.makeText(this,
                    "Arrencant l'activitat "+ et_recogeParm.getText().toString(), Toast.LENGTH_LONG)
                    .show();
            startActivity(intent2onActiv);
        }
    }

    public void navegar(View view) {

        //Obrir el navegador amb Intents
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.google.com"));

        startActivity(intent);
    }

    public void mapeador(View view) {
        String uri =
                String.format("geo:46.414382,10.013988");

        Intent intent = new
                Intent(Intent.ACTION_VIEW, Uri.parse(uri));

        startActivity(intent);
    }
}
