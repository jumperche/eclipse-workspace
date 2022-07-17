package first;

import java.util.Scanner;

public class transport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
        int x=Integer.parseInt(scanner.nextLine());
        String days=scanner.nextLine();
      
        	
        	switch (days) {
        	case "day":
        		if (x<20) {
        		double taxi=x*0.79+0.7;
        		System.out.printf("%.2f", taxi); }
        		else if (x>=20 && x<100) {
        			double bus=x*0.09;
        			System.out.printf("%.2f", bus); }
        		else if (x>=100) {
        			double train=x*0.06;
        			System.out.printf("%.2f", train); }
        		break;
        	case "night": 
        		if (x<20) {
        		double taxi=x*0.90+0.7;
        		System.out.printf("%.2f", taxi); }
        		else if (x>=20 && x<100) {
        			double bus=x*0.09;
        			System.out.printf("%.2f", bus); }
        		else if (x>=100) {
        			double train=x*0.06;
        			System.out.printf("%.2f", train); }
        		break;
        		default:
        			System.out.println("error");
        	}     	
        		
        	}
        	
        
	}


