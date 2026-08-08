import models.ReservationChambre;
import models.ReservationSalle;
import services.GestionEvenementiel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GestionEvenementiel sm = new GestionEvenementiel();

        ReservationChambre rc;
        ReservationSalle rs;

        int choix;

        do {

            System.out.println("===== MENU =====");
            System.out.println("1- Ajouter reservation chambre");
            System.out.println("2- Ajouter reservation salle");
            System.out.println("3- Afficher le recapitulatif");
            System.out.println("4- Quitter");

            System.out.print("Faites votre Choix : ");
            choix = sc.nextInt();
            sc.nextLine();

            switch (choix) {

                case 1:

                    System.out.print("Code : ");
                    String codeCh = sc.nextLine();

                    System.out.print("Nombre nuits : ");
                    int nombreNuits = sc.nextInt();

                    System.out.print("Prix nuit : ");
                    int prixNuit = sc.nextInt();

                    System.out.print("Tarif petit dejeuner : ");
                    int tarifPD = sc.nextInt();

                    rc = new ReservationChambre(codeCh, nombreNuits, prixNuit);

                    rc.setTarif_petitDejeuner(tarifPD);

                    sm.ajouter(rc);

                    rc.afficherRecapitulatif();

                    System.out.println("Prix total : " + rc.calculerPrixTotal());

                    break;

                case 2:

                    System.out.print("Code : ");
                    String codeSalle = sc.nextLine();

                    System.out.print("Nombre heure : ");
                    int nombreHeure = sc.nextInt();

                    System.out.print("Prix heure : ");
                    int prixHeure = sc.nextInt();

                    rs = new ReservationSalle(codeSalle, nombreHeure, prixHeure);

                    sm.ajouter(rs);

                    rs.afficherRecapitulatif();

                    System.out.println("Prix total : " + rs.calculerPrixTotal());

                    break;

                case 3:


                    sm.genererRapportJournalier();

                    break;

                case 4:

                    System.out.println("CIAO CIAO!!!");

                    break;

                default:

                    System.out.println("CHOIX INVALIDE!!!!");

            }

        } while (choix != 4);

    }
}