package application;

import java.sql.Date;

public class Medicament {

    private String medId;
    private String nomMed;
    private String description;
    private Date dateProdMed;
    private Date dateExperMed;
    private int qteMed;
    private double prix;
    private StockMed stockMed;
    private MedPatient medPatient;
    private String stockId;
    private String medPatientId;
   

    public String getMedPatientId() {
        return medPatientId;
    }

    public int getQteStock() {
        return stockMed != null ? stockMed.getQteStock() : 0;
    }

    public void setMedPatientId(String medPatientId) {
        this.medPatientId = medPatientId;
    }

  

    public String getStockId() {
        return stockId;
    }

    public Date getDateAchat() {
        return medPatient != null ? medPatient.getDateAchat() : null;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

 

    public String getMedId() {
        return medId;
    }

    public String getNomMed() {
        return nomMed;
    }

    public String getDescription() {
        return description;
    }

    public Date getDateProdMed() {
        return dateProdMed;
    }

    public Date getDateExperMed() {
        return dateExperMed;
    }

    public int getQteMed() {
        return qteMed;
    }

    public double getPrix() {
        return prix;
    }

    public StockMed getStockMed() {
        return stockMed;
    }

    public MedPatient getMedPatient() {
        return medPatient;
    }

    public void setMedId(String medId) {
        this.medId = medId;
    }

    public void setNomMed(String nomMed) {
        this.nomMed = nomMed;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDateProdMed(Date dateProdMed) {
        this.dateProdMed = dateProdMed;
    }

    public void setDateExperMed(Date dateExperMed) {
        this.dateExperMed = dateExperMed;
    }

    public void setQteMed(int qteMed) {
        this.qteMed = qteMed;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setStockMed(StockMed stockMed) {
        this.stockMed = stockMed;
    }

    public void setMedPatient(MedPatient medPatient) {
        this.medPatient = medPatient;
    }
    
    @Override
    public String toString() {
    	return " Medicament =[ med Id :  "+ medId +" nom medicament : "+nomMed + "description : "
    			+ description+"date prod : "+dateProdMed+" date Exper :"+dateExperMed + "qte Medicament : "+ qteMed +" prix : "+
    					prix+ " stock id :"+stockId +" med patient ID :"+medPatientId + "]";
    }
}
