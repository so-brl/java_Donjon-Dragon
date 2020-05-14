package com.campusnum;

import com.campusnum.equipements.*;
import com.campusnum.personnages.Guerrier;
import com.campusnum.personnages.Magicien;
import com.campusnum.personnages.Personnage;
import com.campusnum.commun.Type;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Represente le bon déroulement du jeux
 */

public class Menu {

    private ArrayList<Personnage> yourCustomPersonnages = new ArrayList<Personnage>();

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
        Scanner sc = new Scanner(System.in);
        System.out.println(" ** Commencer une nouvelle partie ** \nTappez : \n1 -> oui \n" + "2 -> non");
        int userChoiceToStart = sc.nextInt();
        switch (userChoiceToStart){
            case 1 :
                System.out.println("------------------------------- \n**** Création d'une nouvelle partie **** \n------------------------------- \n**** Pour quitter  la partie , tappez 0 **** \n------------------------------- ");
                personnageChoice();
                break;
            case 2 :
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
     * Quitter la partie
     */
    public void endGame(){
        System.out.println("------------------------------- \nVous avez quitté la partie, à bientôt:)\n-------------------------------");
        System.exit(0);
    }

    /**
     * Choix du personnage
     * @return Array de personnage
     */
    public int personnageChoice() {
        System.out.println(" ** Choisissez un personnage : ** \nTappez : \n1 -> Guerrier \n2 -> Magicien");
        Scanner sc = new Scanner(System.in);
        int userChoicePersonnage = sc.nextInt();
        if (userChoicePersonnage == 1) {
            System.out.println("------------------------------- \nVous avez choisi : Guerrier \n-------------------------------" );
                yourCustomPersonnages.add(Guerrier.creatGuerrier());
        } else if (userChoicePersonnage == 2) {
            System.out.println("------------------------------- \nVous avez choisi : Magicien \n-------------------------------");
            yourCustomPersonnages.add(Magicien.creatMagicien());
        } else if (userChoicePersonnage == 0) {
            endGame();
        } else {
            System.out.println("Nous n'avons pas compris votre demande");
            personnageChoice();
        }
        otherPersonnageChoice();
        return userChoicePersonnage;
    }

    /**
     * Choix d'un personnage supplémentaire
     */
    public void otherPersonnageChoice() {
        System.out.println(" ** Voulez-vous choisir un personnage supplémentaire** \nTappez : \n1 -> [oui] \n2 -> [non]");
        Scanner sc = new Scanner(System.in);
        int userChoiceOtherPersonnage = sc.nextInt();
        if (userChoiceOtherPersonnage == 1) {
            personnageChoice();
        } else if (userChoiceOtherPersonnage == 2) {
            System.out.println("Customiser votre/vos personnages");
            listPersonnageChoice();
        } else if (userChoiceOtherPersonnage == 0) {
            endGame();
        } else {
            System.out.println("Nous n'avons pas compris votre demande");
            otherPersonnageChoice();
        }
    }

    /**
     * Affiche la liste des personnages
     */
    public void listPersonnageChoice() {
        System.out.println("Liste de vos personnages :");
        for (int i = 0; i < yourCustomPersonnages.size() ; i++) {
            int num = i + 1;
            System.out.println("Personnage n°" + num + " : " + yourCustomPersonnages.get(i).getNom());
            System.out.println(yourCustomPersonnages.get(i));
        }
        modificationPersonnage();
    }

    /**
     * Modification de la customisation du personnage
     */
    public void modificationPersonnage() {
        System.out.println("** Voulez-vous modifier un ou plusieurs personnage(s) ?** \nTappez : \n1 -> Oui \n2 -> Non");
        Scanner sc = new Scanner(System.in);
        int mofificatPersonnage = sc.nextInt();
        if (mofificatPersonnage == 1) {
            System.out.println("Choisissez le personnage à modifier : ");
            for (int i = 0; i < yourCustomPersonnages.size() ; i++) {
                int num = i + 1;
                System.out.println("Choisissez " + num + " pour modifier :  " + yourCustomPersonnages.get(i).getNom());
            }
            int choixAModifier = sc.nextInt();
            int i = choixAModifier - 1;
            System.out.println("Vous voulez modifier : ");
            System.out.println(yourCustomPersonnages.get(i));
            Personnage temp = yourCustomPersonnages.get(i);
            if (temp instanceof Guerrier) {
                Guerrier g = (Guerrier) temp;
                System.out.println("Vous avez choisis de modifier ce guerrier");
                System.out.println("** Choisissez : ** \n" +
                        "- 1 pour modifier le nom \n " +
                        "- 2 pour modifier le niveau de vie \n " +
                        "- 3 pour modifier la fore d'attaque \n " +
                        "- 4 pour modifier l'arme' \n " +
                        "- 5 pour modifier le bouclier \n " +
                        "- 6 pour supprimer le personnage \n"
                );
                int modifier=0;
                try{
                    modifier= sc.nextInt();
                }
                catch(InputMismatchException exception){
                    System.out.println("**** Merci d'entrer un chiffre ****");
                    modificationPersonnage();
                }
                finally{
                    sc.close();
                }

                switch (modifier) {
                    case 1:
                        System.out.println("** Modifier le nom : ");
                        Scanner scnom = new Scanner(System.in);
                        String nom = scnom.nextLine();
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
                    case 0 :
                        endGame();
                        break;

                }
                modificationPersonnage();
            } else if (temp instanceof Magicien) {
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
                int modifier = sc.nextInt();
                switch (modifier) {
                    case 1:
                        System.out.println("** Modifier le nom : ");
                        Scanner scnom = new Scanner(System.in);
                        String nom = scnom.nextLine();
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
                    case 0 :
                        endGame();
                        break;

                }modificationPersonnage();
            }
        }
        else if (mofificatPersonnage == 2) {
            System.out.println("Vous êtes enfin prêt :) \n");
            playing();
        }
        else {
            System.out.println("Nous n'avons pas compris votre choix");
            modificationPersonnage();
        }
    }

    /**
     * Une fois les personnages validés , la partie commence
     */
    public void playing(){
        System.out.println("La partie va commencer");
    }

}


