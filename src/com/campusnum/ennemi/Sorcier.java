package com.campusnum.ennemi;

import com.campusnum.equipements.Philtre;
import com.campusnum.equipements.PhiltreListe;
import com.campusnum.equipements.Sort;
import com.campusnum.equipements.SortsListe;
import com.campusnum.personnages.Magicien;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Sorcier extends Ennemi {


    /**
     * Création d'un sorcier
     */
    public Sorcier() {
        this.type = "Sorcier";
        this.vie = 9;
        this.puissance = 2;
    }


    /**
     * Description du Sorcier
     * @return la liste des caractéristiques du Sorcier
     */
    @Override //pris en compte en priorité
    public String toString() {
        return "- Type = Sorcier \n" +
                "- Niveau de vie = " + vie + "\n" +
                "- Puissance d'attaque = " + puissance + "\n"
                ;
    }


}
