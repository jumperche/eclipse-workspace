package SoftUniFundament;
//You will receive a sequence of integers, separated by spaces - the distances to the Pokémons.
//Then you will begin receiving integers, which will correspond to indexes in that sequence.
//When you receive an index, you must remove the element at that index from the sequence (as if you've captured the Pokémon).
//•	You must INCREASE the value of all elements in the sequence which are LESS or EQUAL to the removed element, with the value of the removed element.
//•	You must DECREASE the value of all elements in the sequence which are GREATER than the removed element, with the value of the removed element.
//If the given index is LESS than 0, remove the first element of the sequence, and COPY the last element to its place.
//If the given index is GREATER than the last index of the sequence, remove the last element from the sequence, and COPY the first element to its place.
//The increasing and decreasing of elements should be done in these cases, also. The element, whose value you should use, is the REMOVED element.
//The program ends when the sequence has no elements (there are no Pokémons left for Ely to catch).
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" ")).map(value -> Integer.parseInt(value))
                .collect(Collectors.toList());
        int sum=0;
        while (list.size()!=0){

            int index=Integer.parseInt(scanner.nextLine());
            int removeValue ;
            if (index<0){
                removeValue=list.get(0);
                list.add(0,list.get(list.size()-1));
                list.remove(1);
              sum=sum+removeValue;
            }else if (index>list.size()-1){
                removeValue=list.get(list.size()-1);
                list.remove(list.size()-1);
                list.add(list.get(0));
                sum=sum+removeValue;

            }
            else {
                removeValue = list.get(index);
                list.remove(index);
                sum=sum+removeValue;
            }
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i)<=removeValue){
                    list.set(i,list.get(i)+removeValue);

                }
                else {
                    list.set(i,list.get(i)-removeValue);
                }
            }
        }
        System.out.println(sum);
    }
}
