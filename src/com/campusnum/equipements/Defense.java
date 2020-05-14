package com.campusnum.equipements;

abstract class Defense {

    private String nom;

    /**
     * Création de la  Défense
     * @param nom
     */
    public Defense(String nom) {
        this.nom = nom;
    }

    /**
     * Récupèreer le nom de la Défense
     * @return
     */
    public String getNom() {
        return nom;
    }

    /**
     * Modifier le nom de la Défense
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Description de la Défense
     * @return une description de la Défense
     */
    public String toString() {
        return nom;
    }

}
