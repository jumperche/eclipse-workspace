package first;

import java.util.Scanner;

public class pipes {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);

        int volume=Integer.parseInt(scanner.nextLine());
        int pipe1=Integer.parseInt(scanner.nextLine());
        int pipe2=Integer.parseInt(scanner.nextLine());
        double hrs=Double.parseDouble(scanner.nextLine());

        double totalBothPipes = (pipe1 + pipe2) * hrs;

        if (volume >= totalBothPipes){
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.",
                    (totalBothPipes * 100 / volume), (pipe1 * hrs * 100 / totalBothPipes), (pipe2 * hrs * 100 / totalBothPipes));
        }else{
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hrs, (totalBothPipes - volume));
	
	}
	}
}
