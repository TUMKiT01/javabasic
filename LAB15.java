import java.util.Scanner;
public class LAB15 {
    public static void main(String []args){
        int num, sum;
        Scanner input = new Scanner(System.in);
        System.out.print("enter number(greater than 10 and not greter than 30) : "); 
        num = input.nextInt();
        while (num<=10 || num>30){
            System.out.print("enter number(greater than 10 and not greter than 30) : "); 
            num = input.nextInt();
        }
        for (int i=1; i<=12; i++){
            sum = num*i;
            System.out.println(num+"x"+i+" = "+sum);
        }
    }
}
