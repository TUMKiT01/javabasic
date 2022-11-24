import java.util.Scanner;
public class LAB8 {
    public static void main(String[] ages){
        Scanner input = new Scanner(System.in);
        int hour_in,minute_in;
        int hour_out,minute_out;
        int parking_time;
        double fee=0.0;
        System.out.println("ป้อนเวลา เข้า");
        System.out.print("เวลาเข้า :");hour_in =input.nextInt();
        System.out.print("นาที :");minute_in =input.nextInt();

        System.out.println("ป้อนเวลา ออก");
        System.out.print("เวลาออก :");hour_out =input.nextInt();
        System.out.print("นาที :");minute_out =input.nextInt();
        parking_time = (hour_out*60+minute_out)-(hour_in*60+minute_in);

        if(parking_time<=30){
        System.out.println("ค่าบริการฟรี ////////");
        }
        else if(parking_time>30 && parking_time<=120){
            fee= (parking_time-30)*1.00;
        }
        else if(parking_time>120 && parking_time<=240){
            fee= (parking_time-120)*1.50+(90*1.00);
        }
        else if(parking_time>240){
            fee= (parking_time-240)*2.00+(120*1.50)+(90*1.0);
        }
        
        System.out.println("เวลาเข้า จอด: "+hour_in+"นาฬิกา :"+minute_in+"นาที");
        System.out.println("เวลาเข้า ออก: "+hour_out+"นาฬิกา :"+minute_out+"นาที");
        System.out.println("จำนวน นาที ที่จอดรวม :"+parking_time+"นาที");
        System.out.println("ค่าบริการ :"+fee+"บาท");

    }
    
}
