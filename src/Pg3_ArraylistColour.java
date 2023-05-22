import java.util.ArrayList;

public class Pg3_ArraylistColour {
/*
3. Write a Java program to create a new array list, add some colours(string) and
printout the collection using for each loop.
 */
public static void main(String[] args) {
    ArrayList<String> colours =new ArrayList<>();
    colours.add("Red");
    colours.add("Blue");
    colours.add("Pink");
    colours.add("Purple");
    colours.add("Black");
    colours.add("White");

    for(String a:colours){
        System.out.print(a);
        System.out.print(" ");}

}
}
