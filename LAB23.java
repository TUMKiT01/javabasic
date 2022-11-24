public class LAB23{
public static void main(String [ ] args){ 
    int var1 = 5;
    char letter = 'M' ;
    drawSquare(var1) ;
    drawSquare(var1,letter);
    drawSquare(var1,letter,2);
    double area1 = calAreaRectangle(5.0,7.0) ;
    double area2 = calAreaRectangle(5.0) ;

    System.out.println("Rectangle(base=5.0,height=7.0)" +"has area = "+ area1) ;
    System.out.println("Rectangle(base=5.0,height=5.0)" +"has area = " + area2) ;
 }
 public static void drawSquare (int width){ 
         for(int i=1;i<=width;i++){
            System.out.print('@');
            }
            System.out.println();   
        //////////////////////////////
        for(int j=1;j<=width-2;j++){

            for(int k=1;k<=width;k++){
                if(k==1 || k==width){
                System.out.print('@');
                }
            else
            System.out.print(' ');
            }
            System.out.println();
        }
        ///////////////////////////////
        for(int i=0;i<width;i++){
            if( width ==1){break;}
            System.out.print('@');
         }
         System.out.println();
         System.out.println("-------------------------------");
 }      
 public static void drawSquare (int width, char achar){
     for(int i=1;i<=width;i++){
         System.out.print(achar);
        }
         System.out.println();   
//////////////////////////////
    for(int j=1;j<=width-2;j++){

    for(int k=1;k<=width;k++){
        if(k==1 || k==width){
        System.out.print(achar);
        }
    else
         System.out.print(' ');
        }
         System.out.println();
    }
///////////////////////////////
    for(int i=0;i<width;i++){
        if( width ==1){break;}
         System.out.print(achar);
        }
        System.out.println();
        System.out.println("-------------------------------");
}
 public static void drawSquare (int width, char achar, int number) {     
        width = width * number;
         for(int i=1;i<=width;i++){
         System.out.print(achar);
        }
            System.out.println();   
//////////////////////////////
         for(int j=1;j<=width-2;j++){

        for(int k=1;k<=width;k++){
        if(k==1 || k==width){
         System.out.print(achar);
            }
        else
         System.out.print(' ');
        }
        System.out.println();
       }
///////////////////////////////
        for(int i=0;i<width;i++){
        if( width ==1){break;}
         System.out.print(achar);
      }
    System.out.println();
    System.out.println("-------------------------------");
}
    public static double calAreaRectangle(double width ){ 
        double result;
        result = width*width;
         return result;
    }
    public static double calAreaRectangle(double width, double length){
        double result;
        result = width*length;
         return result;

    }
} // end class
    

