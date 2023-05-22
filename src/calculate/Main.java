package calculate;
/*
Write a “main” method into main class. It has scanner that takes user
input. Also write the logic that it ask user to “Enter first Number:”,
“Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
enter + symbol result like “Addition of 5 and 10 is: 15” and respective
for other symbol.
5. With the result it’s also print one more message “Would you like to do
more calculation Please enter “Y” or “N” :” (Hint use while loop if user
enter Y program asking the user to enter First Number, and if user enter
N program should terminate)
 */

import java.util.Scanner;

public class Main{


    public static void main(String[] args) {
        char ch;
        do{
        Calculator cal=new Calculator();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a=s.nextInt(); //store first number in variable
        System.out.println("Enter second number : ");
        int b=s.nextInt();  //store second number in variable
        System.out.println("Please enter symbol :");
         char symbol=s.next().charAt(0);  //store symbol in variable
         cal.calculateResult(a,b,symbol);
             if (symbol=='+'){ cal.addition(a,b);}
             else if(symbol=='-'){cal.subtraction(a,b);}
             else if(symbol=='/'){cal.division(a,b);}
             else if(symbol=='*'){cal.multiplication(a,b);}
             else { System.out.println("Invalid entry");}
        System.out.println("Would you like to do more calculation please enter \"Y\"or \"N\" : ");
       ch=s.next().charAt(0);
    }while (ch=='y' || ch=='Y');}
}
