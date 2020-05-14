package com.campusnum.personnages;
import com.campusnum.equipements.*;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Représente un guerrier
 */
public class Guerrier extends Personnage {
    private Arme arme;
    private Bouclier bouclier;
    private static int minVie = 5;
    private static int maxVie = 10;
    private static int minForce = 5;
    private static int maxForce = 10;

    /**
     * Constructor de Guerrier
     * @param nom
     * @param niveauVie
     * @param attaqueforce
     */
    public Guerrier(String nom, int niveauVie, int attaqueforce) {
        super(nom, niveauVie, attaqueforce);
        this.arme = ArmesListe.random();
        this.bouclier = BouclierListe.random();
    }

    /**
     * Créaton d'un Guerrier en Random
     * @return
     */
    public static Guerrier creatGuerrier (){
        System.out.println("Quel est son nom : ");
        Scanner sc = new Scanner(System.in);
        String namePersonnage = sc.nextLine();
        ThreadLocalRandom rand = ThreadLocalRandom.current();
        int vie = rand.nextInt(minVie, maxVie);
        int force = rand.nextInt(minForce, maxForce);
        Guerrier guerrier = new Guerrier(namePersonnage, vie, force);
        return guerrier;
    }

    /**
     * Description du Guerrier
     * @return la liste des caractéristiques du Guerrier
     */
    @Override
    public String toString() {
        return  "- Nom = "+ nom + "\n" +
                "- Type =  Guerrier \n" +
                "- Niveau de vie = " + vie + "\n" +
                "- Puissance d'attaque = " + puissance + "\n" +
                "- Arme = " + arme  + "\n" +
                "- Bouclier = " + bouclier + "\n"  ;
    }

    /**
     * Récupère l'arme du guerrier
     * @return Le présentation de l'arme
     */
    public String getArme(){
        return arme.toString();
    }
    /**
     * Permet de modifier l'arme du Guerrier
     * @param arme la nouvelle arme
     */
    public void setArme(Arme arme) {
        this.arme = arme;
    }

    /**
     * Permet de récupérer le Bouclier du Guerrier
     * @return Le bouclier du Guerrier
     */
    public Bouclier getBouclier() {
        return bouclier;
    }

    /**
     * Permet de modifier le bouclierr du gerrier
     * @param bouclier le nouveau boucler
     */
    public void setBouclier(Bouclier bouclier) {
         this.bouclier = bouclier;
    }

}
