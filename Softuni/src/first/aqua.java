package first;

import java.util.Scanner;

public class aqua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		
		int dul=Integer.parseInt(scanner.nextLine());
		int shir=Integer.parseInt(scanner.nextLine());
		int vis=Integer.parseInt(scanner.nextLine());
		double prozent=Double.parseDouble(scanner.nextLine());
		double obem=dul*shir*vis;
		double obem_litri=obem*0.001;
		double result=obem_litri*(1-(prozent/100));
		System.out.println(result);
		scanner.close();  
	}

}
