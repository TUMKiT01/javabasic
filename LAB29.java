import java.util.Scanner;
public class LAB29{
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            int[][]total_sales = new int[4][5];
            int[][][]product_sales = new int[4][5][6];

        int i=0,j=0,k=0;
        for( k=0; k<4;k++){
            System.out.println("employee  No."+k);
            for( i = 0; i<5;i++){;
                System.out.println("product No."+i);
                for( j=0;j<6;j++){
                    System.out.print("enter product_sales month No."+j+":");
                    product_sales[k][i][j] = input.nextInt();
                }
            }
        }
        System.out.println("==================================================================");
        total_sales=total_product(product_sales);
        System.out.println("=============================total_product_max=====================================");
        total_product_max(total_sales); 
    } 
    public static int[][] total_product(int[][][] product_sales){
        int[][]total_sales = new int[4][5];
        ////set array total_sales = 0 total
        for(int k=0; k<4;k++){
            for(int i = 0; i<5;i++){;
                total_sales[k][i] =0;
            }
        }
        ////////////////////////////////////////////////
        for(int k=0; k<4;k++){
            for(int i = 0; i<5;i++){
                System.out.println("product No."+i);
                for(int j=0;j<6;j++){
                    System.out.println("product_sales month No. "+j+"= "+product_sales[k][i][j]);
                    total_sales[k][i] += product_sales[k][i][j];
                }
                
            System.out.println("employee  No. "+k);
            System.out.println("product No. "+i+"Total : product_sales 6 month :"+ total_sales[k][i]);
            System.out.println("==================================================================");
            }
        }
        return total_sales;
    }  
    public static void total_product_max(int[][] total_sales){
        int total_product1 = total_sales[0][0];
        int total_product2 = total_sales[0][1];
        int total_product3 = total_sales[0][2];
        int total_product4 = total_sales[0][3];
        int total_product5 = total_sales[0][4];
        int person1 = 0;
        int person2 = 0;
        int person3 = 0;
        int person4 = 0;int person5 = 0;
        int ti0 = 0;int ti1 = 0;int ti2 = 0;int ti3 = 0;int ti4 = 0;
        
        for(int k=0; k<4;k++){
            int i = 0;
                  if(total_sales[k][i]>total_product1){
                    total_product1 = total_sales[k][i];
                    person1 = k;
                  }
            System.out.println("------------------------------------");   
        }
        System.out.println("product No.1 Employees with the highest total sales for 6 months are: "+person1);
            
        for(int k=0; k<4;k++){
            int i = 1;
                  if(total_sales[k][i]>total_product2 ){
                    total_product1 = total_sales[k][i];
                    person2 = k;
                  }
            System.out.println("------------------------------------");
            
        }
         System.out.println("product No. 2 Employees with the highest total sales for 6 months are: "+person2);
    
        for(int k=0; k<4;k++){
            int i = 2;
                  if(total_sales[k][i]>total_product3 ){
                    total_product1 = total_sales[k][i];
                    person3 = k;
                  }

            System.out.println("------------------------------------");  
            
        }
        System.out.println("product No. 3 Employees with the highest total sales for 6 months are: "+person3);
         
        for(int k=0; k<4;k++){
            int i = 3;
                  if(total_sales[k][i]>total_product4 ){
                    total_product1 = total_sales[k][i];
                    person4 = k;
                  }
            System.out.println("------------------------------------");      
        }
        System.out.println("product No. 4 Employees with the highest total sales for 6 months are: "+person4);
         
         for(int k=0; k<4;k++){
            int i = 4;

                  if(total_sales[k][i]>total_product5 ){
                    total_product1 = total_sales[k][i];
                    person5 = k;
                  }
            System.out.println("------------------------------------");   
         }
        System.out.println("product No. 5 Employees with the highest total sales for 6 months are: "+person5);
         
        }
    }



