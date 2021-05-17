package fr.eni.ecole.bo;

import java.time.LocalDate;


public class Velo extends Cycle {
    private static final double TARIF_VELO = 4.90;
    private int nbreVitesses;


    @Override
    public double getTarif() {
        return TARIF_VELO;
    }

    /**
     * @param marque
     * @param modele
     * @param dateAchat
     */

    public Velo(String marque, String modele, LocalDate dateAchat, int nbreVitesses) {
        super(marque, modele, dateAchat);
        this.nbreVitesses = nbreVitesses;
    }

    public static double getTarifVelo() {
        return TARIF_VELO;
    }


    @Override
    public String toString() {
        return "Velo{" +
                "marque='" + marque + '\'' +
                ", \n modele='" + modele + '\'' +
                ", Age=" + super.age() + "an" + (super.age() > 1 ? "s" : "") +
                ", nbreVitesses=" + nbreVitesses +
                ", tarif = " + this.getTarif() + " €" +
                '}';
    }
}
