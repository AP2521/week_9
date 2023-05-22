import java.util.ArrayList;

public class Pg11_GlobalName {
    /*
    11. Declare global variables of your name, Add all your group names in list, using
for each loop iterate and print ONLY your name.
     */
   static String name="Anish";
    public static void main(String[] args) {
        ArrayList<String> group=new ArrayList<>();
        group.add("Nimit");
        group.add("Kruti");
        group.add("Shweta");
        group.add(name);
        for (String a:group){
            if (a.equalsIgnoreCase("Anish"))
                System.out.println(a);
    }
}}
