package com.campusnum.objet;

public class Objet {
    protected String type ;
    protected int puissance;

    /**
     * Création de l'Objet
     */
    public Objet(String type, int puissance) {
        this.type = type;
        this.puissance = puissance;

    }




    /**
     * Récupérer la puissance d'attaque du Objet
     * @return
     */
    public int getPuissance() {
        return puissance;
    }

    /**
     * Modifier la puissance d'attaque du Objet
     * @param puissance
     */
    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }



    /**
     * Description de l'objet
     * @return la liste des caractéristiques de l'objet
     */
    @Override //pris en compte en priorité
    public String toString() {
        return " Type = " + type +
                " ->  Puissance d'attaque = " + puissance
                ;
    }
}
