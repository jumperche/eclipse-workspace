package first;

import java.util.Scanner;

public class harvest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);

        int x=Integer.parseInt(scanner.nextLine());
        double y=Double.parseDouble(scanner.nextLine());
        int liter=Integer.parseInt(scanner.nextLine());
        int worker=Integer.parseInt(scanner.nextLine());
        double total=(x*y);
        double wine=(40*total/100)/2.5;
              
        if (wine>=liter) {
        	double result=(wine-liter);
        	int value=(int)result;
        	double result1=result/worker;
        	int value1 =(int)result1;
        	int wines =(int)wine;
        	System.out.println("Good harvest this year! Total wine: " + wines + " liters.");
        	System.out.println( value + " liters left -> "+ value1 + " liters per person.");}
        	else
        	{double result = liter-wine;
        	result=Math.floor(result);
        	int value=(int)result;
        	System.out.println("It will be a tough winter! More " + value + " liters wine needed.");
        	
        }
	}

}
