package first;

import java.util.Scanner;

public class weather2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		double a=Double.parseDouble(scanner.nextLine());
		
		
		if (a>=26.00&&a<=35.00) {
			System.out.println("Hot");}
		 else if (a>=20.1&&a<=25.9)  {
			 System.out.println("Warm");}
		 else if (a>=15.00&&a<=20.0){ 
		System.out.println("Mild");}
		 else if (a>=12.00&&a<=14.9){ 
				System.out.println("cool");}
		 else if (a>=5.00&&a<=11.9) {
			 System.out.println("Cold");}
	 		else {System.out.println("unknown");}
		scanner.close(); 
	}
}

