import java.util.Scanner;
public class LAB16 {
    public static void main(String[] args) {
        String  _Char;
        int w_ide,l_ong;
        Scanner input = new Scanner(System.in);
        System.out.print("ป้อน ตัวอักขระ :"); _Char = input.nextLine();
        System.out.print("ป้อนค่า ความกว้าง ของสี่เหลียม(มากกว่า 0 และไม่เกิน 15):");w_ide = input.nextInt();
            while(w_ide < 0|| w_ide >15){
            System.out.print("INVALID NUMBER:");
            System.out.print("ป้อนค่า ความกว้าง ของสี่เหลียม (มากกว่า 0 และไม่เกิน 15):");w_ide = input.nextInt();
        }
        System.out.print("ป้อนค่า ยาว ของสี่เหลียม(มากกว่า 0 และไม่เกิน 15):");l_ong = input.nextInt();
            while(l_ong < 0|| l_ong >15){
            System.out.print("INVALID NUMBER:");  
            System.out.print("ป้อนค่า ยาว ของสี่เหลียม(มากกว่า 0 และไม่เกิน 15):");l_ong = input.nextInt();
        }
        ////////////////////////////////////////////////////
            for(int i=1;i<=l_ong;i++){
            System.out.print(_Char);
            }
        System.out.println();   
        //////////////////////////////////////////////////// 
        for(int j=1;j<=w_ide-2;j++){

            for(int k=1;k<=w_ide;k++){
                if(k==1 || k==w_ide){
                System.out.print(_Char);
                }
            else
            System.out.print(' ');
            }
        System.out.println();
        }
        ////////////////////////////////////////////////////////
        for(int i=1;i<=l_ong;i++){
            System.out.print(_Char);
            }
        ///////////////////////////////////////////////////////
    }
}   
    

