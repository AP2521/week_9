import java.util.HashMap;
import java.util.Map;

public class Pg7_HashMap {
    /*
    7. Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map.
     */
    public static void main(String[] args) {
        HashMap<String,Integer> people=new HashMap<>();
        people.put("Java",1);
        people.put("Postman",2);
        people.put("Selenium",3);
        for (Map.Entry<String,Integer> group:people.entrySet()){
            System.out.println(group.getKey()+" "+group.getValue());
        }
    }
}
