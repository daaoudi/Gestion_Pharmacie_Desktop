package application;

import java.sql.Date;

public class Facture {

	private String factureId;
	private double total;
	private String patFactureId;
	private PatFacture patFacture;
	private Medicament medicament;
	private Patient patient;
	private MedPatient medPatient;
	private int qteMedPatient;
	
	public int getQteMedPatient() {
        return qteMedPatient;
    }

	public void setQteMedPatient(int qteMedPatient) {
		this.qteMedPatient=qteMedPatient;
	}
	public String getFactureId() {
		return factureId;
	}
	
	public double getTotal() {
		return total;
	}
	public String getPatFactureId() {
		return patFactureId;
	}
	public PatFacture getPatFacture() {
		return patFacture;
	}
	public Medicament getMedicament() {
		return medicament;
	}
	public Patient getPatient() {
		return patient;
	}
	public MedPatient getMedPatient() {
		return medPatient;
	}
	public Date getDateTransaction() {
		return patFacture !=null ? patFacture.getDateTransaction() : null;
	}
	
	public String getNomMed() {
		return medicament !=null ? medicament.getNomMed() : "";
	}
	public String getNomPat() {
		return patient !=null ? patient.getNomPat() : "";
	}
	public String getPrenomPat() {
		return patient !=null ? patient.getPrenomPat() : "";
	}
	public double getPrix() {
		return medicament !=null ? medicament.getPrix() : null;
	}
//	public int getQteMedPatient() {
//		return medPatient !=null ? medPatient.getQteMedPatient() : null;
//	}
	public void setFactureId(String factureId) {
		this.factureId=factureId;
	}
	public void setTotal(double total) {
		this.total=total;
	}
	public void setPatFactureId(String patFactureId) {
		this.patFactureId=patFactureId;
	}
	public void setPatFacture(PatFacture patFacture) {
		this.patFacture=patFacture;
	}
	public void setMedicament(Medicament medicament) {
		this.medicament=medicament;
	}
	public void setPatient(Patient patient) {
		this.patient=patient;
	}
	public void setMedPatient(MedPatient medPatient) {
		this.medPatient=medPatient;
	}
	@Override
	public String toString() {
		return " Facture =[ facture Id :  "+factureId + " Total :  "+total + " patient facture Id : "+patFactureId + " ]";
	}
}
