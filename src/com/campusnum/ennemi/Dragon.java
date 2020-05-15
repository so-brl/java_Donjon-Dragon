package com.campusnum.ennemi;

public class Dragon extends Ennemi {

    /**
     * Création d'un Dragon
     */
    public Dragon() {
        this.type = "Dragon";
        this.vie = 9;
        this.puissance = 2;
    }

    /**
     * Description du Dragon
     * @return la liste des caractéristiques du Dragon
     */
    @Override //pris en compte en priorité
    public String toString() {
        return "- Type = Dragon \n" +
                "- Niveau de vie = " + vie + "\n" +
                "- Puissance d'attaque = " + puissance + "\n"
                ;
    }
}
