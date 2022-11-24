import java.util.Scanner;
public class LAB2 {
    public static void main(String[] args){
     double Foodcost,rebate;
     Scanner input = new Scanner(System.in);
     System.out.print("[ยอดรวมค่าส่งอาหาร] :");Foodcost=input.nextDouble();
     System.out.print("[%ส่วนลด] :");rebate=input.nextDouble();
     double A,B,C;
     A=Foodcost-(Foodcost*(rebate/100)); 
     B=(A*10)/100;
     C=((A+B)*7)/100;
     Foodcost = A+B+C;
     System.out.println("คำนวณยอดรวมค่าอาหารหลังหักส่วนลด :"+A);
     System.out.println("service charge 10% :"+B);
     System.out.println("VAT 7% :"+C);
     System.out.println("ค่าอาหารที่ต้องชำระ :"+Foodcost);
    }
    
}
