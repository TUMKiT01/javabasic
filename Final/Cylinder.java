public class Cylinder extends Circle {
    protected int high_Cylinder;
    Cylinder()
    {
        high_Cylinder = 0;
    }
    public void setHigh_Cylinder(int high_Cylinder) {
        this.high_Cylinder = high_Cylinder;
    }
    public int getHigh_Cylinder() {return high_Cylinder;}
    public double computeVolume_Cylinder(){
            double result = 0;
             result =  computeArea_Circle() * high_Cylinder;
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

        System.out.println("This shape is Cylinder with radius: "+radius + " and height "+high_Cylinder  ) ;
        System.out.println("Cylinder volume is: " + computeVolume_Cylinder()) ;
     
    
    }
}
