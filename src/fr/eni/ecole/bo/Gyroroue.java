package fr.eni.ecole.bo;

import java.time.LocalDate;

/**
 * <ul>
 *     <li>classe Gyroroue</li>
 *     <li>hérite de CycleElectrique</li>
 *     <li>comporte une méthode d'affichage</li>
 * </ul>
 */
public class Gyroroue extends CycleElectrique {
    private static final double TARIF_GYROROUE = 18.90;

    public Gyroroue(String marque, String modele, LocalDate dateAchat, int autonomie) {
        super(marque, modele, dateAchat, autonomie);
    }

    @Override
    public double getTarif() {
        return TARIF_GYROROUE;
    }


    @Override
    public String toString() {
        return "Gyroroue{" +
                "marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", age=" + super.age() + "an" + (super.age() > 1 ? "s" : "") +
                ", autonomie=" + autonomie +
                '}';
    }
}
