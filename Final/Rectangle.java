public class Rectangle extends Shape {
    protected  int wide_rac;
    protected  int l_ong_rac;
    public Rectangle(){
        wide_rac = 0;
        l_ong_rac = 0;
    }
    public void setRectangle(int wide_rac,int l_ong_rac){
        this.l_ong_rac = l_ong_rac;
        this.wide_rac = wide_rac;
    }
    public void setL_ong_rac(int l_ong_rac) {
        this.l_ong_rac = l_ong_rac;
    }
    public void setWide_rac(int wide_rac) {
        this.wide_rac = wide_rac;
    }
    public int getWide_rac() {return wide_rac;}
    public int getL_ong_rac() {return l_ong_rac;}

    public int computeArea_Rectangle(){
        int result = 0;
        result =  wide_rac * l_ong_rac;
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

        System.out.println("This shape is Rectangle with wide: "+wide_rac + " and length "+l_ong_rac  ) ;
        System.out.println("This Triangle area is: " + computeArea_Rectangle()) ;
     
    }
}
 