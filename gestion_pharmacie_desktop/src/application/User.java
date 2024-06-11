package application;

public class User {
	private int id;
	private String nom;
	private String prenom;
	private String email;
	private String password;
	private String telephone;
	private String userType;
	
	public int getId() {return id;}
	public String getNom() {return nom;}
	public String getPrenom() {return prenom;}
	public String getEmail() {return email;}
	public String getPassword() {return password;}
	public String getTelephone() {return telephone;}
	public String getUserType() {return userType;}
	
	public void setId(int id) {
		this.id=id;
	}
	public void setNom(String nom) {
		this.nom=nom;
	}
	public void setPrenom(String prenom) {
		this.prenom=prenom;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	public void setTelephone(String telephone) {
		this.telephone=telephone;
	}
	public void setUserType(String userType) {
		this.userType=userType;
	}
}
