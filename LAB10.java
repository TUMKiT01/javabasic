import java.util.Scanner;
public class LAB10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int salary,in_come_Ex,in_surance,child_s;
        double net_income=0.0,tax=0.0;
        System.out.println(" ป้อน เงินเดือน 1 เดือน :"); salary = input.nextInt();
        System.out.println(" ป้อน รายได้พิเศษ ต่อ ปี :");in_come_Ex = input.nextInt();
        System.out.println(" ป้อน ค่าประกัน ต่อ ปี:");in_surance = input.nextInt();
        System.out.println(" ป้อน จำนวนบุตรที่ศึกษาอยู่  :");child_s = input.nextInt();

        if(in_surance > 100000){
        net_income = ((salary*12) + in_come_Ex)-100000-(child_s*17000)-60000;
        }
        else {
        net_income = ((salary*12) + in_come_Ex)-in_surance-(child_s*17000)-60000;
        }
        ///////////////////////////////////////////////////////
        if(net_income<=100000){
            tax = 0.0;
        } 
        else if(net_income<=300000 ){
            tax = ((net_income-100000)*0.05);
        }
        else if(net_income<=500000 ){
            tax = ((net_income-300000)*0.10 +(200000*0.05));
        }
        else if(net_income<=1000000){
            tax = ((net_income-500000)*0.15)+(200000*0.10)+(200000*0.05);
        }
        else{
            tax = ((net_income-1000000)*0.20)+(500000*0.15)+(200000*0.10)+(200000*0.05);        
        }
  
    System.out.println("รายได้ : "+net_income+" บาท");
    System.out.println("ภาษี : "+tax+" บาท ");
    System.out.println("รายได้สุทธิ หลัง หักภาษี : "+(net_income-tax)+"  บาท  ");

    }


        
}    

