package com.campusnum;

import com.campusnum.equipements.*;
import com.campusnum.personnages.Guerrier;
import com.campusnum.personnages.Magicien;
import com.campusnum.personnages.Personnage;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Represente le bon déroulement du jeux
 */

public class Menu {

    private ArrayList<Personnage> yourCustomPersonnages = new ArrayList<Personnage>();
    public Scanner sc = new Scanner(System.in);

    /**
     * Accueil du jeux
     */
    public void welcome() {
        System.out.println(
                "        ,     \\    /      ,        \n" +
                        "       / \\    )\\__/(     / \\       \n" +
                        "      /   \\  (_\\  /_)   /   \\      \n" +
                        " ____/_____\\__\\@  @/___/_____\\____ \n" +
                        "|             |\\../|              |\n" +
                        "|              \\VV/               |\n" +
                        "|        Donjons et Dragons       |\n" +
                        "|_________________________________|\n" +
                        " |    /\\ /      \\\\       \\ /\\    | \n" +
                        " |  /   V        ))       V   \\  | \n" +
                        " |/     `       //        '     \\| \n" +
                        " `              V                '");
    }

    /**
     * Commencer le jeux
     */
    public void startGame() {
        System.out.println(" ** Commencer une nouvelle partie ** \nTappez : \n1 -> oui \n" + "2 -> non");
        int userChoiceToStart = sc.nextInt();
        switch (userChoiceToStart) {
            case 1:
                System.out.println("------------------------------- \n**** Création d'une nouvelle partie **** \n------------------------------- \n**** Pour quitter  la partie , tappez 0 **** \n------------------------------- ");
                personnageChoice();
                break;
            case 2:
                System.out.println("Dommage on se serait bien ammusé");
                break;
            case 0:
                endGame();
                break;
            default:
                System.out.println("Nous n'avons pas compris votre demande");
                startGame();
                break;
        }
    }

    /**
     * Choix du personnage
     *
     * @return Array de personnage
     */
    public int personnageChoice() {
        System.out.println(" ** Choisissez un personnage : ** \nTappez : \n1 -> Guerrier \n2 -> Magicien");
        int userChoicePersonnage = sc.nextInt();
        switch (userChoicePersonnage) {
            case 0:
                endGame();
                break;
            case 1:
                System.out.println("------------------------------- \nVous avez choisi : Guerrier \n-------------------------------");
                yourCustomPersonnages.add(Guerrier.creatGuerrier());
                break;
            case 2:
                System.out.println("------------------------------- \nVous avez choisi : Magicien \n-------------------------------");
                yourCustomPersonnages.add(Magicien.creatMagicien());
                break;
            default:
                System.out.println("Nous n'avons pas compris votre demande");
                personnageChoice();
                break;
        }
        otherPersonnageChoice();
        return userChoicePersonnage;
    }

    /**
     * Choix d'un personnage supplémentaire
     */
    public void otherPersonnageChoice() {
        System.out.println(" ** Voulez-vous choisir un personnage supplémentaire** \nTappez : \n1 -> [oui] \n2 -> [non]");
        int userChoiceOtherPersonnage = sc.nextInt();
        switch (userChoiceOtherPersonnage) {
            case 0:
                endGame();
                break;
            case 1:
                personnageChoice();
                break;
            case 2:
                System.out.println("Customiser votre/vos personnages");
                listPersonnageChoice();
                break;
            default:
                System.out.println("Nous n'avons pas compris votre demande");
                otherPersonnageChoice();
                break;
        }
    }

    /**
     * Affiche la liste des personnages
     */
    public void listPersonnageChoice() {
        System.out.println("Liste de vos personnages :");
        for (int i = 0; i < yourCustomPersonnages.size(); i++) {
            int num = i + 1;
            System.out.println("Personnage n°" + num + " : " + yourCustomPersonnages.get(i).getNom());
            System.out.println(yourCustomPersonnages.get(i));
        }
        modificationPersonnage();
    }

    /**
     * Choix du personnage à modifier
     */
    public void modificationPersonnage() {
        System.out.println("** Voulez-vous modifier un ou plusieurs personnage(s) ?** \nTappez : \n1 -> Oui \n2 -> Non");
        int mofificatPersonnage = sc.nextInt();
        switch (mofificatPersonnage) {
            case 0:
                endGame();
                break;
            case 1:
                System.out.println("Choisissez le personnage à modifier : ");
                for (int i = 0; i < yourCustomPersonnages.size(); i++) {
                    int num = i + 1;
                    System.out.println("Choisissez " + num + " pour modifier :  " + yourCustomPersonnages.get(i).getNom());
                }
                int choixAModifier = sc.nextInt();
                int i = choixAModifier - 1;
                System.out.println("Vous voulez modifier : ");
                System.out.println(yourCustomPersonnages.get(i));
                Personnage temp = yourCustomPersonnages.get(i);
                detailsModificationPersonnage(temp, i);
                break;
            case 2:
                System.out.println("Vous êtes enfin prêt :) \n");
                playing();
                break;
            default:
                System.out.println("Nous n'avons pas compris votre choix");
                modificationPersonnage();
                break;
        }
    }

    /**
     * Récupération du type de personnage à modifier
     * Appel la methode lié au type de personnage
     *
     * @param temp
     * @param i
     */
    public void detailsModificationPersonnage(Personnage temp, int i) {
        if (temp instanceof Guerrier) {
            ifModificationGuerrier(temp, i);
        } else if (temp instanceof Magicien) {
            ifModificationMagicien(temp, i);
        }
    }

    /**
     * Personnalisation d'un guerrier
     *
     * @param temp
     * @param i
     */
    public void ifModificationGuerrier(Personnage temp, int i) {
        Guerrier g = (Guerrier) temp;
        System.out.println("Vous avez choisis de modifier ce guerrier");
        System.out.println("** Choisissez : ** \n" +
                "- 1 pour modifier le nom \n" +
                "- 2 pour modifier le niveau de vie \n" +
                "- 3 pour modifier la fore d'attaque \n" +
                "- 4 pour modifier l\'arme \n" +
                "- 5 pour modifier le bouclier \n" +
                "- 6 pour supprimer le personnage \n"
        );
        int modifier = 0;
        try {
            modifier = sc.nextInt();
        } catch (InputMismatchException exception) {
            System.out.println("**** Merci d'entrer un chiffre ****");
            modificationPersonnage();
        }
//    finally {sc.close();}
        switch (modifier) {
            case 1:
                System.out.println("** Modifier le nom : ");
                String nom = sc.nextLine();
                temp.setNom(nom);
                System.out.println("Votre nouveau nom: " + nom);
                System.out.println(yourCustomPersonnages.get(i));
                break;
            case 2:
                ThreadLocalRandom rand = ThreadLocalRandom.current();
                int vie = rand.nextInt(5, 10);
                temp.setVie(vie);
                System.out.println("Votre nouveau Niveau de vie : " + vie);
                System.out.println(yourCustomPersonnages.get(i));
                break;
            case 3:
                ThreadLocalRandom randsecond = ThreadLocalRandom.current();
                int force = randsecond.nextInt(5, 10);
                temp.setPuissance(force);
                System.out.println("Votre nouvelle force d'Attaque : " + force);
                System.out.println(yourCustomPersonnages.get(i));
                break;
            case 4:
                System.out.println("** Modifier l'arme' : ");
                Arme armeModif = ArmesListe.random();
                g.setArme(armeModif);
                System.out.println("Votre nouvelle Arme : " + armeModif);
                System.out.println(yourCustomPersonnages.get(i));
                break;
            case 5:
                System.out.println("** Modifier le bouclier : ");
                Bouclier bouclierModif = BouclierListe.random();
                g.setBouclier(bouclierModif);
                System.out.println("Votre nouveau bouclier : " + bouclierModif);
                System.out.println(yourCustomPersonnages.get(i));
                break;
            case 6:
                System.out.println("Le personnage: " + yourCustomPersonnages.get(i).getNom() + " à bien été supprimer");
                yourCustomPersonnages.remove(i);
                break;
            case 0:
                endGame();
                break;

        }
        modificationPersonnage();
    }

    /**
     * Personnalisation d'un magicien
     *
     * @param temp
     * @param i
     */
    public void ifModificationMagicien(Personnage temp, int i) {
        Magicien m = (Magicien) temp;
        System.out.println("Vous avez choisis de modifier ce magicien");
        System.out.println("** Choisissez : ** \n" +
                "- 1 pour modifier le nom \n " +
                "- 2 pour modifier le niveau de vie \n " +
                "- 3 pour modifier la fore d'attaque \n " +
                "- 4 pour modifier le sort \n " +
                "- 5 pour supprimer le philtre \n" +
                "- 6 pour supprimer le personnage \n"
        );
        int modifier = 0;
        try {
            modifier = sc.nextInt();
        } catch (InputMismatchException exception) {
            System.out.println("**** Merci d'entrer un chiffre ****");
            modificationPersonnage();
        }
//    finally {sc.close();}
        switch (modifier) {
            case 1:
                System.out.println("** Modifier le nom : ");
                String nom = sc.nextLine();
                m.setNom(nom);
                System.out.println("Votre nouveau nom: " + nom);
                System.out.println(yourCustomPersonnages.get(i));
                break;
            case 2:
                ThreadLocalRandom rand = ThreadLocalRandom.current();
                int vie = rand.nextInt(3, 6);
                m.setVie(vie);
                System.out.println("Votre nouveau Niveau de vie : " + vie);
                System.out.println(yourCustomPersonnages.get(i));
                break;
            case 3:
                ThreadLocalRandom randsecond = ThreadLocalRandom.current();
                int force = randsecond.nextInt(8, 15);
                m.setPuissance(force);
                System.out.println("Votre nouvelle force d'Attaque : " + force);
                System.out.println(yourCustomPersonnages.get(i));
                break;
            case 4:
                System.out.println("** Modifier le sort : ");
                Sort sortModif = SortsListe.random();
                m.setSort(sortModif);
                System.out.println("Votre nouveau Sort : " + sortModif);
                System.out.println(yourCustomPersonnages.get(i));
                break;
            case 5:
                System.out.println("** Modifier le philtre : ");
                Philtre philtreModif = PhiltreListe.random();
                m.setPhiltre(philtreModif);
                System.out.println("Votre nouveau philtre : " + philtreModif);
                System.out.println(yourCustomPersonnages.get(i));
                break;
            case 6:
                System.out.println("Le personnage: " + yourCustomPersonnages.get(i).getNom() + " à bien été supprimer");
                yourCustomPersonnages.remove(i);
                break;
            case 0:
                endGame();
                break;

        }
        modificationPersonnage();
    }


    /**
     * Une fois les personnages validés , la partie commence
     */
    public void playing() {
        System.out.println("La partie va commencer");
    }

    /**
     * Quitter la partie
     */
    public void endGame() {
        System.out.println("------------------------------- \nVous avez quitté la partie, à bientôt:)\n-------------------------------");
        System.exit(0);
    }


}


