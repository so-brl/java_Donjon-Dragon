package com.campusnum.equipements;

import com.campusnum.commun.Type;

public enum SortsListe {
    spell1(new Sort("Spell 1",5, Type.Air)),
    spell2(new Sort("Spell 2",10,Type.Feu )),
    spell3(new Sort("Spell 3", 15,Type.Plante)),
    spell4(new Sort("Spell 4", 20,Type.Terre)),
    spell5(new Sort("Spell 5", 15,Type.Toxic));

    private Sort sort;

    /**
     * Création du Sort
     * @param sort
     */
    SortsListe(Sort sort) {
        this.sort=sort;
    }

    /**
     * Récupérer Sort
     * @return Sort
     */
    public Sort getSort() {
        return sort;
    }

    /**
     * Modifier Sort
     * @param sort
     */
    public void setSort(Sort sort) {
        this.sort = sort;
    }

    /**
     * Récupérer un Sort random dans la liste
     * @return
     */
    public static Sort random() {
        return values()[(int) (Math.random() * values().length)].getSort();
    }

}
