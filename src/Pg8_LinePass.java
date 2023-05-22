import java.util.HashMap;
import java.util.Scanner;

public class Pg8_LinePass {
    /*
    8. Write the program that tell you which line pass through particular stations.
Just use Zone 1 stations name. (Challenge)
     */
    public static void main(String[] args) {
        String y;
        HashMap<String,String> metroStation=new HashMap<>();
        metroStation.put("Phoenix","19,Ave/Northern/Glendale/Central Ave/Camelback,Indian School/Thomas/CentralAve");
        metroStation.put("Tempe","Priest Drive/Central Pkway/Mill Ave/University Dr.");
        metroStation.put("Mesa","Alma School/Country Club/Center/Mesa dr.");
        do{
        Scanner s=new Scanner(System.in);
        System.out.println("Enter city ");
        String a=s.next();
        for (String b:metroStation.keySet()){
            if (a.equalsIgnoreCase(b))
            System.out.println(metroStation.get(b));
        }

            System.out.println("Would you like to enter another city Y/N ");
            y=s.next();
    }while (y.equalsIgnoreCase("y"));
        System.out.println("Thank you using");
    }
}
