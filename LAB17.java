import java.util.Scanner ;
class LAB17
{ 
    public static void main(String args [ ]){  
    int number = getNumber( ) ;
    int result = calFactotial(number) ;
    System.out.println(number + "!="+ result ) ; 
 }
    public static int getNumber()
    { 
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("ป้อน  ตัวเลข:"); num = input.nextInt();
        while(num < 0|| num >10){
            System.out.print("wrong number:");
            num = input.nextInt();
        } 
        return num;
    }
    public static int calFactotial(int digit ){ 
        int fact =1;
        for(int i = 1; i <= digit ; i++){
            fact = fact *i;
        }
        return fact;
    }
}

