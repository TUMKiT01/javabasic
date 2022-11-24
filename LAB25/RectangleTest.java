class RectangleTest{
    public static void main(String[] args){
        Rectangle a = new Rectangle();
        a.setRectangle(5.0, 5.0);
        a.calPerimeter();
        a.showRectangle();

        System.out.println("------------resize-------------");
        a.changeSize();
        a.changeSize(5.0);
        a.changeSize(5.0, 5.0);
        a.showRectangle();
        
        System.out.println("-------------------------");
        System.out.println();

        Rectangle b = new Rectangle();
        b.setRectangle(3.0, 3.0);
        b.calPerimeter();
        b.showRectangle();

        System.out.println("--------------resize-----------");
        b.changeSize();
        b.changeSize(3.0);
        b.changeSize(3.0, 3.0);
        b.showRectangle();

        
        System.out.println("-------------------------");
        System.out.println();

        Rectangle  c= new Rectangle();
        c.setRectangle(2.0, 2.0);
        c.calPerimeter();
        c.showRectangle();

        System.out.println("------------resize-------------");
        c.changeSize();
        c.changeSize(2.0);
        c.changeSize(2.0, 2.0);
        c.showRectangle();

        
    }
}



