package com.campusnum.plateau;

import com.campusnum.ennemi.Ennemi;

import java.util.Random;

public class CaseEnnemi extends OptionCasePlateau {
    Random random = new Random();
    private String[] ennemi = new String[]{"Gobelin", "Dragon", "Sorcier"};
    int nbrEnnemi = ennemi.length;
    private Random aleatoire = random.nextInt(0, nbrEnnemi);

    String typeEnnemi= ennemi[aleatoire];

    public CaseEnnemi(typeEnnemi) {
        Ennemi CaseEnnemi = new Ennemi(random) {
        }
    }
}
