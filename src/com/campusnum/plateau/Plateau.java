package com.campusnum.plateau;

import com.campusnum.personnages.Personnage;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class Plateau {

    LinkedHashMap<Integer, Case> mapPlateau = new LinkedHashMap<>();

    public void createPlateau() {
        for (int i = 0; i < 64; i++) {
            mapPlateau.put(i, OptionCase.generateCase());
        }

    }

    public void affichePlateau() {
        for (Map.Entry<Integer,Case> entry : mapPlateau.entrySet()) {
            System.out.println("Case n°"+ entry.getKey() + " -> " + entry.getValue());
        }
    }


}
