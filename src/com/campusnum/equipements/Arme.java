package com.campusnum.equipements;

/**
 * Représente une arme
 */
public class Arme extends Attaque {
 //TODO : Rajouter chance de coup critique
    /**
     * Création de l'arme depuis ArmeListe
     * @param nom       Nom de l'Arme
     * @param puissance Puissance de l'Arme
     */
    public Arme(String nom, int puissance) {
        super(nom, puissance);
    }

}
