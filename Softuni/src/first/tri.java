package first;

import java.util.Scanner;

public class tri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		Double a=Double.parseDouble(scanner.nextLine());
		
		Double h=Double.parseDouble(scanner.nextLine());
		double result=a*h/2;
		System.out.printf("%.2f",result);
		scanner.close(); 
	}

}
