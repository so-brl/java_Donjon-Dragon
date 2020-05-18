package com.campusnum;


import com.campusnum.ennemi.Ennemi;
import com.campusnum.ennemi.Sorcier;
import com.campusnum.plateau.Plateau;

import java.io.OutputStream;
import java.security.KeyStore;
import java.util.*;

/**
 * Class Principal
 */
public class Main {

    public static void main(String[] args) {
//        Menu menu = new Menu();
//        menu.welcome();
//        menu.startGame();
        Plateau plateau = new Plateau();
        plateau.createPlateau();
        plateau.affichePlateau();

//        String[] choices = new String[]{"azerty","qsdfgh"};
//        System.out.println(choices[0]);
//        choices[0] = "test";

    }

}
