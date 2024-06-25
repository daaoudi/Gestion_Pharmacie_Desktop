package application;

import java.sql.Date;

public class Patient {
	private String patientId;
	private String nomPat;
	private String prenomPat;
	private String telPat;
	private String adressePat;
	private String docteurId;
	private String medPatientId;
	private String patFactureId;
	private Docteur docteur;
	private MedPatient medPatient;
	private PatFacture patFacture;
	
	public String getPatientId() {
		return patientId;
	}
	public String getNomPat() {
		return nomPat;
	}
	public String getPrenomPat() {
		return prenomPat;
	}
	public String getTelPat() {
		return telPat;
	}
	public String getAdressePat() {
		return adressePat;
	}
	
	public String getDocteurId() {
		return docteurId;
	}
	
	public String getMedPatientId() {
		return medPatientId;
	}
	public String getPatFactureId() {
		return patFactureId;
	}
	public Docteur getDocteur() {
		return docteur;
	}
	public MedPatient getMedPatient() {
		return medPatient;
	}
	public PatFacture getPatFacture() {
		return patFacture;
	}
	 public String getNomDoc() {
	        return docteur != null ? docteur.getNomDoc() : null;
	    }

	    public String getPrenomDoc() {
	        return docteur != null ? docteur.getPrenomDoc() : null;
	    }

	    public Date getDateAchat() {
	        return medPatient != null ? medPatient.getDateAchat() : null;
	    }

	    public Date getDateTransaction() {
	        return patFacture != null ? patFacture.getDateTransaction() :null;
	        }
	//setters
	public void setPatientId(String patientId) {
		this.patientId=patientId;
	}
	public void setNomPat(String nomPat) {
		this.nomPat=nomPat;
	}
	public void setPrenomPat(String prenomPat) {
		this.prenomPat=prenomPat;
	}
	public void setTelPat(String telPat) {
		this.telPat=telPat;
	}
	public void setAdressePat(String adressePat) {
		this.adressePat=adressePat;
	}
	public void setDocteurId(String docteurId) {
		this.docteurId=docteurId;
	}
	public void setMedPatientId(String medPatientId) {
		this.medPatientId=medPatientId;
	}
	public void setPatFactureId(String patFactureId) {
		this.patFactureId=patFactureId;
	}
	public void setDocteur(Docteur docteur) {
		this.docteur=docteur;
	}
	public void setMedPatient(MedPatient medPatient) {
		this.medPatient=medPatient;
	}
	public void setPatFacture(PatFacture patFacture) {
		this.patFacture=patFacture;
	}
	@Override
	public String toString() {
		return " Patient = [ patient Id :  "+patientId + " nom : "+nomPat + " prenom : "+ prenomPat+ " telephone : "
				+ telPat+" adresse : "+adressePat + " docteur Id : "+ docteurId+ " medicament Patient Id : "+medPatientId + " patient facture Id :"
						+ patFactureId+"";
	}
}
