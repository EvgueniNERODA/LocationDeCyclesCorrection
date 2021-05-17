package fr.eni.ecole.bo;

import java.time.LocalDate;

/**
 * <ul>
 *     <li>classe abstraite Cycles, parent de Velo, Cyclelectrique.</li>
 *     <li>comporte une méthode de calcul d'age à partir de la date d'achat</li>
 *     <li>comporte le constructeur de cycle</li>
 * </ul>
 */
public abstract class Cycle {
    protected String marque;
    protected String modele;
    protected LocalDate dateAchat;


    /**
     * methode de calcul de l'âge du vélo
     *
     * @return
     */
    public int age() {
        return this.dateAchat.until(LocalDate.now()).getYears();


    }

    public abstract double getTarif();

    public Cycle(String marque, String modele, LocalDate dateAchat) {
        this.marque = marque;
        this.modele = modele;
        this.dateAchat = dateAchat;
    }
}
