package com.example.aula02;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class IMCresultados extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_imcresultados);
        tvResultado = findViewById(R.id.tvResultado);
        imageView2 = findViewById(R.id.imageView2);


        //recuperando o intent
        Intent i = getIntent();
        Bundle b = i.getExtras();
        Double peso = b.getDouble("peso");
        Double altura = b.getDouble("altura");

        //calculo do imc
        Double imc = peso/(altura*altura);

        tvRe
    }
}