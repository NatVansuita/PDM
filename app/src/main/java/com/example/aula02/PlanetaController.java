package com.example.aula02;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PlanetaController extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_planeta);

        Bundle bundle=getIntent().getExtras();
        Planeta p = (Planeta)bundle.getSerializable("planeta");
        ImageView imageView = findViewById(R.id.imageView);
        TextView textView =findViewById(R.id.tvNomePlaneta);

        imageView.setImageResource(p.imagem);
        textView.setText(p.nome);


    }
}