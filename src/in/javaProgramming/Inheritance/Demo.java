package in.javaProgramming.Inheritance;
 class  Shape{
    public void  getAre(){
        System.out.println("this is the area of shape area");
     }
 }
class  Rectangle extends Shape{
     public void getAre(){
         System.out.println("This is the area of rectangle");
     }
}
public class Demo {
    public static void main(String[] args){
        Shape sh = new Shape();
        sh.getAre();
        Rectangle r = new Rectangle();
        r.getAre();
    }
}