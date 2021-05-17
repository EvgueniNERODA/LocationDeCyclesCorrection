package fr.eni.ecole.bo;

import java.time.LocalDate;

/**
 * classe abstaite cycleElectrique
 * parent de Gyropode et Gyroroue
 */
public abstract class CycleElectrique extends Cycle {
    protected int autonomie;

    public CycleElectrique(String marque, String modele, LocalDate dateAchat, int autonomie) {
        super(marque, modele, dateAchat);
        this.autonomie = autonomie;
    }
}
