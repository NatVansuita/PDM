package com.example.aula02;

import android.graphics.Bitmap;

import java.io.Serializable;

public class Planeta implements Serializable {
    String nome;
    //Bitmap Imagem;
    Integer imagem; //São recursos da pasta drawable R.drawable.nome

    public Planeta(String nome, Integer imagem) {
        this.nome = nome;
        this.imagem = imagem;

    }
}
