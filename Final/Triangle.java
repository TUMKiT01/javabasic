public class Triangle extends Shape {
    protected  int base;
    protected  int l_ong;
    public Triangle(){
        base=0;
        l_ong=0;
    }
    public void setTriangle(int base, int l_ong){
        this.l_ong = l_ong;
        this.base = base;
    }
    public void setL_ong(int l_ong) {
        this.l_ong = l_ong;
    }
    public void setWide(int base) {
        this.base = base;
    }
    public int getBase() {return base;}
    public int getL_ong(){return l_ong;}
    public double computeArea_Triangle(){
        double result = 0;
        result = 0.5 * base * l_ong;
    return result;
    }
    public void displayShape(){
        super.displayShape();
             
        System.out.println("This shape is Triangle with base: "+base + " and length "+l_ong  ) ;
        System.out.println("This Triangle area is: " + computeArea_Triangle()) ;
    }
}
