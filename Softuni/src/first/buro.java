package first;

import java.util.Scanner;

public class buro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int himikal=Integer.parseInt(scanner.nextLine());
		int markeri=Integer.parseInt(scanner.nextLine());
		int preparat=Integer.parseInt(scanner.nextLine());
		double prozent=Double.parseDouble(scanner.nextLine());
		prozent=prozent/100;
		double result=(himikal*5.80)+(markeri*7.20)+(preparat*1.20);
		double suma=result-(result*prozent);
		System.out.println(suma);
		scanner.close();  
				
	}

}
