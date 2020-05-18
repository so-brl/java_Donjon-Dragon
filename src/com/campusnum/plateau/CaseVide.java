package com.campusnum.plateau;

public class CaseVide extends Case{
    private String casevide = "Cela ne veut pas dire que vous êtes seul";

    public CaseVide() {


    }

    @Override
    public String toString() {
        return "** Case Vide ** " +  casevide ;
    }
}
