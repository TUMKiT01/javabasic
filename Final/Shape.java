public class Shape {
    protected int positionx;
    protected int positiony; 
    protected char color = 'B'; 
    public Shape() { positionx = positiony = 0 ; }
    public void changeColor(char newcolor)
    { 
        switch (newcolor) {
              case 'R' : 
              case 'B' :
              case 'Y' : color = newcolor ; break ;
              default : System.out.println(" wrong color") ; break ; }
    }
    public void changePosition(int newx , int newy)
    {       positionx = newx ;
            positiony = newy ;
    }
    public int getPosition_X(){
        return positionx ;
    }
    public int getPosition_Y(){
        return positiony ;
    }
    public void displayShape()
    { 
            System.out.println("This shape is at " +positionx + " on x-axis." ) ;
            System.out.println("This shape is at " + positiony + "on y-axis." ) ;
            switch(color) { 
                    case 'R' : System.out.println("This shape is red") ; break ;
                    case 'B' : System.out.println("This shape is black" ) ; break ;
                    case 'Y' : System.out.println("This shape is yellow") ; break ;
                    default : System.out.println("wrong color") ; break ;
                 }
    }
}
