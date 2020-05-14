package com.campusnum.equipements;
import com.campusnum.commun.Type;
import com.campusnum.equipements.*;


public abstract class Attaque {
    private String nom;
    private int puissance;

    /**
     * Création de l'attaque
     * @param nom Nom de l'attaque
     * @param puissance Puissance de l'attaque
     */
    public Attaque(String nom, int puissance) {
        this.nom = nom;
        this.puissance = puissance;
    }

    /**
     * Récupérer le nom de l'attaque
     * @return
     */
    public String getNom() {
        return nom;
    }

    /**
     * Modifier le nom de l'attaque
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Récupérer la puissance de l''attaque
     * @return
     */
    public int getPuissance() {
        return puissance;
    }

    /**
     * Modifier la puissance de l'attaque
     * @param puissance
     */
    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    /**
     * Description de l'attaque
     * @return une description de l'attaque
     */
    public String toString() {
        return nom + " - puissance : " + puissance;
    }
}
