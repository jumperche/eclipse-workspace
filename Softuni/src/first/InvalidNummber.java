package first;

import java.util.Scanner;

public class InvalidNummber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		double x=Double.parseDouble(scanner.nextLine());
		
		if ((x>=100)&&(x<=200)||(x==0)) {
					}
		else {System.out.println("invalid" );
		}
	}

}
