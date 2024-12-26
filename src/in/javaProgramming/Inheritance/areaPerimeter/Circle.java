package in.javaProgramming.Inheritance.areaPerimeter;
  class Shape {
      public double getPerimeter() {
          return 0.0;
      }

      public double getArea() {
          return 0.0;
      }
  }
     class Circle1 extends Shape {

          private double Pi = Math.PI;
          private double radios;
          public Circle1(double radios) {
              this.radios = radios;
          }
          public double getPerimeter() {

              return 2*Pi*radios;
          }
          public double getArea() {

              return Pi*Math.pow(radios , 2);
          }
      }

public class Circle {
    public static void main(String [] args){
        double r = 45.8;
   Circle1 cr = new Circle1 (r);
        System.out.println(cr.getArea());


    }
}
