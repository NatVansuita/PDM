package com.example.aula02;

import java.util.ArrayList;

public class PlanetaDao {

    // Lista que vai guardar todos os planetas
    ArrayList<Planeta> planetas;

    // Construtor: cria a lista e preenche com planetas padrão
    public PlanetaDao() {

        this.planetas = new ArrayList<>(); // Inicializa a lista vazia

        // Vetor com os nomes dos planetas
        String[] nomes = new String[] {
                "Mercurio", "Venus", "Terra", "Marte",
                "Jupter", "Saturno", "Urano", "Netuno"
        };

        // Vetor com os IDs das imagens que estão na pasta drawable
        Integer[] imagens = new Integer[] {
                R.drawable.mercury, R.drawable.venus,
                R.drawable.earth, R.drawable.mars,
                R.drawable.jupter, R.drawable.saturn,
                R.drawable.uranus, R.drawable.neptune
        };

        // Loop que percorre os vetores e cria um planeta para cada posição
        for (int i = 0; i < nomes.length; i++) {

            // Cria um novo planeta usando o nome e a imagem da posição atual
            planetas.add(new Planeta(nomes[i], imagens[i]));

            // Adiciona o planeta criado na lista planetas
        }
    }

    // Método que devolve a lista de planetas quando outra classe precisar
    public ArrayList<Planeta> getPlatenas() {
        return this.planetas; // Retorna todos os planetas cadastrados
    }
}
