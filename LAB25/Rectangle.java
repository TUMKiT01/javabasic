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
    System.out.println("Rectangle Area ="+calArea());
    System.out.println("Perimeter_Rectangle ="+calPerimeter());

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


}


