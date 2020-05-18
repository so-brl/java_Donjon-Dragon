package com.campusnum.plateau;

import com.campusnum.ennemi.Dragon;
import com.campusnum.ennemi.Gobelin;
import com.campusnum.ennemi.Sorcier;

import java.util.Random;

public enum OptionCase {
    coffre,
    ennemi,
    vide;

    public static Case generateCase(){
        Random random = new Random();
        int nbrCase = OptionCase.values().length;
        int aleatoire = random.nextInt(nbrCase);
        OptionCase typeCase = OptionCase.values()[aleatoire];
        switch (typeCase){
            case vide:
                return new CaseVide() ;

            case ennemi:
                return new CaseEnnemi();

            case coffre:
                return new CaseObjet();

            default:
                System.out.println("bug");
                return null;
        }
    }



}
