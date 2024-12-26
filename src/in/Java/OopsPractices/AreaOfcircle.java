package in.Java.OopsPractices;

class Circle{
    private double pi = Math.PI;
    private double radius;

    public Circle(double radius){
        this.radius = radius;

    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public double getCircumference(){
        return 2*pi*radius;
    }

    public double getArea(){
        return pi*Math.pow(radius ,2);
    }

}


public class AreaOfcircle {
    public static void main(String[] args){
        Circle circle = new Circle(4.67);

        System.out.println("the circumference of circle "+ circle.getCircumference() );
        System.out.println("the are of circle is :"+circle.getArea());

        System.out.println("AFTER MODIFY VALUE ");
        circle.setRadius(10);
        System.out.println("the Circumference of circle :"+circle.getCircumference() );
        System.out.println("The are of circle is :"+circle.getArea() );


    }
}
