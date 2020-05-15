package com.campusnum.plateau;

public enum OptionCase {
    coffre("coffre"),
    ennemi("ennem"),
    vide("vide");

    OptionCase(String caseDescription) {
        this.caseDescription = caseDescription;
    }

    public String getCaseDescription() {
        return caseDescription;
    }

    private final String caseDescription;


}
