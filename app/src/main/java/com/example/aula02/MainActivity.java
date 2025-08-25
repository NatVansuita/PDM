package com.example.aula02;

import android.annotation.SuppressLint;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.time.LocalDate;

public class MainActivity extends AppCompatActivity {

    int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Log.d( "ciclo_vida",  "Oncrea");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d( "ciclo_vida", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d( "ciclo_vida", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d( "ciclo_vida", "onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d( "ciclo_vida", "onDestroy ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d( "ciclo_vida", "onStop");
    }
}

