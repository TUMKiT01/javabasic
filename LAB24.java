public class LAB24{ 
 public static void main(String [ ] args){ 
    int var1 = 5;
    char letter = 'M' ;
    drawTriangle(var1) ;
    drawTriangle (var1,letter);
    drawTriangle (var1,letter,2);

    double area1 = computeArea(5.0 , 8.0) ;
    System.out.println("Triangle (base=5.0 , height=8.0) has area = " + area1) ;
    double area2 = computeArea(5.0 , 8.0 , 7.0) ;
    System.out.println("Triangle (side1=5.0 , side2=8.0 , side3=7.0) has area = " + area2) ;
 }
 public static void drawTriangle (int base_){ 
        int high_ = base_-1;
        int base = base_-1;
        for (int i=0; i<high_; i++){
            for (int col=0; col<base; col++) {
                if (base == high_){
                   System.out.print('@');
                }if (col == 0 && base != high_){
                    System.out.print('@');
                }if(col > 0 && base != high_){
                     System.out.print(' ');
                }if(col+1 == base){
                    System.out.print('@');    
                }
            }
            System.out.println();
            base--;
            if (base == 0){
                 System.out.print('@');
            }
        }
    System.out.println();
    System.out.println("-------------------------------");
}
 public static void drawTriangle (int base_, char achar) {
    int high_ = base_-1;
    int base = base_-1;
    for (int i=0; i<high_; i++){
        for (int col=0; col<base; col++) {
            if (base == high_){
               System.out.print(achar);
            }if (col == 0 && base != high_){
                System.out.print(achar);
            }if(col > 0 && base != high_){
                 System.out.print(' ');
            }if(col+1 == base){
                System.out.print(achar);    
            }
        }
        System.out.println();
        base--;
        if (base == 0){
            System.out.print(achar);
        }
    }
    System.out.println();
    System.out.println("-------------------------------");
 }
 public static void drawTriangle (int base_ , char achar, int number) 
 {  
    for(int n=0 ; n<number ; n++){
        int high_ = base_-1;
        int base = base_-1;
    for (int i=0; i<high_; i++)
    {
        for (int col=0; col<base; col++) {
            if (base == high_){
               System.out.print(achar);
            }if (col == 0 && base != high_){
                System.out.print(achar);
            }if(col > 0 && base != high_){
                 System.out.print(' ');
            }if(col+1 == base){
                System.out.print(achar);    
            }
        }
        System.out.println();
        base--;
        if (base == 0){
            System.out.println(achar);
        }
    }
  }
  System.out.println();
  System.out.println("-------------------------------");
 }
 public static double computeArea(double base , double height ) 
 { 
    double result;
    result = 0.5*height*base;
    return result;
 }
 public static double computeArea(double side1 , double side2 , double side3 ){
    double s,result;
    s = 0.5*(side1+side2+side3);
    result =(s*(s-side1)*(s-side2)*(s-side3));
    return Math.sqrt(result);
 }
} // end class
