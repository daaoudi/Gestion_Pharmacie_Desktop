package application;

import java.sql.Date;

public class MedPatient {
	private String medPatientId;
	private int qteMedPatient;
	private Date dateAchat;
	
	public String getMedPatientId() {
		return medPatientId;
	}
	
	public int getQteMedPatient() {
		return qteMedPatient;
	}
	public Date getDateAchat() {
		return dateAchat;
	}
	
	public void setMedPatientId(String medPatientId) {
		this.medPatientId=medPatientId;
	}
	
	public void setQteMedPatient(int qteMedPatient) {
		this.qteMedPatient=qteMedPatient;
	}
	
	public void setDateAchat(Date dateAchat) {
		this.dateAchat=dateAchat;
	}
	
	@Override
	public String toString() {
		return String.valueOf(dateAchat);
	}

}
