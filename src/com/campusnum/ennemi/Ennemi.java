package com.campusnum.ennemi;

public abstract class Ennemi {
    protected String type ;
    protected int vie;
    protected int puissance;

    /**
     * Création de l'Ennemi

     */
    public Ennemi(String type) {
        this.type = type;

    }




    /**
     * Récupérer la puissance d'attaque du Ennemi
     * @return
     */
    public int getPuissance() {
        return puissance;
    }

    /**
     * Modifier la puissance d'attaque du Ennemi
     * @param puissance
     */
    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }


    /**
     * Récupérer le niveau de vie du Ennemi
     * @return niveauVie
     */
    public  int getVie() {
        return vie;
    }

    /**
     * Modifier le niveau de vie du Ennemi
     * @param vie
     */
    public void setVie(int vie) {
        this.vie = vie;
    }

    /**
     * Description du Ennemi
     * @return
     */
    @Override
    public String toString() {
        return "Ennemis{" +
                this.toString() +
                '}';
    }

}
