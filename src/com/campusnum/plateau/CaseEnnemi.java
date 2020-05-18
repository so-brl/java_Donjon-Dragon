package com.campusnum.plateau;

import com.campusnum.ennemi.Dragon;
import com.campusnum.ennemi.Ennemi;
import com.campusnum.ennemi.Gobelin;
import com.campusnum.ennemi.Sorcier;

import java.util.Arrays;
import java.util.Random;

public class CaseEnnemi extends Case {

    private String[] typesEnnemi = new String[]{"Gobelin", "Dragon", "Sorcier"};
    private Ennemi ennemi;

    public CaseEnnemi(){
        ennemi=generateEnnemi();
    }

    public Ennemi generateEnnemi() {
        Random random = new Random();
        int nbrEnnemi = typesEnnemi.length;
        int aleatoire = random.nextInt(nbrEnnemi);

        String typeEnnemi= typesEnnemi[aleatoire];
        switch (aleatoire){
            case 0:
                Gobelin CaseEnnemiGobelin = new Gobelin(typeEnnemi);
                return CaseEnnemiGobelin ;

            case 1:
                Dragon CaseEnnemiDragon = new Dragon(typeEnnemi);
                return CaseEnnemiDragon;

            case 2:
                Sorcier CaseEnnemiSorcier = new Sorcier(typeEnnemi);
                return CaseEnnemiSorcier;

            default:
                System.out.println("bug");
                return null;
        }


    }

    @Override
    public String toString() {
        return "** Case Ennemi ** " + ennemi ;
    }
}
