package in.javaProgramming.Constructor;
//  write a java programm to create a class called point with instance varriable x and y . implements overloaded Constructor

//1-> One constructor takes int parameters.
//2 ->  Another constructor takes double parameters.
// 3 -> Print the values of the variables for each constructor.

public class Point {
    private int x;
    private int y;

    private double Y;
private double X;


    public Point(int x  ,int y){
        this.x= x;
        this.y= y;
        System.out.println(x+y);

    }
    public Point(double X, double Y ){

        this.X= X;
        this.Y = Y;
        System.out.println(X+Y);
    }
    public static void main(String[] args) {
  Point p = new Point(3 , 5);
  Point P = new Point(2.4 , 3.5);

//        System.out.println(p.x);
//        System.out.println(P.y);


    }
}
