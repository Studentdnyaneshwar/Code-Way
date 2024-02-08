package miniAtmInterface;

import java.util.Scanner;

public class Main_Atm_Class {
 public static void main(String[] args) {
	 AtmInterface op = new AtmOperationImp();
	int atmnumber = 9954;
	int atmpin = 9143;
	Scanner in = new Scanner(System.in);
	System.out.println("Welcome to ATM Machine");
	System.out.println("Enter Atm number");
	 int atmNumber=in.nextInt();
	 System.out.println("Enter Atm pin");
	 int atmPin = in.nextInt();
	 if ((atmnumber==atmNumber)&&(atmpin==atmPin)) {
		   while(true) {
			System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View miniStatement\n5.Exit");
			System.out.println("Enter choice :");
			int ch =in.nextInt();
			if(ch==1) {
			op.viewBalance();
		  }
		   else if (ch==2) {
		    System.out.println("Enter Amount to withdraw ");
		    double withdrawAmount = in.nextDouble();
		    op.withdrawAmount(withdrawAmount);
	     	}
             else if (ch==3) {
			System.out.println("Enter to Deposit  Amount:");
			 double depositAmount = in.nextDouble();
			 op.depositBalance(depositAmount);
			 //System.exit(0);
	    	 }
             else if (ch==4) {
        	 op.viewMiniStatement();
              }
              else if (ch==5) {
        	  System.out.println("Collect Your ATM Card \n Thank you for Visit ");
        	   System.exit(0);
	
               } else {
        	    System.out.println(" Please Enter Correct Choice");
                    }
		       }
	 }
	 else {
		 System.out.println("Incorrect Pin or  Atm number");
		 System.exit(0);
	    }
	 in.close();
 }
 
}
