package first;

import java.util.Scanner;

public class MatchTickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		  double b=Double.parseDouble(scanner.nextLine());
	       String category=scanner.nextLine();
	       int zahl=Integer.parseInt(scanner.nextLine());
	       switch (category) {
	       case "VIP":
	    	   if (zahl<=4) {
	    		   double pr=b*75/100;
	    		   b=b-pr;
	    		   double total=b-(499.99*zahl);
	    		   if (total>=0) {
	    			   System.out.printf("Yes! You have %.2f leva left.",total);	
	    		   }
	    		   else {System.out.printf("Not enough money! You need %.2f leva.",Math.abs(total));}  }
	    				   
	    	   if ((zahl>=5)&&(zahl<=9)) {
	    		   double pr=b*60/100;
	    		   b=b-pr;
	    		   double total=b-(499.99*zahl);
	    		   if (total>=0) {
	    			   System.out.printf("Yes! You have %.2f leva left.",total);	
	    		   }
	    		   else {System.out.printf("Not enough money! You need %.2f leva.",Math.abs(total));}  }
	    	   
	    	   if ((zahl>=10)&&(zahl<=24)) {
	    		   double pr=b*50/100;
	    		   b=b-pr;
	    		   double total=b-(499.99*zahl);
	    		   if (total>=0) {
	    			   System.out.printf("Yes! You have %.2f leva left.",total);	
	    		   }
	    		   else {System.out.printf("Not enough money! You need %.2f leva.",Math.abs(total));}  }
	    	   if ((zahl>=25)&&(zahl<=49)) {
	    		   double pr=b*40/100;
	    		   b=b-pr;
	    		   double total=b-(499.99*zahl);
	    		   if (total>=0) {
	    			   System.out.printf("Yes! You have %.2f leva left.",total);	
	    		   }
	    		   else {System.out.printf("Not enough money! You need %.2f leva.",Math.abs(total));}  }
	    	   if (zahl>=50) {
	    		   double pr=b*25/100;
	    		   b=b-pr;
	    		   double total=b-(499.99*zahl);
	    		   if (total>=0) {
	    			   System.out.printf("Yes! You have %.2f leva left.",total);	
	    		   }
	    		   else {System.out.printf("Not enough money! You need %.2f leva.",Math.abs(total));}  }
	    	   break;
	       case "Normal":
	    	   if (zahl<=4) {
	    		   double pr=b*75/100;
	    		   b=b-pr;
	    		   double total=b-(249.99*zahl);
	    		   if (total>=0) {
	    			   System.out.printf("Yes! You have %.2f leva left.",total);	
	    		   }
	    		   else {System.out.printf("Not enough money! You need %.2f leva.",Math.abs(total));}  }
	    				   
	    	   if ((zahl>=5)&&(zahl<=9)) {
	    		   double pr=b*60/100;
	    		   b=b-pr;
	    		   double total=b-(249.99*zahl);
	    		   if (total>=0) {
	    			   System.out.printf("Yes! You have %.2f leva left.",total);	
	    		   }
	    		   else {System.out.printf("Not enough money! You need %.2f leva.",Math.abs(total));}  }
	    	   
	    	   if ((zahl>=10)&&(zahl<=24)) {
	    		   double pr=b*50/100;
	    		   b=b-pr;
	    		   double total=b-(249.99*zahl);
	    		   if (total>=0) {
	    			   System.out.printf("Yes! You have %.2f leva left.",total);	
	    		   }
	    		   else {System.out.printf("Not enough money! You need %.2f leva.",Math.abs(total));}  }
	    	   if ((zahl>=25)&&(zahl<=49)) {
	    		   double pr=b*40/100;
	    		   b=b-pr;
	    		   double total=b-(249.99*zahl);
	    		   if (total>=0) {
	    			   System.out.printf("Yes! You have %.2f leva left.",total);	
	    		   }
	    		   else {System.out.printf("Not enough money! You need %.2f leva.",Math.abs(total));}  }
	    	   if (zahl>=50) {
	    		   double pr=b*25/100;
	    		   b=b-pr;
	    		   double total=b-(249.99*zahl);
	    		   if (total>=0) {
	    			   System.out.printf("Yes! You have %.2f leva left.",total);	
	    		   }
	    		   else {System.out.printf("Not enough money! You need %.2f leva.",Math.abs(total));}  }
	       	break;
	       	default : System.out.printf("error");
	       		
	       }
	       
	       
	       
	       
	       
	       
	       
	       
	       
	      	}
	      

}
