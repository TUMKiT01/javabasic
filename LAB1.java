import java.util.Scanner;
public class LAB1 {
    public static void main(String[] args)
    {
     double baht,rate,result;
     Scanner input = new Scanner(System.in);
     System.out.println("กรุณาใส่อัตราแลกเปลี่ยน ");
     System.out.print("[จำนวณเงินบาท] :");baht=input.nextDouble(); 
     System.out.print("[มีค่าเท่ากับเงินสกุลต่างชาติ] :");rate=input.nextDouble();
     System.out.print("กรุณาใส่เงินบาทที่ต้องการแลกเปลียน :");result=input.nextDouble();
     result=rate*(result/baht);
     System.out.println("ผลการคำนวณได้เป็นเงินสกุลต่างชาติ :"+ result);
    }
}
