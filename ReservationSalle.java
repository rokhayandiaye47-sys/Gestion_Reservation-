package models;

import impl.IRESERVATION;

public class ReservationSalle implements IRESERVATION {
    private String code;
    private int nombre_heure;
    private int prix_heure;
    private int taxe=15000;

    public ReservationSalle(String code, int nombre_heure, int prix_heure){
        this.code=code;
        this.prix_heure=prix_heure;
        this.nombre_heure=nombre_heure;

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getNombre_heure() {
        return nombre_heure;
    }

    public void setNombre_heure(int nombre_heure) {
        this.nombre_heure = nombre_heure;
    }

    public int getPrix_heure() {
        return prix_heure;
    }

    public void setPrix_heure(int prix_heure) {
        this.prix_heure = prix_heure;
    }





    @Override
    public double calculerPrixTotal() {
        return ((this.prix_heure * this.nombre_heure)+taxe);
    }

    @Override
    public void afficherRecapitulatif() {
        System.out.println("CODE:"+ getCode());
        System.out.println("PRIX_HEURE:"+getPrix_heure());
        System.out.println("NOMBRE_HEURE:"+getNombre_heure());

    }

    @Override
    public String getCodeReservation() {
        return this.code;
    }
}
