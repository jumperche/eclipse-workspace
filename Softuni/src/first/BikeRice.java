package first;

import java.util.Scanner;

public class BikeRice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int zahlJ=Integer.parseInt(scanner.nextLine());
		int zahlS=Integer.parseInt(scanner.nextLine());
	       String category=scanner.nextLine();
	      switch (category) {
	      case "trail":
	    	  double price=zahlJ*5.5+zahlS*7;
	    	  double org=price*5/100;
    		  double total=price-org;   
    		  System.out.printf("%.2f",total);
	    	  
	    	  break;
	      case "cross-country":
	    	  if (zahlJ+zahlS>=50) {
	    		  double priceC=zahlJ*8+zahlS*9.5;
	    		  double pr=priceC*25/100;
	    		  priceC=priceC-pr;
	    		  double orgC=priceC*5/100;
	    		  double totalC=priceC-orgC;   
	    		  System.out.printf("%.2f",totalC);}
	    	  else {
	    		  double priceC=zahlJ*8+zahlS*9.5;
	    		
	    		  double orgC=priceC*5/100;
	    		  double totalC=priceC-orgC;   
	    		  System.out.printf("%.2f",totalC);}
	    	  break;
	      case "downhill":
	    	  double priceD=zahlJ*12.25+zahlS*13.75;
	    	  double orgD=priceD*5/100;
    		  double totalD=priceD-orgD;   
    		  System.out.printf("%.2f",totalD);
	    	  
	    	  break;
	    	  
	    	  
	      case "road":
	    	  
	    	  double priceR=zahlJ*20+zahlS*21.5;
	    	  double orgR=priceR*5/100;
    		  double totalR=priceR-orgR;   
    		  System.out.printf("%.2f",totalR);
	    	  
	    	  break;
	      		default :
	      			System.out.printf("error");
	       
	       
	      
	}
	}
}
