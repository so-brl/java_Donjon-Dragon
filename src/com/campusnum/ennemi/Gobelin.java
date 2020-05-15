package com.campusnum.ennemi;

public class Gobelin extends Ennemi {
    /**
     * Création d'un Gobelin
     */
    public Gobelin() {
        this.type = "Gobelin";
        this.vie = 9;
        this.puissance = 2;
    }

    /**
     * Description du Gobelin
     * @return la liste des caractéristiques du Gobelin
     */
    @Override //pris en compte en priorité
    public String toString() {
        return "- Type = Gobelin \n" +
                "- Niveau de vie = " + vie + "\n" +
                "- Puissance d'attaque = " + puissance + "\n"
                ;
    }


}
