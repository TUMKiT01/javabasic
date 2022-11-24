public class Circle extends Shape{
    protected double radius;
    Circle(){
        radius = 0.0;
    }
    public void setCircle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {return radius;}
    public double computeArea_Circle(){
        double result = 0.0;
        result =  (22.0/7.0)*(radius*radius);
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
        
        System.out.println("This shape is Circle with radius: "+radius) ;
        System.out.println("This Circle area is: " + computeArea_Circle()) ;
    }
    
}
