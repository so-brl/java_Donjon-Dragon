package com.campusnum.personnages;

public abstract class Personnage {
    protected String nom ;
    protected int vie;
    protected int puissance;

    /**
     * Création de l'objet Personnage
     * @param nom
     * @param vie
     * @param puissance
     */
    public Personnage(String nom, int vie, int puissance) {
        this.nom = nom;
        this.vie = vie;
        this.puissance = puissance;
    }

    /**
     * Modifier le nom du Personnage
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Récupérer le nom du Personnage
     * @return nom
     */
    public  String getNom() {
        return nom;
    }

    /**
     * Récupérer la puissance d'attaque du Personnage
     * @return
     */
    public int getPuissance() {
        return puissance;
    }

    /**
     * Modifier la puissance d'attaque du Personnage
     * @param puissance
     */
    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }


    /**
     * Récupérer le niveau de vie du Personnage
     * @return niveauVie
     */
    public  int getVie() {
        return vie;
    }

    /**
     * Modifier le niveau de vie du Personnage
     * @param vie
     */
    public void setVie(int vie) {
        this.vie = vie;
    }

    /**
     * Description du Personnage
     * @return
     */
    @Override
    public String toString() {
        return "Personnage{" +
                this.toString() +
                '}';
    }

}
