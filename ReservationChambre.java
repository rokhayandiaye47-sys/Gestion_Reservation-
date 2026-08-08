package models;

import impl.IRESERVATION;

public class ReservationChambre implements IRESERVATION {
    private String code;
    private int nombreNuits;
    private int prixNuits;
    private int tarif_petitDejeuner;

    public ReservationChambre(String code, int nombreNuit, int prixNuit){
        this.code=code;
        this.prixNuits=prixNuit;
        this.nombreNuits=nombreNuit;

    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getNombreNuits() {
        return nombreNuits;
    }

    public void setNombreNuits(int nombreNuits) {
        this.nombreNuits = nombreNuits;
    }

    public int getPrixNuits() {
        return prixNuits;
    }

    public void setPrixNuits(int prixNuits) {
        this.prixNuits = prixNuits;
    }

    public int getTarif_petitDejeuner() {
        return tarif_petitDejeuner;
    }

    public void setTarif_petitDejeuner(int tarif_petitDejeuner) {
        this.tarif_petitDejeuner = tarif_petitDejeuner;
    }

    @Override
    public double calculerPrixTotal() {
        return ((this.nombreNuits*prixNuits)+(nombreNuits*tarif_petitDejeuner));
    }

    @Override
    public void afficherRecapitulatif() {
        System.out.println("CODE:"+ getCode());
        System.out.println("PRIX_NUIT:"+getPrixNuits());
        System.out.println("NOMBRE_NUIT:"+getNombreNuits());
        System.out.println("TARIF PETUT DEJEUNER:"+getTarif_petitDejeuner());

    }

    @Override
    public String getCodeReservation() {
        return this.code;
    }
}
