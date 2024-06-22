package application;

public class Fournisseur {

	private String fournisseurId;
	private String nomFour;
	private String prenomFour;
	private String telFour;
	private String stockId;
	private StockMed stockMed;
	
	public String getFournisseurId() {
		return fournisseurId;
	}
	
	public String getNomFour() {
		return nomFour;
	}
	
	public String getPrenomFour() {
		return prenomFour;
	}
	public String getTelFour() {
		return telFour;
	}
	
	public String getStockId() {
		return stockId;
	}
	 public int getQteStock() {
	        return stockMed != null ? stockMed.getQteStock() : 0;
	    }
	 
	 public StockMed getStockMed() {
		 return stockMed;
	 }
	 
	 public void setStockMed(StockMed stockMed) {
		 this.stockMed=stockMed;
	 }
	 
	 public void setFournisseurId(String fournisseurId) {
		 this.fournisseurId=fournisseurId;
	 }
	 
	 public void setNomFour(String nomFour) {
		 this.nomFour=nomFour;
	 }
	 
	 public void setPrenomFour(String prenomFour) {
		 this.prenomFour=prenomFour;
	 }
	 
	 public void setTelFour(String telFour) {
		 this.telFour=telFour;
	 }
	 
	 public void setStockId(String stockId) {
		 this.stockId=stockId;
	 }
	 
	 
	 public String toString() {
		 return " Fournisseur =[ Fournisseur Id :"   +fournisseurId + " nom :"+nomFour +"  prenom : "+prenomFour +" telephone : "
		 		+telFour +" stock Id : "+ stockId +" ";
	 }
}
