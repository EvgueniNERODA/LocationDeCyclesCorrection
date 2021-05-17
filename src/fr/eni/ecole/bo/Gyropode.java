package fr.eni.ecole.bo;

import java.time.LocalDate;

/**
 * Gyropode
 * <p>
 * taille minimum en centimètres
 */
public class Gyropode extends CycleElectrique {
    private static final double TARIF_GYROPODE = 29.90;

    private int tailleMini;

    public Gyropode(String marque, String modele, LocalDate dateAchat, int autonomie, int tailleMini) {
        super(marque, modele, dateAchat, autonomie);
        this.tailleMini = tailleMini;
    }


    @Override
    public double getTarif() {
        return TARIF_GYROPODE;
    }

    @Override
    public String toString() {
        return "Gyropode{" +
                "marque='" + marque + '\'' +
                ", modele='" + super.age() + "an" + (super.age() > 1 ? "s" : "") + '\'' +
                ", age=" + dateAchat +
                ", autonomie=" + autonomie +
                ", tailleMini=" + tailleMini / 100 +
                '}';
    }
}
