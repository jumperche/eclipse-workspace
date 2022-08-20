package first;
//Write a program, which reads a list of integers from the console and receives commands, which manipulate the list. Your program may receive the following commands:
//•	Delete {element} - delete all elements in the array, which are equal to the given element
//•	Insert {element} {position} - insert element at the given position
//You should stop the program when you receive the command "end". Print all numbers in the array separated with a single whitespace.
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        List< Integer > list = Arrays.stream ( scanner.nextLine ( ).split ( " " ) ).map (value -> Integer.parseInt ( value ) )
                .collect ( Collectors.toList ( ) );
        List< String > input = Arrays.stream ( scanner.nextLine ( ).split ( " " ) ).map (value ->  value )
                .collect ( Collectors.toList ( ) );


        //String input=scanner.nextLine();
        while (!input.get(0).equals("end")){
            int help = Integer.parseInt(input.get(1));

            if (input.get(0).equals("Delete")) {


                list.removeIf(n -> (n == help));
            }
            else {
                int position = Integer.parseInt(input.get(2));
                list.add(position, help);

            }
                input= Arrays.stream ( scanner.nextLine ( ).split ( " " ) ).map (value ->  value )
                        .collect ( Collectors.toList ( ) );

            }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}
