public class Prism extends Triangle{
    protected int high_prism;
    Prism(){
        high_prism = 0;
    }
    public void setHigh_prism(int high_prism) {
        this.high_prism = high_prism;
    }
    public int gethigh_prism() {return high_prism;}

    public double computeVolume_Prism(){
        double result = 0;
        result = computeArea_Triangle() * high_prism;
    return result;
    }
    public void displayShape(){
        super.displayShape();
        System.out.println("This shape is Prism with base area : "+computeArea_Triangle() + " and length "+high_prism  ) ;
        System.out.println("Prism volume is: " + computeVolume_Prism()) ;

    }
    
}
