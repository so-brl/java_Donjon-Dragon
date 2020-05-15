package com.campusnum.plateau;

import com.campusnum.personnages.Personnage;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class Plateau {

    LinkedHashMap<Integer, OptionCase> mapPlateau = new LinkedHashMap<>();

    public void creatPlateau() {
        for (int i = 0; i < 64; i++) {
            mapPlateau.put(i, OptionCase.vide);
        }

    }

    public void affichePlateau() {
        for (Map.Entry<Integer,OptionCase> entry : mapPlateau.entrySet()) {
            System.out.println("Case n°"+ entry.getKey() + " -> " + entry.getValue());
        }
    }


}
