package com.example.aula02;

import android.annotation.SuppressLint;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.time.LocalDate;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText editTextMin, editTextMax;
    TextView tv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        editTextMin = findViewById(R.id.edMin);
        editTextMax = findViewById(R.id.edMax);
        tv = findViewById(R.id.tvResultado);

        button.setOnClickListener(v -> {
            Random random = new Random();
            int min,max;

            min = Integer.parseInt(editTextMin.getText().toString());
            max = Integer.parseInt(editTextMax.getText().toString());
            int delta = max - min;

            int sortiado = random.nextInt(delta) + min;

            tv.setText(Integer.toString(sortiado));
        });
    }
}

