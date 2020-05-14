package com.campusnum.personnages;
import com.campusnum.equipements.*;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Représente un magicien
 */
public class Magicien extends Personnage {
    private Sort sort;
    private Philtre philtre;
    private static int minVie = 3;
    private static int maxVie = 6;
    private static int minForce = 8;
    private static int maxForce = 15;

    /**
     * Contructor de Magicien
     * @param nom
     * @param niveauVie
     * @param attaqueforce
     */
    public Magicien (String nom, int niveauVie, int attaqueforce) {
        super(nom,niveauVie,attaqueforce);
        this.sort = SortsListe.random();
        this.philtre = PhiltreListe.random();
    }

    /**
     * Création d'un Magicien en random
     * @return
     */
    public static Magicien creatMagicien (){
        System.out.println("Quel est son nom : ");
        Scanner sc = new Scanner(System.in);
        String namePersonnage = sc.nextLine();
        ThreadLocalRandom rand = ThreadLocalRandom.current();
        int vie = rand.nextInt(minVie, maxVie);
        int force = rand.nextInt(minForce, maxForce);
        Magicien magicien = new Magicien(namePersonnage, vie, force);
        return magicien;
    }

    /**
     * Description du Magicien
     * @return la liste des caractéristiques du Magicien
     */
    @Override //pris en compte en priorité
    public String toString() {
        return  "- Nom = "+ nom + "\n" +
                "- Type = Magicien \n" +
                "- Niveau de vie = " + vie +"\n" +
                "- Puissance d'attaque = " + puissance + "\n" +
                "- Sort  = " + sort + "\n" +
                "- Philtre =  " + philtre + "\n"   ;
    }

    /**
     * Récupérer le Sort
     * @return
     */
    public Sort getSort() {
        return sort;
    }

    /**
     * Modifier le Sort
     * @param sort
     */
    public void setSort(Sort sort) {
        this.sort = sort;
    }

    /**
     * Récupérer le Philtre
     * @return
     */
    public Philtre getPhiltre() {
        return philtre;
    }

    /**
     * Modifier le Philtre
     * @param philtre
     */
    public void setPhiltre(Philtre philtre) {
        this.philtre = philtre;
    }


}

