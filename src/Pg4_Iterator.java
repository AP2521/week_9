import java.util.ArrayList;
import java.util.Iterator;

public class Pg4_Iterator {
    /*
    4. Write a Java program to iterate through all elements in an array list using
Iterator.
     */
    public static void main(String[] args) {
        ArrayList<String> week=new ArrayList<>();
        week.add("Monday");
        week.add("Tuesday");
        week.add("Wednesday");
        week.add("Thursday");
        week.add("Friday");
        week.add("Saturday");
        week.add("Funday");

        Iterator weekday= week.iterator();
        while (weekday.hasNext()){
        System.out.print(weekday.next());
            System.out.print(" ");
          week.set(6,"Sunday");}
    }
}
