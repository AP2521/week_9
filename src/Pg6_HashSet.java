import java.util.HashSet;
import java.util.Set;

public class Pg6_HashSet {
    /*Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
Show which numbers are between 1 and 10 are in the set. (Hint: use for loop
and if else) */
    public static void main(String[] args) {
        Set<Integer> num = new HashSet<>();
        num.add(4);
        num.add(7);
        num.add(8);


        for(int i =1; i <= 10; i++){
            if(num.contains(i)){
                System.out.println(i + " contain in Set ");
            }else{
                System.out.println(i + " not contain in Set ");
            }


        }
    }
}
