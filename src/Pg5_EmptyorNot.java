import java.util.ArrayList;

/*
5. Write a Java program to test an array list is empty or not.
Define array list with underground tube names
 */
public class Pg5_EmptyorNot {
    public static void main(String[] args) {
        ArrayList<Integer> year=new ArrayList<>();
          year.add(0,2023);
          year.add(1,2021);
          year.add(2,2022);
          year.add(3,2020);
        System.out.println(year.get(2));
        System.out.println(year.isEmpty());}

}
