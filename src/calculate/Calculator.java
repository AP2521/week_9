package calculate;
/*
1. Create one package with name calculate
2. Create two class with name “Calculator” and “Main”
3. Create four methods with manes “addition”, “subtraction”, “division”,
and “multiplication”. All methods are instance method and it doesn’t
return anything. But it has two parameters with name “int a” and “int
b”. Also each method have System.out.println(). This prints the result.
Also create all one more method with name “calculateResult” with
three parameter with name int a, int b and char symbol. Write the logic
in calculateResult method that when user enter first number and
second number and symbol based on symbol it does calculate.
 */

public class Calculator {
    int result; //Declare Result
    public void addition(int a, int b){
        System.out.println("Addition of "+a+" and "+b+" is : "+result);
    }
    public void subtraction(int a, int b){
        System.out.println("Subtraction of "+a+" and "+b+" is : "+result);
    }
    public void division(int a, int b){
        System.out.println("Division of "+a+" and "+b+" is : "+result);
    }
    public void multiplication(int a, int b){
        System.out.println("Multiplication of "+a+" and "+b+" is : "+result);
    }
    public int calculateResult(int a, int b, char symbol) {
        if (symbol == '+') {  //addition
            result = (a + b);
            return result;
        } else if (symbol == '-') {  //subtraction
            result = (a - b);
            return result;
        } else if (symbol == '/') { //division
            result = (a / b);
            return result;
        } else  {    //multiplication
            result = (a * b);
            return result;
        }
    }
}
