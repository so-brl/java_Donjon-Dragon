package com.campusnum.equipements;


import com.campusnum.commun.Type;

/**
 * Représente un Sort
 */
public class Sort extends Attaque {

    private  Type type;

    /**
     * Création d'un Sort
     * @param nom       Nom du Sort
     * @param puissance Puissance du Sort
     */
    public  Sort(String nom, int puissance, Type type) {
        super(nom, puissance);
        this.type = type;
    }

    /**
     * Récupère le type de Sort
     * @return
     */
    public Type getType() {
        return type;
    }

    /**
     * Permet de modifier le type de Sort
     * @param type
     */
    public void setType(Type type) {
        this.type = type;
    }
}
