package in.Java.OopsPractices;
class Rectangle {
  private   double height;
    private double width;
private double area;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void setHeight(double height){
        this.height = height;

    }
    public double getHeight(){
        return height;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getWidth(){
        return width;
    }
    public double getArea(){
         return width+height;
    }
}
public class Area
{
    public static void main(String[] arg){
        Rectangle re = new Rectangle(20.5 , 30.5);
        System.out.println(re.getArea());

    }

}
