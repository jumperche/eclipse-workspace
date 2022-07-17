package first;

import java.util.Scanner;

public class fishland {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		Double cenaSkumria=Double.parseDouble(scanner.nextLine());
		Double cenaCaca=Double.parseDouble(scanner.nextLine());
		Double kgPalamud=Double.parseDouble(scanner.nextLine());
		Double kgSafrid=Double.parseDouble(scanner.nextLine());
		int kgMidi=Integer.parseInt(scanner.nextLine());
		double palamud=kgPalamud*(cenaSkumria+(60*cenaSkumria/100));
		double safrid=kgSafrid*(cenaCaca+(80*cenaCaca/100));
		double midi=kgMidi*7.5;
		double result=palamud+safrid+midi;
		System.out.printf("%.2f",result);
		scanner.close(); 
	}

}
