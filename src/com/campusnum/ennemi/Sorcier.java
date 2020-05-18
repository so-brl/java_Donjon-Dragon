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
    public Sorcier(String typeEnnemi) {
        super(typeEnnemi, 2, 9);
    }



}
