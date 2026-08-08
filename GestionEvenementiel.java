package services;

import impl.IRESERVATION;

import java.util.ArrayList;
import java.util.List;

public class GestionEvenementiel {

    List<IRESERVATION> listeReservation = new ArrayList<>();

    public void ajouter(IRESERVATION r) {

        listeReservation.add(r);

        System.out.println("RESERVATION ajoutee avec succes !!");
    }

    public void genererRapportJournalier() {

        double total = 0;

        for (IRESERVATION r : listeReservation) {

            r.afficherRecapitulatif();

            System.out.println("Prix total : " + r.calculerPrixTotal());

            total = total + r.calculerPrixTotal();

            System.out.println("---------------------");
        }

        System.out.println("Chiffre affaire : " + total);
    }
}