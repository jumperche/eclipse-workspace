package first;

import java.util.Scanner;

public class cat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);

        int day=Integer.parseInt(scanner.nextLine());
        int days=365-day;
        int game=(day*127)+(days*63);
       
        if (game>30000) {
        	int hours=(game-30000)/60;
        	int min=(game-30000)%60;
        	System.out.println("Tom will run away");
        	System.out.println(hours + " hours and " + min +" minutes more for play");}
        else{ int hours=(30000-game)/60;
        int min=(30000-game)%60;
        System.out.println("Tom sleeps well");
        System.out.println(hours + " hours and " + min + " minutes less for play");}
        }        
	}


