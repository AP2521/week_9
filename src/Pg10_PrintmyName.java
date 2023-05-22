import java.util.ArrayList;

public class Pg10_PrintmyName {
    /*
    10. Write program and add all group members names in to array and iterates
through for each loop and print your name.
     */
    public static void main(String[] args) {

    ArrayList<String> group=new ArrayList<>();
group.add("Anish");
group.add("Nimit");
group.add("Kruti");
group.add("Shweta");
    for (String a:group){
        if (a.equalsIgnoreCase("Anish"))
        System.out.println(a);
    }
}}
