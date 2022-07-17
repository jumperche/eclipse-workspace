package first;

import java.util.Scanner;

public class celsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		Double a=Double.parseDouble(scanner.nextLine());
		
		
		double result=a*1.8+32;
		System.out.printf("%.2f",result);
		scanner.close(); 
	}

}
