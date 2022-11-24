import java.util.Scanner;
public class LAB28 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int student_number=4;
        char [] scoreGrade = new char[4];
        double [] scoreHw = new double[4];
        double [] scoreReport = new double[4];
        double [] scoreMid = new double[4];
        double [] scoreFinal = new double[4];
        double [] scoreTotal = new double[4];
    for(int i=0; i<student_number;i++){
        System.out.println("Put Data Student: "+(i+1));
        System.out.print("Put Score homework: ");scoreHw[i] = input.nextDouble();
         while(scoreHw[i] < 0 || scoreHw[i] > 20){
                System.out.println("INVALID SCORE");
                System.out.print("Put Score homework: "); scoreHw[i] = input.nextDouble();
            }
        System.out.print("Put Score Report: ");scoreReport[i] = input.nextDouble();
         while(scoreReport[i] < 0 || scoreReport[i] > 10){
                System.out.println("INVALID SCORE");
                System.out.print("Put Score Report: "); scoreReport[i] = input.nextDouble();
            }
        System.out.print("Put Score Midterm: ");scoreMid[i] = input.nextDouble();
         while(scoreMid[i] < 0 || scoreMid[i] > 30){
                System.out.println("INVALID SCORE");
                System.out.print("Put Score Midterm: ");scoreMid[i] = input.nextDouble();
            }
         System.out.print("Put Score Final: ");scoreFinal[i] = input.nextDouble();
         while(scoreFinal[i] < 0 || scoreFinal[i] > 40){
                System.out.println("INVALID SCORE");
                System.out.print("Put Score Final: ");scoreFinal[i] = input.nextDouble();
            }
         scoreTotal[i] =scoreHw[i]+scoreReport[i]+scoreMid[i]+scoreFinal[i];
         //======================================
        if ( scoreTotal[i]<50){
           scoreGrade[i] = 'F';
        }else if ( scoreTotal[i]<=69){
           scoreGrade[i] = 'D';
        }else if (scoreTotal[i]<=79){
           scoreGrade[i] = 'C';
        }else if (scoreTotal[i]<=89){
           scoreGrade[i] = 'B';
        }else {
           scoreGrade[i] = 'A';
        }
    } 
        double average_hw=0,average_r=0,average_min=0,average_f=0,average_sum=0;
         for(int i=0; i<student_number;i++){
            
                  average_hw += scoreHw[i];
                  average_r += scoreReport[i];
                  average_min += scoreMid[i];
                  average_f += scoreFinal[i];
                  average_sum  += scoreTotal[i];  
                  if(i+1 == student_number){
                    average_hw = average_hw/student_number;
                    average_r = average_r/student_number;
                    average_min = average_min/student_number;
                    average_f = average_f/student_number;
                    average_sum  = average_sum/student_number; 

                  } 
              
             
         }
         for (int i=0; i<student_number; i++){
            System.out.println("              HW  RE  QU  FI  TOT  GRADE");
            System.out.println("Student No."+i+" :"+scoreHw[i]+" ,"+scoreReport[i]+" ,"
                    +scoreMid[i]+" ,"+scoreFinal[i]+" ,"+scoreTotal[i]+" ,"+scoreGrade[i]);
        }
        System.out.println("------------------------------");
        System.out.println("Average        : "+average_hw+", "+average_r+", "
                            +average_min+", "+ average_f+", "+average_sum);
        System.out.println("------------------------------");
        int totalA = 0,totalB = 0,totalC = 0,totalD = 0,totalF = 0;
        for (int i=0; i<student_number; i++){
            switch(scoreGrade[i]){
                case 'A' : totalA++ ; break;
                case 'B' : totalB++ ; break;
                case 'C' : totalC++ ; break;
                case 'D' : totalD++ ; break;
                case 'F' : totalF++ ; break;
              }

        }
        System.out.println("Number of A Student = "+totalA);
        System.out.println("Number of B Student = "+totalB);
        System.out.println("Number of C Student = "+totalC);
        System.out.println("Number of D Student = "+totalD);
        System.out.println("Number of F Student = "+totalF);

    }
    }
