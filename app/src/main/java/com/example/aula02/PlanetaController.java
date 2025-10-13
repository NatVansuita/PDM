package com.example.aula02;

import java.util.ArrayList;

public class PlanetaController {
    PlanetaDao planetaDao;

    public void addPlaneta(Planeta planeta){

    }
    public ArrayList<Planeta> getPlanetas(){
        return planetaDao.getPlanetas();
    }

    public ArrayList<String> getNomePlanetas(){
        ArrayList<String> nomes = new ArrayList<String>();
        for (Planeta planeta : planetaDao.getPlanetas()){
            nomes.add(planeta.nome);
        }
        return nomes;
    }

}
