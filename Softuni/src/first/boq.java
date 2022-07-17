package first;

import java.util.Scanner;

public class boq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		int najlon=Integer.parseInt(scanner.nextLine());
		double boq=Double.parseDouble(scanner.nextLine());
		int razreditel=Integer.parseInt(scanner.nextLine());
		int chasove=Integer.parseInt(scanner.nextLine());
		najlon=najlon+2;
		boq=(boq+(10*boq/100));
		double result=(najlon*1.5)+(boq*14.50)+(razreditel*5)+0.4;
		double majstor=(result*30/100)*chasove;
		double suma=(result+majstor);
		System.out.println(suma);
		scanner.close();  
		
		
		
	}

}
