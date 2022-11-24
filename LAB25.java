public class Rectangle {
    public double width,height;

public Rectangle(){
    width = 0.0;
    height= 0.0;
}
public void setRectangle(double width_, double height_) {
    width = width_;
    height= height_;
} 
public double getHeight(){
    return height;
}
public double getWidth(){
    return width;
}
public double calArea(){
    double result;
    result = height*width;
    return result;

}
public double calPerimeter(){
    double result;
    result = 2*(height+width);
    return result;
}
public void showRectangle(){
    System.out.println("height ="+getHeight());
    System.out.println("width ="+getWidth());
    System.out.println("ขนาดพื้นที่4เหลี่ยม ="+calArea());
    System.out.println("ความยาวรอบพื้นที่4เหลี่ยม ="+calPerimeter());

}
public void changeSize(){
    width = width*2;
    height= height*2;
}
public void changeSize(double amount){
    width = width+amount;
}
public void changeSize(double amount1, double amount2){
    width = width+amount1;
    height = height+amount2;
}
class RectangleTest{
    public static void main(String[] args){
        Rectangle a = new Rectangle();
        a.setRectangle(5.0, 5.0);
        a.calPerimeter();
        a.showRectangle();

        System.out.println("------------ปลับขนาด-------------");
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

        System.out.println("------------ปลับขนาด-------------");
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

        System.out.println("------------ปลับขนาด-------------");
        c.changeSize();
        c.changeSize(2.0);
        c.changeSize(2.0, 2.0);
        c.showRectangle();

        
    }
}
}


