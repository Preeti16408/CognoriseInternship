import java.util.Random;
import java.util.Scanner;

public class Calculator {
    public static void main(String arg[])
    {
Scanner scan = new Scanner(System.in);
System.out.println("Enter any two number");
double num1 = scan.nextDouble();
double num2 = scan.nextDouble();
System.out.println("any operator :(+,-,/,*)");
char op=scan.next().charAt(0);
double result=0;
try{
    switch (op) {

    case '+':

    result = num1+num2;
    System.out.println("result"+result);
    break;
    case '-':
    result = num1-num2;
    System.out.println("result"+result);
    break;
    case '/':
    if (num2!=0)
    {
    result = num1/num2;
    System.out.println("result"+result);
    } else{ System.out.println("division by 0 is not possible");}
    break;
case '*':
result = num1*num2;
System.out.println("result"+result);
break;
default:
System.out.println("invalid operator");
    }
}
catch( Exception ex)
{
    System.out.println(ex.getMessage());
}


}

    
}