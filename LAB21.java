import java.util.Scanner;
public class LAB21 {
    public static void main(String[] arge){
        Scanner input = new Scanner(System.in);
        System.out.println("    เลือกการคำนวณ    " );
        System.out.println("calculate rectangle area......enter (1) " );
        System.out.println("calculate triangle area......enter  (2) " );
        System.out.println("calculate circle area......enter    (3) " );
        int pink = input.nextInt();
        while(pink < 1 || pink>3){
            System.out.println("INVALID CHOICE");
            pink = input.nextInt();
        }

        if(pink==1){rectangle();}
        else if(pink==2){triangle();}
        else{circle();}   
    }
    public static void rectangle() {
        double wide_,long_;
        Scanner input = new Scanner(System.in);
        System.out.print("ป้อนความกว้าง  :" );wide_ = input.nextDouble();
        System.out.print("ป้อนความยาว  :" );long_ = input.nextDouble();
        System.out.println("calculate rectangle area : ="+(wide_*long_));
        
    }
    public static void triangle() {
        double wide_base,high_;
        Scanner input = new Scanner(System.in);
        System.out.print("ป้อนความกว้างของฐาน  " );wide_base = input.nextDouble();
        System.out.print("ป้อนความสูง  " );        high_ = input.nextDouble();
        System.out.println("calculate triangle area : ="+(0.5*wide_base*high_));
        
    }
    public static void circle() {
        double r,r_1;
        Scanner input = new Scanner(System.in);
        System.out.print("รัศมี " );r = input.nextDouble();
         r_1 =   ((22.0/7.0)*(r*r));
        System.out.println("calculate circle area : ="+r_1+" ");  
        
    }
}
