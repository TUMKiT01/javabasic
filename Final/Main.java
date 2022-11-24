public class Main {
    public static void main(String[] args){
        Prism p = new Prism();
        Box b = new Box();
        Cylinder c = new Cylinder();
        
        p.changeColor('R');
        p.changePosition(1, 2);
        p.setTriangle(5,2);
        p.setHigh_prism(10);
        p.displayShape();
        
        System.out.println("===========================================");

        b.changeColor('B');
        b.changePosition(3, 4);
        b.setRectangle(3, 8);
        b.setHigh_box(20);
        b.displayShape();

        System.out.println("===========================================");

        c.changeColor('Y');
        c.changePosition(5, 6);
        c.setCircle(5);
        c.setHigh_Cylinder(5);
        c.displayShape();
        
        //System.out.println(c.getRadius());
        //System.out.println(c.getHigh_Cylinder());

    }
}
