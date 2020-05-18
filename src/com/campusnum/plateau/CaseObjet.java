package com.campusnum.plateau;

import com.campusnum.objet.Arc;
import com.campusnum.objet.Epee;
import com.campusnum.objet.Massue;
import com.campusnum.objet.Objet;

import java.util.Random;

public class CaseObjet extends Case {
    private String[] typesObjet = new String[]{"Arc", "Epée", "Massue"};
    private Objet objet;

    public CaseObjet(){
        objet=generateObjet();
    }

    public Objet generateObjet() {
        Random random = new Random();
        int nbrObjet = typesObjet.length;
        int aleatoire = random.nextInt(nbrObjet);

        String typeObjet= typesObjet[aleatoire];
        switch (aleatoire){
            case 0:
                Arc CaseObjetArc = new Arc(typeObjet);
                return CaseObjetArc ;

            case 1:
                Epee CaseObjetEpee = new Epee(typeObjet);
                return CaseObjetEpee;

            case 2:
                Massue CaseObjeMassue = new Massue(typeObjet);
                return CaseObjeMassue;

            default:
                System.out.println("bug");
                return null;
        }


    }

    @Override
    public String toString() {
        return "** Case Objet ** " + objet ;
    }
}
