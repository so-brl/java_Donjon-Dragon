package com.campusnum.ennemi;

public  abstract class Ennemi {
    protected String type ;
    protected int vie;
    protected int puissance;

    /**
     * Création de l'Ennemi
     */
    public Ennemi(String type, int puissance, int vie) {
        this.type = type;
        this.puissance = puissance;
        this.vie = vie;

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
     * Description du Gobelin
     * @return la liste des caractéristiques du Gobelin
     */
    @Override //pris en compte en priorité
    public String toString() {
        return " Type = " + type +
                " -> Niveau de vie = " + vie +
                " / Puissance d'attaque = " + puissance
                ;
    }

}
