package application;

public class StockMed {
	
	private String stockId;
	private int qteStock;
	
	public String getStockId() {return stockId;}
	public int getQteStock() {return qteStock;}
	
	public void setStockId(String stockId ) {
		this.stockId=stockId;
	}
	public void setQteStock(int qteStock) {
		this.qteStock=qteStock;
	}
	
	@Override
    public String toString() {
        return String.valueOf(qteStock); // Display qte in ComboBox
    }


}
