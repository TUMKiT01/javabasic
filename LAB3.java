import java.util.Scanner;
public class LAB3 {
    public static void main(String[] arge)
    {
     double room,unitE,unitW,wifi,total;
     Scanner input = new Scanner(System.in);
     System.out.println("ค่าเช่าห้อง : จำนวณหน่วยไฟฟ้าที่ใช้ : จำนวณหน่วยน้ำประปาที่ใช้ : ค่าwifi");
     room=input.nextDouble();
     unitE=input.nextDouble(); unitE=unitE*10;
     unitW= input.nextDouble(); unitW=unitW*15;
     wifi=input.nextDouble();
     total = room+unitE+unitW+wifi;
     System.out.println("ค่าเช่าห้อง :"+room+ " ค่าไฟฟ้า :"+unitE+" ค่าน้ำประปา :" +unitW +" ค่าwifi :"+wifi );
     System.out.println("สรุปยอดร่วมทั้งหมด = "+total);
    }
    
}
