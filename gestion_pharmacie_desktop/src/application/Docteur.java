package application;

public class Docteur {

	private String docteurId;
	private String nomDoc;
	private String prenomDoc;
	private String telDoc;
	private String specialite;
	
	public String getDocteurId() {
		return docteurId;
	}
	
	public String getNomDoc() {
		return nomDoc;
	}
	
	public String getPrenomDoc() {
		return prenomDoc;
	}
	
	public String getTelDoc() {
		return telDoc;
	}
	public String getSpecialite() {
		return specialite;
	}
	
	public void setDocteurId(String docteurId) {
		this.docteurId=docteurId;
	}
	
	public void setNomDoc(String nomDoc) {
		this.nomDoc=nomDoc;
	}
	
	public void setPrenomDoc(String prenomDoc) {
		this.prenomDoc=prenomDoc;
	}
	
	public void setTelDoc(String telDoc) {
		this.telDoc=telDoc;
	}
	
	public void setSpecialite(String specialite) {
		this.specialite=specialite;
	}
	
	@Override
	public String toString() {
		return " Docteur = [ docteur Id :  " +docteurId + " nom : "+ nomDoc+ " prenom :  "+ prenomDoc+
				"telephone : "+ telDoc  +" specialite : "
				+  specialite+" ]";
	}
	
}
