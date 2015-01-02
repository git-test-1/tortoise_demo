
public class sheepOrder {
	
	private int quantity;
	private int sheepCode;
	private String sheepName;
	private String notes;
	private int tasteScore;
	
	/**
	 * 
	 * New Master and sheep_release2 and sheep_fix comments
	 */
	public void setQuantity(Integer i) {
	
		quantity=i;
		
	}
	
	/**
	 * @param args
	 */
	public Integer getQuantity() {
	
		return quantity*10;
		
	}		
	/**
	 * 
	 * @param args
	 */
	public void setSheepCode(Integer i) {
	
		sheepCode=i;
		
	}
	
	/**
	 * @param args
	 */
	public Integer getsheepCode() {
	
		return sheepCode;
		
	}	
	
	/**
	 * 
	 * @param args
	 */
	public void setSheepName(String s) {
	
		sheepName=s;
		
	}
	
	/**
	 * @param args
	 */
	public String getSheepName() {
	
		return sheepName;
		
	}	
	
	/**
	 * 
	 * @param args
	 */
	public void setNotes(String s) {
	
		notes=s;
		
	}
	
	public void setTasteScore(Integer i) {
	
		tasteScore=i;
		
	}
	
	/**
	 * @param args
	 */
	public String getNotes() {
	
		return notes;
		
	}		
		
	public Integer getTasteScore() {
	
		return tasteScore;
	}	
}
