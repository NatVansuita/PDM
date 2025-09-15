package com.example.aula02;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText edPeso,edAltura;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        edPeso = findViewById(R.id.TTkg);
        edAltura = findViewById(R.id.TTm);

        button.setOnClickListener(V -> {
            Intent i = new Intent(MainActivity.this,MainActivity.class);
            Bundle bundle = new Bundle();

            double peso = Double.parseDouble(edPeso.getText().toString());
            bundle.putDouble("peso",peso);

            double altura = Double.parseDouble(edAltura.getText().toString());
            bundle.putDouble("altura",altura);

            i.putExtras(bundle);

            startActivity(i);
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}