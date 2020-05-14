package com.campusnum.equipements;

public enum ArmesListe {
        blaspheme(new Arme("Blasphème", 15)),
        shisui(new Arme("Shisui", 20)),
        nike(new Arme("Une paire de nike", 8)),
        lancepierre(new Arme("Lance-pierre", 5)),
        unesouris(new Arme("Une souris", 4)),
        barbapapa(new Arme("Barbapapa", 1));

    private Arme arme;

    /**
     * Création de l'Arme
     * @param arme
     */
    ArmesListe(Arme arme) {
        this.arme = arme;
    }

    /**
     * Récupérer l'Arme
     * @return Arme
     */
    public Arme getArme() {
        return arme;
    }

    /**
     * Modifier l'Arme
     * @param arme
     */
    public void setArme(Arme arme) {
        this.arme = arme;
    }

    /**
     * Récupère une Arme en Random dans la liste
     * @return
     */
        public static Arme random() {
            return values()[(int) (Math.random() * values().length)].getArme();
        }

    }




