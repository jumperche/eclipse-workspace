package SoftUniFundament;
//Write a program that prints you a receipt for your new computer. You will receive the parts' prices (without tax) until you receive what type of customer this is - special or regular. Once you receive the type of customer you should print the receipt.
//The taxes are 20% of each part's price you receive.
//If the customer is special, he has a 10% discount on the total price with taxes.
//If a given price is not a positive number, you should print "Invalid price!" on the console and continue with the next price.
//If the total price is equal to zero, you should print "Invalid order!" on the console
import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input=scanner.nextLine();
        double sum=0;
        double tax=0;
        double total=0;
        while (!input.equals("special")&&!input.equals("regular")){
            double in=Double.parseDouble(input);
            if (in<0){
                System.out.println("Invalid price!" );
                input=scanner.nextLine();
                continue;


            }
            sum=sum+in;
            input=scanner.nextLine();
        }
if (sum==0){
    System.out.println("Invalid order!" );
}
else {
    tax=sum*0.2;
    if (input.equals("special")){
        total=(sum+tax)-(sum+tax)*0.1;
    }
    else {
        total=sum+tax;
    }

print(sum,tax,total);
}
    }
    public static void print(double sum, double tax,double total){
        System.out.println("Congratulations you've just bought a new computer!");
        System.out.printf("Price without taxes: %.2f$%n",sum);
        System.out.printf("Taxes: %.2f$%n",tax);
        System.out.println("-----------");
        System.out.printf("Total price: %.2f$%n",total);
    }
}
