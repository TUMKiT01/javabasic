import java.util.Scanner;
public class LAB14 {
    public static void main(String[] ages){
        Scanner input = new Scanner(System.in);
        int num =1 ,fact =1;
        int value;
        do{
        System.out.println("ป้อนเลขจำนวณเต็ม ระหว่าง 1 - 10 :");
         value = input.nextInt();
                if(value >= 1 && value <=10){
                    for(int i=1;i<=value;i++){    
                        fact=fact*i;    
                    }    
                    System.out.println("Factorial ของ "+value+" is: "+fact);    
                    num = 0;
                   }      
                 else
                 System.out.println("Wrong num:");
        }while(num != 0);
     }

}