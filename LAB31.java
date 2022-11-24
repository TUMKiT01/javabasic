import java.util.Scanner;
class LAB31{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int pink;
        int [] anArray = new int[10];
    do{
        for(int i=0; i<10;i++){
             anArray[i] = (int)(Math.random()*100);
        }
        /////////////////
        // for(int j=0;j<anArray.length;j++){
        //     System.out.println("number: "+j+" ="+anArray[j]);  
        // }
        ///////////////////
         System.out.print("Input number: ");
         int number = input.nextInt();
         int num=0;
         outerloop:
         for(int i=0;i<anArray.length;i++){
               if(number == anArray[i]){
                    System.out.println("CONGRATULATION");
                    for(int j=0;j<anArray.length;j++){
                        System.out.println("number: "+j+" ="+anArray[j]);  
                    }
                break outerloop;
                   
            }
            else if(num==4){
                System.out.println("GAME OVER");
                for(int j=0;j<anArray.length;j++){
                    System.out.println("number: "+j+" ="+anArray[j]);  
                    }
                break outerloop;
                }
            else if(i==anArray.length-1){
                System.out.println("Massing");
                System.out.print("Input number: ");
                number = input.nextInt();
                i = 0;
                num++;
                    }
            }
        System.out.println("PlayGame again? Yes=1 No=0 :"); 
        pink = input.nextInt();
  }while(pink==1);
      System.out.println("End Game");
    }
  }
