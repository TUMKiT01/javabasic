import java.util.Scanner;
public class LAB30 {
    public static void main(String[ ] args) {
    Scanner input = new Scanner(System.in);
    int [] anArray = new int[10];
    for(int i=0; i<10;i++){
        System.out.print("Put number Array:"+i+" = ");
        anArray[i] = input.nextInt();
    }
    for(int i=0; i<10;i++){
        System.out.print(" number Array: "+i+"= "+anArray[i]+"\n");
    }
    int index_max=findMax(anArray);
    int index_min=findMin(anArray);
    System.out.println(" number Max: "+"address to: "+index_max+"= "+anArray[index_max]);
    System.out.println(" number Min: "+"address to: "+index_min+"= "+anArray[index_min]);
    System.out.println(" Total Average: "+findAverage(anArray));
    }
     public static int findMax(int[] anArray){
         int max = anArray[0];
         int index_i =0;
         for(int i=0;i<10;i++){
             if(max<anArray[i]){
                 max=anArray[i];
                 index_i = i;
              }
         }
        return index_i;
    }
     public static  int  findMin(int[] anArray){
         int min = anArray[0];
         int index_i =0;
         for(int i=0;i<10;i++){
             if(min>anArray[i]){
                 min=anArray[i];
                 index_i = i;
             }
         }
        return index_i;

     }
     public static  double  findAverage(int[ ] anArray){
         double sum= 0.0,n = 10;

         for(int i=0;i<10;i++){
             sum = sum+anArray[i];

         }
        return sum/n;

     }
}