package in.javaProgramming.Inheritance;
class Vehicle{
    public void drive(){

        System.out.println("the car drive");
    }
}
 class Car extends Vehicle{
    public void drive(){
        System.out.println("reparing a car ");
    }
 }
class InheriraceUsing {
    public static void main(String[] args){
   Vehicle v = new Vehicle();
   v.drive();
   Car car = new Car();
   car.drive();
    }
}
