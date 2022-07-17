package first;

import java.util.Scanner;

public class hrana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		int pile=Integer.parseInt(scanner.nextLine());
		int riba=Integer.parseInt(scanner.nextLine());
		int veg=Integer.parseInt(scanner.nextLine());
		double pilem=pile*10.35;
		double ribam=riba*12.40;
		double vegm=veg*8.15;
		double suma=pilem+ribam+vegm;
		double desert=suma*20/100;
		double result=suma+desert+2.5;
		System.out.println(result);
		scanner.close();  
	}

}
