package first;

import java.util.Scanner;

public class Flowers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int zahlH=Integer.parseInt(scanner.nextLine());
		int zahlR=Integer.parseInt(scanner.nextLine());
		int zahlL=Integer.parseInt(scanner.nextLine());
	    String category=scanner.nextLine();
	    String holiday=scanner.nextLine();
	       int buk=zahlR+zahlH+zahlL;
	       double cena=zahlL*2.5+zahlH*2+zahlR*4.1;
	       double cenaW=zahlL*4.15+zahlH*3.75+zahlR*4.5;
	       double cenaHolW=cenaW+(cenaW*15/100);
	       double cenaHoliday=cena+(cena*15/100);
	      switch (category) {
	      case "Sommer":
	      case "Spring":
	    	 if (holiday.equals("Y")) {
	    	  if (zahlL>7) {
	    	double total=cenaHoliday-(cenaHoliday*5/100);}
	    		  if (buk>20)
	    		  {	double prise=(cenaHoliday-(cenaHoliday*5/100))-((cenaHoliday-(cenaHoliday*5/100))*20/100)+2;
	    		  System.out.printf("%.2f",prise);}
	    		  else {double prise=(cenaHoliday-(cenaHoliday*5/100)+2);
	    		  System.out.printf("%.2f",prise);}
	    	 }
	    	 else if  (zahlL>7) {
	    		 double total=cena-(cena*5/100);
	    		 System.out.printf("%.2f",total);}
	    	 else if (buk>20)
   		  {	double pr=(cena-(cena*5/100)-((cena-(cena*5/100))*20/100)+2);
   		System.out.printf("%.2f",pr);}
		    		  else {System.out.printf("%.2f",cena+2);}
	      	 break;
      case "Autumn":  
	    	  if (buk>20)
    		  {	double prise=(cenaHolW-(cenaHolW*10/100))-((cenaHolW-(cenaHolW*10/100))*20/100)+2;
    		  System.out.printf("%.2f",prise);}
    		  else {double prise=(cenaHolW-(cenaHolW*10/100)+2);
    		  System.out.printf("%.2f",prise);}
    		  
    	
	  break;
  
	     case "Winter":
	    	  if (holiday.equals("Y")) {
		    	  if (zahlR>10) {
		    		  double total=cenaHolW-(cenaHolW*10/100);}
		    		  if (buk>20)
		    		  {	double prise=(cenaHolW-(cenaHolW*10/100))-((cenaHolW-(cenaHolW*10/100))*20/100)+2;
		    		  System.out.printf("%.2f",prise);}
		    		  else {double prise=(cenaHolW-(cenaHolW*10/100)+2);
		    		  System.out.printf("%.2f",prise);}
		    		  }
		    	 else if  (zahlR>10) {
		    		 double total=cenaW-(cenaW*10/100);
		    		 System.out.printf("%.2f",total);}
		    	 else if (buk>20){
	   		  	double pr=(cenaW-(cenaW*10/100)-((cenaW-(cenaW*10/100))*20/100)+2);
	   		System.out.printf("%.2f",pr); }
			    		  else {System.out.printf("%.2f",cenaW+2);}
	    	  
	    	  break;
	     default : System.out.printf("error");
	    	  
	
	   
	      }  	  
	    	 
	    	  
	      }
}
