import java.util.Scanner;
public class LAB7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("เลือกเครื่องดื่มที่ต้องการซื้อ");
        int Pay=0;
        int pink;   
        System.out.println("Espresso(40 บาท).............. กด 1 ");
        System.out.println("Americano hot(40 บาท)..........กด 2 ");
        System.out.println("Americano iced(50 บาท).........กด 3 ");
        System.out.println("Latte hot(50 บาท)............. กด 4 ");
        System.out.println("Matcha latte(60 บาท).......... กด 5 ");
        pink = input.nextInt();       
         switch(pink){
                case 1 :Pay=40;System.out.println("Espresso(40 บาท)"+" รวม : ="+Pay);break;
                case 2 :Pay=40;System.out.println("Americano hot(40 บาท)"+" รวม : ="+Pay);break;
                case 3 :Pay=50;System.out.println("Americano iced(50 บาท)"+" รวม : ="+Pay);break;
                case 4 :Pay=50;System.out.println("Latte hot(50 บาท) ");        
                case 5 : if(Pay != 50){
                        Pay=60;System.out.println("Matcha latte(60 บาท) ");       
                         }     
                         else{ 
                          System.out.println("Plain milk.....................กด 1 ");
                          System.out.println("Low fat milk(+5 บาท)...........กด 2 ");
                          System.out.println("Lactose(+8 บาท)................กด 3 ");
                          System.out.println("Soy milk(+10 บาท)..............กด 4 ");
                          System.out.println("Almond milk(+15 บาท)...........กด 5 ");
                          int pink5 = input.nextInt();
                          switch(pink5){                                         
                               case 1:System.out.println("Plain milk");break ;
                               case 2:Pay+=5;System.out.println("Low fat milk(+5 บาท)"+" รวม : ="+Pay);break ;
                               case 3:Pay+=8;System.out.println("Lactose(+8 บาท)"+" รวม : ="+Pay);break ;
                               case 4:Pay+=10;System.out.println("Soy milk(+10 บาท)"+" รวม : ="+Pay);break ;
                               case 5:Pay+=15;System.out.println("Almond milk(+15 บาท)"+" รวม : ="+Pay);break ;   
                                }    
                            } 
                
                            
          }   

    }
  }
     