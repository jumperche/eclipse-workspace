package first;

import java.util.Scanner;

public class trapec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		Double a=Double.parseDouble(scanner.nextLine());
		Double b=Double.parseDouble(scanner.nextLine());
		Double h=Double.parseDouble(scanner.nextLine());
		double result=(a+b)*h/2;
		System.out.printf("%.2f",result);
		scanner.close(); 
		
	}

}
