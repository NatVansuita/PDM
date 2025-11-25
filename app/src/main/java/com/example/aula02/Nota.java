package com.example.aula02;

import java.io.Serializable;

public class Nota  implements Serializable {
    int id;
    String texto;

    public Nota(int id, String texto) {
        this.id = id;
        this.texto = texto;
    }
}