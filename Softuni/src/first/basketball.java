package first;

import java.util.Scanner;

public class basketball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		int taksa=Integer.parseInt(scanner.nextLine());
		double kez=(taksa-(taksa*40/100));
		double ekip=(kez-(kez*20/100));
		double topka=ekip/4;
		double aks=topka/5;
		double result=taksa+kez+ekip+topka+aks;
		System.out.println(result);
			
		scanner.close();  
	}

}

