package task;

import java.util.Scanner;

public class GradeCalculator {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter total no of subject");
	int size = sc.nextInt();
	float sum=0;
	 int a[] = new int[size];
	 
	
	 for (int i = 0; i < a.length; i++) {
		
		 System.out.println("Enter your "+(i+1)+" subject Mark");
				sum=sum+(a[i]=sc.nextInt());
	}
	 float per = sum/a.length;
	 System.out.println("Total no of Subject:"+size+"\n"+"Total Marks :"+(size*100));
	 System.out.println("Obtained Marks :"+sum);
	 System.out.println("Percentage is : "+per);
	 sc.close();
	 
 }
}
