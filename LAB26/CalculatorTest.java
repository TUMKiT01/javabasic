import java.util.Scanner;
public class CalculatorTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Calculator a = new Calculator();
        System.out.println("1 is to find the sum of two numbers.");
        System.out.println("2 is to find the difference of two numbers.");
        System.out.println("3 is to find the product of two numbers.");
        System.out.println("4 is to find the divisor of two numbers.");
        System.out.print("select :"); int pink = input.nextInt();
        if(pink<0 || pink>4){
            System.out.println("Numbers do not range from 1-4. "); pink = input.nextInt();
        }
        double numberOne,numberTwo,result=0;
        System.out.println("Enter 2 number ");
        System.out.print("numberOne:");  numberOne = input.nextInt();
        System.out.print("numberTwo:");  numberTwo = input.nextInt();
        switch(pink){
            case 1:result=a.sum(numberOne,numberTwo); break;
            case 2:result=a.minus(numberOne,numberTwo);break;
            case 3:result=a.product(numberOne,numberTwo);break;
            case 4:result=a.divide(numberOne,numberTwo);break;
        }
      System.out.println("result = " + result);
     }
}
