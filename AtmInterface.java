package miniAtmInterface;

public interface AtmInterface {
	public void viewBalance(); 
	public void withdrawAmount(double withdrawAmount); 
	public void depositBalance(double depositAmount); 
	public void viewMiniStatement(); 
}
