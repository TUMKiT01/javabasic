import java.util.Scanner;
public class LAB9 {
    public static void main(String[] arge)
    {     
     int money;
     Scanner input = new Scanner(System.in);
     System.out.print("ใส่จำนวณเงิน :");
     money = input.nextInt();
     if(money>=1000){
        
        System.out.println("ธนบัตร 1000  :"+money/1000 +" ใบ");    
        money = money%1000;
     }
     if(money>=500){
        System.out.println("ธนบัตร 500  :"+money/500 +" ใบ");      
        money = money%500;
     }
     if(money>=100)
     {
        System.out.println("ธนบัตร 100  :"+money/100 +" ใบ");      
        money = money%100;
     }
     if(money>=50){
        System.out.println("ธนบัตร 50  :"+money/50 +" ใบ");        
        money = money%50;
     }
     if(money>=20)
     {
        System.out.println("ธนบัตร 20  :"+money/20 +" ใบ");        
        money = money%20;
     }
     if(money>=10)
     {
        System.out.println("เหรียญ 10  :"+money/10 +" เหรียญ");     
        money = money%10;
     }
     if(money>=5)
     {
        System.out.println("เหรียญ 5   :"+money/10 +" เหรียญ");     
        money = money%5;
     }
     if(money>=1){
        System.out.println("เหรียญ 1  :"+money/1 +" เหรียญ");
        money = money%1;

     }

     
    }
    
   
}
