import java.util.Scanner;
public class LAB5{
    public static void main(String[]   age){
        int room,e_unit,w_unit,wifi,all_W_E=0;
        Scanner input = new Scanner(System.in);
        System.out.print("ป้อนค่า เช่าห้อง :"); room = input.nextInt();
        System.out.print("ค่าWiFi :"); wifi= input.nextInt();
        System.out.print("หน่วยน้ำ :"); w_unit= input.nextInt();
        System.out.print("หน่วยไฟฟ้า :"); e_unit= input.nextInt();       
        int total_W=0;
        int static_W = w_unit;

            if(static_W <= 5 ){
                total_W =15*w_unit;
             
            }
            else if(static_W >= 6 && static_W <=10 ){
                total_W = 5*15+((w_unit-5)*20);
         
            }
                 
            else if(static_W>=11 ){
                    if(static_W==11){static_W+=1;}
                w_unit = static_W-=11;
                total_W= (5*15)+(4*20)+(25*w_unit);
      
           }
           System.out.println(" ค่าน้ำปะปา  = "+total_W+ " บาท " );
            int static_E = e_unit;
            int total_E =0;
            if(static_E <= 50 ){
                total_E =8*e_unit;
    
                }
            if(static_E >= 51 && static_E <=200 ){
                total_E = 8*50+((e_unit-50)*9);
       
                }
                     
            if(static_E>=201 ){
                if(static_E==201){static_E+=1;}
                e_unit = static_E-=200;
                total_E= (50*8)+(150*9)+(10*e_unit);
          
                }
        System.out.println(" ค่าไฟฟ้า  = "+total_E+ " บาท " );
        System.out.println(" ค่าห้อง  = "+room+ " บาท " );
        System.out.println(" ค่าwifi  = "+wifi+ " บาท " );
        all_W_E = total_E+total_E;
        System.out.println("ยอดรวม ค่าห้อง  = "+(all_W_E+room+wifi)+ " บาท " );

       }
 }

