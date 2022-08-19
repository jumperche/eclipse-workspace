package first;
// On the first line, you will be given a list of wagons (integers). Each integer represents the number of passengers that are currently in each wagon. On the next line, you will get the max capacity of each wagon (single integer). Until you receive "end" you will be given two types of input:
//•	Add {passengers} - add a wagon to the end with the given number of passengers
//•	{passengers} -  find an existing wagon to fit all the passengers (starting from the first wagon)
//At the end print the final state of the train (all the wagons separated by a space)
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        List< Integer > list = Arrays.stream ( scanner.nextLine ( ).split ( " " ) ).map (value -> Integer.parseInt ( value ) )
                .collect ( Collectors.toList ( ) );

        int max=Integer.parseInt(scanner.nextLine());
        List< String > input = Arrays.stream ( scanner.nextLine ( ).split ( " " ) ).map (value ->  value )
                .collect ( Collectors.toList ( ) );


        //String input=scanner.nextLine();
        while (!input.get(0).equals("end")){
if (input.get(0).equals("Add")){
    list.add(Integer.parseInt(input.get(1)));
}
else {
    int help=Integer.parseInt(input.get(0));
    for (int i = 0; i < list.size(); i++) {
        int test=list.get(i)+help;
        if (test<=max){
            list.set(i,test);
            break;
        }

    }
}

            input= Arrays.stream ( scanner.nextLine ( ).split ( " " ) ).map (value ->  value )
                    .collect ( Collectors.toList ( ) );
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}
