package first;

import java.util.Scanner;

public class deposit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		double depo=Double.parseDouble(scanner.nextLine());
		int srok=Integer.parseInt(scanner.nextLine());
		double prozent=Double.parseDouble(scanner.nextLine());
		prozent=prozent/100;
		double result=depo+srok*((depo*prozent)/12);
		System.out.println(result);
		scanner.close();  	
	}

}
