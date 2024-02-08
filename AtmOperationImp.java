package miniAtmInterface;
import java.util.HashMap;
import java.util.Map;
public class AtmOperationImp implements AtmInterface {
     Atm atm =new  Atm();
     Map<Double,String> ministmt = new HashMap<>();
	@Override
	public void viewBalance() {
	 System.out.println("Available Balance is:"+atm.getBalance());
	}
	@Override
	public void withdrawAmount(double withdrawAmount) {
        if (withdrawAmount<=atm.getBalance()) {
    	  ministmt.put(withdrawAmount, "Amount Witdrawn");
     	  System.out.println(withdrawAmount+"Collect your Cash");
          atm.setBalance(atm.getBalance()-withdrawAmount);
          viewBalance();
     	}else {
   		System.out.println("Insufficient Balance !!!!");
     }
    }	
	@Override
	public void depositBalance(double depositAmount) {
		ministmt.put(depositAmount, "Amount Deposited");
       System.out.println(depositAmount+"Deposited Successfully !!");
       atm.setBalance(atm.getBalance()+depositAmount);
       viewBalance();
	}
	@Override
	public void viewMiniStatement() {
		for(Map.Entry<Double, String> m : ministmt.entrySet()) {
			System.out.println(m.getKey()+"  "+m.getValue());
		   }
		System.out.println(atm.getBalance()+"Available Bal:");
	}
}
