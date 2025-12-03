package com.example.aula02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Variáveis principais
    Button button;
    TextView numero;
    int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Liga numero ao TextView do layout e cria um evento de clique
        numero = findViewById(R.id.textView);
        numero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView numero = (TextView) view; //Converte o elemento para TextView
                //numero.setText("+");
                contador++; //Incrementa o contador
                numero.setText(Integer.toString(contador)); //Converte o contador para texto e exibe no TextView

            }
        });

        button = findViewById(R.id.button);
        button.setText("Click aqui");
        button.setOnClickListener(new View.OnClickListener() { //Evento do Botão
            @Override
            public void onClick(View view) { // Uma vez clicado ele fica com o "+"
                Button b = (Button) view;
                b.setText("+");
                contador++;
                numero.setText(Integer.toString(contador)); //Atualiza o TextView principal numero com o valor do contador
            }
        });
    }
}
