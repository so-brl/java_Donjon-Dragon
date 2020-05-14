package com.campusnum.equipements;

public enum BouclierListe {
    commun(new Bouclier("Bouclier CLAQUÉ AU SOL")),
    normal(new Bouclier("Bouclier en bois")),
    rare(new Bouclier("Bouclier dorée")),
    epique(new Bouclier("Bouclier BADASS")),
    legendaire(new Bouclier("Bouclier Hylien")),
    ancien(new Bouclier("Bouclier ancien mais tu vois il as vécu il est solide sur ses appuis")),
    primordial(new Bouclier("Bouclier primoridal")),
    maudit(new Bouclier("Cursed shield")),
    mousse(new Bouclier("Bouclier en mousse, il est un peu mou mais tranquil ça passe")),
    padbol(new Bouclier("Pas de bouclier dommage mon pote tu feras peut-être mieux la prochaine fois je sais pas on verras bien aller bonne journée le NULOS"));

    private Bouclier bouclier;

    /**
     * Création du Bouclier
     * @param bouclier
     */
    BouclierListe(Bouclier bouclier) {
        this.bouclier = bouclier;
    }

    /**
     * Récupéer le Bouclier
     * @return
     */
    public Bouclier getBouclier() {
        return bouclier;
    }

    /**
     * Modifier le Bouclier
     * @param bouclier
     */
    public void setBouclier(Bouclier bouclier) {
        this.bouclier = bouclier;
    }

    /**
     * Récupérer un Bouclier random dans la liste
     * @return
     */
    public static Bouclier random() {
        return values()[(int) (Math.random() * values().length)].getBouclier();
    }



}
