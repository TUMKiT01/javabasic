import java.util.Scanner;
public class LAB12 {
    public  static void main(String[] age){
        Scanner input = new Scanner(System.in);
        String chack = " ";
    while(chack == " "){    
        System.out.println("    เลือกการคำนวณ    " );
        System.out.println("calculate rectangle area......enter (1) " );
        System.out.println("calculate triangle area......enter  (2) " );
        System.out.println("calculate circle area......enter    (3) " );
        int pink = input.nextInt();
        if(pink ==1 ||  pink ==2 || pink ==3)
        {
                if(pink == 1){
                    double wide_,long_;
                    System.out.print("ป้อนความกว้าง  :" );wide_ = input.nextDouble();
                    System.out.print("ป้อนความยาว  :" );long_ = input.nextDouble();
                    System.out.println("calculate rectangle area : ="+(wide_*long_));
                    chack ="EXIT";
                 }
                else if(pink == 2){
                     double wide_base,high_;
                     System.out.print("ป้อนความกว้างของฐาน  " );wide_base = input.nextDouble();
                     System.out.print("ป้อนความสูง  " );        high_ = input.nextDouble();
                     System.out.println("calculate triangle area : ="+(0.5*wide_base*high_));
                     chack ="EXIT";
                 }
                else if(pink == 3){
                     double r,r_1;
                     System.out.print("รัศมี " );r = input.nextDouble();
                      r_1 =   ((22.0/7.0)*(r*r));
                     System.out.println("calculate circle area : ="+r_1+" ");  
                     chack ="EXIT";           
                 }
        
            
        } 
        else{
             System.out.println("INVALID COICE");
             System.out.println("   ");
            }
     
                
    }


    
 }
}

