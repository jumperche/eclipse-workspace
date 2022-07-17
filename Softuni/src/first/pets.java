package first;

import java.util.Scanner;

public class pets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
        int day=Integer.parseInt(scanner.nextLine());
        int kg=Integer.parseInt(scanner.nextLine());
        double dog=Double.parseDouble(scanner.nextLine());
        double cat=Double.parseDouble(scanner.nextLine());
        double turtle=Double.parseDouble(scanner.nextLine());
        turtle=turtle/1000;
        double bedarf=dog*day+cat*day+turtle*day;
        if (bedarf<=kg) {
        double result=kg-bedarf;
        int value1 =(int)result;
        System.out.println(value1 + " kilos of food left.");
        }
        else {
        	double result=bedarf-kg;
        	result=Math.ceil(result);
        	int value1 =(int)result;
        	System.out.println(value1 +" more kilos of food are needed.");
        }
        
        
	}

}
