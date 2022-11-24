import java.util.Scanner;
public class LAB23 {
    public static void main(String[] arge){
    Scanner input = new Scanner(System.in);
    for(int i =0; i<10 ;i++)
    {
        Long ID_studen;
        int H_work_s=0,P_work_s=0,Quiz_s=0,Final_s=0;
        double total_s=0.0;
        System.out.print("ป้อน รหัสนักเรียน :");ID_studen = input.nextLong();
        H_work_s =homework();
        P_work_s =statement();
        Quiz_s =Quiz();
        Final_s=Final();

        total_s = H_work_s+P_work_s+Quiz_s+Final_s;
       if(total_s<50)
           System.out.println("Total = "+total_s+"Gate F");
       else if(total_s<60)
           System.out.println("Total = "+total_s+"Gate D");
       else if(total_s<70)
           System.out.println("Total = "+total_s+"Gate C");
       else if(total_s<90)
           System.out.println("Total = "+total_s+"Gate B");
       else
           System.out.println("Total = "+total_s+"Gate A");        
   }
 }
 public static int homework(){
    int H_work_s;
        Scanner input = new Scanner(System.in);
        System.out.print("ป้อน คะแนการบ้าน:");H_work_s = input.nextInt();
        while(H_work_s<0||H_work_s>20){
        System.out.print("INVALID SCORE: ");H_work_s = input.nextInt(); 
        }
        return H_work_s;

    }
public static int statement(){
    int P_work_s;
        Scanner input = new Scanner(System.in);
        System.out.print("ป้อน คะแนนรายงาน:");P_work_s = input.nextInt();
        while(P_work_s<0||P_work_s>10){
        System.out.print("INVALID SCORE: ");P_work_s= input.nextInt(); 
        }
        return P_work_s;
    }
public static int Quiz(){
    int Quiz_s;
        Scanner input = new Scanner(System.in);
        System.out.print("ป้อน คะแนนสอบย่อย:");Quiz_s = input.nextInt();
        while(Quiz_s<0||Quiz_s>30){
        System.out.print("INVALID SCORE: ");Quiz_s= input.nextInt(); 
        }
        return Quiz_s;
    }
public static int Final(){  
    int Final_s;
        Scanner input = new Scanner(System.in); 
        System.out.print("ป้อน คะแนนสอบไล่:");Final_s = input.nextInt();
        while(Final_s<0||Final_s>40){
        System.out.print("INVALID SCORE: ");Final_s= input.nextInt();
    }  
    return Final_s;
}






}

