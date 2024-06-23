package application;

import java.sql.Date;

public class PatFacture {

	private String patFactureId;
	private Date dateTransaction;
	
	public String getPatFactureId() {
		return patFactureId;
	}
	
	public Date getDateTransaction() {
		return dateTransaction;
	}
	
	public void setPatFactureId(String patFactureId) {
		this.patFactureId=patFactureId;
	}
	
	public void setDateTransaction(Date dateTransaction) {
		this.dateTransaction=dateTransaction;
	}
	
	@Override
	public String toString() {
		return " Patient Facture =[ patient Facture Id :  "+ patFactureId + " date Transaction :  "+dateTransaction + " ]";
	}
}
