package fr.eni.ecole.main;

import fr.eni.ecole.bo.Cycle;
import fr.eni.ecole.bo.Gyropode;
import fr.eni.ecole.bo.Gyroroue;
import fr.eni.ecole.bo.Velo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //création d'un tableau de cycles son affichage
        Cycle[] tabCycles = new Cycle[6];
        tabCycles[0] = new Velo("Lapierre", "speed 400", LocalDate.of(2017, 6, 21), 27);
        tabCycles[1] = new Velo("Btwin", "riverside 900", LocalDate.of(2018, 6, 20), 23);
        tabCycles[2] = new Gyropode("Segway", "Ninebot Elite", LocalDate.of(2021, 4, 20), 40, 150);
        tabCycles[3] = new Gyropode("Weebot", "Echo", LocalDate.of(2020, 5, 1), 35, 160);
        tabCycles[4] = new Gyroroue("Immotion", "v8", LocalDate.of(2021, 4, 1), 40);
        tabCycles[5] = new Gyroroue("Segway", "Ninebot One E+", LocalDate.of(2021, 4, 4), 30);





        /*autre méthode plus rapide
        Cycle [] alouerSenior = {
                new Velo ("Lapierre", "speed 400",LocalDate.of (2017,6,21))
        }

         */

        /*boucle avec foreeach
        for (Cycle cycle: aLouer) {
              if (cycle != null){
                  System.out.println(cycle);
              }

        }
        */

        //affichage du tableau de cycles
        for (int i = 0; i < tabCycles.length; i++) {
            if (tabCycles[i] != null) {
                System.out.println(tabCycles[i]);
            }

        }
        /*autre méthode
        for (int i = 0; i < tabCycles.length; i++) {
            System.out.println((tabCycles[i] != null ? tabCycles[i]: ""));

        }

         */

    }


}
