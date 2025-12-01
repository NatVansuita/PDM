package com.example.aula02;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // Variáveis principais
    Button button;
    EditText editTextMin, getEditTextMax;
    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Ativa o modo que ocupa toda a tela (Edge to Edge)
        EdgeToEdge.enable(this);

        // Carrega o layout principal
        setContentView(R.layout.activity_main);

        // Ajusta o padding para respeitar as barras do sistema (status bar e navegação)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.tv), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Liga as variáveis aos elementos do layout XML
        button = findViewById(R.id.button);
        editTextMin = findViewById(R.id.edMin);
        getEditTextMax = findViewById(R.id.edMax);
        tvResultado = findViewById(R.id.tvResultado);

        // Evento do botão: quando clicar ele vai sortear um número
        button.setOnClickListener(v -> {

            // Cria o gerador de números aleatórios
            Random random = new Random();

            int min, max;

            // Pega os números digitados e converte para inteiro
            min = Integer.parseInt(editTextMin.getText().toString());
            max = Integer.parseInt(getEditTextMax.getText().toString());

            // Calcula quantos números existem no intervalo
            int delta = (max - min) + 1;

            // Sorteia um número dentro do intervalo e ajusta somando o mínimo
            int sorteado = random.nextInt(delta) + min;

            // Mostra o número sorteado no TextView de resultado
            tvResultado.setText(Integer.toString(sorteado));
        });
    }

    // --- Ciclo de vida da Activity, só imprime logs no Logcat ---

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Ciclo_vida", "OnStart"); // A tela ficou visível
        Log.wtf("Ciclo_vida", "OnStart"); // Log forte para chamar atenção
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Ciclo_vida", "OnResume"); // O usuário pode interagir com a tela
        Log.wtf("Ciclo_vida", "OnResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Ciclo_vida", "OnRestart"); // A tela foi aberta de novo depois de stop
        Log.wtf("Ciclo_vida", "OnRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Ciclo_vida", "OnPause"); // O app perdeu foco (abriu outra tela por cima)
        Log.wtf("Ciclo_vida", "OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Ciclo_vida", "OnStop"); // A tela não está mais visível
        Log.wtf("Ciclo_vida", "OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Ciclo_vida", "OnDestroy"); // A Activity foi finalizada
        Log.wtf("Ciclo_vida", "OnDestroy");
    }
}
