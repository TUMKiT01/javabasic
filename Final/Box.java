public class Box extends Rectangle{
    protected int high_box;
    public Box(){
        high_box = 0;
    }
    public void setHigh_box(int high_box) {
        this.high_box = high_box;
    }
    public int getHigh_box() {return high_box;}

    public int computeVolume_Box(){
        int result = 0;
        result =  computeArea_Rectangle() * high_box;
    return result;
    }
    public void displayShape(){
        System.out.println("This shape is at " +positionx + " on x-axis." ) ;
        System.out.println("This shape is at " + positiony + " on y-axis." ) ;
        switch(color) { 
                case 'R' : System.out.println("This shape is red ") ; break ;
                case 'B' : System.out.println("This shape is black" ) ; break ;
                case 'Y' : System.out.println("This shape is yellow ") ; break ;
                default : System.out.println("wrong color") ; break ;
             }

        System.out.println("This shape is Box with width: "+wide_rac + " and length "+l_ong_rac+" and height "+high_box ) ;
        System.out.println("Box volume is: " + computeVolume_Box()) ;
     
    }
}
 

