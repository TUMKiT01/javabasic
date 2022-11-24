import java.util.Scanner ;
public class LAB18{
public static void main(String args [ ]){ 
    
    int number = getNumber();
    multiply12(number) ; 
}
 public static int getNumber()
{ 
    int num;
    Scanner input = new Scanner(System.in);
    System.out.print("enter number(greater than 10 and not greter than 30) : "); 
    num = input.nextInt();
    while (num<=10 || num>30){
        System.out.print("enter number(greater than 10 and not greter than 30) : "); 
        num = input.nextInt();
    }
    return num;
}
 public static void multiply12(int digit){
    int sum;
    for (int i=1; i<=12; i++){
        sum = digit*i;
        System.out.println(digit+"x"+i+" = "+sum);
    }
  }
}
