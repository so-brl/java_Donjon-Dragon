package com.campusnum.equipements;

public enum PhiltreListe {
    felicis(new Philtre("Felix felicis")),
    puissance(new Philtre("Philtre de puissance")),
    vie(new Philtre("Philtre de vie")),
    infini(new Philtre("Potion de soin")),
    amnesie(new Philtre("Philtre d'amnésie")),
    eclatax(new Philtre("Philtre ECLATAX"));

    private Philtre philtre ;

    /**
     * Création du Philtre
     * @param philtre
     */
    PhiltreListe(Philtre philtre) {
        this.philtre = philtre;
    }

    /**
     * Récupérer le Philtre
     * @return Philtre
     */
    public Philtre getPhiltre() {
        return philtre;
    }

    /**
     * Modifier le Philtre
     * @param philtre
     */
    public void setPhiltre(Philtre philtre) {
        this.philtre = philtre;
    }

    /**
     * Récupérer un Philtre random dans la liste
     * @return
     */
    public static Philtre random() {
        return values()[(int) (Math.random() * values().length)].getPhiltre();
    }

}
