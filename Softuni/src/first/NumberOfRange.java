package first;

import java.util.Scanner;

public class NumberOfRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		double x=Double.parseDouble(scanner.nextLine());
		
		if ((x>=-100)&&(x<=100)) {
			 if (x!=0) {
			System.out.println("Yes" );}
			 else {System.out.println("No" );}
		}
		else {System.out.println("No" );
		}
	}

}
