import java.util.Scanner;
public class LAB19{
    public static void main(String[] args){
        String char_;
        int w_ide,l_ong;
        Scanner input = new Scanner(System.in);
        System.out.print("กรุณาป้อนอักขระ");char_ = input.nextLine();
        System.out.print("กรุณาป้อนความ กว้าง ของสี่เหลียม");w_ide = input.nextInt();
        while(w_ide<=0 || w_ide>15){
            System.out.println("INVALID NUMBER");
            System.out.print("กรุณาป้อนความ กว้าง ของสี่เหลียม");w_ide = input.nextInt();
        }
        System.out.print("กรุณาป้อนความ ยาว ของสี่เหลียม");l_ong = input.nextInt();
        while(l_ong<0 || l_ong>15){
            System.out.println("INVALID NUMBER");
            System.out.print("กรุณาป้อนความ ยาว ของสี่เหลียม");l_ong = input.nextInt();
        }
        show(w_ide,l_ong,char_);
    }
    public static void show(int w_ide,int l_ong,String char_){
        //////////////////////////////
        for(int i=1;i<=w_ide;i++){
            System.out.print(char_);
            }
            System.out.println();   
        //////////////////////////////
        for(int j=1;j<=l_ong-2;j++){

            for(int k=1;k<=w_ide;k++){
                if(k==1 || k==w_ide){
                System.out.print(char_);
                }
            else
            System.out.print(' ');
            }
            System.out.println();
        }
        ///////////////////////////////
        for(int i=0;i<w_ide;i++){
            if( w_ide ==1){break;}
            System.out.print(char_);
            }
        ///////////////////////////////
    }
 
}
