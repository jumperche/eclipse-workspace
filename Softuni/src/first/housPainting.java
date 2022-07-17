package first;

import java.util.Scanner;

public class housPainting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		Double x=Double.parseDouble(scanner.nextLine());
		Double y=Double.parseDouble(scanner.nextLine());
		Double h=Double.parseDouble(scanner.nextLine());
		double greenA=2*(x*x)-(1.2*2);
		double greenB=2*(x*y)-2*(1.5*1.5);
		double green=greenA+greenB;
		double redA=2*(x*y);
		double redB=2*(x*h/2);
		double red=redA+redB;
		double resultGreen=green/3.4;
		double resultRed=red/4.3;
		
		System.out.printf("%.2f%n ",resultGreen);
		System.out.printf("%.2f",resultRed);
		
		scanner.close(); 
		
		
		
		
		
	}

}
